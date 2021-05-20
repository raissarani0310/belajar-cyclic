package com.lothrazar.cyclic.block.endershelf;

import com.lothrazar.cyclic.base.BlockBase;
import com.lothrazar.cyclic.block.enderctrl.EnderShelfHelper;
import com.lothrazar.cyclic.block.enderctrl.TileEnderCtrl;
import com.lothrazar.cyclic.registry.TileRegistry;
import com.lothrazar.cyclic.util.UtilBlockstates;
import com.lothrazar.cyclic.util.UtilEnchant;
import java.util.Set;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;

public class BlockEnderShelf extends BlockBase {

  public BlockEnderShelf(Properties properties, boolean isController) {
    super(properties.hardnessAndResistance(1.8F));
  }

  @Override
  @OnlyIn(Dist.CLIENT)
  public void registerClient() {
    ClientRegistry.bindTileEntityRenderer(TileRegistry.ender_shelf, EnderShelfRenderer::new);
  }

  @Override
  protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
    builder.add(BlockStateProperties.HORIZONTAL_FACING);
  }

  @Override
  public boolean hasTileEntity(BlockState state) {
    return true;
  }

  @Override
  public TileEntity createTileEntity(BlockState state, IBlockReader world) {
    return new TileEnderShelf();
  }

  @Override
  public void onBlockPlacedBy(World world, BlockPos pos, BlockState state, LivingEntity entity, ItemStack stack) {
    if (entity != null) {
      world.setBlockState(pos, state.with(BlockStateProperties.HORIZONTAL_FACING, UtilBlockstates.getFacingFromEntityHorizontal(pos, entity)), 2);
      if (world.getTileEntity(pos) != null && world.getTileEntity(pos) instanceof TileEnderShelf) {
        TileEnderShelf shelf = (TileEnderShelf) world.getTileEntity(pos);
        BlockPos controllerPos = EnderShelfHelper.findConnectedController(world, pos);
        if (controllerPos != null) {
          shelf.setControllerLocation(controllerPos);
          TileEnderCtrl controller = (TileEnderCtrl) world.getTileEntity(controllerPos);
          if (controllerPos != null && controller != null) {
            Set<BlockPos> shelves = EnderShelfHelper.findConnectedShelves(world, controllerPos);
            controller.setShelves(shelves);
          }
        }
      }
    }
  }

  @Override
  public void onReplaced(BlockState state, World worldIn, BlockPos pos, BlockState newState, boolean isMoving) {
    //    boolean isCurrentlyShelf = EnderShelfHelper.isShelf(state);
    //    boolean isNewShelf = EnderShelfHelper.isShelf(newState);
    //    TileEnderShelf teThisShelf = getTileEntity(worldIn, pos);
    //    if (isCurrentlyShelf && !isNewShelf && teThisShelf != null && teThisShelf.getControllerLocation() != null) {
    //      //trigger controller reindex
    //      teThisShelf.setShelves(EnderShelfHelper.findConnectedShelves(worldIn, pos));
    //    }
    if (state.getBlock() != newState.getBlock()) {
      TileEntity tileentity = worldIn.getTileEntity(pos);
      if (tileentity != null) {
        IItemHandler items = tileentity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY).orElse(null);
        if (items != null) {
          for (int i = 0; i < items.getSlots(); ++i) {
            ItemStack is = items.getStackInSlot(i);
            while (!is.isEmpty()) {
              InventoryHelper.spawnItemStack(worldIn, pos.getX(), pos.getY(), pos.getZ(), is.split(1));
            }
          }
          worldIn.updateComparatorOutputLevel(pos, this);
          worldIn.removeTileEntity(pos);
        }
      }
    }
  }

  @Override
  public ActionResultType onBlockActivated(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult hit) {
    ItemStack heldItem = player.getHeldItem(hand);
    if (hand != Hand.MAIN_HAND && heldItem.isEmpty()) {
      //if your hand is empty, dont process if its the OFF hand
      //otherwise: main hand inserts, off hand takes out right away
      return ActionResultType.PASS;
    }
    Direction face = hit.getFace();
    Vector3d hitVec = hit.getHitVec();
    int slot = getSlotFromHitVec(pos, face, hitVec);
    if (world.getTileEntity(pos) instanceof TileEnderShelf) {
      TileEnderShelf shelf = getTileEntity(world, pos);
      if (hit.getFace() == state.get(BlockStateProperties.HORIZONTAL_FACING)) {
        //
        // single shelf
        //
        if (heldItem.getItem() == Items.ENCHANTED_BOOK) {
          shelf.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY).ifPresent(h -> {
            if (h.getStackInSlot(slot) == ItemStack.EMPTY || UtilEnchant.doBookEnchantmentsMatch(h.getStackInSlot(slot), heldItem)) {
              if (!world.isRemote) {
                ItemStack remaining = h.insertItem(slot, heldItem, false);
                player.setHeldItem(hand, remaining);
              }
            }
          });
        }
        else if (heldItem.isEmpty()) {
          shelf.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY).ifPresent(h -> {
            ItemStack retrievedBook = h.extractItem(slot, 1, false);
            player.setHeldItem(hand, retrievedBook);
          });
        }
      }
    }
    return ActionResultType.PASS;
  }

  private int getSlotFromHitVec(BlockPos pos, Direction face, Vector3d hitVec) {
    double normalizedY = hitVec.getY() - pos.getY();
    return (int) Math.floor(normalizedY / 0.20);
  }

  public TileEnderShelf getTileEntity(World world, BlockPos pos) {
    return (TileEnderShelf) world.getTileEntity(pos);
  }
}
