
package net.mcreator.silveroretest.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class EctoPlasmItem extends Item {
	public EctoPlasmItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
