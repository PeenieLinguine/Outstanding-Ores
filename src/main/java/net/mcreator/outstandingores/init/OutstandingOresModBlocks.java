
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.outstandingores.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.outstandingores.block.TungstenOreBlock;
import net.mcreator.outstandingores.block.TantalumOreBlock;
import net.mcreator.outstandingores.block.TalcBlock;
import net.mcreator.outstandingores.block.ReinforcedTalcBlock;
import net.mcreator.outstandingores.block.ReinforcedAlloySmelterBlock;
import net.mcreator.outstandingores.block.OnyxOreBlock;
import net.mcreator.outstandingores.block.MoissaniteOreBlock;
import net.mcreator.outstandingores.block.JumpBoostGraphiteBlock;
import net.mcreator.outstandingores.block.GraphiteOreBlock;
import net.mcreator.outstandingores.block.GlowingGraphiteBlock;
import net.mcreator.outstandingores.block.DeepslateTantalumOreBlock;
import net.mcreator.outstandingores.block.DeepslateGraphiteOreBlock;
import net.mcreator.outstandingores.block.CubicZirconiaOreBlock;
import net.mcreator.outstandingores.block.BlockOfTungstenBlock;
import net.mcreator.outstandingores.block.BlockOfTantalumBlock;
import net.mcreator.outstandingores.block.BlockOfTantalumArsenideBlock;
import net.mcreator.outstandingores.block.BlockOfRawTungstenBlock;
import net.mcreator.outstandingores.block.BlockOfRawTantalumBlock;
import net.mcreator.outstandingores.block.BlockOfRawGraphiteBlock;
import net.mcreator.outstandingores.block.BlockOfRawArsenicBlock;
import net.mcreator.outstandingores.block.BlockOfOnyxBlock;
import net.mcreator.outstandingores.block.BlockOfMoissaniteBlock;
import net.mcreator.outstandingores.block.BlockOfGraphiteBlock;
import net.mcreator.outstandingores.block.BlockOfCubicZirconiaBlock;
import net.mcreator.outstandingores.block.BlockOfCraftiteBlock;
import net.mcreator.outstandingores.block.BlockOfArsenicBlock;
import net.mcreator.outstandingores.block.ArsenicOreBlock;
import net.mcreator.outstandingores.OutstandingOresMod;

public class OutstandingOresModBlocks {
	public static Block GRAPHITE_ORE;
	public static Block DEEPSLATE_GRAPHITE_ORE;
	public static Block BLOCK_OF_RAW_GRAPHITE;
	public static Block BLOCK_OF_GRAPHITE;
	public static Block GLOWING_GRAPHITE;
	public static Block JUMP_BOOST_GRAPHITE;
	public static Block TALC;
	public static Block REINFORCED_TALC;
	public static Block ARSENIC_ORE;
	public static Block BLOCK_OF_RAW_ARSENIC;
	public static Block BLOCK_OF_ARSENIC;
	public static Block TANTALUM_ORE;
	public static Block DEEPSLATE_TANTALUM_ORE;
	public static Block BLOCK_OF_RAW_TANTALUM;
	public static Block BLOCK_OF_TANTALUM;
	public static Block TUNGSTEN_ORE;
	public static Block BLOCK_OF_RAW_TUNGSTEN;
	public static Block BLOCK_OF_TUNGSTEN;
	public static Block BLOCK_OF_TANTALUM_ARSENIDE;
	public static Block ONYX_ORE;
	public static Block BLOCK_OF_ONYX;
	public static Block MOISSANITE_ORE;
	public static Block BLOCK_OF_MOISSANITE;
	public static Block CUBIC_ZIRCONIA_ORE;
	public static Block BLOCK_OF_CUBIC_ZIRCONIA;
	public static Block BLOCK_OF_CRAFTITE;
	public static Block REINFORCED_ALLOY_SMELTER;

