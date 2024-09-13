package net.mcreator.outstandingores.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.outstandingores.init.OutstandingOresModItems;

import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;

public class CraftiteShovelBonusEffectProcedure {
	public CraftiteShovelBonusEffectProcedure() {
		PlayerBlockBreakEvents.BEFORE.register((world, player, pos, state, blockentity) -> {
			execute(world, pos.getX(), pos.getY(), pos.getZ(), player);
			return true;
		});
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == OutstandingOresModItems.CRAFTITE_SHOVEL) {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.SAND || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.RED_SAND) {
				{
					BlockPos _pos = BlockPos.containing(x, y, z);
					Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
				if (Math.random() <= 0.000003) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(OutstandingOresModItems.CRAFTITE));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level)
						_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 30));
				} else if (Math.random() <= 0.0004) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, (EnchantmentHelper.enchantItem(RandomSource.create(), new ItemStack(Items.BOOK), 30, true)));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level)
						_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 5));
				} else if (Math.random() <= 0.0008) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(OutstandingOresModItems.CUBIC_ZIRCONIA));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level)
						_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 5));
				} else if (Math.random() <= 0.0016) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(OutstandingOresModItems.MOISSANITE));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level)
						_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 3));
				} else if (Math.random() <= 0.0032) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(OutstandingOresModItems.ONYX));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level)
						_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 3));
				} else if (Math.random() <= 0.0064) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.DIAMOND));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level)
						_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 2));
				} else if (Math.random() <= 0.012) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.EMERALD));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level)
						_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 2));
				} else if (Math.random() <= 0.024) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.GOLD_INGOT));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level)
						_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 1));
				} else if (Math.random() <= 0.048) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.IRON_INGOT));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level)
						_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 1));
				} else if (Math.random() <= 0.096) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.GUNPOWDER));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
		}
	}
}
