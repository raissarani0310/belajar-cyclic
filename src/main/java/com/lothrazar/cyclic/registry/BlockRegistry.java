package com.lothrazar.cyclic.registry;

import java.util.ArrayList;
import java.util.List;
import com.lothrazar.cyclic.ModCyclic;
import com.lothrazar.cyclic.block.BlockCyclic;
import com.lothrazar.cyclic.block.BlockSimple;
import com.lothrazar.cyclic.block.ButtonBlockMat;
import com.lothrazar.cyclic.block.CandlePeaceBlock;
import com.lothrazar.cyclic.block.CandleWaterBlock;
import com.lothrazar.cyclic.block.DoorbellButton;
import com.lothrazar.cyclic.block.FireplaceBlock;
import com.lothrazar.cyclic.block.FlowerSimpleBlock;
import com.lothrazar.cyclic.block.LaunchBlock;
import com.lothrazar.cyclic.block.LavaSpongeBlock;
import com.lothrazar.cyclic.block.MetalBarsBlock;
import com.lothrazar.cyclic.block.PeatBlock;
import com.lothrazar.cyclic.block.PeatFuelBlock;
import com.lothrazar.cyclic.block.PressurePlateMetal;
import com.lothrazar.cyclic.block.anvil.BlockAnvilAuto;
import com.lothrazar.cyclic.block.anvilmagma.BlockAnvilMagma;
import com.lothrazar.cyclic.block.anvilvoid.BlockAnvilVoid;
import com.lothrazar.cyclic.block.apple.AppleCropBlock;
import com.lothrazar.cyclic.block.battery.BlockBattery;
import com.lothrazar.cyclic.block.battery.ClayBattery;
import com.lothrazar.cyclic.block.beaconpotion.BlockPotion;
import com.lothrazar.cyclic.block.bedrock.UnbreakableBlock;
import com.lothrazar.cyclic.block.bedrock.UnbreakablePoweredBlock;
import com.lothrazar.cyclic.block.breaker.BlockBreaker;
import com.lothrazar.cyclic.block.cable.energy.BlockCableEnergy;
import com.lothrazar.cyclic.block.cable.fluid.BlockCableFluid;
import com.lothrazar.cyclic.block.cable.item.BlockCableItem;
import com.lothrazar.cyclic.block.clock.BlockRedstoneClock;
import com.lothrazar.cyclic.block.collectfluid.BlockFluidCollect;
import com.lothrazar.cyclic.block.collectitem.BlockItemCollector;
import com.lothrazar.cyclic.block.conveyor.BlockConveyor;
import com.lothrazar.cyclic.block.crafter.BlockCrafter;
import com.lothrazar.cyclic.block.crate.BlockCrate;
import com.lothrazar.cyclic.block.creativebattery.BlockBatteryInfinite;
import com.lothrazar.cyclic.block.creativeitem.BlockItemInfinite;
import com.lothrazar.cyclic.block.crusher.BlockCrusher;
import com.lothrazar.cyclic.block.detectmoon.BlockMoon;
import com.lothrazar.cyclic.block.detectorentity.BlockDetector;
import com.lothrazar.cyclic.block.detectoritem.BlockDetectorItem;
import com.lothrazar.cyclic.block.detectweather.BlockWeather;
import com.lothrazar.cyclic.block.dice.BlockDice;
import com.lothrazar.cyclic.block.disenchant.BlockDisenchant;
import com.lothrazar.cyclic.block.dropper.BlockDropper;
import com.lothrazar.cyclic.block.enderctrl.BlockEnderCtrl;
import com.lothrazar.cyclic.block.enderitemshelf.BlockItemShelf;
import com.lothrazar.cyclic.block.endershelf.BlockEnderShelf;
import com.lothrazar.cyclic.block.expcollect.BlockExpPylon;
import com.lothrazar.cyclic.block.eye.BlockEye;
import com.lothrazar.cyclic.block.eyetp.BlockEyeTp;
import com.lothrazar.cyclic.block.fan.BlockFan;
import com.lothrazar.cyclic.block.fanslab.BlockFanSlab;
import com.lothrazar.cyclic.block.fishing.BlockFisher;
import com.lothrazar.cyclic.block.forester.BlockForester;
import com.lothrazar.cyclic.block.generatorfluid.BlockGeneratorFluid;
import com.lothrazar.cyclic.block.generatorfood.BlockGeneratorFood;
import com.lothrazar.cyclic.block.generatorfuel.BlockGeneratorFuel;
import com.lothrazar.cyclic.block.generatoritem.BlockGeneratorDrops;
import com.lothrazar.cyclic.block.generatorsolar.BlockGeneratorSolar;
import com.lothrazar.cyclic.block.glass.DarkGlassBlock;
import com.lothrazar.cyclic.block.glass.DarkGlassConnectedBlock;
import com.lothrazar.cyclic.block.glass.GlassConnectedBlock;
import com.lothrazar.cyclic.block.harvester.BlockHarvester;
import com.lothrazar.cyclic.block.hopper.BlockSimpleHopper;
import com.lothrazar.cyclic.block.hopperfluid.BlockFluidHopper;
import com.lothrazar.cyclic.block.hoppergold.BlockGoldHopper;
import com.lothrazar.cyclic.block.laser.BlockLaser;
import com.lothrazar.cyclic.block.lightcompr.BlockLightCamo;
import com.lothrazar.cyclic.block.magnet.BlockMagnetPanel;
import com.lothrazar.cyclic.block.melter.BlockMelter;
import com.lothrazar.cyclic.block.miner.BlockMiner;
import com.lothrazar.cyclic.block.packager.BlockPackager;
import com.lothrazar.cyclic.block.peatfarm.BlockPeatFarm;
import com.lothrazar.cyclic.block.phantom.CloudBlock;
import com.lothrazar.cyclic.block.phantom.CloudPlayerBlock;
import com.lothrazar.cyclic.block.phantom.GhostBlock;
import com.lothrazar.cyclic.block.phantom.MembraneBlock;
import com.lothrazar.cyclic.block.phantom.MembraneLamp;
import com.lothrazar.cyclic.block.phantom.SoilBlock;
import com.lothrazar.cyclic.block.placer.BlockPlacer;
import com.lothrazar.cyclic.block.placerfluid.BlockPlacerFluid;
import com.lothrazar.cyclic.block.rotator.BlockRotator;
import com.lothrazar.cyclic.block.scaffolding.BlockScaffolding;
import com.lothrazar.cyclic.block.scaffolding.BlockScaffoldingReplace;
import com.lothrazar.cyclic.block.scaffolding.BlockScaffoldingResponsive;
import com.lothrazar.cyclic.block.screen.BlockScreentext;
import com.lothrazar.cyclic.block.shapebuilder.BlockStructure;
import com.lothrazar.cyclic.block.shapedata.BlockShapedata;
import com.lothrazar.cyclic.block.shears.BlockShearing;
import com.lothrazar.cyclic.block.solidifier.BlockSolidifier;
import com.lothrazar.cyclic.block.soundmuff.SoundmufflerBlock;
import com.lothrazar.cyclic.block.soundmuff.ghost.SoundmufflerBlockGhost;
import com.lothrazar.cyclic.block.soundplay.BlockSoundPlayer;
import com.lothrazar.cyclic.block.soundrecord.BlockSoundRecorder;
import com.lothrazar.cyclic.block.spikes.EnumSpikeType;
import com.lothrazar.cyclic.block.spikes.SpikesBlock;
import com.lothrazar.cyclic.block.spikes.SpikesDiamond;
import com.lothrazar.cyclic.block.sprinkler.BlockSprinkler;
import com.lothrazar.cyclic.block.tank.BlockFluidTank;
import com.lothrazar.cyclic.block.tankcask.BlockCask;
import com.lothrazar.cyclic.block.terraglass.BlockTerraGlass;
import com.lothrazar.cyclic.block.terrasoil.BlockTerraPreta;
import com.lothrazar.cyclic.block.tp.BlockTeleport;
import com.lothrazar.cyclic.block.trash.BlockTrash;
import com.lothrazar.cyclic.block.uncrafter.BlockUncraft;
import com.lothrazar.cyclic.block.user.BlockUser;
import com.lothrazar.cyclic.block.wireless.energy.BlockWirelessEnergy;
import com.lothrazar.cyclic.block.wireless.fluid.BlockWirelessFluid;
import com.lothrazar.cyclic.block.wireless.item.BlockWirelessItem;
import com.lothrazar.cyclic.block.wireless.redstone.BlockWirelessRec;
import com.lothrazar.cyclic.block.wireless.redstone.BlockWirelessTransmit;
import com.lothrazar.cyclic.block.workbench.BlockWorkbench;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ChainBlock;
import net.minecraft.world.level.block.LanternBlock;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BlockRegistry {

  public static List<BlockCyclic> BLOCKSCLIENTREGISTRY = new ArrayList<>(); // TODO: refactor this
  public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ModCyclic.MODID);
  public static final RegistryObject<Block> COMPRESSED_COBBLESTONE = BLOCKS.register("compressed_cobblestone", () -> new BlockSimple(Block.Properties.of(Material.STONE, DyeColor.GRAY).strength(1.0F, 7.0F)) {

    @Override
    public void appendHoverText(ItemStack stack, BlockGetter worldIn, List<Component> tooltip, TooltipFlag flagIn) {}
  });
  public static final RegistryObject<Block> FLINT_BLOCK = BLOCKS.register("flint_block", () -> new BlockSimple(Block.Properties.of(Material.STONE, DyeColor.BLACK).strength(1.3F, 5.0F)) {

    @Override
    public void appendHoverText(ItemStack stack, BlockGetter worldIn, List<Component> tooltip, TooltipFlag flagIn) {}
  });
  public static final RegistryObject<Block> SPIKES_IRON = BLOCKS.register("spikes_iron", () -> new SpikesBlock(Block.Properties.of(Material.STONE), EnumSpikeType.PLAIN));
  public static final RegistryObject<Block> SPIKES_FIRE = BLOCKS.register("spikes_fire", () -> new SpikesBlock(Block.Properties.of(Material.STONE), EnumSpikeType.FIRE));
  public static final RegistryObject<Block> SPIKES_CURSE = BLOCKS.register("spikes_curse", () -> new SpikesBlock(Block.Properties.of(Material.STONE), EnumSpikeType.CURSE));
  public static final RegistryObject<Block> SPIKES_DIAMOND = BLOCKS.register("spikes_diamond", () -> new SpikesDiamond(Block.Properties.of(Material.METAL)));
  public static final RegistryObject<Block> FLUIDHOPPER = BLOCKS.register("hopper_fluid", () -> new BlockFluidHopper(Block.Properties.of(Material.STONE)));
  public static final RegistryObject<Block> HOPPER = BLOCKS.register("hopper", () -> new BlockSimpleHopper(Block.Properties.of(Material.WOOD)));
  public static final RegistryObject<Block> HOPPERGOLD = BLOCKS.register("hopper_gold", () -> new BlockGoldHopper(Block.Properties.of(Material.METAL)));
  public static final RegistryObject<Block> ANVILVOID = BLOCKS.register("anvil_void", () -> new BlockAnvilVoid(Block.Properties.of(Material.HEAVY_METAL)));
  public static final RegistryObject<Block> FANSLAB = BLOCKS.register("fan_slab", () -> new BlockFanSlab(Block.Properties.of(Material.STONE)));
  public static final RegistryObject<Block> ROTATOR = BLOCKS.register("rotator", () -> new BlockRotator(Block.Properties.of(Material.STONE)));
  public static final RegistryObject<Block> DETECTORMOON = BLOCKS.register("detector_moon", () -> new BlockMoon(Block.Properties.of(Material.STONE)));
  public static final RegistryObject<Block> DETECTORWEATHER = BLOCKS.register("detector_weather", () -> new BlockWeather(Block.Properties.of(Material.STONE)));
  public static final RegistryObject<Block> TERRAGLASS = BLOCKS.register("terra_glass", () -> new BlockTerraGlass(Block.Properties.of(Material.STONE)));
  public static final RegistryObject<Block> SPRINKLER = BLOCKS.register("sprinkler", () -> new BlockSprinkler(Block.Properties.of(Material.STONE)));
  public static final RegistryObject<Block> SHEARING = BLOCKS.register("shearing", () -> new BlockShearing(Block.Properties.of(Material.STONE)));
  public static final RegistryObject<Block> DARK_GLASS_CONNECTED = BLOCKS.register("dark_glass_connected", () -> new DarkGlassConnectedBlock(Block.Properties.of(Material.DIRT)));
  public static final RegistryObject<Block> GLASS_CONNECTED = BLOCKS.register("glass_connected", () -> new GlassConnectedBlock(Block.Properties.of(Material.GLASS)));
  public static final RegistryObject<Block> ENDER_ITEM_SHELF = BLOCKS.register("ender_item_shelf", () -> new BlockItemShelf(Block.Properties.of(Material.WOOD)));
  public static final RegistryObject<Block> DOORBELL = BLOCKS.register("doorbell", () -> new DoorbellButton(Block.Properties.of(Material.WOOD)));
  public static final RegistryObject<Block> WIRELESS_ENERGY = BLOCKS.register("wireless_energy", () -> new BlockWirelessEnergy(Block.Properties.of(Material.METAL)));
  public static final RegistryObject<Block> WIRELESS_ITEM = BLOCKS.register("wireless_item", () -> new BlockWirelessItem(Block.Properties.of(Material.METAL)));
  public static final RegistryObject<Block> WIRELESS_FLUID = BLOCKS.register("wireless_fluid", () -> new BlockWirelessFluid(Block.Properties.of(Material.METAL)));
  public static final RegistryObject<Block> SOUND_RECORDER = BLOCKS.register("sound_recorder", () -> new BlockSoundRecorder(Block.Properties.of(Material.METAL)));
  public static final RegistryObject<Block> SOUND_PLAYER = BLOCKS.register("sound_player", () -> new BlockSoundPlayer(Block.Properties.of(Material.METAL)));
  public static final RegistryObject<Block> GENERATOR_FUEL = BLOCKS.register("generator_fuel", () -> new BlockGeneratorFuel(Block.Properties.of(Material.METAL)));
  public static final RegistryObject<Block> GENERATOR_FOOD = BLOCKS.register("generator_food", () -> new BlockGeneratorFood(Block.Properties.of(Material.METAL)));
  public static final RegistryObject<Block> GENERATOR_FLUID = BLOCKS.register("generator_fluid", () -> new BlockGeneratorFluid(Block.Properties.of(Material.METAL)));
  public static final RegistryObject<Block> GENERATOR_ITEM = BLOCKS.register("generator_item", () -> new BlockGeneratorDrops(Block.Properties.of(Material.METAL)));
  public static final RegistryObject<Block> PACKAGER = BLOCKS.register("packager", () -> new BlockPackager(Block.Properties.of(Material.METAL)));
  public static final RegistryObject<Block> TERRA_PRETA = BLOCKS.register("terra_preta", () -> new BlockTerraPreta(Block.Properties.of(Material.DIRT).sound(SoundType.GRAVEL)));
  public static final RegistryObject<Block> LIGHT_CAMO = BLOCKS.register("light_camo", () -> new BlockLightCamo(Block.Properties.of(Material.METAL)));
  public static final RegistryObject<Block> LASER = BLOCKS.register("laser", () -> new BlockLaser(Block.Properties.of(Material.METAL)));
  public static final RegistryObject<Block> FLOWER_CYAN = BLOCKS.register("flower_cyan", () -> new FlowerSimpleBlock(Block.Properties.of(Material.PLANT, DyeColor.CYAN)));
  public static final RegistryObject<Block> FLOWER_PURPLE_TULIP = BLOCKS.register("flower_purple_tulip", () -> new FlowerSimpleBlock(Block.Properties.of(Material.PLANT, DyeColor.PURPLE)));
  public static final RegistryObject<Block> FLOWER_LIME_CARNATION = BLOCKS.register("flower_lime_carnation", () -> new FlowerSimpleBlock(Block.Properties.of(Material.PLANT, DyeColor.LIME)));
  public static final RegistryObject<Block> FLOWER_ABSALON_TULIP = BLOCKS.register("flower_absalon_tulip", () -> new FlowerSimpleBlock(Block.Properties.of(Material.PLANT, DyeColor.BROWN)));
  public static final RegistryObject<Block> MEMBRANE = BLOCKS.register("membrane", () -> new MembraneBlock(Block.Properties.of(Material.DIRT)));
  public static final RegistryObject<Block> LAMP = BLOCKS.register("lamp", () -> new MembraneLamp(Block.Properties.of(Material.STONE, DyeColor.WHITE)));
  public static final RegistryObject<Block> SOIL = BLOCKS.register("soil", () -> new SoilBlock(Block.Properties.of(Material.DIRT)));
  public static final RegistryObject<Block> CLOUD = BLOCKS.register("cloud", () -> new CloudBlock(Block.Properties.of(Material.DIRT)));
  public static final RegistryObject<Block> CLOUD_MEMBRANE = BLOCKS.register("cloud_membrane", () -> new CloudPlayerBlock(Block.Properties.of(Material.DIRT)));
  public static final RegistryObject<Block> GHOST = BLOCKS.register("ghost", () -> new GhostBlock(Block.Properties.of(Material.STONE), false));
  public static final RegistryObject<Block> GHOST_PHANTOM = BLOCKS.register("ghost_phantom", () -> new GhostBlock(Block.Properties.of(Material.STONE), true));
  public static final RegistryObject<Block> WORKBENCH = BLOCKS.register("workbench", () -> new BlockWorkbench(Block.Properties.of(Material.STONE)));
  public static final RegistryObject<Block> OBSIDIAN_PRESSURE_PLATE = BLOCKS.register("obsidian_pressure_plate", () -> new PressurePlateMetal(Block.Properties.of(Material.METAL, Blocks.OBSIDIAN.defaultMaterialColor()).noCollission().strength(0.5F)));
  public static final RegistryObject<Block> GOLD_BARS = BLOCKS.register("gold_bars", () -> new MetalBarsBlock(Block.Properties.of(Material.METAL)));
  public static final RegistryObject<Block> GOLD_CHAIN = BLOCKS.register("gold_chain", () -> new ChainBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(1).sound(SoundType.CHAIN).noOcclusion()));
  public static final RegistryObject<Block> GOLD_LANTERN = BLOCKS.register("gold_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).noOcclusion().strength(1.5F).sound(SoundType.LANTERN).lightLevel(p -> 14)));
  public static final RegistryObject<Block> GOLD_SOUL_LANTERN = BLOCKS.register("gold_soul_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).noOcclusion().strength(1.5F).sound(SoundType.LANTERN).lightLevel(p -> 15)));
  public static final RegistryObject<Block> COPPER_BARS = BLOCKS.register("copper_bars", () -> new MetalBarsBlock(Block.Properties.of(Material.METAL)));
  public static final RegistryObject<Block> COPPER_CHAIN = BLOCKS.register("copper_chain", () -> new ChainBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(1.0F).sound(SoundType.CHAIN).noOcclusion()));
  public static final RegistryObject<Block> COPPER_LANTERN = BLOCKS.register("copper_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).noOcclusion().strength(1.5F).sound(SoundType.LANTERN).lightLevel(p -> 12))); //soul_lantern=10
  public static final RegistryObject<Block> COPPER_SOUL_LANTERN = BLOCKS.register("copper_soul_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).noOcclusion().strength(1.5F).sound(SoundType.LANTERN).lightLevel(p -> 13))); //soul_lantern=10
  public static final RegistryObject<Block> COPPER_PRESSURE_PLATE = BLOCKS.register("copper_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.METAL, Blocks.COPPER_BLOCK.defaultMaterialColor()).noCollission().strength(0.5F)) {

    @Override
    protected int getSignalForState(BlockState st) {
      return st.getValue(POWERED) ? 8 : 0;
    }
  });
  public static final RegistryObject<Block> NETHERITE_BARS = BLOCKS.register("netherite_bars", () -> new MetalBarsBlock(Block.Properties.of(Material.METAL)));
  public static final RegistryObject<Block> NETHERTIE_CHAIN = BLOCKS.register("netherite_chain", () -> new ChainBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(5.0F, 6.0F).sound(SoundType.CHAIN).noOcclusion()));
  public static final RegistryObject<Block> NETHERITE_LANTERN = BLOCKS.register("netherite_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).noOcclusion().strength(3.5F).sound(SoundType.LANTERN).lightLevel(p -> 15))); // same as lantern=15
  public static final RegistryObject<Block> NETHERITE_PRESSURE_PLATE = BLOCKS.register("netherite_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.METAL, Blocks.COPPER_BLOCK.defaultMaterialColor()).noCollission().strength(0.5F)));
  public static final RegistryObject<Block> SPONGE_LAVA = BLOCKS.register("sponge_lava", () -> new LavaSpongeBlock(Block.Properties.of(Material.SPONGE).lightLevel(p -> 2)));
  public static final RegistryObject<Block> CRUSHER = BLOCKS.register("crusher", () -> new BlockCrusher(Block.Properties.of(Material.METAL)));
  public static final RegistryObject<Block> PEACE_CANDLE = BLOCKS.register("peace_candle", () -> new CandlePeaceBlock(Block.Properties.of(Material.STONE)
      .lightLevel(p -> p.getValue(BlockCyclic.LIT) ? 6 : 0)));
  public static final RegistryObject<Block> WATER_CANDLE = BLOCKS.register("water_candle", () -> new CandleWaterBlock(Block.Properties.of(Material.STONE)
      .lightLevel(p -> p.getValue(BlockCyclic.LIT) ? 1 : 0)));
  public static final RegistryObject<Block> TELEPORT = BLOCKS.register("teleport", () -> new BlockTeleport(Block.Properties.of(Material.STONE)));
  public static final RegistryObject<Block> APPLE_SPROUT_EMERALD = BLOCKS.register("apple_sprout_emerald", () -> new AppleCropBlock(Block.Properties.of(Material.PLANT), false));
  public static final RegistryObject<Block> APPLE_SPROUT_DIAMOND = BLOCKS.register("apple_sprout_diamond", () -> new AppleCropBlock(Block.Properties.of(Material.PLANT), false));
  public static final RegistryObject<Block> APPLE_SPROUT = BLOCKS.register("apple_sprout", () -> new AppleCropBlock(Block.Properties.of(Material.PLANT), true));
  public static final RegistryObject<Block> COMPUTER_SHAPE = BLOCKS.register("computer_shape", () -> new BlockShapedata(Block.Properties.of(Material.METAL)));
  public static final RegistryObject<Block> SCAFFOLD_FRAGILE = BLOCKS.register("scaffold_fragile", () -> new BlockScaffolding(Block.Properties.of(Material.WOOD), true));
  public static final RegistryObject<Block> SCAFFOLD_RESPONSIVE = BLOCKS.register("scaffold_responsive", () -> new BlockScaffoldingResponsive(Block.Properties.of(Material.WOOD), false));
  public static final RegistryObject<Block> SCAFFOLD_REPLACE = BLOCKS.register("scaffold_replace", () -> new BlockScaffoldingReplace(Block.Properties.of(Material.WOOD)));
  public static final RegistryObject<Block> DARK_GLASS = BLOCKS.register("dark_glass", () -> new DarkGlassBlock(Block.Properties.of(Material.DIRT)));
  public static final RegistryObject<Block> PEAT_UNBAKED = BLOCKS.register("peat_unbaked", () -> new PeatBlock(Block.Properties.of(Material.DIRT).sound(SoundType.GRAVEL)));
  public static final RegistryObject<Block> PEAT_BAKED = BLOCKS.register("peat_baked", () -> new PeatFuelBlock(Block.Properties.of(Material.DIRT).sound(SoundType.GRAVEL)));
  public static final RegistryObject<Block> PEAT_FARM = BLOCKS.register("peat_farm", () -> new BlockPeatFarm(Block.Properties.of(Material.STONE)));
  public static final RegistryObject<Block> SOLIDIFIER = BLOCKS.register("solidifier", () -> new BlockSolidifier(Block.Properties.of(Material.STONE)));
  public static final RegistryObject<Block> MELTER = BLOCKS.register("melter", () -> new BlockMelter(Block.Properties.of(Material.STONE)));
  public static final RegistryObject<Block> BATTERY = BLOCKS.register("battery", () -> new BlockBattery(Block.Properties.of(Material.STONE)));
  public static final RegistryObject<Block> CASK = BLOCKS.register("cask", () -> new BlockCask(Block.Properties.of(Material.WOOD)));
  public static final RegistryObject<Block> CRATE = BLOCKS.register("crate", () -> new BlockCrate(Block.Properties.of(Material.WOOD)));
  public static final RegistryObject<Block> EYE_REDSTONE = BLOCKS.register("eye_redstone", () -> new BlockEye(Block.Properties.of(Material.WOOD)));
  public static final RegistryObject<Block> EYE_TELEPORT = BLOCKS.register("eye_teleport", () -> new BlockEyeTp(Block.Properties.of(Material.WOOD)));
  public static final RegistryObject<Block> PLACER = BLOCKS.register("placer", () -> new BlockPlacer(Block.Properties.of(Material.STONE)));
  public static final RegistryObject<Block> BREAKER = BLOCKS.register("breaker", () -> new BlockBreaker(Block.Properties.of(Material.STONE)));
  public static final RegistryObject<Block> DROPPER = BLOCKS.register("dropper", () -> new BlockDropper(Block.Properties.of(Material.METAL)));
  public static final RegistryObject<Block> FORESTER = BLOCKS.register("forester", () -> new BlockForester(Block.Properties.of(Material.METAL)));
  public static final RegistryObject<Block> HARVESTER = BLOCKS.register("harvester", () -> new BlockHarvester(Block.Properties.of(Material.STONE)));
  public static final RegistryObject<Block> MINER = BLOCKS.register("miner", () -> new BlockMiner(Block.Properties.of(Material.METAL)));
  public static final RegistryObject<Block> PLACER_FLUID = BLOCKS.register("placer_fluid", () -> new BlockPlacerFluid(Block.Properties.of(Material.METAL)));
  public static final RegistryObject<Block> USER = BLOCKS.register("user", () -> new BlockUser(Block.Properties.of(Material.STONE)));
  public static final RegistryObject<Block> COLLECTOR = BLOCKS.register("collector", () -> new BlockItemCollector(Block.Properties.of(Material.STONE)));
  public static final RegistryObject<Block> COLLECTOR_FLUID = BLOCKS.register("collector_fluid", () -> new BlockFluidCollect(Block.Properties.of(Material.STONE)));
  public static final RegistryObject<Block> STRUCTURE = BLOCKS.register("structure", () -> new BlockStructure(Block.Properties.of(Material.STONE)));
  public static final RegistryObject<Block> UNCRAFTER = BLOCKS.register("uncrafter", () -> new BlockUncraft(Block.Properties.of(Material.METAL)));
  public static final RegistryObject<Block> CRAFTER = BLOCKS.register("crafter", () -> new BlockCrafter(Block.Properties.of(Material.METAL)));
  public static final RegistryObject<Block> CONVEYOR = BLOCKS.register("conveyor", () -> new BlockConveyor(Block.Properties.of(Material.METAL)));
  public static final RegistryObject<Block> TANK = BLOCKS.register("tank", () -> new BlockFluidTank(Block.Properties.of(Material.STONE)));
  public static final RegistryObject<Block> ANVIL = BLOCKS.register("anvil", () -> new BlockAnvilAuto(Block.Properties.of(Material.HEAVY_METAL).sound(SoundType.ANVIL)));
  public static final RegistryObject<Block> ANVIL_MAGMA = BLOCKS.register("anvil_magma", () -> new BlockAnvilMagma(Block.Properties.of(Material.HEAVY_METAL).sound(SoundType.ANVIL)));
  public static final RegistryObject<Block> BEACON = BLOCKS.register("beacon", () -> new BlockPotion(Block.Properties.of(Material.METAL)));
  public static final RegistryObject<Block> SOUNDPROOFING_GHOST = BLOCKS.register("soundproofing_ghost", () -> new SoundmufflerBlockGhost(Block.Properties.of(Material.STONE)));
  public static final RegistryObject<Block> SOUNDPROOFING = BLOCKS.register("soundproofing", () -> new SoundmufflerBlock(Block.Properties.of(Material.STONE)));
  public static final RegistryObject<Block> CLOCK = BLOCKS.register("clock", () -> new BlockRedstoneClock(Block.Properties.of(Material.STONE)));
  public static final RegistryObject<Block> WIRELESS_RECEIVER = BLOCKS.register("wireless_receiver", () -> new BlockWirelessRec(Block.Properties.of(Material.STONE)));
  public static final RegistryObject<Block> WIRELESS_TRANSMITTER = BLOCKS.register("wireless_transmitter", () -> new BlockWirelessTransmit(Block.Properties.of(Material.STONE)));
  public static final RegistryObject<Block> FISHER = BLOCKS.register("fisher", () -> new BlockFisher(Block.Properties.of(Material.STONE)));
  public static final RegistryObject<Block> DISENCHANTER = BLOCKS.register("disenchanter", () -> new BlockDisenchant(Block.Properties.of(Material.STONE)));
  public static final RegistryObject<Block> EXPERIENCE_PYLON = BLOCKS.register("experience_pylon", () -> new BlockExpPylon(Block.Properties.of(Material.STONE)));
  public static final RegistryObject<Block> FAN = BLOCKS.register("fan", () -> new BlockFan(Block.Properties.of(Material.STONE)));
  public static final RegistryObject<Block> TRASH = BLOCKS.register("trash", () -> new BlockTrash(Block.Properties.of(Material.STONE)));
  public static final RegistryObject<Block> DICE = BLOCKS.register("dice", () -> new BlockDice(Block.Properties.of(Material.STONE)));
  public static final RegistryObject<Block> SCREEN = BLOCKS.register("screen", () -> new BlockScreentext(Block.Properties.of(Material.METAL)));
  public static final RegistryObject<Block> DETECTOR_ITEM = BLOCKS.register("detector_item", () -> new BlockDetectorItem(Block.Properties.of(Material.STONE)));
  public static final RegistryObject<Block> DETECTOR_ENTITY = BLOCKS.register("detector_entity", () -> new BlockDetector(Block.Properties.of(Material.STONE)));
  public static final RegistryObject<Block> ENERGY_PIPE = BLOCKS.register("energy_pipe", () -> new BlockCableEnergy(Block.Properties.of(Material.WOOL).sound(SoundType.STONE)));
  public static final RegistryObject<Block> ITEM_PIPE = BLOCKS.register("item_pipe", () -> new BlockCableItem(Block.Properties.of(Material.WOOL).sound(SoundType.STONE)));
  public static final RegistryObject<Block> FLUID_PIPE = BLOCKS.register("fluid_pipe", () -> new BlockCableFluid(Block.Properties.of(Material.WOOL).sound(SoundType.STONE)));
  public static final RegistryObject<Block> PLATE_LAUNCH = BLOCKS.register("plate_launch", () -> new LaunchBlock(Block.Properties.of(Material.STONE), false));
  public static final RegistryObject<Block> PLATE_LAUNCH_REDSTONE = BLOCKS.register("plate_launch_redstone", () -> new LaunchBlock(Block.Properties.of(Material.STONE), true));
  public static final RegistryObject<Block> BATTERY_INFINITE = BLOCKS.register("battery_infinite", () -> new BlockBatteryInfinite(Block.Properties.of(Material.STONE)));
  public static final RegistryObject<Block> ITEM_INFINITE = BLOCKS.register("item_infinite", () -> new BlockItemInfinite(Block.Properties.of(Material.STONE)));
  public static final RegistryObject<Block> FIREPLACE = BLOCKS.register("fireplace", () -> new FireplaceBlock(Block.Properties.of(Material.STONE)));
  public static final RegistryObject<Block> UNBREAKABLE_BLOCK = BLOCKS.register("unbreakable_block", () -> new UnbreakableBlock(Block.Properties.of(Material.STONE))); //stable, only changes with player interaction
  public static final RegistryObject<Block> UNBREAKABLE_REACTIVE = BLOCKS.register("unbreakable_reactive", () -> new UnbreakablePoweredBlock(Block.Properties.of(Material.STONE))); //reactive and unstable, ignores players and reads redstone 
  public static final RegistryObject<Block> ENDER_SHELF = BLOCKS.register("ender_shelf", () -> new BlockEnderShelf(Block.Properties.of(Material.STONE)));
  public static final RegistryObject<Block> ENDER_CONTROLLER = BLOCKS.register("ender_controller", () -> new BlockEnderCtrl(Block.Properties.of(Material.STONE)));
  //1.7+
  public static final RegistryObject<Block> MAGNET_BLOCK = BLOCKS.register("magnet_block", () -> new BlockMagnetPanel(Block.Properties.of(Material.STONE)));
  public static final RegistryObject<Block> BUTTON_BASALT = BLOCKS.register("button_basalt", () -> new ButtonBlockMat(Block.Properties.of(Material.STONE), 4));
  public static final RegistryObject<Block> BUTTON_BLACKSTONE = BLOCKS.register("button_blackstone", () -> new ButtonBlockMat(Block.Properties.of(Material.STONE), 8));
  public static final RegistryObject<Block> BATTERY_CLAY = BLOCKS.register("battery_clay", () -> new ClayBattery(Block.Properties.of(Material.STONE)));// NOGUI
  public static final RegistryObject<Block> GENERATOR_SOLAR = BLOCKS.register("generator_solar", () -> new BlockGeneratorSolar(Block.Properties.of(Material.STONE))); // NOGUI
  //  public static final RegistryObject<Block> ENCHANTER = BLOCKS.register("enchanter", () -> new Block(Block.Properties.of(Material.STONE)));
  //cursed altars
  //flight = bat and phaontom. destruc = explosions. fortune = wandering traders
  //  public static final RegistryObject<BlockAltarSol> ALTAR_FLIGHT = BLOCKS.register("altar_flight", () -> new BlockAltarSol(Block.Properties.of(Material.STONE), AltarType.FLIGHT));
  //  public static final RegistryObject<BlockAltarSol> ALTAR_DESTRUCTION = BLOCKS.register("altar_destruction", () -> new BlockAltarSol(Block.Properties.of(Material.STONE), AltarType.DESTRUCTION));
  //  public static final RegistryObject<BlockAltarSol> ALTAR_FORTUNE = BLOCKS.register("altar_fortune", () -> new BlockAltarSol(Block.Properties.of(Material.STONE), AltarType.TRADER));
  //  public static final RegistryObject<Block> PEDESTAL = BLOCKS.register("pedestal", () -> new BlockAltarSol(Block.Properties.of(Material.STONE)));
  //powered furnace
  //  public static final RegistryObject<Block> GENERATOR_CAT = BLOCKS.register("generator_cat", () -> new Block(Block.Properties.of(Material.STONE))); // NOGUI
  //  public static final RegistryObject<Block> DOOR_GOLD = BLOCKS.register("door_gold", () -> new DoorBlock(Block.Properties.of(Material.METAL, MaterialColor.GOLD).sound(SoundType.METAL)));
  //  public static final RegistryObject<Block> DOOR_NETHERITE = BLOCKS.register("door_netherite", () -> new DoorBlock(Block.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_BLACK).sound(SoundType.METAL)));
  //drain use bottle on it to fill. and its a fluid cap
  //  public static final RegistryObject<Block> EXPERIENCE_DRAIN = BLOCKS.register("experience_drain", () -> new Block(Block.Properties.of(Material.STONE))); // NOGUI
  //magnet_anti_block87
}
