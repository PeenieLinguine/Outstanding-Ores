package net.mcreator.outstandingores.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.outstandingores.init.OutstandingOresModItems;

public class CraftitePickaxeBonusEffectProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == OutstandingOresModItems.CRAFTITE_PICKAXE) {
			if (entity.isShiftKeyDown()) {
				if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.LIGHTNING_ROD)) {
					{
						BlockPos _pos = BlockPos.containing(x, y, z);
						Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
						world.destroyBlock(_pos, false);
					}
					{
						BlockPos _pos = BlockPos.containing(x + 1, y, z);
						Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
						world.destroyBlock(_pos, false);
					}
					{
						BlockPos _pos = BlockPos.containing(x - 1, y, z);
						Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
						world.destroyBlock(_pos, false);
					}
					{
						BlockPos _pos = BlockPos.containing(x + 1, y + 1, z);
						Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
						world.destroyBlock(_pos, false);
					}
					{
						BlockPos _pos = BlockPos.containing(x + 1, y - 1, z);
						Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
						world.destroyBlock(_pos, false);
					}
					{
						BlockPos _pos = BlockPos.containing(x - 1, y + 1, z);
						Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
						world.destroyBlock(_pos, false);
					}
					{
						BlockPos _pos = BlockPos.containing(x - 1, y - 1, z);
						Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
						world.destroyBlock(_pos, false);
					}
					{
						BlockPos _pos = BlockPos.containing(x, y + 1, z);
						Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
						world.destroyBlock(_pos, false);
					}
					{
						BlockPos _pos = BlockPos.containing(x, y - 1, z);
						Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
						world.destroyBlock(_pos, false);
					}
					{
						BlockPos _pos = BlockPos.containing(x, y, z + 1);
						Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
						world.destroyBlock(_pos, false);
					}
					{
						BlockPos _pos = BlockPos.containing(x, y, z - 1);
						Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
						world.destroyBlock(_pos, false);
					}
					{
						BlockPos _pos = BlockPos.containing(x, y + 1, z + 1);
						Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
						world.destroyBlock(_pos, false);
					}
					{
						BlockPos _pos = BlockPos.containing(x, y - 1, z + 1);
						Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
						world.destroyBlock(_pos, false);
					}
					{
						BlockPos _pos = BlockPos.containing(x, y + 1, z - 1);
						Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
						world.destroyBlock(_pos, false);
					}
					{
						BlockPos _pos = BlockPos.containing(x, y - 1, z - 1);
						Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
						world.destroyBlock(_pos, false);
					}
					{
						BlockPos _pos = BlockPos.containing(x + 1, y, z + 1);
						Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
						world.destroyBlock(_pos, false);
					}
					{
						BlockPos _pos = BlockPos.containing(x - 1, y, z + 1);
						Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
						world.destroyBlock(_pos, false);
					}
					{
						BlockPos _pos = BlockPos.containing(x + 1, y, z - 1);
						Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
						world.destroyBlock(_pos, false);
					}
					{
						BlockPos _pos = BlockPos.containing(x - 1, y, z - 1);
						Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
						world.destroyBlock(_pos, false);
					}
					{
						BlockPos _pos = BlockPos.containing(x + 1, y + 1, z + 1);
						Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
						world.destroyBlock(_pos, false);
					}
					{
						BlockPos _pos = BlockPos.containing(x - 1, y + 1, z + 1);
						Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
						world.destroyBlock(_pos, false);
					}
					{
						BlockPos _pos = BlockPos.containing(x + 1, y - 1, z + 1);
						Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
						world.destroyBlock(_pos, false);
					}
					{
						BlockPos _pos = BlockPos.containing(x + 1, y + 1, z - 1);
						Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
						world.destroyBlock(_pos, false);
					}
					{
						BlockPos _pos = BlockPos.containing(x - 1, y - 1, z + 1);
						Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
						world.destroyBlock(_pos, false);
					}
					{
						BlockPos _pos = BlockPos.containing(x - 1, y + 1, z - 1);
						Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
						world.destroyBlock(_pos, false);
					}
					{
						BlockPos _pos = BlockPos.containing(x + 1, y - 1, z - 1);
						Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
						world.destroyBlock(_pos, false);
					}
					{
						BlockPos _pos = BlockPos.containing(x - 1, y - 1, z - 1);
						Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
						world.destroyBlock(_pos, false);
					}
				}
			}
		}
	}
}
