package net.mcreator.outstandingores.procedures;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.outstandingores.init.OutstandingOresModItems;

import java.util.Map;

public class TantalumItemBonusEffectProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		ItemStack pickaxe = ItemStack.EMPTY;
		double EnchtSize = 0;
		double i = 0;
		double j = 0;
		double k = 0;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == OutstandingOresModItems.TANTALUM_PICKAXE
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == OutstandingOresModItems.TANTALUM_SWORD
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == OutstandingOresModItems.TANTALUM_AXE
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == OutstandingOresModItems.TANTALUM_SHOVEL
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == OutstandingOresModItems.TANTALUM_HOE
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == OutstandingOresModItems.TANTALUM_PICKAXE
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == OutstandingOresModItems.TANTALUM_SWORD
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == OutstandingOresModItems.TANTALUM_AXE
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == OutstandingOresModItems.TANTALUM_SHOVEL
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == OutstandingOresModItems.TANTALUM_HOE) {
			if (itemstack.getOrCreateTag().getBoolean("mendingEnchantment") == false) {
				itemstack.getOrCreateTag().putBoolean("mendingEnchantment", true);
				itemstack.enchant(Enchantments.MENDING, 1);
			}
		} else {
			if (itemstack.getOrCreateTag().getBoolean("mendingEnchantment") == true) {
				itemstack.getOrCreateTag().putBoolean("mendingEnchantment", false);
				{
					Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
					if (_enchantments.containsKey(Enchantments.MENDING)) {
						_enchantments.remove(Enchantments.MENDING);
						EnchantmentHelper.setEnchantments(_enchantments, itemstack);
					}
				}
			}
		}
	}
}
