package net.mcreator.lsfurniture.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.lsfurniture.block.display.CrimsonWardrobe2DisplayItem;

public class CrimsonWardrobe2DisplayModel extends AnimatedGeoModel<CrimsonWardrobe2DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CrimsonWardrobe2DisplayItem animatable) {
		return new ResourceLocation("ls_furniture", "animations/wardrobetop.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CrimsonWardrobe2DisplayItem animatable) {
		return new ResourceLocation("ls_furniture", "geo/wardrobetop.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CrimsonWardrobe2DisplayItem entity) {
		return new ResourceLocation("ls_furniture", "textures/blocks/crimson_wardrobe.png");
	}
}
