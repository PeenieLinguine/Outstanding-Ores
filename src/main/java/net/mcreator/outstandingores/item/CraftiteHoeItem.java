
package net.mcreator.outstandingores.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.InteractionResult;
import net.minecraft.network.chat.Component;

import net.mcreator.outstandingores.procedures.CraftiteHoeBonusEffectProcedure;
import net.mcreator.outstandingores.init.OutstandingOresModTabs;
import net.mcreator.outstandingores.init.OutstandingOresModItems;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

import java.util.List;

public class CraftiteHoeItem extends HoeItem {
	public CraftiteHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 12068;
			}

			public float getSpeed() {
				return 30f;
			}

			public float getAttackDamageBonus() {
				return 0f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 35;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(OutstandingOresModItems.CRAFTITE_BASE), new ItemStack(OutstandingOresModItems.CRAFTITE));
			}
		}, 0, 4f, new Item.Properties().fireResistant());
		ItemGroupEvents.modifyEntriesEvent(OutstandingOresModTabs.TAB_OUTSTANDING_ORES).register(content -> content.accept(this));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u00A7cTool Bonus Effect:"));
		list.add(Component.literal("\u00A7a\u00A7lTill\u00A7r \u00A76\u00A7lThe\u00A7r \u00A72\u00A7lLand:\u00A7r\u00A77 Till out a \u00A7r\u00A7e3x3 \u00A7r\u00A77area."));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		InteractionResult retval = super.useOn(context);
		CraftiteHoeBonusEffectProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getItemInHand());
		return retval;
	}
}
