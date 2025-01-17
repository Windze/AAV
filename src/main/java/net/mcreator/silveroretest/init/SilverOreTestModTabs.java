
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.silveroretest.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.silveroretest.SilverOreTestMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class SilverOreTestModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SilverOreTestMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> GHOST_MOUND_MOD = REGISTRY.register("ghost_mound_mod",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.silver_ore_test.ghost_mound_mod")).icon(() -> new ItemStack(SilverOreTestModItems.ECTO_PLASM.get())).displayItems((parameters, tabData) -> {
				tabData.accept(SilverOreTestModItems.SILVER_ORE_INGOT.get());
				tabData.accept(SilverOreTestModBlocks.SILVER_ORE_ORE.get().asItem());
				tabData.accept(SilverOreTestModBlocks.SILVER_ORE_BLOCK.get().asItem());
				tabData.accept(SilverOreTestModItems.SILVER_SWORD.get());
				tabData.accept(SilverOreTestModItems.SILVER_SMITHING_TEMPLATE.get());
				tabData.accept(SilverOreTestModItems.ECTO_CLOTH.get());
				tabData.accept(SilverOreTestModItems.GHOST_BERRY.get());
				tabData.accept(SilverOreTestModBlocks.GHOST_PLANKS.get().asItem());
				tabData.accept(SilverOreTestModBlocks.GHOST_SLABS.get().asItem());
				tabData.accept(SilverOreTestModBlocks.GHOST_STAIRS.get().asItem());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {

			tabData.accept(SilverOreTestModItems.GHOST_SHROUD_ARMOR_CHESTPLATE.get());

		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {

			tabData.accept(SilverOreTestModBlocks.SILVER_ORE_ORE.get().asItem());

		}
	}
}
