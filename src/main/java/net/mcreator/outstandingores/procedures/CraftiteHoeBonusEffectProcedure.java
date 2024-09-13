package net.mcreator.outstandingores.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.util.RandomSource;
import net.minecraft.core.BlockPos;

import java.util.Map;

public class CraftiteHoeBonusEffectProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, ItemStack itemstack) {
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.GRASS_BLOCK || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DIRT) {
			if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.GRASS) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = Blocks.FARMLAND.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
				{
					BlockPos _bp = BlockPos.containing(x, y + 1, z);
					BlockState _bs = Blocks.AIR.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			}
		}
		if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.GRASS_BLOCK || (world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.DIRT) {
			if ((world.getBlockState(BlockPos.containing(x + 1, y + 1, z))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(x + 1, y + 1, z))).getBlock() == Blocks.GRASS) {
				{
					BlockPos _bp = BlockPos.containing(x + 1, y, z);
					BlockState _bs = Blocks.FARMLAND.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
				{
					BlockPos _bp = BlockPos.containing(x + 1, y + 1, z);
					BlockState _bs = Blocks.AIR.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			}
		}
		if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.GRASS_BLOCK || (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.DIRT) {
			if ((world.getBlockState(BlockPos.containing(x - 1, y + 1, z))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(x - 1, y + 1, z))).getBlock() == Blocks.GRASS) {
				{
					BlockPos _bp = BlockPos.containing(x - 1, y, z);
					BlockState _bs = Blocks.FARMLAND.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
				{
					BlockPos _bp = BlockPos.containing(x - 1, y + 1, z);
					BlockState _bs = Blocks.AIR.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.GRASS_BLOCK || (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.DIRT) {
			if ((world.getBlockState(BlockPos.containing(x, y + 1, z + 1))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(x, y + 1, z + 1))).getBlock() == Blocks.GRASS) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z + 1);
					BlockState _bs = Blocks.FARMLAND.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
				{
					BlockPos _bp = BlockPos.containing(x, y + 1, z + 1);
					BlockState _bs = Blocks.AIR.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.GRASS_BLOCK || (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.DIRT) {
			if ((world.getBlockState(BlockPos.containing(x, y + 1, z - 1))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(x, y + 1, z - 1))).getBlock() == Blocks.GRASS) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z - 1);
					BlockState _bs = Blocks.FARMLAND.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
				{
					BlockPos _bp = BlockPos.containing(x, y + 1, z - 1);
					BlockState _bs = Blocks.AIR.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			}
		}
		if ((world.getBlockState(BlockPos.containing(x + 1, y, z + 1))).getBlock() == Blocks.GRASS_BLOCK || (world.getBlockState(BlockPos.containing(x + 1, y, z + 1))).getBlock() == Blocks.DIRT) {
			if ((world.getBlockState(BlockPos.containing(x + 1, y + 1, z + 1))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(x + 1, y + 1, z + 1))).getBlock() == Blocks.GRASS) {
				{
					BlockPos _bp = BlockPos.containing(x + 1, y, z + 1);
					BlockState _bs = Blocks.FARMLAND.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
				{
					BlockPos _bp = BlockPos.containing(x + 1, y + 1, z + 1);
					BlockState _bs = Blocks.AIR.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			}
		}
		if ((world.getBlockState(BlockPos.containing(x - 1, y, z - 1))).getBlock() == Blocks.GRASS_BLOCK || (world.getBlockState(BlockPos.containing(x - 1, y, z - 1))).getBlock() == Blocks.DIRT) {
			if ((world.getBlockState(BlockPos.containing(x - 1, y + 1, z - 1))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(x - 1, y + 1, z - 1))).getBlock() == Blocks.GRASS) {
				{
					BlockPos _bp = BlockPos.containing(x - 1, y, z - 1);
					BlockState _bs = Blocks.FARMLAND.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
				{
					BlockPos _bp = BlockPos.containing(x - 1, y + 1, z - 1);
					BlockState _bs = Blocks.AIR.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			}
		}
		if ((world.getBlockState(BlockPos.containing(x + 1, y, z - 1))).getBlock() == Blocks.GRASS_BLOCK || (world.getBlockState(BlockPos.containing(x + 1, y, z - 1))).getBlock() == Blocks.DIRT) {
			if ((world.getBlockState(BlockPos.containing(x + 1, y + 1, z - 1))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(x + 1, y + 1, z - 1))).getBlock() == Blocks.GRASS) {
				{
					BlockPos _bp = BlockPos.containing(x + 1, y, z - 1);
					BlockState _bs = Blocks.FARMLAND.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
				{
					BlockPos _bp = BlockPos.containing(x + 1, y + 1, z - 1);
					BlockState _bs = Blocks.AIR.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			}
		}
		if ((world.getBlockState(BlockPos.containing(x - 1, y, z + 1))).getBlock() == Blocks.GRASS_BLOCK || (world.getBlockState(BlockPos.containing(x - 1, y, z + 1))).getBlock() == Blocks.DIRT) {
			if ((world.getBlockState(BlockPos.containing(x - 1, y + 1, z + 1))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(x - 1, y + 1, z + 1))).getBlock() == Blocks.GRASS) {
				{
					BlockPos _bp = BlockPos.containing(x - 1, y, z + 1);
					BlockState _bs = Blocks.FARMLAND.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
				{
					BlockPos _bp = BlockPos.containing(x - 1, y + 1, z + 1);
					BlockState _bs = Blocks.AIR.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			}
		}
		{
			ItemStack _ist = itemstack;
			if (_ist.hurt(1, RandomSource.create(), null)) {
				_ist.shrink(1);
				_ist.setDamageValue(0);
			}
		}
	}
}
