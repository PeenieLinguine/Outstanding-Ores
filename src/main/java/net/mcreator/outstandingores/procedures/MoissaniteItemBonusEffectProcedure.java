package net.mcreator.outstandingores.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.SimpleContainer;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.outstandingores.init.OutstandingOresModItems;

import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;

public class MoissaniteItemBonusEffectProcedure {
	public MoissaniteItemBonusEffectProcedure() {
		PlayerBlockBreakEvents.BEFORE.register((world, player, pos, state, blockentity) -> {
			execute(world, pos.getX(), pos.getY(), pos.getZ(), state, player);
			return true;
		});
	}

	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == OutstandingOresModItems.MOISSANITE_SHOVEL) {
			if (!((world.getBlockState(BlockPos.containing(x, y, z))) == Blocks.AIR.defaultBlockState())) {
				if ((world instanceof Level _lvlSmeltResult
						? _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING, new SimpleContainer((new ItemStack(blockstate.getBlock()))), _lvlSmeltResult).map(recipe -> recipe.getResultItem(_lvlSmeltResult.registryAccess()).copy())
								.orElse(ItemStack.EMPTY)
						: ItemStack.EMPTY).getItem() == Blocks.TERRACOTTA.asItem()
						|| (world instanceof Level _lvlSmeltResult
								? _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING, new SimpleContainer((new ItemStack(blockstate.getBlock()))), _lvlSmeltResult)
										.map(recipe -> recipe.getResultItem(_lvlSmeltResult.registryAccess()).copy()).orElse(ItemStack.EMPTY)
								: ItemStack.EMPTY).getItem() == Blocks.GLASS.asItem()) {
					world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
					world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(blockstate));
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
								(world instanceof Level _lvlSmeltResult
										? _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING, new SimpleContainer((new ItemStack(blockstate.getBlock()))), _lvlSmeltResult)
												.map(recipe -> recipe.getResultItem(_lvlSmeltResult.registryAccess()).copy()).orElse(ItemStack.EMPTY)
										: ItemStack.EMPTY));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("block.lava.extinguish")), SoundSource.BLOCKS, 50, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("block.lava.extinguish")), SoundSource.BLOCKS, 50, 1, false);
						}
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.LAVA, x, y, z, 3, 1, 0, 1, 1);
					if (Math.random() <= 0.4) {
						if (world instanceof ServerLevel _level)
							_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 1));
						if (Math.random() <= 0.2) {
							if (world instanceof ServerLevel _level)
								_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 1));
							if (Math.random() <= 0.05) {
								if (world instanceof ServerLevel _level)
									_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 1));
							}
						}
					}
				} else {
					{
						BlockPos _pos = BlockPos.containing(x, y, z);
						Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
						world.destroyBlock(_pos, false);
					}
					world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(blockstate));
				}
			}
		}
	}
}
