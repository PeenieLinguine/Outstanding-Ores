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
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.outstandingores.init.OutstandingOresModItems;

import java.util.Map;

public class CraftiteArmorEffectProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == OutstandingOresModItems.CRAFTITE_ARMOR_HELMET
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == OutstandingOresModItems.CRAFTITE_ARMOR_CHESTPLATE
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == OutstandingOresModItems.CRAFTITE_ARMOR_LEGGINGS
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == OutstandingOresModItems.CRAFTITE_ARMOR_BOOTS) {
			if (itemstack.getItem() == OutstandingOresModItems.CRAFTITE_ARMOR_HELMET) {
				if (itemstack.getOrCreateTag().getBoolean("CZenchant") == false) {
					itemstack.getOrCreateTag().putBoolean("CZenchant", true);
					itemstack.enchant(Enchantments.PROJECTILE_PROTECTION, 5);
				}
			}
			if (itemstack.getItem() == OutstandingOresModItems.CRAFTITE_ARMOR_CHESTPLATE) {
				if (itemstack.getOrCreateTag().getBoolean("CZenchant") == false) {
					itemstack.getOrCreateTag().putBoolean("CZenchant", true);
					itemstack.enchant(Enchantments.THORNS, 5);
				}
			}
			if (itemstack.getItem() == OutstandingOresModItems.CRAFTITE_ARMOR_LEGGINGS) {
				if (itemstack.getOrCreateTag().getBoolean("CZenchant") == false) {
					itemstack.getOrCreateTag().putBoolean("CZenchant", true);
					itemstack.enchant(Enchantments.SOUL_SPEED, 5);
				}
			}
			if (itemstack.getItem() == OutstandingOresModItems.CRAFTITE_ARMOR_BOOTS) {
				if (itemstack.getOrCreateTag().getBoolean("CZenchant") == false) {
					itemstack.getOrCreateTag().putBoolean("CZenchant", true);
					itemstack.enchant(Enchantments.DEPTH_STRIDER, 5);
				}
			}
		} else {
			if (itemstack.getOrCreateTag().getBoolean("CZenchant") == true) {
				itemstack.getOrCreateTag().putBoolean("CZenchant", false);
				{
					Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
					if (_enchantments.containsKey(Enchantments.PROJECTILE_PROTECTION)) {
						_enchantments.remove(Enchantments.PROJECTILE_PROTECTION);
						EnchantmentHelper.setEnchantments(_enchantments, itemstack);
					}
				}
				{
					Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
					if (_enchantments.containsKey(Enchantments.THORNS)) {
						_enchantments.remove(Enchantments.THORNS);
						EnchantmentHelper.setEnchantments(_enchantments, itemstack);
					}
				}
				{
					Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
					if (_enchantments.containsKey(Enchantments.SOUL_SPEED)) {
						_enchantments.remove(Enchantments.SOUL_SPEED);
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
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == OutstandingOresModItems.CRAFTITE_ARMOR_HELMET
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == OutstandingOresModItems.CRAFTITE_ARMOR_CHESTPLATE
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == OutstandingOresModItems.CRAFTITE_ARMOR_LEGGINGS
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == OutstandingOresModItems.CRAFTITE_ARMOR_BOOTS) {
			if (entity.isUnderWater() == true) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 40, 0, true, false));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 40, 4, true, false));
			} else {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 32, true, false));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.JUMP, 40, 10, true, false));
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(MobEffects.WATER_BREATHING);
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(MobEffects.DOLPHINS_GRACE);
			}
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("outstanding_ores:cover_me_in_minecraft"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					for (String criteria : _ap.getRemainingCriteria())
						_player.getAdvancements().award(_adv, criteria);
				}
			}
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0, true, false));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2, true, false));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 4, true, false));
			entity.fallDistance = 0;
		} else {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.JUMP);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.MOVEMENT_SPEED);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.DAMAGE_RESISTANCE);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.DAMAGE_BOOST);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.FIRE_RESISTANCE);
		}
	}
}
