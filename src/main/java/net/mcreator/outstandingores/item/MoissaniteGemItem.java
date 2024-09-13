
package net.mcreator.outstandingores.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.outstandingores.procedures.MoissaniteArmorEffectProcedure;
import net.mcreator.outstandingores.init.OutstandingOresModTabs;
import net.mcreator.outstandingores.init.OutstandingOresModItems;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

import java.util.List;

import java.lang.reflect.Type;

public abstract class MoissaniteGemItem extends ArmorItem {
	public MoissaniteGemItem(Type type, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForType(Type type) {
				return new int[]{13, 15, 16, 11}[type.getSlot().getIndex()] * 53;
			}

			@Override
			public int getDefenseForType(Type type) {
				return new int[]{4, 10, 12, 4}[type.getSlot().getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 28;
			}

			@Override
			public SoundEvent getEquipSound() {
				return BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("item.armor.equip_netherite"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(OutstandingOresModItems.MOISSANITE));
			}

			@Environment(EnvType.CLIENT)
			@Override
			public String getName() {
				return "moissanite_";
			}

			@Override
			public float getToughness() {
				return 4f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.25f;
			}
		}, type, properties);
	}

	public static class Helmet extends MoissaniteGemItem {
		public Helmet() {
			super(Type.HELMET, new Item.Properties());
			ItemGroupEvents.modifyEntriesEvent(OutstandingOresModTabs.TAB_OUTSTANDING_ORES).register(content -> content.accept(this));
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, world, list, flag);
			list.add(Component.literal("\u00A7cFull Set Bonus Effect:"));
			list.add(Component.literal("\u00A74Fire Resistance"));
		}

		@Override
		public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slotinv, boolean selected) {
			double unique = Math.random();
			ItemStack stack = entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY;
			if (stack.getItem() == (itemstack).getItem()) {
				if (stack.getOrCreateTag().getDouble("_id") != unique)
					stack.getOrCreateTag().putDouble("_id", unique);
				if (itemstack.getOrCreateTag().getDouble("_id") == unique)
					MoissaniteArmorEffectProcedure.execute(entity);
			}
		}
	}

	public static class Chestplate extends MoissaniteGemItem {

		public Chestplate() {
			super(Type.CHESTPLATE, new Item.Properties());
			ItemGroupEvents.modifyEntriesEvent(OutstandingOresModTabs.TAB_OUTSTANDING_ORES).register(content -> content.accept(this));
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, world, list, flag);
			list.add(Component.literal("\u00A7cFull Set Bonus Effect:"));
			list.add(Component.literal("\u00A74Fire Resistance"));
		}

		@Override
		public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slotinv, boolean selected) {
			double unique = Math.random();
			ItemStack stack = entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY;
			if (stack.getItem() == (itemstack).getItem()) {
				if (stack.getOrCreateTag().getDouble("_id") != unique)
					stack.getOrCreateTag().putDouble("_id", unique);
				if (itemstack.getOrCreateTag().getDouble("_id") == unique)
					MoissaniteArmorEffectProcedure.execute(entity);
			}
		}
	}

	public static class Leggings extends MoissaniteGemItem {

		public Leggings() {
			super(Type.LEGGINGS, new Item.Properties());
			ItemGroupEvents.modifyEntriesEvent(OutstandingOresModTabs.TAB_OUTSTANDING_ORES).register(content -> content.accept(this));
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, world, list, flag);
			list.add(Component.literal("\u00A7cFull Set Bonus Effect:"));
			list.add(Component.literal("\u00A74Fire Resistance"));
		}

		@Override
		public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slotinv, boolean selected) {
			double unique = Math.random();
			ItemStack stack = entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY;
			if (stack.getItem() == (itemstack).getItem()) {
				if (stack.getOrCreateTag().getDouble("_id") != unique)
					stack.getOrCreateTag().putDouble("_id", unique);
				if (itemstack.getOrCreateTag().getDouble("_id") == unique)
					MoissaniteArmorEffectProcedure.execute(entity);
			}
		}
	}

	public static class Boots extends MoissaniteGemItem {

		public Boots() {
			super(Type.BOOTS, new Item.Properties());
			ItemGroupEvents.modifyEntriesEvent(OutstandingOresModTabs.TAB_OUTSTANDING_ORES).register(content -> content.accept(this));
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, world, list, flag);
			list.add(Component.literal("\u00A7cFull Set Bonus Effect:"));
			list.add(Component.literal("\u00A74Fire Resistance"));
		}

		@Override
		public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slotinv, boolean selected) {
			double unique = Math.random();
			ItemStack stack = entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY;
			if (stack.getItem() == (itemstack).getItem()) {
				if (stack.getOrCreateTag().getDouble("_id") != unique)
					stack.getOrCreateTag().putDouble("_id", unique);
				if (itemstack.getOrCreateTag().getDouble("_id") == unique)
					MoissaniteArmorEffectProcedure.execute(entity);
			}
		}
	}
}
