
package net.mcreator.outstandingores.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.InteractionResult;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.mcreator.outstandingores.procedures.GraphiteToolBonusEffectProcedure;
import net.mcreator.outstandingores.init.OutstandingOresModTabs;
import net.mcreator.outstandingores.init.OutstandingOresModItems;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

import java.util.List;

public class GraphiteHoeItem extends HoeItem {
	public GraphiteHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 196;
			}

			public float getSpeed() {
				return 5.5f;
			}

			public float getAttackDamageBonus() {
				return 0f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 12;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(OutstandingOresModItems.GRAPHITE_INGOT));
			}
		}, 0, -1f, new Item.Properties());
		ItemGroupEvents.modifyEntriesEvent(OutstandingOresModTabs.TAB_OUTSTANDING_ORES).register(content -> content.accept(this));
	}

	@Override
	public boolean mineBlock(ItemStack itemstack, Level world, BlockState blockstate, BlockPos pos, LivingEntity entity) {
		boolean retval = super.mineBlock(itemstack, world, blockstate, pos, entity);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		GraphiteToolBonusEffectProcedure.execute(world, itemstack);
		return retval;
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		Level world = entity.level();
		GraphiteToolBonusEffectProcedure.execute(world, itemstack);
		return retval;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u00A7cTool Bonus Effect:"));
		list.add(Component.literal("\u00A7e\u00A7lEfficient \u00A7r\u00A78\u00A7lWear: \u00A7r\u00A77Gain \u00A7eEfficiency \u00A7r\u00A77when the tool is below a certain level of \u00A78Durability\u00A7r\u00A77."));
		list.add(Component.literal("\u00A7eEfficiency I\u00A77: \u00A7f75%"));
		list.add(Component.literal("\u00A7eEfficiency II\u00A77: \u00A7f50%"));
		list.add(Component.literal("\u00A7eEfficiency III\u00A77: \u00A7f25%"));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		InteractionResult retval = super.useOn(context);
		GraphiteToolBonusEffectProcedure.execute(context.getLevel(), context.getItemInHand());
		return retval;
	}
}
