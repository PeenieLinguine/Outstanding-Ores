
package net.mcreator.outstandingores.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.mcreator.outstandingores.procedures.MoissanitePickaxeBonusEffectProcedure;
import net.mcreator.outstandingores.init.OutstandingOresModTabs;
import net.mcreator.outstandingores.init.OutstandingOresModItems;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

import java.util.List;

public class MoissanitePickaxeItem extends PickaxeItem {
	public MoissanitePickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 6542;
			}

			public float getSpeed() {
				return 17f;
			}

			public float getAttackDamageBonus() {
				return 7f;
			}

			public int getLevel() {
				return 7;
			}

			public int getEnchantmentValue() {
				return 28;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(OutstandingOresModItems.MOISSANITE));
			}
		}, 1, -2.8f, new Item.Properties().fireResistant());
		ItemGroupEvents.modifyEntriesEvent(OutstandingOresModTabs.TAB_OUTSTANDING_ORES).register(content -> content.accept(this));
	}

	@Override
	public boolean mineBlock(ItemStack itemstack, Level world, BlockState blockstate, BlockPos pos, LivingEntity entity) {
		boolean retval = super.mineBlock(itemstack, world, blockstate, pos, entity);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		MoissanitePickaxeBonusEffectProcedure.execute(world, entity, itemstack);
		return retval;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u00A7cTool Bonus Effect:"));
		list.add(Component.literal("\u00A74\u00A7lMolten Rock:\u00A7r\u00A77 As you dig up blocks you will gain more \u00A7r\u00A7eHaste \u00A7r\u00A77up to \u00A7r\u00A7eHaste IV\u00A7r\u00A77."));
		list.add(Component.literal("\u00A77When you lose \u00A7bcooldown\u00A77 your \u00A7r\u00A7eHaste \u00A7r\u00A77will reset."));
	}
}
