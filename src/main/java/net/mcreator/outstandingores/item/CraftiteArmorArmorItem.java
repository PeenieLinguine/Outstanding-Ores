
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

import net.mcreator.outstandingores.procedures.CraftiteArmorEffectProcedure;
import net.mcreator.outstandingores.init.OutstandingOresModTabs;
import net.mcreator.outstandingores.init.OutstandingOresModItems;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

import java.util.List;

import java.lang.reflect.Type;

public abstract class CraftiteArmorArmorItem extends ArmorItem {
	public CraftiteArmorArmorItem(Type type, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForType(Type type) {
				return new int[]{13, 15, 16, 11}[type.getSlot().getIndex()] * 124;
			}

			@Override
			public int getDefenseForType(Type type) {
				return new int[]{6, 16, 18, 6}[type.getSlot().getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 50;
			}

			@Override
			public SoundEvent getEquipSound() {
				return BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("item.armor.equip_elytra"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(OutstandingOresModItems.CRAFTITE));
			}

			@Environment(EnvType.CLIENT)
			@Override
			public String getName() {
				return "craftitearmor";
			}

			@Override
			public float getToughness() {
				return 6f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.5f;
			}
		}, type, properties);
	}

	public static class Helmet extends CraftiteArmorArmorItem {
		public Helmet() {
			super(Type.HELMET, new Item.Properties());
			ItemGroupEvents.modifyEntriesEvent(OutstandingOresModTabs.TAB_OUTSTANDING_ORES).register(content -> content.accept(this));
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, world, list, flag);
			list.add(Component.literal("\u00A7cFull Set Bonus Effect:"));
			list.add(Component.literal("\u00A7dProjectile Protection V"));
			list.add(Component.literal("\u00A71\u00A7lWater:"));
			list.add(Component.literal("  \u00A73Water Breathing"));
			list.add(Component.literal("  \u00A7bDolphins Grace V"));
			list.add(Component.literal("\u00A76\u00A7lFire:"));
			list.add(Component.literal("  \u00A74Fire Resistance"));
			list.add(Component.literal("  \u00A7cNo Fall Damage"));
			list.add(Component.literal("\u00A72\u00A7lEarth:"));
			list.add(Component.literal("  \u00A7fStrength III"));
			list.add(Component.literal("  \u00A78Resistance V"));
			list.add(Component.literal("\u00A7f\u00A7lAir:"));
			list.add(Component.literal("  \u00A7eSuper Speed"));
			list.add(Component.literal("  \u00A76Super Jump"));
		}

		@Override
		public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slotinv, boolean selected) {
			double unique = Math.random();
			ItemStack stack = entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY;
			if (stack.getItem() == (itemstack).getItem()) {
				if (stack.getOrCreateTag().getDouble("_id") != unique)
					stack.getOrCreateTag().putDouble("_id", unique);
				if (itemstack.getOrCreateTag().getDouble("_id") == unique)
					CraftiteArmorEffectProcedure.execute(entity, itemstack);
			}
		}
	}

	public static class Chestplate extends CraftiteArmorArmorItem {

		public Chestplate() {
			super(Type.CHESTPLATE, new Item.Properties());
			ItemGroupEvents.modifyEntriesEvent(OutstandingOresModTabs.TAB_OUTSTANDING_ORES).register(content -> content.accept(this));
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, world, list, flag);
			list.add(Component.literal("\u00A7cFull Set Bonus Effect:"));
			list.add(Component.literal("\u00A75Thorns V"));
			list.add(Component.literal("\u00A71\u00A7lWater:"));
			list.add(Component.literal("  \u00A73Water Breathing"));
			list.add(Component.literal("  \u00A7bDolphins Grace V"));
			list.add(Component.literal("\u00A76\u00A7lFire:"));
			list.add(Component.literal("  \u00A74Fire Resistance"));
			list.add(Component.literal("  \u00A7cNo Fall Damage"));
			list.add(Component.literal("\u00A72\u00A7lEarth:"));
			list.add(Component.literal("  \u00A7fStrength III"));
			list.add(Component.literal("  \u00A78Resistance V"));
			list.add(Component.literal("\u00A7f\u00A7lAir:"));
			list.add(Component.literal("  \u00A7eSUPER SPEED"));
			list.add(Component.literal("  \u00A76SUPER JUMP"));
		}

		@Override
		public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slotinv, boolean selected) {
			double unique = Math.random();
			ItemStack stack = entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY;
			if (stack.getItem() == (itemstack).getItem()) {
				if (stack.getOrCreateTag().getDouble("_id") != unique)
					stack.getOrCreateTag().putDouble("_id", unique);
				if (itemstack.getOrCreateTag().getDouble("_id") == unique)
					CraftiteArmorEffectProcedure.execute(entity, itemstack);
			}
		}
	}

	public static class Leggings extends CraftiteArmorArmorItem {

		public Leggings() {
			super(Type.LEGGINGS, new Item.Properties());
			ItemGroupEvents.modifyEntriesEvent(OutstandingOresModTabs.TAB_OUTSTANDING_ORES).register(content -> content.accept(this));
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, world, list, flag);
			list.add(Component.literal("\u00A7cFull Set Bonus Effect:"));
			list.add(Component.literal("\u00A78Soul Speed V"));
			list.add(Component.literal("\u00A71\u00A7lWater:"));
			list.add(Component.literal("  \u00A73Water Breathing"));
			list.add(Component.literal("  \u00A7bDolphins Grace V"));
			list.add(Component.literal("\u00A76\u00A7lFire:"));
			list.add(Component.literal("  \u00A74Fire Resistance"));
			list.add(Component.literal("  \u00A7cNo Fall Damage"));
			list.add(Component.literal("\u00A72\u00A7lEarth:"));
			list.add(Component.literal("  \u00A7fStrength III"));
			list.add(Component.literal("  \u00A78Resistance V"));
			list.add(Component.literal("\u00A7f\u00A7lAir:"));
			list.add(Component.literal("  \u00A7eSUPER SPEED"));
			list.add(Component.literal("  \u00A76SUPER JUMP"));
		}

		@Override
		public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slotinv, boolean selected) {
			double unique = Math.random();
			ItemStack stack = entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY;
			if (stack.getItem() == (itemstack).getItem()) {
				if (stack.getOrCreateTag().getDouble("_id") != unique)
					stack.getOrCreateTag().putDouble("_id", unique);
				if (itemstack.getOrCreateTag().getDouble("_id") == unique)
					CraftiteArmorEffectProcedure.execute(entity, itemstack);
			}
		}
	}

	public static class Boots extends CraftiteArmorArmorItem {

		public Boots() {
			super(Type.BOOTS, new Item.Properties());
			ItemGroupEvents.modifyEntriesEvent(OutstandingOresModTabs.TAB_OUTSTANDING_ORES).register(content -> content.accept(this));
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, world, list, flag);
			list.add(Component.literal("\u00A7cFull Set Bonus Effect:"));
			list.add(Component.literal("\u00A73Depth Strider V"));
			list.add(Component.literal("\u00A71\u00A7lWater:"));
			list.add(Component.literal("  \u00A73Water Breathing"));
			list.add(Component.literal("  \u00A7bDolphins Grace V"));
			list.add(Component.literal("\u00A76\u00A7lFire:"));
			list.add(Component.literal("  \u00A74Fire Resistance"));
			list.add(Component.literal("  \u00A7cNo Fall Damage"));
			list.add(Component.literal("\u00A72\u00A7lEarth:"));
			list.add(Component.literal("  \u00A7fStrength III"));
			list.add(Component.literal("  \u00A78Resistance V"));
			list.add(Component.literal("\u00A7f\u00A7lAir:"));
			list.add(Component.literal("  \u00A7eSUPER SPEED"));
			list.add(Component.literal("  \u00A76SUPER JUMP"));
		}

		@Override
		public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slotinv, boolean selected) {
			double unique = Math.random();
			ItemStack stack = entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY;
			if (stack.getItem() == (itemstack).getItem()) {
				if (stack.getOrCreateTag().getDouble("_id") != unique)
					stack.getOrCreateTag().putDouble("_id", unique);
				if (itemstack.getOrCreateTag().getDouble("_id") == unique)
					CraftiteArmorEffectProcedure.execute(entity, itemstack);
			}
		}
	}
}
