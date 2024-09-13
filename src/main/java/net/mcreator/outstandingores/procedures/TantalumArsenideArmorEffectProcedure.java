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

public class TantalumArsenideArmorEffectProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == OutstandingOresModItems.TANTALUM_ARSENIDE_ARMOR_HELMET
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == OutstandingOresModItems.TANTALUM_ARSENIDE_ARMOR_CHESTPLATE
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == OutstandingOresModItems.TANTALUM_ARSENIDE_ARMOR_LEGGINGS
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == OutstandingOresModItems.TANTALUM_ARSENIDE_ARMOR_BOOTS) {
			if (itemstack.getOrCreateTag().getBoolean("blastProtectionEnchantment") == false) {
				itemstack.getOrCreateTag().putBoolean("blastProtectionEnchantment", true);
				{
					Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
					if (_enchantments.containsKey(Enchantments.FIRE_PROTECTION)) {
						_enchantments.remove(Enchantments.FIRE_PROTECTION);
						EnchantmentHelper.setEnchantments(_enchantments, itemstack);
					}
				}
				{
					Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
					if (_enchantments.containsKey(Enchantments.PROJECTILE_PROTECTION)) {
						_enchantments.remove(Enchantments.PROJECTILE_PROTECTION);
						EnchantmentHelper.setEnchantments(_enchantments, itemstack);
					}
				}
				{
					Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
					if (_enchantments.containsKey(Enchantments.ALL_DAMAGE_PROTECTION)) {
						_enchantments.remove(Enchantments.ALL_DAMAGE_PROTECTION);
						EnchantmentHelper.setEnchantments(_enchantments, itemstack);
					}
				}
				{
					Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
					if (_enchantments.containsKey(Enchantments.BLAST_PROTECTION)) {
						_enchantments.remove(Enchantments.BLAST_PROTECTION);
						EnchantmentHelper.setEnchantments(_enchantments, itemstack);
					}
				}
				itemstack.enchant(Enchantments.BLAST_PROTECTION, 5);
			}
		} else if (!((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == OutstandingOresModItems.TANTALUM_ARSENIDE_ARMOR_HELMET
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == OutstandingOresModItems.TANTALUM_ARSENIDE_ARMOR_CHESTPLATE
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == OutstandingOresModItems.TANTALUM_ARSENIDE_ARMOR_LEGGINGS
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == OutstandingOresModItems.TANTALUM_ARSENIDE_ARMOR_BOOTS)) {
			itemstack.getOrCreateTag().putBoolean("blastProtectionEnchantment", false);
			{
				Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
				if (_enchantments.containsKey(Enchantments.BLAST_PROTECTION)) {
					_enchantments.remove(Enchantments.BLAST_PROTECTION);
					EnchantmentHelper.setEnchantments(_enchantments, itemstack);
				}
			}
		}
	}
}
