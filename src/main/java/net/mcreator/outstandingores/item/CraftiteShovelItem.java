
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

import net.mcreator.outstandingores.procedures.CraftiteShovelBonusEffectProcedure;
import net.mcreator.outstandingores.init.OutstandingOresModTabs;
import net.mcreator.outstandingores.init.OutstandingOresModItems;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

import java.util.List;

public class CraftiteShovelItem extends ShovelItem {
	public CraftiteShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 12068;
			}

			public float getSpeed() {
				return 30f;
			}

			public float getAttackDamageBonus() {
				return 10.5f;
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
	public boolean mineBlock(ItemStack itemstack, Level world, BlockState blockstate, BlockPos pos, LivingEntity entity) {
		boolean retval = super.mineBlock(itemstack, world, blockstate, pos, entity);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		CraftiteShovelBonusEffectProcedure.execute(world, x, y, z, entity);
		return retval;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u00A7cTool Bonus Effect:"));
		list.add(Component.literal("\u00A78\u00A7lX \u00A7r\u00A75\u00A7lMarks \u00A7r\u00A72\u00A7lEvery \u00A7r\u00A7e\u00A7lSpot:\u00A7r\u00A77 After digging up"));
		list.add(Component.literal("\u00A76Sand \u00A77there is a chance to discover \u00A7eTreasure\u00A77."));
		list.add(Component.literal("\u00A78Gunpowder: \u00A7f9.6%"));
		list.add(Component.literal("\u00A77Iron: \u00A7f4.8%"));
		list.add(Component.literal("\u00A76Gold: \u00A7f2.4%"));
		list.add(Component.literal("\u00A7aEmerald: \u00A7f1.2%"));
		list.add(Component.literal("\u00A7bDiamond: \u00A7f0.64%"));
		list.add(Component.literal("\u00A74Onyx: \u00A7f0.32%"));
		list.add(Component.literal("\u00A7eMoissanite: \u00A7f0.16%"));
		list.add(Component.literal("\u00A73Cubic Zirconia: \u00A7f0.08%"));
		list.add(Component.literal("\u00A7dEnchanted Book: \u00A7f0.04%"));
		list.add(Component.literal("\u00A75Craftite: \u00A7f0.0002%"));
		list.add(Component.literal("\u00A77\u00A7oThe chances for \u00A7r\u00A75\u00A7oCraftite \u00A7r\u00A77\u00A7ois low but never 0."));
		list.add(Component.literal("\u00A77\u00A7o - Some genius gambling philosopher"));
	}
}
