package net.mcreator.lsfurniture.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.Minecraft;

import net.mcreator.lsfurniture.world.inventory.OvenMenu;
import net.mcreator.lsfurniture.procedures.ShowFireInGUIProcedureProcedure;
import net.mcreator.lsfurniture.procedures.OvenFuelRemainingProcedure;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;

public class OvenScreen extends AbstractContainerScreen<OvenMenu> {
	private final static HashMap<String, Object> guistate = OvenMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public OvenScreen(OvenMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("ls_furniture:textures/screens/oven.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("ls_furniture:textures/screens/furnace_fire_off.png"));
		this.blit(ms, this.leftPos + 53, this.topPos + 36, 0, 0, 14, 14, 14, 14);

		if (ShowFireInGUIProcedureProcedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("ls_furniture:textures/screens/furnace_fire_on.png"));
			this.blit(ms, this.leftPos + 53, this.topPos + 37, 0, 0, 14, 14, 14, 14);
		}

		RenderSystem.setShaderTexture(0, new ResourceLocation("ls_furniture:textures/screens/progress_arrow_back.png"));
		this.blit(ms, this.leftPos + 103, this.topPos + 26, 0, 0, 22, 15, 22, 15);

		double Progress1 = 0;
		Progress1 = (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "smeltingtime")) / 4.54;

		int progressint1 = (int) Progress1;


		RenderSystem.setShaderTexture(0, new ResourceLocation("ls_furniture:textures/screens/progress_arrow_back.png"));
		this.blit(ms, this.leftPos + 103, this.topPos + 44, 0, 0, 22, 15, 22, 15);

		double Progress2 = 0;
		Progress2 = (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "smeltingtime2")) / 4.54;

		int progressint2 = (int) Progress2;

		RenderSystem.setShaderTexture(0, new ResourceLocation("ls_furniture:textures/screens/progress_arrow_fill.png"));
		this.blit(ms, this.leftPos + 103, this.topPos + 26, 0, 0, progressint1, 15, progressint1, 15);

		RenderSystem.setShaderTexture(0, new ResourceLocation("ls_furniture:textures/screens/progress_arrow_fill.png"));
		this.blit(ms, this.leftPos + 103, this.topPos + 44, 0, 0, progressint2, 15, progressint2, 15);

		RenderSystem.setShaderTexture(0, new ResourceLocation("ls_furniture:textures/screens/progress_arrow_negative.png"));
		this.blit(ms, this.leftPos + 103, this.topPos + 26, 0, 0, 22, 15, 22, 15);

		RenderSystem.setShaderTexture(0, new ResourceLocation("ls_furniture:textures/screens/progress_arrow_negative.png"));
		this.blit(ms, this.leftPos + 103, this.topPos + 44, 0, 0, 22, 15, 22, 15);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, Component.translatable("gui.ls_furniture.oven.label_oven"), 7, 6, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.ls_furniture.oven.label_inventory"), 7, 72, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.ls_furniture.oven.label_empty"), 78, 16, -12829636);
		this.font.draw(poseStack,

				OvenFuelRemainingProcedure.execute(world, x, y, z), 15, 52, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
	}
}
