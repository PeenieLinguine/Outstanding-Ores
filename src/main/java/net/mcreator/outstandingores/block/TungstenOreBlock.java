
package net.mcreator.outstandingores.block;

import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.outstandingores.procedures.TungstenOreBlockDestroyedByPlayerProcedure;
import net.mcreator.outstandingores.init.OutstandingOresModItems;
import net.mcreator.outstandingores.init.OutstandingOresModBlocks;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

import java.util.function.Predicate;
import java.util.List;
import java.util.Collections;

public class TungstenOreBlock extends Block {
	public static BlockBehaviour.Properties PROPERTIES = BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().sound(SoundType.GILDED_BLACKSTONE).strength(30f, 10f).requiresCorrectToolForDrops();
	public static final Predicate<BiomeSelectionContext> GENERATE_BIOMES = BiomeSelectors.tag(TagKey.create(Registries.BIOME, new ResourceLocation("is_overworld")));

	public TungstenOreBlock() {
		super(PROPERTIES);
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(OutstandingOresModItems.RAW_TUNGSTEN));
	}

	@Override
	public void playerDestroy(Level world, Player entity, BlockPos pos, BlockState blockstate, BlockEntity blockEntity, ItemStack itemStack) {
		super.playerDestroy(world, entity, pos, blockstate, blockEntity, itemStack);
		TungstenOreBlockDestroyedByPlayerProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), entity);
	}

	@Environment(EnvType.CLIENT)
	public static void clientInit() {
		BlockRenderLayerMap.INSTANCE.putBlock(OutstandingOresModBlocks.TUNGSTEN_ORE, RenderType.solid());
	}
}
