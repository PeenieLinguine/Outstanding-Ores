package net.mcreator.outstandingores.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.outstandingores.init.OutstandingOresModItems;

public class CubicZirconiaToolEffectProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		ItemStack pickaxe = ItemStack.EMPTY;
		double EnchtSize = 0;
		double i = 0;
		double j = 0;
		double k = 0;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == OutstandingOresModItems.CUBIC_ZIRCONIA_PICKAXE
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == OutstandingOresModItems.CUBIC_ZIRCONIA_SHOVEL
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == OutstandingOresModItems.CUBIC_ZIRCONIA_HOE) {
			if (entity.isUnderWater() == true) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 60, 2, false, false));
				if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == OutstandingOresModItems.CUBIC_ZIRCONIA_ARMOR_HELMET
						&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == OutstandingOresModItems.CUBIC_ZIRCONIA_ARMOR_CHESTPLATE
						&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == OutstandingOresModItems.CUBIC_ZIRCONIA_ARMOR_LEGGINGS
						&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == OutstandingOresModItems.CUBIC_ZIRCONIA_ARMOR_BOOTS) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 60, 0, false, false));
				} else {
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(MobEffects.WATER_BREATHING);
				}
			} else {
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(MobEffects.DAMAGE_RESISTANCE);
			}
		}
	}
}
