
package net.mcreator.outstandingores.block;

import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.outstandingores.init.OutstandingOresModBlocks;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

import java.util.function.Predicate;
import java.util.List;
import java.util.Collections;

public class TalcBlock extends Block {
	public static BlockBehaviour.Properties PROPERTIES = BlockBehaviour.Properties.of().requiresCorrectToolForDrops().sound(SoundType.AMETHYST).strength(1.5f, 2f).lightLevel(s -> 6).requiresCorrectToolForDrops().friction(0.75f).speedFactor(1.08f)
			.jumpFactor(1.03f).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true);
	public static final Predicate<BiomeSelectionContext> GENERATE_BIOMES = BiomeSelectors.tag(TagKey.create(Registries.BIOME, new ResourceLocation("is_overworld")));

	public TalcBlock() {
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
		return Collections.singletonList(new ItemStack(this, 1));
	}

	@Environment(EnvType.CLIENT)
	public static void clientInit() {
		BlockRenderLayerMap.INSTANCE.putBlock(OutstandingOresModBlocks.TALC, RenderType.solid());
	}
}
