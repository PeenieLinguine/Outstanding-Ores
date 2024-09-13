package net.mcreator.outstandingores.procedures;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;

import net.mcreator.outstandingores.init.OutstandingOresModItems;

import java.util.Map;

public class TantalumArmorEffectProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == OutstandingOresModItems.TANTALUM_ARMOR_HELMET
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == OutstandingOresModItems.TANTALUM_ARMOR_CHESTPLATE
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == OutstandingOresModItems.TANTALUM_ARMOR_LEGGINGS
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == OutstandingOresModItems.TANTALUM_ARMOR_BOOTS) {
			if (itemstack.getOrCreateTag().getBoolean("mendingEnchantment") == false) {
				itemstack.getOrCreateTag().putBoolean("mendingEnchantment", true);
				itemstack.enchant(Enchantments.MENDING, 1);
			}
		} else if (!((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == OutstandingOresModItems.TANTALUM_ARMOR_HELMET
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == OutstandingOresModItems.TANTALUM_ARMOR_CHESTPLATE
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == OutstandingOresModItems.TANTALUM_ARMOR_LEGGINGS
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == OutstandingOresModItems.TANTALUM_ARMOR_BOOTS)) {
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
