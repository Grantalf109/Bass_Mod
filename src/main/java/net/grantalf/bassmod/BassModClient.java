package net.grantalf.bassmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.grantalf.bassmod.block.ModBlocks;
import net.grantalf.bassmod.entity.ModEntities;
import net.grantalf.bassmod.entity.client.AmongusRenderer;
import net.grantalf.bassmod.entity.client.BassRenderer;
import net.grantalf.bassmod.entity.client.ImposterRenderer;
import net.minecraft.client.render.RenderLayer;

public class BassModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.EBONY_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.EBONY_TRAPDOOR, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.EBONY_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.EBONY_SAPLING, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.VENT_BLOCK, RenderLayer.getCutout());


        EntityRendererRegistry.register(ModEntities.BASS, BassRenderer::new);
        EntityRendererRegistry.register(ModEntities.AMONGUS, AmongusRenderer::new);
        EntityRendererRegistry.register(ModEntities.IMPOSTER, ImposterRenderer::new);
    }
}
