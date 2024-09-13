
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.outstandingores.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.outstandingores.OutstandingOresMod;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

public class OutstandingOresModTabs {
	public static ResourceKey<CreativeModeTab> TAB_OUTSTANDING_ORES = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(OutstandingOresMod.MODID, "outstanding_ores"));

	public static void load() {
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_OUTSTANDING_ORES,
				FabricItemGroup.builder().title(Component.translatable("item_group." + OutstandingOresMod.MODID + ".outstanding_ores")).icon(() -> new ItemStack(OutstandingOresModItems.MOISSANITE_PICKAXE)).build());
	}
}
