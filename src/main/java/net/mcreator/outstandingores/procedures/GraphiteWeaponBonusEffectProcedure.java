package net.mcreator.outstandingores.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;

import java.util.Map;

public class GraphiteWeaponBonusEffectProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (147 <= itemstack.getDamageValue()) {
			itemstack.getOrCreateTag().putBoolean("Sharpness 1", false);
			{
				Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
				if (_enchantments.containsKey(Enchantments.SHARPNESS)) {
					_enchantments.remove(Enchantments.SHARPNESS);
					EnchantmentHelper.setEnchantments(_enchantments, itemstack);
				}
			}
			itemstack.getOrCreateTag().putBoolean("Sharpness 2", false);
			{
				Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
				if (_enchantments.containsKey(Enchantments.SHARPNESS)) {
					_enchantments.remove(Enchantments.SHARPNESS);
					EnchantmentHelper.setEnchantments(_enchantments, itemstack);
				}
			}
			new Object() {
				private int ticks = 0;

				public void startDelay(LevelAccessor world) {
					ServerTickEvents.END_SERVER_TICK.register((server) -> {
						this.ticks++;
						if (this.ticks == 1) {
							itemstack.getOrCreateTag().putBoolean("Sharpness 3", true);
							itemstack.enchant(Enchantments.SHARPNESS, 3);
							return;
						}
					});
				}
			}.startDelay(world);
		} else if (98 <= itemstack.getDamageValue()) {
			itemstack.getOrCreateTag().putBoolean("Sharpness 1", false);
			{
				Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
				if (_enchantments.containsKey(Enchantments.SHARPNESS)) {
					_enchantments.remove(Enchantments.SHARPNESS);
					EnchantmentHelper.setEnchantments(_enchantments, itemstack);
				}
			}
			new Object() {
				private int ticks = 0;

				public void startDelay(LevelAccessor world) {
					ServerTickEvents.END_SERVER_TICK.register((server) -> {
						this.ticks++;
						if (this.ticks == 1) {
							itemstack.getOrCreateTag().putBoolean("Sharpness 2", true);
							itemstack.enchant(Enchantments.SHARPNESS, 2);
							return;
						}
					});
				}
			}.startDelay(world);
		} else if (49 <= itemstack.getDamageValue()) {
			itemstack.getOrCreateTag().putBoolean("Sharpness 1", false);
			{
				Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
				if (_enchantments.containsKey(Enchantments.SHARPNESS)) {
					_enchantments.remove(Enchantments.SHARPNESS);
					EnchantmentHelper.setEnchantments(_enchantments, itemstack);
				}
			}
			new Object() {
				private int ticks = 0;

				public void startDelay(LevelAccessor world) {
					ServerTickEvents.END_SERVER_TICK.register((server) -> {
						this.ticks++;
						if (this.ticks == 1) {
							itemstack.getOrCreateTag().putBoolean("Sharpness 1", true);
							itemstack.enchant(Enchantments.SHARPNESS, 1);
							return;
						}
					});
				}
			}.startDelay(world);
		} else {
			itemstack.getOrCreateTag().putBoolean("Sharpness 1", false);
			itemstack.getOrCreateTag().putBoolean("Sharpness 2", false);
			itemstack.getOrCreateTag().putBoolean("Sharpness 3", false);
			{
				Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
				if (_enchantments.containsKey(Enchantments.SHARPNESS)) {
					_enchantments.remove(Enchantments.SHARPNESS);
					EnchantmentHelper.setEnchantments(_enchantments, itemstack);
				}
			}
		}
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 600, 2, false, false));
	}
}
