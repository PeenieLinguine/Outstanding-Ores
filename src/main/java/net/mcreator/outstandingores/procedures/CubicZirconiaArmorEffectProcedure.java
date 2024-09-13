package net.mcreator.outstandingores.procedures;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.outstandingores.init.OutstandingOresModItems;

import java.util.Map;

public class CubicZirconiaArmorEffectProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == OutstandingOresModItems.CUBIC_ZIRCONIA_ARMOR_HELMET
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == OutstandingOresModItems.CUBIC_ZIRCONIA_ARMOR_CHESTPLATE
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == OutstandingOresModItems.CUBIC_ZIRCONIA_ARMOR_LEGGINGS
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == OutstandingOresModItems.CUBIC_ZIRCONIA_ARMOR_BOOTS) {
			if (itemstack.getItem() == OutstandingOresModItems.CUBIC_ZIRCONIA_ARMOR_HELMET) {
				if (itemstack.getOrCreateTag().getBoolean("CZenchant") == false) {
					itemstack.getOrCreateTag().putBoolean("CZenchant", true);
					itemstack.enchant(Enchantments.RESPIRATION, 5);
				}
			}
			if (itemstack.getItem() == OutstandingOresModItems.CUBIC_ZIRCONIA_ARMOR_CHESTPLATE) {
				if (itemstack.getOrCreateTag().getBoolean("CZenchant") == false) {
					if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == OutstandingOresModItems.CUBIC_ZIRCONIA_PICKAXE
							|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == OutstandingOresModItems.CUBIC_ZIRCONIA_SHOVEL
							|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == OutstandingOresModItems.CUBIC_ZIRCONIA_HOE) {
						itemstack.getOrCreateTag().putBoolean("CZenchant", true);
						itemstack.enchant(Enchantments.AQUA_AFFINITY, 5);
					}
				}
			}
			if (itemstack.getItem() == OutstandingOresModItems.CUBIC_ZIRCONIA_ARMOR_BOOTS) {
				if (itemstack.getOrCreateTag().getBoolean("CZenchant") == false) {
					itemstack.getOrCreateTag().putBoolean("CZenchant", true);
					itemstack.enchant(Enchantments.DEPTH_STRIDER, 5);
				}
			}
			if (itemstack.getItem() == OutstandingOresModItems.CUBIC_ZIRCONIA_ARMOR_CHESTPLATE) {
				while (itemstack.getOrCreateTag().getBoolean("CZenchant") == true) {
					if (!((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == OutstandingOresModItems.CUBIC_ZIRCONIA_PICKAXE
							|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == OutstandingOresModItems.CUBIC_ZIRCONIA_SHOVEL
							|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == OutstandingOresModItems.CUBIC_ZIRCONIA_HOE)) {
						itemstack.getOrCreateTag().putBoolean("CZenchant", false);
						{
							Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
							if (_enchantments.containsKey(Enchantments.AQUA_AFFINITY)) {
								_enchantments.remove(Enchantments.AQUA_AFFINITY);
								EnchantmentHelper.setEnchantments(_enchantments, itemstack);
							}
						}
						break;
					}
					break;
				}
			}
		} else {
			if (itemstack.getOrCreateTag().getBoolean("CZenchant") == true) {
				itemstack.getOrCreateTag().putBoolean("CZenchant", false);
				{
					Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
					if (_enchantments.containsKey(Enchantments.RESPIRATION)) {
						_enchantments.remove(Enchantments.RESPIRATION);
						EnchantmentHelper.setEnchantments(_enchantments, itemstack);
					}
				}
				{
					Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
					if (_enchantments.containsKey(Enchantments.AQUA_AFFINITY)) {
						_enchantments.remove(Enchantments.AQUA_AFFINITY);
						EnchantmentHelper.setEnchantments(_enchantments, itemstack);
					}
				}
				{
					Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
					if (_enchantments.containsKey(Enchantments.DEPTH_STRIDER)) {
						_enchantments.remove(Enchantments.DEPTH_STRIDER);
						EnchantmentHelper.setEnchantments(_enchantments, itemstack);
					}
				}
			}
		}
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == OutstandingOresModItems.CUBIC_ZIRCONIA_ARMOR_HELMET
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == OutstandingOresModItems.CUBIC_ZIRCONIA_ARMOR_CHESTPLATE
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == OutstandingOresModItems.CUBIC_ZIRCONIA_ARMOR_LEGGINGS
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == OutstandingOresModItems.CUBIC_ZIRCONIA_ARMOR_BOOTS) {
			if (entity.isUnderWater() == true) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 100, 4, false, false));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 100, 0, false, false));
			} else {
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(MobEffects.DOLPHINS_GRACE);
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(MobEffects.NIGHT_VISION);
			}
		}
	}
}
