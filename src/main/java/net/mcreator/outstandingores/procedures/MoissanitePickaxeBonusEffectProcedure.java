package net.mcreator.outstandingores.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.network.chat.Component;

import net.mcreator.outstandingores.init.OutstandingOresModItems;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;

public class MoissanitePickaxeBonusEffectProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getItem() == OutstandingOresModItems.MOISSANITE_PICKAXE) {
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 100);
			if (entity instanceof Player _plrCldCheck5 && _plrCldCheck5.getCooldowns().isOnCooldown(itemstack.getItem())) {
				new Object() {
					private int ticks = 0;

					public void startDelay(LevelAccessor world) {
						ServerTickEvents.END_SERVER_TICK.register((server) -> {
							this.ticks++;
							if (this.ticks == 60) {
								if (entity instanceof Player _plrCldCheck7 && _plrCldCheck7.getCooldowns().isOnCooldown(itemstack.getItem())) {
									if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 1, 0, false, false));
									if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DIG_SPEED) ? _livEnt.getEffect(MobEffects.DIG_SPEED).getAmplifier() : 0) == 0) {
										new Object() {
											private int ticks = 0;

											public void startDelay(LevelAccessor world) {
												ServerTickEvents.END_SERVER_TICK.register((server) -> {
													this.ticks++;
													if (this.ticks == 60) {
														if (entity instanceof Player _plrCldCheck11 && _plrCldCheck11.getCooldowns().isOnCooldown(itemstack.getItem())) {
															if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
																_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 1, 1, false, false));
															if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DIG_SPEED) ? _livEnt.getEffect(MobEffects.DIG_SPEED).getAmplifier() : 0) == 1) {
																new Object() {
																	private int ticks = 0;

																	public void startDelay(LevelAccessor world) {
																		ServerTickEvents.END_SERVER_TICK.register((server) -> {
																			this.ticks++;
																			if (this.ticks == 60) {
																				if (entity instanceof Player _plrCldCheck15 && _plrCldCheck15.getCooldowns().isOnCooldown(itemstack.getItem())) {
																					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
																						_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 1, 2, false, false));
																					if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DIG_SPEED) ? _livEnt.getEffect(MobEffects.DIG_SPEED).getAmplifier() : 0) == 2) {
																						new Object() {
																							private int ticks = 0;

																							public void startDelay(LevelAccessor world) {
																								ServerTickEvents.END_SERVER_TICK.register((server) -> {
																									this.ticks++;
																									if (this.ticks == 60) {
																										if (entity instanceof Player _plrCldCheck19 && _plrCldCheck19.getCooldowns().isOnCooldown(itemstack.getItem())) {
																											if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
																												_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 1, 3, false, false));
																										}
																										return;
																									}
																								});
																							}
																						}.startDelay(world);
																						if (!(entity instanceof Player _plrCldCheck23 && _plrCldCheck23.getCooldowns().isOnCooldown(itemstack.getItem()))) {
																							if (entity instanceof LivingEntity _entity)
																								_entity.removeEffect(MobEffects.DIG_SPEED);
																							if (entity instanceof Player _player && !_player.level().isClientSide())
																								_player.displayClientMessage(Component.literal("\u00A74\u00A7lMolten Rock \u00A78Lost"), true);
																						}
																					}
																				}
																				if (!(entity instanceof Player _plrCldCheck27 && _plrCldCheck27.getCooldowns().isOnCooldown(itemstack.getItem()))) {
																					if (entity instanceof LivingEntity _entity)
																						_entity.removeEffect(MobEffects.DIG_SPEED);
																					if (entity instanceof Player _player && !_player.level().isClientSide())
																						_player.displayClientMessage(Component.literal("\u00A74\u00A7lMolten Rock \u00A78Lost"), true);
																				}
																				return;
																			}
																		});
																	}
																}.startDelay(world);
															}
														}
														if (!(entity instanceof Player _plrCldCheck32 && _plrCldCheck32.getCooldowns().isOnCooldown(itemstack.getItem()))) {
															if (entity instanceof LivingEntity _entity)
																_entity.removeEffect(MobEffects.DIG_SPEED);
															if (entity instanceof Player _player && !_player.level().isClientSide())
																_player.displayClientMessage(Component.literal("\u00A74\u00A7lMolten Rock \u00A78Lost"), true);
														}
														return;
													}
												});
											}
										}.startDelay(world);
									}
								}
								if (!(entity instanceof Player _plrCldCheck37 && _plrCldCheck37.getCooldowns().isOnCooldown(itemstack.getItem()))) {
									if (entity instanceof LivingEntity _entity)
										_entity.removeEffect(MobEffects.DIG_SPEED);
									if (entity instanceof Player _player && !_player.level().isClientSide())
										_player.displayClientMessage(Component.literal("\u00A74\u00A7lMolten Rock \u00A78Lost"), true);
								}
								return;
							}
						});
					}
				}.startDelay(world);
			}
			if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DIG_SPEED) ? _livEnt.getEffect(MobEffects.DIG_SPEED).getAmplifier() : 0) == 0) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("\u00A74\u00A7lMolten Rock \u00A7eLevel 1!"), true);
				if (!(entity instanceof Player _plrCldCheck44 && _plrCldCheck44.getCooldowns().isOnCooldown(itemstack.getItem()))) {
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(MobEffects.DIG_SPEED);
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("lost"), true);
				}
			}
			if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DIG_SPEED) ? _livEnt.getEffect(MobEffects.DIG_SPEED).getAmplifier() : 0) == 1) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("\u00A74\u00A7lMolten Rock \u00A76Level 2!"), true);
				if (!(entity instanceof Player _plrCldCheck50 && _plrCldCheck50.getCooldowns().isOnCooldown(itemstack.getItem()))) {
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(MobEffects.DIG_SPEED);
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("lost"), true);
				}
			}
			if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DIG_SPEED) ? _livEnt.getEffect(MobEffects.DIG_SPEED).getAmplifier() : 0) == 2) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("\u00A74\u00A7lMolten Rock \u00A7cLevel 3!"), true);
				if (!(entity instanceof Player _plrCldCheck56 && _plrCldCheck56.getCooldowns().isOnCooldown(itemstack.getItem()))) {
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(MobEffects.DIG_SPEED);
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("lost"), true);
				}
			}
			if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DIG_SPEED) ? _livEnt.getEffect(MobEffects.DIG_SPEED).getAmplifier() : 0) == 3) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("\u00A74\u00A7lMolten Rock \u00A75Level 4!"), true);
				if (!(entity instanceof Player _plrCldCheck62 && _plrCldCheck62.getCooldowns().isOnCooldown(itemstack.getItem()))) {
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(MobEffects.DIG_SPEED);
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("lost"), true);
				}
			}
			if (!(entity instanceof Player _plrCldCheck66 && _plrCldCheck66.getCooldowns().isOnCooldown(itemstack.getItem()))) {
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(MobEffects.DIG_SPEED);
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("\u00A74\u00A7lMolten Rock \u00A78Lost"), true);
			}
			while ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DIG_SPEED) ? _livEnt.getEffect(MobEffects.DIG_SPEED).getAmplifier() : 0) == 0) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 20, 0, false, false));
				break;
			}
			while ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DIG_SPEED) ? _livEnt.getEffect(MobEffects.DIG_SPEED).getAmplifier() : 0) == 1) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 20, 1, false, false));
				break;
			}
			while ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DIG_SPEED) ? _livEnt.getEffect(MobEffects.DIG_SPEED).getAmplifier() : 0) == 2) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 20, 2, false, false));
				break;
			}
			while ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DIG_SPEED) ? _livEnt.getEffect(MobEffects.DIG_SPEED).getAmplifier() : 0) == 3) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 20, 3, false, false));
				break;
			}
			while (!(entity instanceof Player _plrCldCheck78 && _plrCldCheck78.getCooldowns().isOnCooldown(itemstack.getItem()))) {
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(MobEffects.DIG_SPEED);
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("lost"), true);
				break;
			}
		}
	}
}
