package net.mcreator.silveroretest.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.silveroretest.init.SilverOreTestModItems;

public class GhostShroudBindPriNazhatiiKlavishiProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(SilverOreTestModItems.GHOST_SHROUD_ARMOR_CHESTPLATE.get())) : false) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 60, 1, false, false));
		}
	}
}
