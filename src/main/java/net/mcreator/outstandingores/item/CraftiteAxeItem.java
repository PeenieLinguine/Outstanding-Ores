
package net.mcreator.outstandingores.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.Component;

import net.mcreator.outstandingores.procedures.CraftiteAxeWeaponBonusEffectProcedure;
import net.mcreator.outstandingores.init.OutstandingOresModTabs;
import net.mcreator.outstandingores.init.OutstandingOresModItems;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

import java.util.List;

public class CraftiteAxeItem extends AxeItem {
	public CraftiteAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 12068;
			}

			public float getSpeed() {
				return 30f;
			}

			public float getAttackDamageBonus() {
				return 18f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 35;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(OutstandingOresModItems.CRAFTITE), new ItemStack(OutstandingOresModItems.CRAFTITE_BASE));
			}
		}, 1, -3f, new Item.Properties().fireResistant());
		ItemGroupEvents.modifyEntriesEvent(OutstandingOresModTabs.TAB_OUTSTANDING_ORES).register(content -> content.accept(this));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		CraftiteAxeWeaponBonusEffectProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity, ar.getObject());
		return ar;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u00A7cTool Bonus Effect:"));
		list.add(Component.literal("\u00A71\u00A7lSkyward \u00A7r\u00A74\u00A7lStrike:\u00A7r\u00A77 On \u00A7r\u00A7d\u00A7nRight Click\u00A7r\u00A77,"));
		list.add(Component.literal("\u00A77after a short charge, you gain extreme \u00A7r\u00A78Resistance"));
		list.add(Component.literal("\u00A77and are launched into the air \u00A7r\u00A7e3 \u00A7r\u00A77separate times."));
		list.add(Component.literal("\u00A77When you land, the ground \u00A7r\u00A7c\u00A7lExplodes \u00A7r\u00A77beneath you."));
		list.add(Component.literal("\u00A77After each iteration, you are launched higher"));
		list.add(Component.literal("\u00A77and your \u00A7r\u00A7c\u00A7lExplosions \u00A7r\u00A77increase in \u00A7r\u00A7eMagnitude\u00A7r\u00A77."));
		list.add(Component.literal("\u00A7b15 second cooldown"));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		InteractionResult retval = super.useOn(context);
		CraftiteAxeWeaponBonusEffectProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer(), context.getItemInHand());
		return retval;
	}
}
