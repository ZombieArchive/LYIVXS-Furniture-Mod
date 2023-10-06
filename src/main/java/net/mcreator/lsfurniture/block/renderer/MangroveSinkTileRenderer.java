package net.mcreator.lsfurniture.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.lsfurniture.block.model.MangroveSinkBlockModel;
import net.mcreator.lsfurniture.block.entity.MangroveSinkTileEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class MangroveSinkTileRenderer extends GeoBlockRenderer<MangroveSinkTileEntity> {
	public MangroveSinkTileRenderer(BlockEntityRendererProvider.Context rendererDispatcherIn) {
		super(rendererDispatcherIn, new MangroveSinkBlockModel());
	}

	@Override
	public RenderType getRenderType(MangroveSinkTileEntity animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
