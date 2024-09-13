package net.mcreator.outstandingores.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;

import net.mcreator.outstandingores.init.OutstandingOresModItems;

import net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents;

public class ArsenicArmorEffectProcedure {
	public ArsenicArmorEffectProcedure() {
		ServerLivingEntityEvents.ALLOW_DAMAGE.register((entity, damageSource, amount) -> {
			if (entity != null) {
				execute(entity);
			}
			return true;
		});
	}

	public static void execute(Entity entity) {
		if (entity == null)
			return;
		while ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == OutstandingOresModItems.ARSENIC_ARMOR_HELMET
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == OutstandingOresModItems.ARSENIC_ARMOR_CHESTPLATE
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == OutstandingOresModItems.ARSENIC_ARMOR_LEGGINGS
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == OutstandingOresModItems.ARSENIC_ARMOR_BOOTS) {
			if (entity instanceof LivingEntity _livEnt8 && _livEnt8.hasEffect(MobEffects.POISON) || entity instanceof LivingEntity _livEnt9 && _livEnt9.hasEffect(MobEffects.WITHER)) {
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(MobEffects.POISON);
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(MobEffects.WITHER);
				break;
			} else {
				break;
			}
		}
	}
}
