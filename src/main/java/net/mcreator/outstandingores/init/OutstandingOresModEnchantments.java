
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.outstandingores.init;

import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.outstandingores.enchantment.SmeltingEnchantment;
import net.mcreator.outstandingores.OutstandingOresMod;

public class OutstandingOresModEnchantments {
	public static Enchantment SMELTING;

	public static void load() {
		SMELTING = Registry.register(BuiltInRegistries.ENCHANTMENT, new ResourceLocation(OutstandingOresMod.MODID, "smelting"), new SmeltingEnchantment());
	}
}
