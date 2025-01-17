
package net.mcreator.silveroretest.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SilverSmithingTemplateItem extends Item {
	public SilverSmithingTemplateItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.RARE));
	}
}
