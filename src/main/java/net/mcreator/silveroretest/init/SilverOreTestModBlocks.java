
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.silveroretest.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.silveroretest.block.SilverOreOreBlock;
import net.mcreator.silveroretest.block.SilverOreBlockBlock;
import net.mcreator.silveroretest.block.GhostTreeBlock;
import net.mcreator.silveroretest.block.GhostStairsBlock;
import net.mcreator.silveroretest.block.GhostSlabsBlock;
import net.mcreator.silveroretest.block.GhostPlanksBlock;
import net.mcreator.silveroretest.block.GhostLeavesBlock;
import net.mcreator.silveroretest.SilverOreTestMod;

public class SilverOreTestModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(SilverOreTestMod.MODID);
	public static final DeferredBlock<Block> SILVER_ORE_ORE = REGISTRY.register("silver_ore_ore", SilverOreOreBlock::new);
	public static final DeferredBlock<Block> SILVER_ORE_BLOCK = REGISTRY.register("silver_ore_block", SilverOreBlockBlock::new);
	public static final DeferredBlock<Block> GHOST_TREE = REGISTRY.register("ghost_tree", GhostTreeBlock::new);
	public static final DeferredBlock<Block> GHOST_LEAVES = REGISTRY.register("ghost_leaves", GhostLeavesBlock::new);
	public static final DeferredBlock<Block> GHOST_PLANKS = REGISTRY.register("ghost_planks", GhostPlanksBlock::new);
	public static final DeferredBlock<Block> GHOST_SLABS = REGISTRY.register("ghost_slabs", GhostSlabsBlock::new);
	public static final DeferredBlock<Block> GHOST_STAIRS = REGISTRY.register("ghost_stairs", GhostStairsBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
