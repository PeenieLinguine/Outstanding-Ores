/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.outstandingores.init;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.client.renderer.item.ClampedItemPropertyFunction;

import net.mcreator.outstandingores.item.WitherSpineFragmentItem;
import net.mcreator.outstandingores.item.WardenRibPieceItem;
import net.mcreator.outstandingores.item.WardenRibItem;
import net.mcreator.outstandingores.item.TungstenSwordItem;
import net.mcreator.outstandingores.item.TungstenShovelItem;
import net.mcreator.outstandingores.item.TungstenPickaxeItem;
import net.mcreator.outstandingores.item.TungstenItem;
import net.mcreator.outstandingores.item.TungstenIngotItem;
import net.mcreator.outstandingores.item.TungstenHoeItem;
import net.mcreator.outstandingores.item.TungstenAxeItem;
import net.mcreator.outstandingores.item.ToastyBreadItem;
import net.mcreator.outstandingores.item.TantalumSwordItem;
import net.mcreator.outstandingores.item.TantalumShovelItem;
import net.mcreator.outstandingores.item.TantalumPickaxeItem;
import net.mcreator.outstandingores.item.TantalumIngotItem;
import net.mcreator.outstandingores.item.TantalumHoeItem;
import net.mcreator.outstandingores.item.TantalumAxeItem;
import net.mcreator.outstandingores.item.TantalumAsenideArmorArmorItem;
import net.mcreator.outstandingores.item.TantalumArsenideSwordItem;
import net.mcreator.outstandingores.item.TantalumArsenideShovelItem;
import net.mcreator.outstandingores.item.TantalumArsenidePickaxeItem;
import net.mcreator.outstandingores.item.TantalumArsenideIngotItem;
import net.mcreator.outstandingores.item.TantalumArsenideHoeItem;
import net.mcreator.outstandingores.item.TantalumArsenideAxeItem;
import net.mcreator.outstandingores.item.TantalumArmorItem;
import net.mcreator.outstandingores.item.TalcShardItem;
import net.mcreator.outstandingores.item.TalcRodItem;
import net.mcreator.outstandingores.item.RawTungstenItem;
import net.mcreator.outstandingores.item.RawTantalumItem;
import net.mcreator.outstandingores.item.RawGraphiteItem;
import net.mcreator.outstandingores.item.RawArsenicItem;
import net.mcreator.outstandingores.item.OnyxSwordItem;
import net.mcreator.outstandingores.item.OnyxShovelItem;
import net.mcreator.outstandingores.item.OnyxPickaxeItem;
import net.mcreator.outstandingores.item.OnyxItem;
import net.mcreator.outstandingores.item.OnyxHoeItem;
import net.mcreator.outstandingores.item.OnyxGemItem;
import net.mcreator.outstandingores.item.OnyxAxeItem;
import net.mcreator.outstandingores.item.MoissaniteSwordItem;
import net.mcreator.outstandingores.item.MoissaniteShovelItem;
import net.mcreator.outstandingores.item.MoissanitePickaxeItem;
import net.mcreator.outstandingores.item.MoissaniteItem;
import net.mcreator.outstandingores.item.MoissaniteHoeItem;
import net.mcreator.outstandingores.item.MoissaniteGemItem;
import net.mcreator.outstandingores.item.MoissaniteAxeItem;
import net.mcreator.outstandingores.item.GraphiteSwordItem;
import net.mcreator.outstandingores.item.GraphiteShovelItem;
import net.mcreator.outstandingores.item.GraphiteRodItem;
import net.mcreator.outstandingores.item.GraphitePickaxeItem;
import net.mcreator.outstandingores.item.GraphiteIngotItem;
import net.mcreator.outstandingores.item.GraphiteHoeItem;
import net.mcreator.outstandingores.item.GraphiteAxeItem;
import net.mcreator.outstandingores.item.ElderGuardianEyeItem;
import net.mcreator.outstandingores.item.DragonScalesItem;
import net.mcreator.outstandingores.item.CubicZirconiaSwordItem;
import net.mcreator.outstandingores.item.CubicZirconiaShovelItem;
import net.mcreator.outstandingores.item.CubicZirconiaPickaxeItem;
import net.mcreator.outstandingores.item.CubicZirconiaItem;
import net.mcreator.outstandingores.item.CubicZirconiaHoeItem;
import net.mcreator.outstandingores.item.CubicZirconiaAxeItem;
import net.mcreator.outstandingores.item.CubicZirconiaArmorItem;
import net.mcreator.outstandingores.item.CraftiteSwordItem;
import net.mcreator.outstandingores.item.CraftiteSmithingTemplateItem;
import net.mcreator.outstandingores.item.CraftiteShovelItem;
import net.mcreator.outstandingores.item.CraftitePickaxeItem;
import net.mcreator.outstandingores.item.CraftiteItem;
import net.mcreator.outstandingores.item.CraftiteHoeItem;
import net.mcreator.outstandingores.item.CraftiteBindingItem;
import net.mcreator.outstandingores.item.CraftiteBaseItem;
import net.mcreator.outstandingores.item.CraftiteAxeItem;
import net.mcreator.outstandingores.item.CraftiteArmorItem;
import net.mcreator.outstandingores.item.ArsenicSwordItem;
import net.mcreator.outstandingores.item.ArsenicShovelItem;
import net.mcreator.outstandingores.item.ArsenicPickaxeItem;
import net.mcreator.outstandingores.item.ArsenicIngotItem;
import net.mcreator.outstandingores.item.ArsenicHoeItem;
import net.mcreator.outstandingores.item.ArsenicAxeItem;
import net.mcreator.outstandingores.item.ArsenicArmorItem;
import net.mcreator.outstandingores.OutstandingOresMod;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class OutstandingOresModItems {
	public static Item GRAPHITE_ORE;
	public static Item DEEPSLATE_GRAPHITE_ORE;
	public static Item RAW_GRAPHITE;
	public static Item BLOCK_OF_RAW_GRAPHITE;
	public static Item GRAPHITE_INGOT;
	public static Item BLOCK_OF_GRAPHITE;
	public static Item GLOWING_GRAPHITE;
	public static Item JUMP_BOOST_GRAPHITE;
	public static Item GRAPHITE_ROD;
	public static Item GRAPHITE_PICKAXE;
	public static Item GRAPHITE_SWORD;
	public static Item GRAPHITE_AXE;
	public static Item GRAPHITE_SHOVEL;
	public static Item GRAPHITE_HOE;
	public static Item TALC_SHARD;
	public static Item TALC;
	public static Item REINFORCED_TALC;
	public static Item TALC_ROD;
	public static Item ARSENIC_ORE;
	public static Item RAW_ARSENIC;
	public static Item BLOCK_OF_RAW_ARSENIC;
	public static Item ARSENIC_INGOT;
	public static Item BLOCK_OF_ARSENIC;
	public static Item ARSENIC_PICKAXE;
	public static Item ARSENIC_SWORD;
	public static Item ARSENIC_AXE;
	public static Item ARSENIC_SHOVEL;
	public static Item ARSENIC_HOE;
	public static Item ARSENIC_ARMOR_HELMET;
	public static Item ARSENIC_ARMOR_CHESTPLATE;
	public static Item ARSENIC_ARMOR_LEGGINGS;
	public static Item ARSENIC_ARMOR_BOOTS;
	public static Item TANTALUM_ORE;
	public static Item DEEPSLATE_TANTALUM_ORE;
	public static Item RAW_TANTALUM;
	public static Item BLOCK_OF_RAW_TANTALUM;
	public static Item TANTALUM_INGOT;
	public static Item BLOCK_OF_TANTALUM;
	public static Item TANTALUM_PICKAXE;
	public static Item TANTALUM_SWORD;
	public static Item TANTALUM_AXE;
	public static Item TANTALUM_SHOVEL;
	public static Item TANTALUM_HOE;
	public static Item TANTALUM_ARMOR_HELMET;
	public static Item TANTALUM_ARMOR_CHESTPLATE;
	public static Item TANTALUM_ARMOR_LEGGINGS;
	public static Item TANTALUM_ARMOR_BOOTS;
	public static Item TUNGSTEN_ORE;
	public static Item BLOCK_OF_RAW_TUNGSTEN;
	public static Item RAW_TUNGSTEN;
	public static Item TUNGSTEN_INGOT;
	public static Item BLOCK_OF_TUNGSTEN;
	public static Item TUNGSTEN_PICKAXE;
	public static Item TUNGSTEN_SWORD;
	public static Item TUNGSTEN_AXE;
	public static Item TUNGSTEN_SHOVEL;
	public static Item TUNGSTEN_HOE;
	public static Item TUNGSTEN_HELMET;
	public static Item TUNGSTEN_CHESTPLATE;
	public static Item TUNGSTEN_LEGGINGS;
	public static Item TUNGSTEN_BOOTS;
	public static Item TANTALUM_ARSENIDE_INGOT;
	public static Item BLOCK_OF_TANTALUM_ARSENIDE;
	public static Item TANTALUM_ARSENIDE_PICKAXE;
	public static Item TANTALUM_ARSENIDE_SWORD;
	public static Item TANTALUM_ARSENIDE_AXE;
	public static Item TANTALUM_ARSENIDE_SHOVEL;
	public static Item TANTALUM_ARSENIDE_HOE;
	public static Item TANTALUM_ARSENIDE_ARMOR_HELMET;
	public static Item TANTALUM_ARSENIDE_ARMOR_CHESTPLATE;
	public static Item TANTALUM_ARSENIDE_ARMOR_LEGGINGS;
	public static Item TANTALUM_ARSENIDE_ARMOR_BOOTS;
	public static Item ONYX_ORE;
	public static Item ONYX;
	public static Item BLOCK_OF_ONYX;
	public static Item ONYX_PICKAXE;
	public static Item ONYX_SWORD;
	public static Item ONYX_AXE;
	public static Item ONYX_SHOVEL;
	public static Item ONYX_HOE;
	public static Item ONYX_GEM_HELMET;
	public static Item ONYX_GEM_CHESTPLATE;
	public static Item ONYX_GEM_LEGGINGS;
	public static Item ONYX_GEM_BOOTS;
	public static Item MOISSANITE_ORE;
	public static Item MOISSANITE;
	public static Item BLOCK_OF_MOISSANITE;
	public static Item MOISSANITE_PICKAXE;
	public static Item MOISSANITE_SWORD;
	public static Item MOISSANITE_AXE;
	public static Item MOISSANITE_SHOVEL;
	public static Item MOISSANITE_HOE;
	public static Item MOISSANITE_GEM_HELMET;
	public static Item MOISSANITE_GEM_CHESTPLATE;
	public static Item MOISSANITE_GEM_LEGGINGS;
	public static Item MOISSANITE_GEM_BOOTS;
	public static Item CUBIC_ZIRCONIA_ORE;
	public static Item CUBIC_ZIRCONIA;
	public static Item BLOCK_OF_CUBIC_ZIRCONIA;
	public static Item CUBIC_ZIRCONIA_PICKAXE;
	public static Item CUBIC_ZIRCONIA_SWORD;
	public static Item CUBIC_ZIRCONIA_AXE;
	public static Item CUBIC_ZIRCONIA_SHOVEL;
	public static Item CUBIC_ZIRCONIA_HOE;
	public static Item CUBIC_ZIRCONIA_ARMOR_HELMET;
	public static Item CUBIC_ZIRCONIA_ARMOR_CHESTPLATE;
	public static Item CUBIC_ZIRCONIA_ARMOR_LEGGINGS;
	public static Item CUBIC_ZIRCONIA_ARMOR_BOOTS;
	public static Item CRAFTITE_BASE;
	public static Item CRAFTITE;
	public static Item BLOCK_OF_CRAFTITE;
	public static Item CRAFTITE_SMITHING_TEMPLATE;
	public static Item CRAFTITE_PICKAXE;
	public static Item CRAFTITE_SWORD;
	public static Item CRAFTITE_AXE;
	public static Item CRAFTITE_SHOVEL;
	public static Item CRAFTITE_HOE;
	public static Item REINFORCED_ALLOY_SMELTER;
	public static Item WARDEN_RIB;
	public static Item WARDEN_RIB_PIECE;
	public static Item WITHER_SPINE_FRAGMENT;
	public static Item DRAGON_SCALES;
	public static Item ELDER_GUARDIAN_EYE;
	public static Item CRAFTITE_BINDING;
	public static Item TOASTY_BREAD;
	public static Item CRAFTITE_ARMOR_HELMET;
	public static Item CRAFTITE_ARMOR_CHESTPLATE;
	public static Item CRAFTITE_ARMOR_LEGGINGS;
	public static Item CRAFTITE_ARMOR_BOOTS;

	public static void load() {
		GRAPHITE_ORE = register("graphite_ore", new BlockItem(OutstandingOresModBlocks.GRAPHITE_ORE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(OutstandingOresModTabs.TAB_OUTSTANDING_ORES).register(content -> content.accept(GRAPHITE_ORE));
		DEEPSLATE_GRAPHITE_ORE = register("deepslate_graphite_ore", new BlockItem(OutstandingOresModBlocks.DEEPSLATE_GRAPHITE_ORE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(OutstandingOresModTabs.TAB_OUTSTANDING_ORES).register(content -> content.accept(DEEPSLATE_GRAPHITE_ORE));
		RAW_GRAPHITE = register("raw_graphite", new RawGraphiteItem());
		BLOCK_OF_RAW_GRAPHITE = register("block_of_raw_graphite", new BlockItem(OutstandingOresModBlocks.BLOCK_OF_RAW_GRAPHITE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(OutstandingOresModTabs.TAB_OUTSTANDING_ORES).register(content -> content.accept(BLOCK_OF_RAW_GRAPHITE));
		GRAPHITE_INGOT = register("graphite_ingot", new GraphiteIngotItem());
		BLOCK_OF_GRAPHITE = register("block_of_graphite", new BlockItem(OutstandingOresModBlocks.BLOCK_OF_GRAPHITE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(OutstandingOresModTabs.TAB_OUTSTANDING_ORES).register(content -> content.accept(BLOCK_OF_GRAPHITE));
		GLOWING_GRAPHITE = register("glowing_graphite", new BlockItem(OutstandingOresModBlocks.GLOWING_GRAPHITE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(OutstandingOresModTabs.TAB_OUTSTANDING_ORES).register(content -> content.accept(GLOWING_GRAPHITE));
		JUMP_BOOST_GRAPHITE = register("jump_boost_graphite", new BlockItem(OutstandingOresModBlocks.JUMP_BOOST_GRAPHITE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(OutstandingOresModTabs.TAB_OUTSTANDING_ORES).register(content -> content.accept(JUMP_BOOST_GRAPHITE));
		GRAPHITE_ROD = register("graphite_rod", new GraphiteRodItem());
		GRAPHITE_PICKAXE = register("graphite_pickaxe", new GraphitePickaxeItem());
		GRAPHITE_SWORD = register("graphite_sword", new GraphiteSwordItem());
		GRAPHITE_AXE = register("graphite_axe", new GraphiteAxeItem());
		GRAPHITE_SHOVEL = register("graphite_shovel", new GraphiteShovelItem());
		GRAPHITE_HOE = register("graphite_hoe", new GraphiteHoeItem());
		TALC_SHARD = register("talc_shard", new TalcShardItem());
		TALC = register("talc", new BlockItem(OutstandingOresModBlocks.TALC, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(OutstandingOresModTabs.TAB_OUTSTANDING_ORES).register(content -> content.accept(TALC));
		REINFORCED_TALC = register("reinforced_talc", new BlockItem(OutstandingOresModBlocks.REINFORCED_TALC, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(OutstandingOresModTabs.TAB_OUTSTANDING_ORES).register(content -> content.accept(REINFORCED_TALC));
		TALC_ROD = register("talc_rod", new TalcRodItem());
		ARSENIC_ORE = register("arsenic_ore", new BlockItem(OutstandingOresModBlocks.ARSENIC_ORE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(OutstandingOresModTabs.TAB_OUTSTANDING_ORES).register(content -> content.accept(ARSENIC_ORE));
		RAW_ARSENIC = register("raw_arsenic", new RawArsenicItem());
		BLOCK_OF_RAW_ARSENIC = register("block_of_raw_arsenic", new BlockItem(OutstandingOresModBlocks.BLOCK_OF_RAW_ARSENIC, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(OutstandingOresModTabs.TAB_OUTSTANDING_ORES).register(content -> content.accept(BLOCK_OF_RAW_ARSENIC));
		ARSENIC_INGOT = register("arsenic_ingot", new ArsenicIngotItem());
		BLOCK_OF_ARSENIC = register("block_of_arsenic", new BlockItem(OutstandingOresModBlocks.BLOCK_OF_ARSENIC, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(OutstandingOresModTabs.TAB_OUTSTANDING_ORES).register(content -> content.accept(BLOCK_OF_ARSENIC));
		ARSENIC_PICKAXE = register("arsenic_pickaxe", new ArsenicPickaxeItem());
		ARSENIC_SWORD = register("arsenic_sword", new ArsenicSwordItem());
		ARSENIC_AXE = register("arsenic_axe", new ArsenicAxeItem());
		ARSENIC_SHOVEL = register("arsenic_shovel", new ArsenicShovelItem());
		ARSENIC_HOE = register("arsenic_hoe", new ArsenicHoeItem());
		ARSENIC_ARMOR_HELMET = register("arsenic_armor_helmet", new ArsenicArmorItem.Helmet());
		ARSENIC_ARMOR_CHESTPLATE = register("arsenic_armor_chestplate", new ArsenicArmorItem.Chestplate());
		ARSENIC_ARMOR_LEGGINGS = register("arsenic_armor_leggings", new ArsenicArmorItem.Leggings());
		ARSENIC_ARMOR_BOOTS = register("arsenic_armor_boots", new ArsenicArmorItem.Boots());
		TANTALUM_ORE = register("tantalum_ore", new BlockItem(OutstandingOresModBlocks.TANTALUM_ORE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(OutstandingOresModTabs.TAB_OUTSTANDING_ORES).register(content -> content.accept(TANTALUM_ORE));
		DEEPSLATE_TANTALUM_ORE = register("deepslate_tantalum_ore", new BlockItem(OutstandingOresModBlocks.DEEPSLATE_TANTALUM_ORE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(OutstandingOresModTabs.TAB_OUTSTANDING_ORES).register(content -> content.accept(DEEPSLATE_TANTALUM_ORE));
		RAW_TANTALUM = register("raw_tantalum", new RawTantalumItem());
		BLOCK_OF_RAW_TANTALUM = register("block_of_raw_tantalum", new BlockItem(OutstandingOresModBlocks.BLOCK_OF_RAW_TANTALUM, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(OutstandingOresModTabs.TAB_OUTSTANDING_ORES).register(content -> content.accept(BLOCK_OF_RAW_TANTALUM));
		TANTALUM_INGOT = register("tantalum_ingot", new TantalumIngotItem());
		BLOCK_OF_TANTALUM = register("block_of_tantalum", new BlockItem(OutstandingOresModBlocks.BLOCK_OF_TANTALUM, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(OutstandingOresModTabs.TAB_OUTSTANDING_ORES).register(content -> content.accept(BLOCK_OF_TANTALUM));
		TANTALUM_PICKAXE = register("tantalum_pickaxe", new TantalumPickaxeItem());
		TANTALUM_SWORD = register("tantalum_sword", new TantalumSwordItem());
		TANTALUM_AXE = register("tantalum_axe", new TantalumAxeItem());
		TANTALUM_SHOVEL = register("tantalum_shovel", new TantalumShovelItem());
		TANTALUM_HOE = register("tantalum_hoe", new TantalumHoeItem());
		TANTALUM_ARMOR_HELMET = register("tantalum_armor_helmet", new TantalumArmorItem.Helmet());
		TANTALUM_ARMOR_CHESTPLATE = register("tantalum_armor_chestplate", new TantalumArmorItem.Chestplate());
		TANTALUM_ARMOR_LEGGINGS = register("tantalum_armor_leggings", new TantalumArmorItem.Leggings());
		TANTALUM_ARMOR_BOOTS = register("tantalum_armor_boots", new TantalumArmorItem.Boots());
		TUNGSTEN_ORE = register("tungsten_ore", new BlockItem(OutstandingOresModBlocks.TUNGSTEN_ORE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(OutstandingOresModTabs.TAB_OUTSTANDING_ORES).register(content -> content.accept(TUNGSTEN_ORE));
		BLOCK_OF_RAW_TUNGSTEN = register("block_of_raw_tungsten", new BlockItem(OutstandingOresModBlocks.BLOCK_OF_RAW_TUNGSTEN, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(OutstandingOresModTabs.TAB_OUTSTANDING_ORES).register(content -> content.accept(BLOCK_OF_RAW_TUNGSTEN));
		RAW_TUNGSTEN = register("raw_tungsten", new RawTungstenItem());
		TUNGSTEN_INGOT = register("tungsten_ingot", new TungstenIngotItem());
		BLOCK_OF_TUNGSTEN = register("block_of_tungsten", new BlockItem(OutstandingOresModBlocks.BLOCK_OF_TUNGSTEN, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(OutstandingOresModTabs.TAB_OUTSTANDING_ORES).register(content -> content.accept(BLOCK_OF_TUNGSTEN));
		TUNGSTEN_PICKAXE = register("tungsten_pickaxe", new TungstenPickaxeItem());
		TUNGSTEN_SWORD = register("tungsten_sword", new TungstenSwordItem());
		TUNGSTEN_AXE = register("tungsten_axe", new TungstenAxeItem());
		TUNGSTEN_SHOVEL = register("tungsten_shovel", new TungstenShovelItem());
		TUNGSTEN_HOE = register("tungsten_hoe", new TungstenHoeItem());
		TUNGSTEN_HELMET = register("tungsten_helmet", new TungstenItem.Helmet());
		TUNGSTEN_CHESTPLATE = register("tungsten_chestplate", new TungstenItem.Chestplate());
		TUNGSTEN_LEGGINGS = register("tungsten_leggings", new TungstenItem.Leggings());
		TUNGSTEN_BOOTS = register("tungsten_boots", new TungstenItem.Boots());
		TANTALUM_ARSENIDE_INGOT = register("tantalum_arsenide_ingot", new TantalumArsenideIngotItem());
		BLOCK_OF_TANTALUM_ARSENIDE = register("block_of_tantalum_arsenide", new BlockItem(OutstandingOresModBlocks.BLOCK_OF_TANTALUM_ARSENIDE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(OutstandingOresModTabs.TAB_OUTSTANDING_ORES).register(content -> content.accept(BLOCK_OF_TANTALUM_ARSENIDE));
		TANTALUM_ARSENIDE_PICKAXE = register("tantalum_arsenide_pickaxe", new TantalumArsenidePickaxeItem());
		TANTALUM_ARSENIDE_SWORD = register("tantalum_arsenide_sword", new TantalumArsenideSwordItem());
		TANTALUM_ARSENIDE_AXE = register("tantalum_arsenide_axe", new TantalumArsenideAxeItem());
		TANTALUM_ARSENIDE_SHOVEL = register("tantalum_arsenide_shovel", new TantalumArsenideShovelItem());
		TANTALUM_ARSENIDE_HOE = register("tantalum_arsenide_hoe", new TantalumArsenideHoeItem());
		TANTALUM_ARSENIDE_ARMOR_HELMET = register("tantalum_arsenide_armor_helmet", new TantalumAsenideArmorArmorItem.Helmet());
		TANTALUM_ARSENIDE_ARMOR_CHESTPLATE = register("tantalum_arsenide_armor_chestplate", new TantalumAsenideArmorArmorItem.Chestplate());
		TANTALUM_ARSENIDE_ARMOR_LEGGINGS = register("tantalum_arsenide_armor_leggings", new TantalumAsenideArmorArmorItem.Leggings());
		TANTALUM_ARSENIDE_ARMOR_BOOTS = register("tantalum_arsenide_armor_boots", new TantalumAsenideArmorArmorItem.Boots());
		ONYX_ORE = register("onyx_ore", new BlockItem(OutstandingOresModBlocks.ONYX_ORE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(OutstandingOresModTabs.TAB_OUTSTANDING_ORES).register(content -> content.accept(ONYX_ORE));
		ONYX = register("onyx", new OnyxItem());
		BLOCK_OF_ONYX = register("block_of_onyx", new BlockItem(OutstandingOresModBlocks.BLOCK_OF_ONYX, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(OutstandingOresModTabs.TAB_OUTSTANDING_ORES).register(content -> content.accept(BLOCK_OF_ONYX));
		ONYX_PICKAXE = register("onyx_pickaxe", new OnyxPickaxeItem());
		ONYX_SWORD = register("onyx_sword", new OnyxSwordItem());
		ONYX_AXE = register("onyx_axe", new OnyxAxeItem());
		ONYX_SHOVEL = register("onyx_shovel", new OnyxShovelItem());
		ONYX_HOE = register("onyx_hoe", new OnyxHoeItem());
		ONYX_GEM_HELMET = register("onyx_gem_helmet", new OnyxGemItem.Helmet());
		ONYX_GEM_CHESTPLATE = register("onyx_gem_chestplate", new OnyxGemItem.Chestplate());
		ONYX_GEM_LEGGINGS = register("onyx_gem_leggings", new OnyxGemItem.Leggings());
		ONYX_GEM_BOOTS = register("onyx_gem_boots", new OnyxGemItem.Boots());
		MOISSANITE_ORE = register("moissanite_ore", new BlockItem(OutstandingOresModBlocks.MOISSANITE_ORE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(OutstandingOresModTabs.TAB_OUTSTANDING_ORES).register(content -> content.accept(MOISSANITE_ORE));
		MOISSANITE = register("moissanite", new MoissaniteItem());
		BLOCK_OF_MOISSANITE = register("block_of_moissanite", new BlockItem(OutstandingOresModBlocks.BLOCK_OF_MOISSANITE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(OutstandingOresModTabs.TAB_OUTSTANDING_ORES).register(content -> content.accept(BLOCK_OF_MOISSANITE));
		MOISSANITE_PICKAXE = register("moissanite_pickaxe", new MoissanitePickaxeItem());
		MOISSANITE_SWORD = register("moissanite_sword", new MoissaniteSwordItem());
		MOISSANITE_AXE = register("moissanite_axe", new MoissaniteAxeItem());
		MOISSANITE_SHOVEL = register("moissanite_shovel", new MoissaniteShovelItem());
		MOISSANITE_HOE = register("moissanite_hoe", new MoissaniteHoeItem());
		MOISSANITE_GEM_HELMET = register("moissanite_gem_helmet", new MoissaniteGemItem.Helmet());
		MOISSANITE_GEM_CHESTPLATE = register("moissanite_gem_chestplate", new MoissaniteGemItem.Chestplate());
		MOISSANITE_GEM_LEGGINGS = register("moissanite_gem_leggings", new MoissaniteGemItem.Leggings());
		MOISSANITE_GEM_BOOTS = register("moissanite_gem_boots", new MoissaniteGemItem.Boots());
		CUBIC_ZIRCONIA_ORE = register("cubic_zirconia_ore", new BlockItem(OutstandingOresModBlocks.CUBIC_ZIRCONIA_ORE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(OutstandingOresModTabs.TAB_OUTSTANDING_ORES).register(content -> content.accept(CUBIC_ZIRCONIA_ORE));
		CUBIC_ZIRCONIA = register("cubic_zirconia", new CubicZirconiaItem());
		BLOCK_OF_CUBIC_ZIRCONIA = register("block_of_cubic_zirconia", new BlockItem(OutstandingOresModBlocks.BLOCK_OF_CUBIC_ZIRCONIA, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(OutstandingOresModTabs.TAB_OUTSTANDING_ORES).register(content -> content.accept(BLOCK_OF_CUBIC_ZIRCONIA));
		CUBIC_ZIRCONIA_PICKAXE = register("cubic_zirconia_pickaxe", new CubicZirconiaPickaxeItem());
		CUBIC_ZIRCONIA_SWORD = register("cubic_zirconia_sword", new CubicZirconiaSwordItem());
		CUBIC_ZIRCONIA_AXE = register("cubic_zirconia_axe", new CubicZirconiaAxeItem());
		CUBIC_ZIRCONIA_SHOVEL = register("cubic_zirconia_shovel", new CubicZirconiaShovelItem());
		CUBIC_ZIRCONIA_HOE = register("cubic_zirconia_hoe", new CubicZirconiaHoeItem());
		CUBIC_ZIRCONIA_ARMOR_HELMET = register("cubic_zirconia_armor_helmet", new CubicZirconiaArmorItem.Helmet());
		CUBIC_ZIRCONIA_ARMOR_CHESTPLATE = register("cubic_zirconia_armor_chestplate", new CubicZirconiaArmorItem.Chestplate());
		CUBIC_ZIRCONIA_ARMOR_LEGGINGS = register("cubic_zirconia_armor_leggings", new CubicZirconiaArmorItem.Leggings());
		CUBIC_ZIRCONIA_ARMOR_BOOTS = register("cubic_zirconia_armor_boots", new CubicZirconiaArmorItem.Boots());
		CRAFTITE_BASE = register("craftite_base", new CraftiteBaseItem());
		CRAFTITE = register("craftite", new CraftiteItem());
		BLOCK_OF_CRAFTITE = register("block_of_craftite", new BlockItem(OutstandingOresModBlocks.BLOCK_OF_CRAFTITE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(OutstandingOresModTabs.TAB_OUTSTANDING_ORES).register(content -> content.accept(BLOCK_OF_CRAFTITE));
		CRAFTITE_SMITHING_TEMPLATE = register("craftite_smithing_template", new CraftiteSmithingTemplateItem());
		CRAFTITE_PICKAXE = register("craftite_pickaxe", new CraftitePickaxeItem());
		CRAFTITE_SWORD = register("craftite_sword", new CraftiteSwordItem());
		CRAFTITE_AXE = register("craftite_axe", new CraftiteAxeItem());
		CRAFTITE_SHOVEL = register("craftite_shovel", new CraftiteShovelItem());
		CRAFTITE_HOE = register("craftite_hoe", new CraftiteHoeItem());
		REINFORCED_ALLOY_SMELTER = register("reinforced_alloy_smelter", new BlockItem(OutstandingOresModBlocks.REINFORCED_ALLOY_SMELTER, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(OutstandingOresModTabs.TAB_OUTSTANDING_ORES).register(content -> content.accept(REINFORCED_ALLOY_SMELTER));
		WARDEN_RIB = register("warden_rib", new WardenRibItem());
		WARDEN_RIB_PIECE = register("warden_rib_piece", new WardenRibPieceItem());
		WITHER_SPINE_FRAGMENT = register("wither_spine_fragment", new WitherSpineFragmentItem());
		DRAGON_SCALES = register("dragon_scales", new DragonScalesItem());
		ELDER_GUARDIAN_EYE = register("elder_guardian_eye", new ElderGuardianEyeItem());
		CRAFTITE_BINDING = register("craftite_binding", new CraftiteBindingItem());
		TOASTY_BREAD = register("toasty_bread", new ToastyBreadItem());
		CRAFTITE_ARMOR_HELMET = register("craftite_armor_helmet", new CraftiteArmorItem.Helmet());
		CRAFTITE_ARMOR_CHESTPLATE = register("craftite_armor_chestplate", new CraftiteArmorItem.Chestplate());
		CRAFTITE_ARMOR_LEGGINGS = register("craftite_armor_leggings", new CraftiteArmorItem.Leggings());
		CRAFTITE_ARMOR_BOOTS = register("craftite_armor_boots", new CraftiteArmorItem.Boots());
	}

	public static void clientLoad() {
	}

	private static Item register(String registryName, Item item) {
		return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(OutstandingOresMod.MODID, registryName), item);
	}

	private static void registerBlockingProperty(Item item) {
		ItemProperties.register(item, new ResourceLocation("blocking"), (ClampedItemPropertyFunction) ItemProperties.getProperty(Items.SHIELD, new ResourceLocation("blocking")));
	}
}
