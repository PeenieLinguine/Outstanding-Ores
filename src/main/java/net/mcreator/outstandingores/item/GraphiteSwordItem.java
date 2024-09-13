
package net.mcreator.outstandingores.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.mcreator.outstandingores.procedures.GraphiteWeaponBonusEffectProcedure;
import net.mcreator.outstandingores.init.OutstandingOresModTabs;
import net.mcreator.outstandingores.init.OutstandingOresModItems;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

import java.util.List;

public class GraphiteSwordItem extends SwordItem {
	public GraphiteSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 196;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 1.5f;
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
		}, 3, -2.4f, new Item.Properties());
		ItemGroupEvents.modifyEntriesEvent(OutstandingOresModTabs.TAB_OUTSTANDING_ORES).register(content -> content.accept(this));
	}

	@Override
	public boolean mineBlock(ItemStack itemstack, Level world, BlockState blockstate, BlockPos pos, LivingEntity entity) {
		boolean retval = super.mineBlock(itemstack, world, blockstate, pos, entity);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		GraphiteWeaponBonusEffectProcedure.execute(world, entity, itemstack);
		return retval;
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		Level world = entity.level();
		GraphiteWeaponBonusEffectProcedure.execute(world, entity, itemstack);
		return retval;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u00A7cTool Bonus Effect:"));
		list.add(Component.literal("\u00A7d\u00A7lAn \u00A7r\u00A75\u00A7lArtist's \u00A7b\u00A7lOutline:\u00A7r\u00A77 Enemies you attack \u00A7r\u00A76\u00A7oGlow\u00A77 for 5 minutes."));
		list.add(Component.literal("\u00A7f\u00A7lSharpened \u00A7r\u00A78\u00A7lWear: \u00A7r\u00A77Gain \u00A7eSharpness \u00A7r\u00A77when the tool is below a certain level of \u00A78Durability\u00A7r\u00A77."));
		list.add(Component.literal("\u00A7fSharpness I\u00A77: \u00A7f75%"));
		list.add(Component.literal("\u00A7fSharpness II\u00A77: \u00A7f50%"));
		list.add(Component.literal("\u00A7fSharpness III\u00A77: \u00A7f25%"));
	}
}
