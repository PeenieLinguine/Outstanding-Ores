package net.mcreator.outstandingores.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.ItemStack;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;

import java.util.Map;

public class GraphiteToolBonusEffectProcedure {
	public static void execute(LevelAccessor world, ItemStack itemstack) {
		if (147 <= itemstack.getDamageValue()) {
			itemstack.getOrCreateTag().putBoolean("Efficiency 1", false);
			{
				Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
				if (_enchantments.containsKey(Enchantments.BLOCK_EFFICIENCY)) {
					_enchantments.remove(Enchantments.BLOCK_EFFICIENCY);
					EnchantmentHelper.setEnchantments(_enchantments, itemstack);
				}
			}
			itemstack.getOrCreateTag().putBoolean("Efficiency 2", false);
			{
				Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
				if (_enchantments.containsKey(Enchantments.BLOCK_EFFICIENCY)) {
					_enchantments.remove(Enchantments.BLOCK_EFFICIENCY);
					EnchantmentHelper.setEnchantments(_enchantments, itemstack);
				}
			}
			new Object() {
				private int ticks = 0;

				public void startDelay(LevelAccessor world) {
					ServerTickEvents.END_SERVER_TICK.register((server) -> {
						this.ticks++;
						if (this.ticks == 1) {
							itemstack.getOrCreateTag().putBoolean("Efficiency 3", true);
							itemstack.enchant(Enchantments.BLOCK_EFFICIENCY, 3);
							return;
						}
					});
				}
			}.startDelay(world);
		} else if (98 <= itemstack.getDamageValue()) {
			itemstack.getOrCreateTag().putBoolean("Efficiency 1", false);
			{
				Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
				if (_enchantments.containsKey(Enchantments.BLOCK_EFFICIENCY)) {
					_enchantments.remove(Enchantments.BLOCK_EFFICIENCY);
					EnchantmentHelper.setEnchantments(_enchantments, itemstack);
				}
			}
			new Object() {
				private int ticks = 0;

				public void startDelay(LevelAccessor world) {
					ServerTickEvents.END_SERVER_TICK.register((server) -> {
						this.ticks++;
						if (this.ticks == 1) {
							itemstack.getOrCreateTag().putBoolean("Efficiency 2", true);
							itemstack.enchant(Enchantments.BLOCK_EFFICIENCY, 2);
							return;
						}
					});
				}
			}.startDelay(world);
		} else if (49 <= itemstack.getDamageValue()) {
			itemstack.getOrCreateTag().putBoolean("Efficiency 1", false);
			{
				Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
				if (_enchantments.containsKey(Enchantments.BLOCK_EFFICIENCY)) {
					_enchantments.remove(Enchantments.BLOCK_EFFICIENCY);
					EnchantmentHelper.setEnchantments(_enchantments, itemstack);
				}
			}
			new Object() {
				private int ticks = 0;

				public void startDelay(LevelAccessor world) {
					ServerTickEvents.END_SERVER_TICK.register((server) -> {
						this.ticks++;
						if (this.ticks == 1) {
							itemstack.getOrCreateTag().putBoolean("Efficiency 1", true);
							itemstack.enchant(Enchantments.BLOCK_EFFICIENCY, 1);
							return;
						}
					});
				}
			}.startDelay(world);
		} else {
			itemstack.getOrCreateTag().putBoolean("Efficiency 1", false);
			itemstack.getOrCreateTag().putBoolean("Efficiency 2", false);
			itemstack.getOrCreateTag().putBoolean("Efficiency 3", false);
			{
				Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
				if (_enchantments.containsKey(Enchantments.BLOCK_EFFICIENCY)) {
					_enchantments.remove(Enchantments.BLOCK_EFFICIENCY);
					EnchantmentHelper.setEnchantments(_enchantments, itemstack);
				}
			}
		}
	}
}
