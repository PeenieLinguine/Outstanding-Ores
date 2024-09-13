
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.outstandingores.init;

import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.outstandingores.block.TungstenOreBlock;
import net.mcreator.outstandingores.block.TantalumOreBlock;
import net.mcreator.outstandingores.block.TalcBlock;
import net.mcreator.outstandingores.block.OnyxOreBlock;
import net.mcreator.outstandingores.block.MoissaniteOreBlock;
import net.mcreator.outstandingores.block.GraphiteOreBlock;
import net.mcreator.outstandingores.block.DeepslateTantalumOreBlock;
import net.mcreator.outstandingores.block.DeepslateGraphiteOreBlock;
import net.mcreator.outstandingores.block.CubicZirconiaOreBlock;
import net.mcreator.outstandingores.block.ArsenicOreBlock;
import net.mcreator.outstandingores.OutstandingOresMod;

import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;

import java.util.function.Predicate;

public class OutstandingOresModFeatures {
	public static void load() {
		register("graphite_ore", new OreFeature(OreConfiguration.CODEC), GraphiteOreBlock.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("deepslate_graphite_ore", new OreFeature(OreConfiguration.CODEC), DeepslateGraphiteOreBlock.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("talc", new OreFeature(OreConfiguration.CODEC), TalcBlock.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("arsenic_ore", new OreFeature(OreConfiguration.CODEC), ArsenicOreBlock.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("tantalum_ore", new OreFeature(OreConfiguration.CODEC), TantalumOreBlock.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("deepslate_tantalum_ore", new OreFeature(OreConfiguration.CODEC), DeepslateTantalumOreBlock.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("tungsten_ore", new OreFeature(OreConfiguration.CODEC), TungstenOreBlock.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("onyx_ore", new OreFeature(OreConfiguration.CODEC), OnyxOreBlock.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("moissanite_ore", new OreFeature(OreConfiguration.CODEC), MoissaniteOreBlock.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("cubic_zirconia_ore", new OreFeature(OreConfiguration.CODEC), CubicZirconiaOreBlock.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
	}

	public static void register(String registryName, Feature feature, Predicate<BiomeSelectionContext> biomes, GenerationStep.Decoration genStep) {
		Registry.register(BuiltInRegistries.FEATURE, new ResourceLocation(OutstandingOresMod.MODID, registryName), feature);
		BiomeModifications.addFeature(biomes, genStep, ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(OutstandingOresMod.MODID, registryName)));
	}
}
