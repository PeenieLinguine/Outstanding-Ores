
package net.mcreator.outstandingores.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.Component;

import net.mcreator.outstandingores.procedures.OnyxToolBonusEffectProcedure;
import net.mcreator.outstandingores.init.OutstandingOresModTabs;
import net.mcreator.outstandingores.init.OutstandingOresModItems;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

import java.util.List;

public class OnyxPickaxeItem extends PickaxeItem {
	public OnyxPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 4196;
			}

			public float getSpeed() {
				return 14f;
			}

			public float getAttackDamageBonus() {
				return 6f;
			}

			public int getLevel() {
				return 6;
			}

			public int getEnchantmentValue() {
				return 23;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(OutstandingOresModItems.ONYX));
			}
		}, 1, -2.8f, new Item.Properties().fireResistant());
		ItemGroupEvents.modifyEntriesEvent(OutstandingOresModTabs.TAB_OUTSTANDING_ORES).register(content -> content.accept(this));
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		Level world = entity.level();
		OnyxToolBonusEffectProcedure.execute(entity);
		return retval;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u00A7cTool Bonus Effect:"));
		list.add(Component.literal("\u00A7e\u00A7lBlock \u00A7r\u00A74\u00A7lConsumption:\u00A7r\u00A77 Whenever a block is destroyed gain \u00A7r\u00A7eSaturation\u00A7r\u00A77."));
		list.add(Component.literal("\u00A77Full armor set is required to negate being \u00A7r\u00A74\u00A7lFat\u00A7r\u00A77."));
	}
}
