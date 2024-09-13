package net.mcreator.outstandingores.procedures;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.outstandingores.init.OutstandingOresModItems;

import java.util.Map;

public class MoissaniteWeaponBonusEffectProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		ItemStack pickaxe = ItemStack.EMPTY;
		double EnchtSize = 0;
		double i = 0;
		double j = 0;
		double k = 0;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == OutstandingOresModItems.MOISSANITE_SWORD
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == OutstandingOresModItems.MOISSANITE_AXE
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == OutstandingOresModItems.MOISSANITE_SWORD
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == OutstandingOresModItems.MOISSANITE_AXE) {
			if (itemstack.getOrCreateTag().getBoolean("fireAspectEnchantment") == false) {
				itemstack.getOrCreateTag().putBoolean("fireAspectEnchantment", true);
				itemstack.enchant(Enchantments.FIRE_ASPECT, 3);
			}
		} else {
			if (itemstack.getOrCreateTag().getBoolean("fireAspectEnchantment") == true) {
				itemstack.getOrCreateTag().putBoolean("fireAspectEnchantment", false);
				{
					Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
					if (_enchantments.containsKey(Enchantments.FIRE_ASPECT)) {
						_enchantments.remove(Enchantments.FIRE_ASPECT);
						EnchantmentHelper.setEnchantments(_enchantments, itemstack);
					}
				}
			}
		}
	}
}
