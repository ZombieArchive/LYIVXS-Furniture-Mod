package net.mcreator.lsfurniture.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.lsfurniture.block.model.FridgeFreezerBlock1DisplayModel;
import net.mcreator.lsfurniture.block.display.FridgeFreezerBlock1DisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class FridgeFreezerBlock1DisplayItemRenderer extends GeoItemRenderer<FridgeFreezerBlock1DisplayItem> {
	public FridgeFreezerBlock1DisplayItemRenderer() {
		super(new FridgeFreezerBlock1DisplayModel());
	}

	@Override
	public RenderType getRenderType(FridgeFreezerBlock1DisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
