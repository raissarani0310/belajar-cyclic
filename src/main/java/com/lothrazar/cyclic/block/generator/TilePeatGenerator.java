package com.lothrazar.cyclic.block.generator;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.lothrazar.cyclic.base.TileEntityBase;
import com.lothrazar.cyclic.capability.CustomEnergyStorage;
import com.lothrazar.cyclic.registry.BlockRegistry;
import com.lothrazar.cyclic.registry.ItemRegistry;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.INBTSerializable;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.energy.CapabilityEnergy;
import net.minecraftforge.energy.IEnergyStorage;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;

public class TilePeatGenerator extends TileEntityBase implements ITickableTileEntity, INamedContainerProvider {

  private static final int BURNTIME = 40;

  public static enum Fields {
    FLOWING, REDSTONE;
  }

  private int fuelRate = 10;
  private LazyOptional<IEnergyStorage> energy = LazyOptional.of(this::createEnergy);
  private int burnTime;
  private int flowing = 1;

  public TilePeatGenerator() {
    super(BlockRegistry.Tiles.peat_generatorTile);
  }

  private LazyOptional<IItemHandler> inventory = LazyOptional.of(this::createHandler);

  private IItemHandler createHandler() {
    return new ItemStackHandler(1);
  }

  private IEnergyStorage createEnergy() {
    return new CustomEnergyStorage(MENERGY, FUEL_WEAK);
  }

  @Override
  public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap, Direction side) {
    if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
      return inventory.cast();
    }
    if (cap == CapabilityEnergy.ENERGY) {
      return energy.cast();
    }
    return super.getCapability(cap, side);
  }
  //  private void setAnimation(boolean lit) {
  //    this.world.setBlockState(pos, this.world.getBlockState(pos).with(BlockFan.IS_LIT, lit));
  //  }

  @Override
  public void read(CompoundNBT tag) {
    setFlowing(tag.getInt("flowing"));
    burnTime = tag.getInt("burnTime");
    fuelRate = tag.getInt("fuelRate");
    energy.ifPresent(h -> ((INBTSerializable<CompoundNBT>) h).deserializeNBT(tag.getCompound("energy")));
    inventory.ifPresent(h -> ((INBTSerializable<CompoundNBT>) h).deserializeNBT(tag.getCompound("inv")));
    super.read(tag);
  }

  @Override
  public CompoundNBT write(CompoundNBT tag) {
    tag.putInt("flowing", getFlowing());
    tag.putInt("fuelRate", fuelRate);
    tag.putInt("burnTime", burnTime);
    inventory.ifPresent(h -> {
      CompoundNBT compound = ((INBTSerializable<CompoundNBT>) h).serializeNBT();
      tag.put("inv", compound);
    });
    energy.ifPresent(h -> {
      CompoundNBT compound = ((INBTSerializable<CompoundNBT>) h).serializeNBT();
      tag.put("energy", compound);
    });
    return super.write(tag);
  }

  private boolean isBurning() {
    return this.burnTime > 0;
  }

  @Override
  public void tick() {
    if (this.requiresRedstone() && !this.isPowered()) {
      return;
    }
    if (this.isBurning() && !this.isFull()) {
      --this.burnTime;
      this.addEnergy(fuelRate);
    }
    inventory.ifPresent(h -> {
      ItemStack stack = h.getStackInSlot(0);
      if (stack.getItem() == ItemRegistry.peat_fuel &&
          this.isBurning() == false) {
        fuelRate = FUEL_WEAK;//for peat_fuel item
        //other types of fuel in the future
        //burn time
        h.extractItem(0, 1, false);
        this.burnTime = BURNTIME;
      }
    });
    if (this.getFlowing() == 1)
      this.tickCableFlow();
  }

  private void tickCableFlow() {
    List<Integer> rawList = IntStream.rangeClosed(
        0,
        5).boxed().collect(Collectors.toList());
    Collections.shuffle(rawList);
    for (Integer i : rawList) {
      Direction exportToSide = Direction.values()[i];
      moveEnergy(exportToSide, FUEL_WEAK);
    }
  }

  public boolean isFull() {
    CustomEnergyStorage e = (CustomEnergyStorage) energy.cast().orElse(null);
    return e == null || e.getEnergyStored() >= e.getMaxEnergyStored();
  }

  private void addEnergy(int i) {
    energy.ifPresent(e -> ((CustomEnergyStorage) e).addEnergy(i));
  }

  public int getBurnTime() {
    return this.burnTime;
  }

  public void setBurnTime(int value) {
    burnTime = value;
  }

  @Override
  public ITextComponent getDisplayName() {
    return new StringTextComponent(getType().getRegistryName().getPath());
  }

  @Nullable
  @Override
  public Container createMenu(int i, PlayerInventory playerInventory, PlayerEntity playerEntity) {
    return new ContainerGenerator(i, world, pos, playerInventory, playerEntity);
  }

  public int getFlowing() {
    return flowing;
  }

  public void setFlowing(int flowing) {
    this.flowing = flowing;
  }

  @Override
  public void setField(int field, int value) {
    switch (Fields.values()[field]) {
      case FLOWING:
        flowing = value;
      break;
      case REDSTONE:
        setNeedsRedstone(value);
      break;
    }
  }
}