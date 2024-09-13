
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.outstandingores.init;

import org.jetbrains.annotations.NotNull;

import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;

public class OutstandingOresModTrades {
	public static void registerTrades() {
		TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 5, factories -> {
			factories.add(new BasicTrade(new ItemStack(OutstandingOresModItems.TANTALUM_INGOT), new ItemStack(OutstandingOresModItems.ARSENIC_INGOT), new ItemStack(OutstandingOresModItems.TANTALUM_ARSENIDE_INGOT), 12, 32, 0.05f));
		});
		TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 5, factories -> {
			factories.add(new BasicTrade(new ItemStack(OutstandingOresModItems.TANTALUM_INGOT), new ItemStack(OutstandingOresModItems.ARSENIC_INGOT), new ItemStack(OutstandingOresModItems.TANTALUM_ARSENIDE_INGOT), 12, 32, 0.05f));
		});
	}

	private record BasicTrade(ItemStack price, ItemStack price2, ItemStack offer, int maxTrades, int xp, float priceMult) implements VillagerTrades.ItemListing {
		@Override
		public @NotNull MerchantOffer getOffer(Entity entity, RandomSource random) {
			return new MerchantOffer(price, price2, offer, maxTrades, xp, priceMult);
		}
	}
}
