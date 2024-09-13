/*
 *	MCreator note:
 *
 *	If you lock base mod element files, you can edit this file and the proxy files
 *	and they won't get overwritten. If you change your mod package or modid, you
 *	need to apply these changes to this file MANUALLY.
 *
 *
 *	If you do not lock base mod element files in Workspace settings, this file
 *	will be REGENERATED on each build.
 *
 */
package net.mcreator.outstandingores;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.mcreator.outstandingores.init.OutstandingOresModTrades;
import net.mcreator.outstandingores.init.OutstandingOresModTabs;
import net.mcreator.outstandingores.init.OutstandingOresModProcedures;
import net.mcreator.outstandingores.init.OutstandingOresModItems;
import net.mcreator.outstandingores.init.OutstandingOresModFeatures;
import net.mcreator.outstandingores.init.OutstandingOresModEnchantments;
import net.mcreator.outstandingores.init.OutstandingOresModBlocks;

import net.fabricmc.api.ModInitializer;

public class OutstandingOresMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "outstanding_ores";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing OutstandingOresMod");

		OutstandingOresModTabs.load();

		OutstandingOresModEnchantments.load();

		OutstandingOresModBlocks.load();
		OutstandingOresModItems.load();

		OutstandingOresModFeatures.load();

		OutstandingOresModProcedures.load();

		OutstandingOresModTrades.registerTrades();

	}
}
