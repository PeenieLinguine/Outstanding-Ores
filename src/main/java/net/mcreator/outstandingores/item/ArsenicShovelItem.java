
package net.mcreator.outstandingores.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.mcreator.outstandingores.procedures.ArsenicToolBonusEffectProcedure;
import net.mcreator.outstandingores.init.OutstandingOresModTabs;
import net.mcreator.outstandingores.init.OutstandingOresModItems;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

import java.util.List;

public class ArsenicShovelItem extends ShovelItem {
	public ArsenicShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 725;
			}

			public float getSpeed() {
				return 7f;
			}

			public float getAttackDamageBonus() {
				return 3f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 16;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(OutstandingOresModItems.ARSENIC_INGOT));
			}
		}, 1, -3f, new Item.Properties());
		ItemGroupEvents.modifyEntriesEvent(OutstandingOresModTabs.TAB_OUTSTANDING_ORES).register(content -> content.accept(this));
	}

	@Override
	public boolean mineBlock(ItemStack itemstack, Level world, BlockState blockstate, BlockPos pos, LivingEntity entity) {
		boolean retval = super.mineBlock(itemstack, world, blockstate, pos, entity);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		ArsenicToolBonusEffectProcedure.execute(world, x, y, z, entity);
		return retval;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u00A7cTool Bonus Effect:"));
		list.add(Component.literal("\u00A77Chance for \u00A7r\u00A7a\u00A7lXP\u00A77 to drop when a block is harvested."));
		list.add(Component.literal("\u00A74\u00A7lCAUTION:\u00A7r\u00A77 Self applies \u00A7r\u00A7dPoison \u00A7r\u00A77and \u00A7r\u00A78Wither\u00A7r\u00A77."));
	}
}
