package net.mcreator.outstandingores.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;

public class CraftiteSwordBonusEffectProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(itemstack.getItem(), 160);
		{
			ItemStack _ist = itemstack;
			if (_ist.hurt(3, RandomSource.create(), null)) {
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
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("item.trident.throw")), SoundSource.PLAYERS, 100, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("item.trident.throw")), SoundSource.PLAYERS, 100, 1, false);
							}
						}
						world.addParticle(ParticleTypes.CRIT, x, y, z, 0, 1, 0);
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("\u00A74\u00A7oLET THE ARROWS RAIN!"), true);
						{
							Entity _shootFrom = entity;
							Level projectileLevel = _shootFrom.level();
							if (!projectileLevel.isClientSide()) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, float damage, int knockback, byte piercing) {
										AbstractArrow entityToSpawn = new Arrow(EntityType.ARROW, level);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setPierceLevel(piercing);
										entityToSpawn.setSecondsOnFire(100);
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, 2, 0, (byte) 2);
								_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
								_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 12, 1);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
						}
						{
							Entity _shootFrom = entity;
							Level projectileLevel = _shootFrom.level();
							if (!projectileLevel.isClientSide()) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, float damage, int knockback, byte piercing) {
										AbstractArrow entityToSpawn = new Arrow(EntityType.ARROW, level);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setPierceLevel(piercing);
										entityToSpawn.setSecondsOnFire(100);
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, 2, 0, (byte) 2);
								_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
								_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 12, 2);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
						}
						{
							Entity _shootFrom = entity;
							Level projectileLevel = _shootFrom.level();
							if (!projectileLevel.isClientSide()) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, float damage, int knockback, byte piercing) {
										AbstractArrow entityToSpawn = new Arrow(EntityType.ARROW, level);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setPierceLevel(piercing);
										entityToSpawn.setSecondsOnFire(100);
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, 1, 0, (byte) 1);
								_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
								_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 10, 3);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
						}
						{
							Entity _shootFrom = entity;
							Level projectileLevel = _shootFrom.level();
							if (!projectileLevel.isClientSide()) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, float damage, int knockback, byte piercing) {
										AbstractArrow entityToSpawn = new Arrow(EntityType.ARROW, level);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setPierceLevel(piercing);
										entityToSpawn.setSecondsOnFire(100);
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, 1, 0, (byte) 1);
								_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
								_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 10, 4);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
						}
						{
							Entity _shootFrom = entity;
							Level projectileLevel = _shootFrom.level();
							if (!projectileLevel.isClientSide()) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, float damage, int knockback, byte piercing) {
										AbstractArrow entityToSpawn = new Arrow(EntityType.ARROW, level);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setPierceLevel(piercing);
										entityToSpawn.setSecondsOnFire(100);
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, 1, 0, (byte) 1);
								_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
								_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 10, 5);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
						}
						{
							Entity _shootFrom = entity;
							Level projectileLevel = _shootFrom.level();
							if (!projectileLevel.isClientSide()) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, float damage, int knockback, byte piercing) {
										AbstractArrow entityToSpawn = new Arrow(EntityType.ARROW, level);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setPierceLevel(piercing);
										entityToSpawn.setSecondsOnFire(100);
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, 1, 0, (byte) 1);
								_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
								_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 10, 6);
								projectileLevel.addFreshEntity(_entityToSpawn);
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
					if (this.ticks == 43) {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("\u00A7c\u00A7oLET THE ARROWS RAIN!!"), true);
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
					if (this.ticks == 45) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("item.trident.throw")), SoundSource.PLAYERS, 100, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("item.trident.throw")), SoundSource.PLAYERS, 100, 1, false);
							}
						}
						world.addParticle(ParticleTypes.CRIT, x, y, z, 0, 1, 0);
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("\u00A76\u00A7oLET THE ARROWS RAIN!!!"), true);
						{
							Entity _shootFrom = entity;
							Level projectileLevel = _shootFrom.level();
							if (!projectileLevel.isClientSide()) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, float damage, int knockback, byte piercing) {
										AbstractArrow entityToSpawn = new Arrow(EntityType.ARROW, level);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setPierceLevel(piercing);
										entityToSpawn.setSecondsOnFire(100);
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, 2, 0, (byte) 2);
								_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
								_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 12, 1);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
						}
						{
							Entity _shootFrom = entity;
							Level projectileLevel = _shootFrom.level();
							if (!projectileLevel.isClientSide()) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, float damage, int knockback, byte piercing) {
										AbstractArrow entityToSpawn = new Arrow(EntityType.ARROW, level);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setPierceLevel(piercing);
										entityToSpawn.setSecondsOnFire(100);
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, 2, 0, (byte) 2);
								_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
								_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 12, 2);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
						}
						{
							Entity _shootFrom = entity;
							Level projectileLevel = _shootFrom.level();
							if (!projectileLevel.isClientSide()) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, float damage, int knockback, byte piercing) {
										AbstractArrow entityToSpawn = new Arrow(EntityType.ARROW, level);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setPierceLevel(piercing);
										entityToSpawn.setSecondsOnFire(100);
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, 1, 0, (byte) 1);
								_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
								_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 10, 3);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
						}
						{
							Entity _shootFrom = entity;
							Level projectileLevel = _shootFrom.level();
							if (!projectileLevel.isClientSide()) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, float damage, int knockback, byte piercing) {
										AbstractArrow entityToSpawn = new Arrow(EntityType.ARROW, level);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setPierceLevel(piercing);
										entityToSpawn.setSecondsOnFire(100);
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, 1, 0, (byte) 1);
								_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
								_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 10, 4);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
						}
						{
							Entity _shootFrom = entity;
							Level projectileLevel = _shootFrom.level();
							if (!projectileLevel.isClientSide()) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, float damage, int knockback, byte piercing) {
										AbstractArrow entityToSpawn = new Arrow(EntityType.ARROW, level);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setPierceLevel(piercing);
										entityToSpawn.setSecondsOnFire(100);
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, 1, 0, (byte) 1);
								_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
								_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 10, 4);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
						}
						{
							Entity _shootFrom = entity;
							Level projectileLevel = _shootFrom.level();
							if (!projectileLevel.isClientSide()) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, float damage, int knockback, byte piercing) {
										AbstractArrow entityToSpawn = new Arrow(EntityType.ARROW, level);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setPierceLevel(piercing);
										entityToSpawn.setSecondsOnFire(100);
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, 1, 0, (byte) 1);
								_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
								_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 10, 5);
								projectileLevel.addFreshEntity(_entityToSpawn);
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
					if (this.ticks == 48) {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("\u00A74\u00A7oLET THE ARROWS RAIN!!!!"), true);
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
					if (this.ticks == 50) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("item.trident.throw")), SoundSource.PLAYERS, 100, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("item.trident.throw")), SoundSource.PLAYERS, 100, 1, false);
							}
						}
						world.addParticle(ParticleTypes.CRIT, x, y, z, 0, 1, 0);
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("\u00A7c\u00A7oLET THE ARROWS RAIN!!!!!"), true);
						{
							Entity _shootFrom = entity;
							Level projectileLevel = _shootFrom.level();
							if (!projectileLevel.isClientSide()) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, float damage, int knockback, byte piercing) {
										AbstractArrow entityToSpawn = new Arrow(EntityType.ARROW, level);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setPierceLevel(piercing);
										entityToSpawn.setSecondsOnFire(100);
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, 2, 0, (byte) 2);
								_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
								_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 12, 1);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
						}
						{
							Entity _shootFrom = entity;
							Level projectileLevel = _shootFrom.level();
							if (!projectileLevel.isClientSide()) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, float damage, int knockback, byte piercing) {
										AbstractArrow entityToSpawn = new Arrow(EntityType.ARROW, level);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setPierceLevel(piercing);
										entityToSpawn.setSecondsOnFire(100);
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, 2, 0, (byte) 2);
								_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
								_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 12, 2);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
						}
						{
							Entity _shootFrom = entity;
							Level projectileLevel = _shootFrom.level();
							if (!projectileLevel.isClientSide()) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, float damage, int knockback, byte piercing) {
										AbstractArrow entityToSpawn = new Arrow(EntityType.ARROW, level);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setPierceLevel(piercing);
										entityToSpawn.setSecondsOnFire(100);
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, 1, 0, (byte) 1);
								_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
								_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 10, 3);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
						}
						{
							Entity _shootFrom = entity;
							Level projectileLevel = _shootFrom.level();
							if (!projectileLevel.isClientSide()) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, float damage, int knockback, byte piercing) {
										AbstractArrow entityToSpawn = new Arrow(EntityType.ARROW, level);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setPierceLevel(piercing);
										entityToSpawn.setSecondsOnFire(100);
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, 1, 0, (byte) 1);
								_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
								_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 10, 4);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
						}
						{
							Entity _shootFrom = entity;
							Level projectileLevel = _shootFrom.level();
							if (!projectileLevel.isClientSide()) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, float damage, int knockback, byte piercing) {
										AbstractArrow entityToSpawn = new Arrow(EntityType.ARROW, level);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setPierceLevel(piercing);
										entityToSpawn.setSecondsOnFire(100);
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, 1, 0, (byte) 1);
								_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
								_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 10, 5);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
						}
						{
							Entity _shootFrom = entity;
							Level projectileLevel = _shootFrom.level();
							if (!projectileLevel.isClientSide()) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, float damage, int knockback, byte piercing) {
										AbstractArrow entityToSpawn = new Arrow(EntityType.ARROW, level);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setPierceLevel(piercing);
										entityToSpawn.setSecondsOnFire(100);
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, 1, 0, (byte) 1);
								_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
								_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 10, 6);
								projectileLevel.addFreshEntity(_entityToSpawn);
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
					if (this.ticks == 53) {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("\u00A76\u00A7oLET THE ARROWS RAIN!!!!!!"), true);
						return;
					}
				});
			}
		}.startDelay(world);
	}
}
