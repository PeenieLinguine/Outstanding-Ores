package net.mcreator.outstandingores.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.outstandingores.init.OutstandingOresModItems;

import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;

public class ArsenicToolBonusEffectProcedure {
	public ArsenicToolBonusEffectProcedure() {
		PlayerBlockBreakEvents.BEFORE.register((world, player, pos, state, blockentity) -> {
			execute(world, pos.getX(), pos.getY(), pos.getZ(), player);
			return true;
		});
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == OutstandingOresModItems.ARSENIC_PICKAXE
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == OutstandingOresModItems.ARSENIC_SHOVEL
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == OutstandingOresModItems.ARSENIC_HOE) {
			if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == OutstandingOresModItems.ARSENIC_ARMOR_HELMET
					&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == OutstandingOresModItems.ARSENIC_ARMOR_CHESTPLATE
					&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == OutstandingOresModItems.ARSENIC_ARMOR_LEGGINGS
					&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == OutstandingOresModItems.ARSENIC_ARMOR_BOOTS) {
				if (Math.random() <= 0.4) {
					if (world instanceof ServerLevel _level)
						_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 1));
					if (Math.random() <= 0.2) {
						if (world instanceof ServerLevel _level)
							_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 1));
						if (Math.random() <= 0.05) {
							if (world instanceof ServerLevel _level)
								_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 1));
						}
					}
				}
			}
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == OutstandingOresModItems.ARSENIC_PICKAXE
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == OutstandingOresModItems.ARSENIC_SHOVEL
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == OutstandingOresModItems.ARSENIC_HOE) {
			if (!((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == OutstandingOresModItems.ARSENIC_ARMOR_HELMET
					&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == OutstandingOresModItems.ARSENIC_ARMOR_CHESTPLATE
					&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == OutstandingOresModItems.ARSENIC_ARMOR_LEGGINGS
					&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == OutstandingOresModItems.ARSENIC_ARMOR_BOOTS)) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.WITHER, 20, 1));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.POISON, 40, 1));
				if (Math.random() <= 0.4) {
					if (world instanceof ServerLevel _level)
						_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 1));
					if (Math.random() <= 0.2) {
						if (world instanceof ServerLevel _level)
							_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 1));
						if (Math.random() <= 0.05) {
							if (world instanceof ServerLevel _level)
								_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 1));
						}
					}
				}
			}
		}
	}
}