	public static void load() {
		GRAPHITE_ORE = register("graphite_ore", new GraphiteOreBlock());
		DEEPSLATE_GRAPHITE_ORE = register("deepslate_graphite_ore", new DeepslateGraphiteOreBlock());
		BLOCK_OF_RAW_GRAPHITE = register("block_of_raw_graphite", new BlockOfRawGraphiteBlock());
		BLOCK_OF_GRAPHITE = register("block_of_graphite", new BlockOfGraphiteBlock());
		GLOWING_GRAPHITE = register("glowing_graphite", new GlowingGraphiteBlock());
		JUMP_BOOST_GRAPHITE = register("jump_boost_graphite", new JumpBoostGraphiteBlock());
		TALC = register("talc", new TalcBlock());
		REINFORCED_TALC = register("reinforced_talc", new ReinforcedTalcBlock());
		ARSENIC_ORE = register("arsenic_ore", new ArsenicOreBlock());
		BLOCK_OF_RAW_ARSENIC = register("block_of_raw_arsenic", new BlockOfRawArsenicBlock());
		BLOCK_OF_ARSENIC = register("block_of_arsenic", new BlockOfArsenicBlock());
		TANTALUM_ORE = register("tantalum_ore", new TantalumOreBlock());
		DEEPSLATE_TANTALUM_ORE = register("deepslate_tantalum_ore", new DeepslateTantalumOreBlock());
		BLOCK_OF_RAW_TANTALUM = register("block_of_raw_tantalum", new BlockOfRawTantalumBlock());
		BLOCK_OF_TANTALUM = register("block_of_tantalum", new BlockOfTantalumBlock());
		TUNGSTEN_ORE = register("tungsten_ore", new TungstenOreBlock());
		BLOCK_OF_RAW_TUNGSTEN = register("block_of_raw_tungsten", new BlockOfRawTungstenBlock());
		BLOCK_OF_TUNGSTEN = register("block_of_tungsten", new BlockOfTungstenBlock());
		BLOCK_OF_TANTALUM_ARSENIDE = register("block_of_tantalum_arsenide", new BlockOfTantalumArsenideBlock());
		ONYX_ORE = register("onyx_ore", new OnyxOreBlock());
		BLOCK_OF_ONYX = register("block_of_onyx", new BlockOfOnyxBlock());
		MOISSANITE_ORE = register("moissanite_ore", new MoissaniteOreBlock());
		BLOCK_OF_MOISSANITE = register("block_of_moissanite", new BlockOfMoissaniteBlock());
		CUBIC_ZIRCONIA_ORE = register("cubic_zirconia_ore", new CubicZirconiaOreBlock());
		BLOCK_OF_CUBIC_ZIRCONIA = register("block_of_cubic_zirconia", new BlockOfCubicZirconiaBlock());
		BLOCK_OF_CRAFTITE = register("block_of_craftite", new BlockOfCraftiteBlock());
		REINFORCED_ALLOY_SMELTER = register("reinforced_alloy_smelter", new ReinforcedAlloySmelterBlock());
	}

	public static void clientLoad() {
		GraphiteOreBlock.clientInit();
		DeepslateGraphiteOreBlock.clientInit();
		BlockOfRawGraphiteBlock.clientInit();
		BlockOfGraphiteBlock.clientInit();
		GlowingGraphiteBlock.clientInit();
		JumpBoostGraphiteBlock.clientInit();
		TalcBlock.clientInit();
		ReinforcedTalcBlock.clientInit();
		ArsenicOreBlock.clientInit();
		BlockOfRawArsenicBlock.clientInit();
		BlockOfArsenicBlock.clientInit();
		TantalumOreBlock.clientInit();
		DeepslateTantalumOreBlock.clientInit();
		BlockOfRawTantalumBlock.clientInit();
		BlockOfTantalumBlock.clientInit();
		TungstenOreBlock.clientInit();
		BlockOfRawTungstenBlock.clientInit();
		BlockOfTungstenBlock.clientInit();
		BlockOfTantalumArsenideBlock.clientInit();
		OnyxOreBlock.clientInit();
		BlockOfOnyxBlock.clientInit();
		MoissaniteOreBlock.clientInit();
		BlockOfMoissaniteBlock.clientInit();
		CubicZirconiaOreBlock.clientInit();
		BlockOfCubicZirconiaBlock.clientInit();
		BlockOfCraftiteBlock.clientInit();
		ReinforcedAlloySmelterBlock.clientInit();
	}

	private static Block register(String registryName, Block block) {
		return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(OutstandingOresMod.MODID, registryName), block);
	}
}
