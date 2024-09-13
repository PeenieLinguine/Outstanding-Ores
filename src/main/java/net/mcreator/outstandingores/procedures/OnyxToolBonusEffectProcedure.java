package net.mcreator.outstandingores.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.network.chat.Component;

import net.mcreator.outstandingores.init.OutstandingOresModItems;

import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;

public class OnyxToolBonusEffectProcedure {
	public OnyxToolBonusEffectProcedure() {
		PlayerBlockBreakEvents.BEFORE.register((world, player, pos, state, blockentity) -> {
			execute(player);
			return true;
		});
	}

	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == OutstandingOresModItems.ONYX_PICKAXE
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == OutstandingOresModItems.ONYX_SHOVEL
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == OutstandingOresModItems.ONYX_HOE) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.SATURATION, 1, 0));
			if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == OutstandingOresModItems.ONYX_GEM_HELMET
					&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == OutstandingOresModItems.ONYX_GEM_CHESTPLATE
					&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == OutstandingOresModItems.ONYX_GEM_LEGGINGS
					&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == OutstandingOresModItems.ONYX_GEM_BOOTS) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.SATURATION, 0, 0));
			} else if (!((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == OutstandingOresModItems.ONYX_GEM_HELMET
					&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == OutstandingOresModItems.ONYX_GEM_CHESTPLATE
					&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == OutstandingOresModItems.ONYX_GEM_LEGGINGS
					&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == OutstandingOresModItems.ONYX_GEM_BOOTS)) {
				if ((entity instanceof Player _plr ? _plr.getFoodData().getSaturationLevel() : 0) == 20) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 40, 2));
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("\u00A77\u00A7oYou are too \u00A7r\u00A74\u00A7l\u00A7ofat\u00A77\u00A7o! Its harder to mine!"), true);
				}
			}
		}
	}
}
