package net.mcreator.lsfurniture.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.lsfurniture.block.display.AcaciaDrawerDisplayItem;

public class AcaciaDrawerDisplayModel extends AnimatedGeoModel<AcaciaDrawerDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AcaciaDrawerDisplayItem animatable) {
		return new ResourceLocation("ls_furniture", "animations/bed_side_draw.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AcaciaDrawerDisplayItem animatable) {
		return new ResourceLocation("ls_furniture", "geo/bed_side_draw.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AcaciaDrawerDisplayItem entity) {
		return new ResourceLocation("ls_furniture", "textures/blocks/acacia_drawer.png");
	}
}
