package eltrut.addendum.core.registry;

import com.teamabnormals.abnormals_core.common.blocks.AbnormalsStairsBlock;
import com.teamabnormals.abnormals_core.common.blocks.VerticalSlabBlock;

import eltrut.addendum.common.AddendumProperties;
import eltrut.addendum.core.Addendum;
import eltrut.addendum.core.compat.AddendumMods;
import eltrut.addendum.core.registry.util.AddendumRegistryHelper;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = Addendum.MOD_ID, bus = Bus.MOD)
public class AddendumBlocks {
	public static final AddendumRegistryHelper HELPER = Addendum.REGISTRY_HELPER;
	
	// End Stone
	public static final RegistryObject<Block> END_STONE_SLAB = HELPER.createBlock("end_stone_slab", () -> new SlabBlock(Block.Properties.from(Blocks.END_STONE)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> END_STONE_STAIRS = HELPER.createBlock("end_stone_stairs", () -> new AbnormalsStairsBlock(Blocks.END_STONE.getDefaultState(), Block.Properties.from(Blocks.END_STONE)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> END_STONE_WALL = HELPER.createBlock("end_stone_wall", () -> new WallBlock(Block.Properties.from(Blocks.END_STONE)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> END_STONE_VERTICAL_SLAB = HELPER.createCompatBlock(AddendumMods.QUARK, "end_stone_vertical_slab", () -> new VerticalSlabBlock(Block.Properties.from(Blocks.END_STONE)), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> POLISHED_END_STONE = HELPER.createBlock("polished_end_stone", () -> new Block(Block.Properties.from(Blocks.END_STONE)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> POLISHED_END_STONE_SLAB = HELPER.createBlock("polished_end_stone_slab", () -> new SlabBlock(Block.Properties.from(Blocks.END_STONE)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> POLISHED_END_STONE_STAIRS = HELPER.createBlock("polished_end_stone_stairs", () -> new AbnormalsStairsBlock(POLISHED_END_STONE.get().getDefaultState(), Block.Properties.from(Blocks.END_STONE)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> POLISHED_END_STONE_WALL = HELPER.createBlock("polished_end_stone_wall", () -> new WallBlock(Block.Properties.from(Blocks.END_STONE)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> POLISHED_END_STONE_VERTICAL_SLAB = HELPER.createCompatBlock(AddendumMods.QUARK, "polished_end_stone_vertical_slab", () -> new VerticalSlabBlock(Block.Properties.from(Blocks.END_STONE)), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> CRACKED_END_STONE_BRICKS = HELPER.createBlock("cracked_end_stone_bricks", () -> new Block(Block.Properties.from(Blocks.END_STONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_END_STONE_BRICK_SLAB = HELPER.createCompatBlock("lepton", "cracked_end_stone_brick_slab", () -> new SlabBlock(Block.Properties.from(Blocks.END_STONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_END_STONE_BRICK_STAIRS = HELPER.createCompatBlock("lepton", "cracked_end_stone_brick_stairs", () -> new AbnormalsStairsBlock(CRACKED_END_STONE_BRICKS.get().getDefaultState(), Block.Properties.from(Blocks.END_STONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_END_STONE_BRICK_WALL = HELPER.createCompatBlock("lepton", "cracked_end_stone_brick_wall", () -> new WallBlock(Block.Properties.from(Blocks.END_STONE_BRICKS)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> CRACKED_END_STONE_BRICK_VERTICAL_SLAB = HELPER.createTwoCompatBlock("lepton", AddendumMods.QUARK, "cracked_end_stone_brick_vertical_slab", () -> new VerticalSlabBlock(Block.Properties.from(Blocks.END_STONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> CHORUSY_END_STONE_BRICKS = HELPER.createBlock("chorusy_end_stone_bricks", () -> new Block(Block.Properties.from(Blocks.END_STONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CHISELED_POLISHED_END_STONE = HELPER.createBlock("chiseled_polished_end_stone", () -> new Block(Block.Properties.from(Blocks.END_STONE)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CHISELED_END_STONE_BRICKS = HELPER.createBlock("chiseled_end_stone_bricks", () -> new Block(Block.Properties.from(Blocks.END_STONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
	
	// Purpur
	public static final RegistryObject<Block> PURPUR_BRICKS = HELPER.createBlock("purpur_bricks", () -> new Block(Block.Properties.from(Blocks.PURPUR_BLOCK)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> PURPUR_BRICK_SLAB = HELPER.createBlock("purpur_brick_slab", () -> new SlabBlock(Block.Properties.from(Blocks.PURPUR_BLOCK)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> PURPUR_BRICK_STAIRS = HELPER.createBlock("purpur_brick_stairs", () -> new AbnormalsStairsBlock(PURPUR_BRICKS.get().getDefaultState(), Block.Properties.from(Blocks.PURPUR_BLOCK)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> PURPUR_BRICK_WALL = HELPER.createBlock("purpur_brick_wall", () -> new WallBlock(Block.Properties.from(Blocks.PURPUR_BLOCK)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> PURPUR_BRICK_VERTICAL_SLAB = HELPER.createCompatBlock(AddendumMods.QUARK, "purpur_brick_vertical_slab", () -> new VerticalSlabBlock(Block.Properties.from(Blocks.PURPUR_BLOCK)), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> CHISELED_PURPUR_BRICKS = HELPER.createBlock("chiseled_purpur_bricks", () -> new Block(Block.Properties.from(Blocks.PURPUR_BLOCK)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> POPPED_CHORUS_FRUIT_BLOCK = HELPER.createBlock("popped_chorus_fruit_block", () -> new Block(Block.Properties.from(Blocks.MAGENTA_WOOL)), ItemGroup.DECORATIONS);
	
	// Midori
	public static final RegistryObject<Block> MIDORI_BRICKS = HELPER.createCompatBlock(AddendumMods.QUARK, "midori_bricks", () -> new Block(AddendumProperties.MIDORI), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> MIDORI_BRICK_SLAB = HELPER.createCompatBlock(AddendumMods.QUARK, "midori_brick_slab", () -> new SlabBlock(AddendumProperties.MIDORI), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> MIDORI_BRICK_STAIRS = HELPER.createCompatBlock(AddendumMods.QUARK, "midori_brick_stairs", () -> new AbnormalsStairsBlock(MIDORI_BRICKS.get().getDefaultState(), AddendumProperties.MIDORI), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> MIDORI_BRICK_WALL = HELPER.createCompatBlock(AddendumMods.QUARK, "midori_brick_wall", () -> new WallBlock(AddendumProperties.MIDORI), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> MIDORI_BRICK_VERTICAL_SLAB = HELPER.createCompatBlock(AddendumMods.QUARK, "midori_brick_vertical_slab", () -> new VerticalSlabBlock(AddendumProperties.MIDORI), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> CHISELED_MIDORI_BRICKS = HELPER.createCompatBlock(AddendumMods.QUARK, "chiseled_midori_bricks", () -> new Block(AddendumProperties.MIDORI), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CACTUS_PASTE_BLOCK = HELPER.createCompatBlock(AddendumMods.QUARK, "cactus_paste_block", () -> new Block(Block.Properties.from(Blocks.LIME_WOOL)), ItemGroup.DECORATIONS);
	
	// Shulker
	public static final RegistryObject<Block> SHULKER_BLOCK = HELPER.createBlock("shulker_block", () -> new Block(Block.Properties.from(Blocks.SHULKER_BOX)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> SHULKER_SWIRL = HELPER.createBlock("shulker_swirl", () -> new Block(Block.Properties.from(Blocks.SHULKER_BOX)), ItemGroup.BUILDING_BLOCKS);
	
}
