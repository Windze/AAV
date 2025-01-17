
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.silveroretest.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.silveroretest.item.SilverSwordItem;
import net.mcreator.silveroretest.item.SilverSmithingTemplateItem;
import net.mcreator.silveroretest.item.SilverOreIngotItem;
import net.mcreator.silveroretest.item.Ghost_ShroudArmorItem;
import net.mcreator.silveroretest.item.GhostBerryItem;
import net.mcreator.silveroretest.item.EctoPlasmItem;
import net.mcreator.silveroretest.item.EctoClothItem;
import net.mcreator.silveroretest.SilverOreTestMod;

public class SilverOreTestModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(SilverOreTestMod.MODID);
	public static final DeferredItem<Item> SILVER_ORE_INGOT = REGISTRY.register("silver_ore_ingot", SilverOreIngotItem::new);
	public static final DeferredItem<Item> SILVER_ORE_ORE = block(SilverOreTestModBlocks.SILVER_ORE_ORE);
	public static final DeferredItem<Item> SILVER_ORE_BLOCK = block(SilverOreTestModBlocks.SILVER_ORE_BLOCK);
	public static final DeferredItem<Item> SILVER_SWORD = REGISTRY.register("silver_sword", SilverSwordItem::new);
	public static final DeferredItem<Item> SILVER_SMITHING_TEMPLATE = REGISTRY.register("silver_smithing_template", SilverSmithingTemplateItem::new);
	public static final DeferredItem<Item> ECTO_PLASM = REGISTRY.register("ecto_plasm", EctoPlasmItem::new);
	public static final DeferredItem<Item> ECTO_CLOTH = REGISTRY.register("ecto_cloth", EctoClothItem::new);
	public static final DeferredItem<Item> GHOST_SHROUD_ARMOR_CHESTPLATE = REGISTRY.register("ghost_shroud_armor_chestplate", Ghost_ShroudArmorItem.Chestplate::new);
	public static final DeferredItem<Item> GHOST_BERRY = REGISTRY.register("ghost_berry", GhostBerryItem::new);
	public static final DeferredItem<Item> GHOST_TREE = block(SilverOreTestModBlocks.GHOST_TREE);
	public static final DeferredItem<Item> GHOST_LEAVES = block(SilverOreTestModBlocks.GHOST_LEAVES);
	public static final DeferredItem<Item> GHOST_PLANKS = block(SilverOreTestModBlocks.GHOST_PLANKS);
	public static final DeferredItem<Item> GHOST_SLABS = block(SilverOreTestModBlocks.GHOST_SLABS);
	public static final DeferredItem<Item> GHOST_STAIRS = block(SilverOreTestModBlocks.GHOST_STAIRS);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
