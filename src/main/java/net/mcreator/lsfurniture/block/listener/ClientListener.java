package net.mcreator.lsfurniture.block.listener;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.lsfurniture.init.LsFurnitureModBlockEntities;
import net.mcreator.lsfurniture.block.renderer.WarpedWardrobeTileRenderer;
import net.mcreator.lsfurniture.block.renderer.WarpedWardrobe2TileRenderer;
import net.mcreator.lsfurniture.block.renderer.WarpedWardrobe1TileRenderer;
import net.mcreator.lsfurniture.block.renderer.WarpedSinkTileRenderer;
import net.mcreator.lsfurniture.block.renderer.WarpedOvenTileRenderer;
import net.mcreator.lsfurniture.block.renderer.WarpedDrawerTileRenderer;
import net.mcreator.lsfurniture.block.renderer.WarpedDeskTileRenderer;
import net.mcreator.lsfurniture.block.renderer.WarpedCupboardTileRenderer;
import net.mcreator.lsfurniture.block.renderer.WarpedCounterTileRenderer;
import net.mcreator.lsfurniture.block.renderer.ToasterTileRenderer;
import net.mcreator.lsfurniture.block.renderer.SprucewardrobeTileRenderer;
import net.mcreator.lsfurniture.block.renderer.SpruceWardrobe2TileRenderer;
import net.mcreator.lsfurniture.block.renderer.SpruceWardrobe1TileRenderer;
import net.mcreator.lsfurniture.block.renderer.SpruceSinkTileRenderer;
import net.mcreator.lsfurniture.block.renderer.SpruceOvenTileRenderer;
import net.mcreator.lsfurniture.block.renderer.SpruceDrawerTileRenderer;
import net.mcreator.lsfurniture.block.renderer.SpruceDeskTileRenderer;
import net.mcreator.lsfurniture.block.renderer.SpruceCupboardTileRenderer;
import net.mcreator.lsfurniture.block.renderer.SpruceCounterTileRenderer;
import net.mcreator.lsfurniture.block.renderer.OakWardrobe2TileRenderer;
import net.mcreator.lsfurniture.block.renderer.OakWardrobe1TileRenderer;
import net.mcreator.lsfurniture.block.renderer.OakWardrobe0TileRenderer;
import net.mcreator.lsfurniture.block.renderer.OakSinkTileRenderer;
import net.mcreator.lsfurniture.block.renderer.OakOvenTileRenderer;
import net.mcreator.lsfurniture.block.renderer.OakDrawerTileRenderer;
import net.mcreator.lsfurniture.block.renderer.OakDeskTileRenderer;
import net.mcreator.lsfurniture.block.renderer.OakCupboardTileRenderer;
import net.mcreator.lsfurniture.block.renderer.OakCounterTileRenderer;
import net.mcreator.lsfurniture.block.renderer.MicrowaveTileRenderer;
import net.mcreator.lsfurniture.block.renderer.MangroveWardrobeTileRenderer;
import net.mcreator.lsfurniture.block.renderer.MangroveWardrobe2TileRenderer;
import net.mcreator.lsfurniture.block.renderer.MangroveWardrobe1TileRenderer;
import net.mcreator.lsfurniture.block.renderer.MangroveSinkTileRenderer;
import net.mcreator.lsfurniture.block.renderer.MangroveOvenTileRenderer;
import net.mcreator.lsfurniture.block.renderer.MangroveDrawerTileRenderer;
import net.mcreator.lsfurniture.block.renderer.MangroveDeskTileRenderer;
import net.mcreator.lsfurniture.block.renderer.MangroveCupboardTileRenderer;
import net.mcreator.lsfurniture.block.renderer.MangroveCounterTileRenderer;
import net.mcreator.lsfurniture.block.renderer.KettleTileRenderer;
import net.mcreator.lsfurniture.block.renderer.JungleWardrobeTileRenderer;
import net.mcreator.lsfurniture.block.renderer.JungleWardrobe2TileRenderer;
import net.mcreator.lsfurniture.block.renderer.JungleWardrobe1TileRenderer;
import net.mcreator.lsfurniture.block.renderer.JungleSinkTileRenderer;
import net.mcreator.lsfurniture.block.renderer.JungleOvenTileRenderer;
import net.mcreator.lsfurniture.block.renderer.JungleDrawerTileRenderer;
import net.mcreator.lsfurniture.block.renderer.JungleDeskTileRenderer;
import net.mcreator.lsfurniture.block.renderer.JungleCupboardTileRenderer;
import net.mcreator.lsfurniture.block.renderer.JungleCounterTileRenderer;
import net.mcreator.lsfurniture.block.renderer.FurnitureCrafterBetaTileRenderer;
import net.mcreator.lsfurniture.block.renderer.FridgeFreezerBlockTileRenderer;
import net.mcreator.lsfurniture.block.renderer.FridgeFreezerBlock2TileRenderer;
import net.mcreator.lsfurniture.block.renderer.FridgeFreezerBlock1TileRenderer;
import net.mcreator.lsfurniture.block.renderer.Darkoakwardrobe2TileRenderer;
import net.mcreator.lsfurniture.block.renderer.Darkoakwardrobe1TileRenderer;
import net.mcreator.lsfurniture.block.renderer.Darkoakwardrobe0TileRenderer;
import net.mcreator.lsfurniture.block.renderer.DarkoakDeskTileRenderer;
import net.mcreator.lsfurniture.block.renderer.DarkOakSinkTileRenderer;
import net.mcreator.lsfurniture.block.renderer.DarkOakOvenTileRenderer;
import net.mcreator.lsfurniture.block.renderer.DarkOakDrawerTileRenderer;
import net.mcreator.lsfurniture.block.renderer.DarkOakCupboardTileRenderer;
import net.mcreator.lsfurniture.block.renderer.DarkOakCounterTileRenderer;
import net.mcreator.lsfurniture.block.renderer.CrimsonWardrobeTileRenderer;
import net.mcreator.lsfurniture.block.renderer.CrimsonWardrobe2TileRenderer;
import net.mcreator.lsfurniture.block.renderer.CrimsonWardrobe1TileRenderer;
import net.mcreator.lsfurniture.block.renderer.CrimsonSinkTileRenderer;
import net.mcreator.lsfurniture.block.renderer.CrimsonOvenTileRenderer;
import net.mcreator.lsfurniture.block.renderer.CrimsonDrawerTileRenderer;
import net.mcreator.lsfurniture.block.renderer.CrimsonDeskTileRenderer;
import net.mcreator.lsfurniture.block.renderer.CrimsonCupboardTileRenderer;
import net.mcreator.lsfurniture.block.renderer.CrimsonCounterTileRenderer;
import net.mcreator.lsfurniture.block.renderer.BirchWardrobeTileRenderer;
import net.mcreator.lsfurniture.block.renderer.BirchWardrobe2TileRenderer;
import net.mcreator.lsfurniture.block.renderer.BirchWardrobe1TileRenderer;
import net.mcreator.lsfurniture.block.renderer.BirchSinkTileRenderer;
import net.mcreator.lsfurniture.block.renderer.BirchOvenTileRenderer;
import net.mcreator.lsfurniture.block.renderer.BirchDrawerTileRenderer;
import net.mcreator.lsfurniture.block.renderer.BirchDeskTileRenderer;
import net.mcreator.lsfurniture.block.renderer.BirchCupboardTileRenderer;
import net.mcreator.lsfurniture.block.renderer.BirchCounterTileRenderer;
import net.mcreator.lsfurniture.block.renderer.AcaciaWardrobeTileRenderer;
import net.mcreator.lsfurniture.block.renderer.AcaciaWardrobe2TileRenderer;
import net.mcreator.lsfurniture.block.renderer.AcaciaWardrobe1TileRenderer;
import net.mcreator.lsfurniture.block.renderer.AcaciaSinkTileRenderer;
import net.mcreator.lsfurniture.block.renderer.AcaciaOvenTileRenderer;
import net.mcreator.lsfurniture.block.renderer.AcaciaDrawerTileRenderer;
import net.mcreator.lsfurniture.block.renderer.AcaciaDeskTileRenderer;
import net.mcreator.lsfurniture.block.renderer.AcaciaCupboardTileRenderer;
import net.mcreator.lsfurniture.block.renderer.AcaciaCounterTileRenderer;
import net.mcreator.lsfurniture.LsFurnitureMod;

