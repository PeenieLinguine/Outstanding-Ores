package net.mcreator.outstandingores.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;

import net.mcreator.outstandingores.init.OutstandingOresModItems;

public class OnyxArmorEffectProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		while ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == OutstandingOresModItems.ONYX_GEM_HELMET
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == OutstandingOresModItems.ONYX_GEM_CHESTPLATE
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == OutstandingOresModItems.ONYX_GEM_LEGGINGS
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == OutstandingOresModItems.ONYX_GEM_BOOTS) {
			while (entity instanceof LivingEntity _livEnt8 && _livEnt8.hasEffect(MobEffects.DARKNESS) || entity instanceof LivingEntity _livEnt9 && _livEnt9.hasEffect(MobEffects.CONFUSION)
					|| entity instanceof LivingEntity _livEnt10 && _livEnt10.hasEffect(MobEffects.WEAKNESS) || entity instanceof LivingEntity _livEnt11 && _livEnt11.hasEffect(MobEffects.DIG_SLOWDOWN)
					|| entity instanceof LivingEntity _livEnt12 && _livEnt12.hasEffect(MobEffects.BLINDNESS)) {
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(MobEffects.DARKNESS);
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(MobEffects.CONFUSION);
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(MobEffects.WEAKNESS);
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(MobEffects.DIG_SLOWDOWN);
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(MobEffects.BLINDNESS);
				break;
			}
			break;
		}
	}
}
