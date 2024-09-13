package net.mcreator.outstandingores.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;

public class CraftiteAxeWeaponBonusEffectProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(itemstack.getItem(), 300);
		{
			ItemStack _ist = itemstack;
			if (_ist.hurt(15, RandomSource.create(), null)) {
				_ist.shrink(1);
				_ist.setDamageValue(0);
			}
		}
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal("\u00A79\u00A7oCharging..."), true);
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("block.note_block.flute")), SoundSource.PLAYERS, 100, 5);
			} else {
				_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("block.note_block.flute")), SoundSource.PLAYERS, 100, 5, false);
			}
		}
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, -1, 50, false, false));
		new Object() {
			private int ticks = 0;

			public void startDelay(LevelAccessor world) {
				ServerTickEvents.END_SERVER_TICK.register((server) -> {
					this.ticks++;
					if (this.ticks == 3) {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("\u00A7e\u00A7oCharging..."), true);
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("block.note_block.flute")), SoundSource.PLAYERS, 100, 5);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("block.note_block.flute")), SoundSource.PLAYERS, 100, 5, false);
							}
						}
						return;
					}
				});
			}
		}.startDelay(world);
		new Object() {
			private int ticks = 0;

			public void startDelay(LevelAccessor world) {
				ServerTickEvents.END_SERVER_TICK.register((server) -> {
					this.ticks++;
					if (this.ticks == 10) {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("\u00A79\u00A7o3"), true);
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("block.note_block.flute")), SoundSource.PLAYERS, 100, 4);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("block.note_block.flute")), SoundSource.PLAYERS, 100, 4, false);
							}
						}
						return;
					}
				});
			}
		}.startDelay(world);
		new Object() {
			private int ticks = 0;

			public void startDelay(LevelAccessor world) {
				ServerTickEvents.END_SERVER_TICK.register((server) -> {
					this.ticks++;
					if (this.ticks == 13) {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("\u00A7e\u00A7o3"), true);
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("block.note_block.flute")), SoundSource.PLAYERS, 100, 4);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("block.note_block.flute")), SoundSource.PLAYERS, 100, 4, false);
							}
						}
						return;
					}
				});
			}
		}.startDelay(world);
		new Object() {
			private int ticks = 0;

			public void startDelay(LevelAccessor world) {
				ServerTickEvents.END_SERVER_TICK.register((server) -> {
					this.ticks++;
					if (this.ticks == 20) {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("\u00A79\u00A7o2"), true);
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("block.note_block.flute")), SoundSource.PLAYERS, 100, 3);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("block.note_block.flute")), SoundSource.PLAYERS, 100, 3, false);
							}
						}
						return;
					}
				});
			}
		}.startDelay(world);
		new Object() {
			private int ticks = 0;

			public void startDelay(LevelAccessor world) {
				ServerTickEvents.END_SERVER_TICK.register((server) -> {
					this.ticks++;
					if (this.ticks == 23) {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("\u00A7e\u00A7o2"), true);
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("block.note_block.flute")), SoundSource.PLAYERS, 100, 3);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("block.note_block.flute")), SoundSource.PLAYERS, 100, 3, false);
							}
						}
						return;
					}
				});
			}
		}.startDelay(world);
		new Object() {
			private int ticks = 0;

			public void startDelay(LevelAccessor world) {
				ServerTickEvents.END_SERVER_TICK.register((server) -> {
					this.ticks++;
					if (this.ticks == 30) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("block.note_block.flute")), SoundSource.PLAYERS, 100, 2);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("block.note_block.flute")), SoundSource.PLAYERS, 100, 2, false);
							}
						}
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("\u00A79\u00A7o1"), true);
						return;
					}
				});
			}
		}.startDelay(world);
		new Object() {
			private int ticks = 0;

			public void startDelay(LevelAccessor world) {
				ServerTickEvents.END_SERVER_TICK.register((server) -> {
					this.ticks++;
					if (this.ticks == 33) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("block.note_block.flute")), SoundSource.PLAYERS, 100, 2);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("block.note_block.flute")), SoundSource.PLAYERS, 100, 2, false);
							}
						}
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("\u00A7e\u00A7o1"), true);
						return;
					}
				});
			}
		}.startDelay(world);
		new Object() {
			private int ticks = 0;

			public void startDelay(LevelAccessor world) {
				ServerTickEvents.END_SERVER_TICK.register((server) -> {
					this.ticks++;
					if (this.ticks == 40) {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("\u00A77Preparing \u00A7r\u00A7b\u00A7lSkyward \u00A7r\u00A76\u00A7lStrike \u00A7r\u00A7eMagnitude 1!"), true);
						entity.setDeltaMovement(new Vec3(0, 1, 0));
						Vec3 motion = entity.getDeltaMovement().scale(1.2);
						entity.setDeltaMovement(motion);
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("entity.firework_rocket.launch")), SoundSource.PLAYERS, 100, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("entity.firework_rocket.launch")), SoundSource.PLAYERS, 100, 1, false);
							}
						}
						return;
					}
				});
			}
		}.startDelay(world);
		new Object() {
			private int ticks = 0;

			public void startDelay(LevelAccessor world) {
				ServerTickEvents.END_SERVER_TICK.register((server) -> {
					this.ticks++;
					if (this.ticks == 55) {
						entity.setDeltaMovement(new Vec3(0, (-2), 0));
						Vec3 motion = entity.getDeltaMovement().scale(1.2);
						entity.setDeltaMovement(motion);
						new Object() {
							private int ticks = 0;

							public void startDelay(LevelAccessor world) {
								ServerTickEvents.END_SERVER_TICK.register((server) -> {
									this.ticks++;
									if (this.ticks == 3) {
										if (world instanceof Level _level && !_level.isClientSide())
											_level.explode(null, (entity.getX()), (entity.getY() - 1), (entity.getZ()), 4, Level.ExplosionInteraction.NONE);
										if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
											_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, -1, 50, false, false));
										if (world instanceof Level _level) {
											if (!_level.isClientSide()) {
												_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("entity.firework_rocket.large_blast")), SoundSource.PLAYERS, 100, 1);
											} else {
												_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("entity.firework_rocket.large_blast")), SoundSource.PLAYERS, 100, 1, false);
											}
										}
										if (entity instanceof Player _player && !_player.level().isClientSide())
											_player.displayClientMessage(Component.literal("\u00A76\u00A7o\u00A7lEXPLOSION I"), true);
										return;
									}
								});
							}
						}.startDelay(world);
						return;
					}
				});
			}
		}.startDelay(world);
		new Object() {
			private int ticks = 0;

			public void startDelay(LevelAccessor world) {
				ServerTickEvents.END_SERVER_TICK.register((server) -> {
					this.ticks++;
					if (this.ticks == 70) {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("\u00A77Preparing \u00A7r\u00A79\u00A7lSkyward \u00A7r\u00A7c\u00A7lStrike \u00A7r\u00A7eMagnitude 2!"), true);
						entity.setDeltaMovement(new Vec3(0, 2, 0));
						Vec3 motion = entity.getDeltaMovement().scale(1.2);
						entity.setDeltaMovement(motion);
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("entity.firework_rocket.launch")), SoundSource.PLAYERS, 100, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("entity.firework_rocket.launch")), SoundSource.PLAYERS, 100, 1, false);
							}
						}
						return;
					}
				});
			}
		}.startDelay(world);
		new Object() {
			private int ticks = 0;

			public void startDelay(LevelAccessor world) {
				ServerTickEvents.END_SERVER_TICK.register((server) -> {
					this.ticks++;
					if (this.ticks == 85) {
						entity.setDeltaMovement(new Vec3(0, (-3), 0));
						Vec3 motion = entity.getDeltaMovement().scale(1.2);
						entity.setDeltaMovement(motion);
						new Object() {
							private int ticks = 0;

							public void startDelay(LevelAccessor world) {
								ServerTickEvents.END_SERVER_TICK.register((server) -> {
									this.ticks++;
									if (this.ticks == 8) {
										if (world instanceof Level _level && !_level.isClientSide())
											_level.explode(null, (entity.getX()), (entity.getY() - 1), (entity.getZ()), 6, Level.ExplosionInteraction.NONE);
										if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
											_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, -1, 50, false, false));
										if (world instanceof Level _level) {
											if (!_level.isClientSide()) {
												_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("entity.firework_rocket.large_blast")), SoundSource.PLAYERS, 100, 1);
											} else {
												_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("entity.firework_rocket.large_blast")), SoundSource.PLAYERS, 100, 1, false);
											}
										}
										if (entity instanceof Player _player && !_player.level().isClientSide())
											_player.displayClientMessage(Component.literal("\u00A7c\u00A7o\u00A7lEXPLOSION II"), true);
										return;
									}
								});
							}
						}.startDelay(world);
						return;
					}
				});
			}
		}.startDelay(world);
		new Object() {
			private int ticks = 0;

			public void startDelay(LevelAccessor world) {
				ServerTickEvents.END_SERVER_TICK.register((server) -> {
					this.ticks++;
					if (this.ticks == 100) {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("\u00A77Preparing \u00A7r\u00A71\u00A7lSkyward \u00A7r\u00A74\u00A7lStrike \u00A7r\u00A7eMagnitude 3!"), true);
						entity.setDeltaMovement(new Vec3(0, 3, 0));
						Vec3 motion = entity.getDeltaMovement().scale(1.2);
						entity.setDeltaMovement(motion);
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("entity.firework_rocket.launch")), SoundSource.PLAYERS, 100, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("entity.firework_rocket.launch")), SoundSource.PLAYERS, 100, 1, false);
							}
						}
						return;
					}
				});
			}
		}.startDelay(world);
		new Object() {
			private int ticks = 0;

			public void startDelay(LevelAccessor world) {
				ServerTickEvents.END_SERVER_TICK.register((server) -> {
					this.ticks++;
					if (this.ticks == 115) {
						entity.setDeltaMovement(new Vec3(0, (-4), 0));
						Vec3 motion = entity.getDeltaMovement().scale(1.2);
						entity.setDeltaMovement(motion);
						new Object() {
							private int ticks = 0;

							public void startDelay(LevelAccessor world) {
								ServerTickEvents.END_SERVER_TICK.register((server) -> {
									this.ticks++;
									if (this.ticks == 11) {
										if (world instanceof Level _level && !_level.isClientSide())
											_level.explode(null, (entity.getX()), (entity.getY() + 2), (entity.getZ()), 8, Level.ExplosionInteraction.NONE);
										if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
											_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, -1, 50, false, false));
										if (world instanceof Level _level) {
											if (!_level.isClientSide()) {
												_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("entity.firework_rocket.large_blast")), SoundSource.PLAYERS, 100, 1);
											} else {
												_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("entity.firework_rocket.large_blast")), SoundSource.PLAYERS, 100, 1, false);
											}
										}
										if (entity instanceof Player _player && !_player.level().isClientSide())
											_player.displayClientMessage(Component.literal("\u00A74\u00A7o\u00A7lEXPLOSION III"), true);
										return;
									}
								});
							}
						}.startDelay(world);
						return;
					}
				});
			}
		}.startDelay(world);
		new Object() {
			private int ticks = 0;

			public void startDelay(LevelAccessor world) {
				ServerTickEvents.END_SERVER_TICK.register((server) -> {
					this.ticks++;
					if (this.ticks == 150) {
						if (entity instanceof LivingEntity _entity)
							_entity.removeEffect(MobEffects.DAMAGE_RESISTANCE);
						return;
					}
				});
			}
		}.startDelay(world);
	}
}
