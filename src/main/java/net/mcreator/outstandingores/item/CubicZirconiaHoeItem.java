
package net.mcreator.outstandingores.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.outstandingores.procedures.CubicZirconiaToolEffectProcedure;
import net.mcreator.outstandingores.init.OutstandingOresModTabs;
import net.mcreator.outstandingores.init.OutstandingOresModItems;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

import java.util.List;

public class CubicZirconiaHoeItem extends HoeItem {
	public CubicZirconiaHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 8096;
			}

			public float getSpeed() {
				return 19f;
			}

			public float getAttackDamageBonus() {
				return 0f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 31;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(OutstandingOresModItems.CUBIC_ZIRCONIA));
			}
		}, 0, 3f, new Item.Properties().fireResistant());
		ItemGroupEvents.modifyEntriesEvent(OutstandingOresModTabs.TAB_OUTSTANDING_ORES).register(content -> content.accept(this));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u00A7cTool Bonus Effect:"));
		list.add(Component.literal("\u00A77All effects only apply \u00A7r\u00A71Underwater\u00A7r\u00A77."));
		list.add(Component.literal("\u00A77While in hand gain \u00A7r\u00A73Water Breathing\u00A7r\u00A77."));
		list.add(Component.literal("\u00A77While full armor set equipped gain \u00A7r\u00A73Aqua Affinity V\u00A7r\u00A77."));
		list.add(Component.literal("\u00A78Resistance III"));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			CubicZirconiaToolEffectProcedure.execute(entity);
	}
}