@Mod.EventBusSubscriber(modid = LsFurnitureMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientListener {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.FURNITURE_CRAFTER_BETA.get(), FurnitureCrafterBetaTileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.OAK_WARDROBE_0.get(), OakWardrobe0TileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.SPRUCEWARDROBE.get(), SprucewardrobeTileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.BIRCH_WARDROBE.get(), BirchWardrobeTileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.JUNGLE_WARDROBE.get(), JungleWardrobeTileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.ACACIA_WARDROBE.get(), AcaciaWardrobeTileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.DARKOAKWARDROBE_0.get(), Darkoakwardrobe0TileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.MANGROVE_WARDROBE.get(), MangroveWardrobeTileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.CRIMSON_WARDROBE.get(), CrimsonWardrobeTileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.WARPED_WARDROBE.get(), WarpedWardrobeTileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.OAK_DESK.get(), OakDeskTileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.SPRUCE_DESK.get(), SpruceDeskTileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.BIRCH_DESK.get(), BirchDeskTileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.JUNGLE_DESK.get(), JungleDeskTileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.ACACIA_DESK.get(), AcaciaDeskTileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.DARKOAK_DESK.get(), DarkoakDeskTileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.MANGROVE_DESK.get(), MangroveDeskTileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.CRIMSON_DESK.get(), CrimsonDeskTileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.WARPED_DESK.get(), WarpedDeskTileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.OAK_DRAWER.get(), OakDrawerTileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.SPRUCE_DRAWER.get(), SpruceDrawerTileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.BIRCH_DRAWER.get(), BirchDrawerTileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.JUNGLE_DRAWER.get(), JungleDrawerTileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.ACACIA_DRAWER.get(), AcaciaDrawerTileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.DARK_OAK_DRAWER.get(), DarkOakDrawerTileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.MANGROVE_DRAWER.get(), MangroveDrawerTileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.CRIMSON_DRAWER.get(), CrimsonDrawerTileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.WARPED_DRAWER.get(), WarpedDrawerTileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.OAK_COUNTER.get(), OakCounterTileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.SPRUCE_COUNTER.get(), SpruceCounterTileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.BIRCH_COUNTER.get(), BirchCounterTileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.JUNGLE_COUNTER.get(), JungleCounterTileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.ACACIA_COUNTER.get(), AcaciaCounterTileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.DARK_OAK_COUNTER.get(), DarkOakCounterTileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.MANGROVE_COUNTER.get(), MangroveCounterTileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.CRIMSON_COUNTER.get(), CrimsonCounterTileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.WARPED_COUNTER.get(), WarpedCounterTileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.OAK_SINK.get(), OakSinkTileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.SPRUCE_SINK.get(), SpruceSinkTileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.BIRCH_SINK.get(), BirchSinkTileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.JUNGLE_SINK.get(), JungleSinkTileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.ACACIA_SINK.get(), AcaciaSinkTileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.DARK_OAK_SINK.get(), DarkOakSinkTileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.MANGROVE_SINK.get(), MangroveSinkTileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.CRIMSON_SINK.get(), CrimsonSinkTileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.WARPED_SINK.get(), WarpedSinkTileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.OAK_OVEN.get(), OakOvenTileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.SPRUCE_OVEN.get(), SpruceOvenTileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.BIRCH_OVEN.get(), BirchOvenTileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.JUNGLE_OVEN.get(), JungleOvenTileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.ACACIA_OVEN.get(), AcaciaOvenTileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.DARK_OAK_OVEN.get(), DarkOakOvenTileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.MANGROVE_OVEN.get(), MangroveOvenTileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.WARPED_OVEN.get(), WarpedOvenTileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.CRIMSON_OVEN.get(), CrimsonOvenTileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.OAK_CUPBOARD.get(), OakCupboardTileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.SPRUCE_CUPBOARD.get(), SpruceCupboardTileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.BIRCH_CUPBOARD.get(), BirchCupboardTileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.JUNGLE_CUPBOARD.get(), JungleCupboardTileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.ACACIA_CUPBOARD.get(), AcaciaCupboardTileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.DARK_OAK_CUPBOARD.get(), DarkOakCupboardTileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.MANGROVE_CUPBOARD.get(), MangroveCupboardTileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.CRIMSON_CUPBOARD.get(), CrimsonCupboardTileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.WARPED_CUPBOARD.get(), WarpedCupboardTileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.FRIDGE_FREEZER_BLOCK.get(), FridgeFreezerBlockTileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.MICROWAVE.get(), MicrowaveTileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.KETTLE.get(), KettleTileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.TOASTER.get(), ToasterTileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.FRIDGE_FREEZER_BLOCK_1.get(), FridgeFreezerBlock1TileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.FRIDGE_FREEZER_BLOCK_2.get(), FridgeFreezerBlock2TileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.OAK_WARDROBE_1.get(), OakWardrobe1TileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.OAK_WARDROBE_2.get(), OakWardrobe2TileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.DARKOAKWARDROBE_1.get(), Darkoakwardrobe1TileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.DARKOAKWARDROBE_2.get(), Darkoakwardrobe2TileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.SPRUCE_WARDROBE_1.get(), SpruceWardrobe1TileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.SPRUCE_WARDROBE_2.get(), SpruceWardrobe2TileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.ACACIA_WARDROBE_1.get(), AcaciaWardrobe1TileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.ACACIA_WARDROBE_2.get(), AcaciaWardrobe2TileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.BIRCH_WARDROBE_1.get(), BirchWardrobe1TileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.BIRCH_WARDROBE_2.get(), BirchWardrobe2TileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.JUNGLE_WARDROBE_1.get(), JungleWardrobe1TileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.JUNGLE_WARDROBE_2.get(), JungleWardrobe2TileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.MANGROVE_WARDROBE_1.get(), MangroveWardrobe1TileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.MANGROVE_WARDROBE_2.get(), MangroveWardrobe2TileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.CRIMSON_WARDROBE_1.get(), CrimsonWardrobe1TileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.CRIMSON_WARDROBE_2.get(), CrimsonWardrobe2TileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.WARPED_WARDROBE_1.get(), WarpedWardrobe1TileRenderer::new);
		event.registerBlockEntityRenderer(LsFurnitureModBlockEntities.WARPED_WARDROBE_2.get(), WarpedWardrobe2TileRenderer::new);
	}
}
