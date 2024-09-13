
package net.mcreator.outstandingores.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.entity.EquipmentSlot;

public class SmeltingEnchantment extends Enchantment {
	public SmeltingEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.VERY_RARE, EnchantmentCategory.BREAKABLE, slots);
	}

	@Override
	public boolean isTreasureOnly() {
		return true;
	}
}
