package net.mcreator.outstandingores.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.outstandingores.init.OutstandingOresModItems;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;

public class TungstenItembonusEffectProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		ItemStack pickaxe = ItemStack.EMPTY;
		double EnchtSize = 0;
		double i = 0;
		double j = 0;
		double k = 0;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == OutstandingOresModItems.TUNGSTEN_PICKAXE
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == OutstandingOresModItems.TUNGSTEN_SWORD
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == OutstandingOresModItems.TUNGSTEN_AXE
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == OutstandingOresModItems.TUNGSTEN_SHOVEL
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == OutstandingOresModItems.TUNGSTEN_HOE) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, -1, 1, false, false));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, -1, 0, false, false));
		} else {
			new Object() {
				private int ticks = 0;

				public void startDelay(LevelAccessor world) {
					ServerTickEvents.END_SERVER_TICK.register((server) -> {
						this.ticks++;
						if (this.ticks == 10) {
							if (entity instanceof LivingEntity _entity)
								_entity.removeEffect(MobEffects.HEALTH_BOOST);
							if (entity instanceof LivingEntity _entity)
								_entity.removeEffect(MobEffects.REGENERATION);
							return;
						}
					});
				}
			}.startDelay(world);
		}
	}
}
