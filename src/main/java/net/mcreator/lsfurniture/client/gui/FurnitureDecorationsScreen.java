package net.mcreator.lsfurniture.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.Minecraft;

import net.mcreator.lsfurniture.world.inventory.FurnitureDecorationsMenu;
import net.mcreator.lsfurniture.network.FurnitureDecorationsButtonMessage;
import net.mcreator.lsfurniture.LsFurnitureMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class FurnitureDecorationsScreen extends AbstractContainerScreen<FurnitureDecorationsMenu> {
	private final static HashMap<String, Object> guistate = FurnitureDecorationsMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_tab_deselect1;
	ImageButton imagebutton_tab_deselect2;
	ImageButton imagebutton_tab_deselect_left_edge;
	ImageButton imagebutton_oak_wood;
	ImageButton imagebutton_iron_ingot;
	ImageButton imagebutton_toddys;
	ImageButton imagebutton_question_mark;
	ImageButton imagebutton_tab_deselect;
	ImageButton imagebutton_path;
	ImageButton imagebutton_tab_deselect3;
	ImageButton imagebutton_stone;
	ImageButton imagebutton_furniture_crafter_button_default;
	ImageButton imagebutton_furniture_crafter_button_default1;

	public FurnitureDecorationsScreen(FurnitureDecorationsMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 276;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("ls_furniture:textures/screens/furniture_decorations.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
		if (mouseX > leftPos + 3 && mouseX < leftPos + 27 && mouseY > topPos + -25 && mouseY < topPos + -1)
			this.renderTooltip(ms, Component.translatable("gui.ls_furniture.furniture_decorations.tooltip_empty"), mouseX, mouseY);
		if (mouseX > leftPos + 36 && mouseX < leftPos + 60 && mouseY > topPos + -25 && mouseY < topPos + -1)
			this.renderTooltip(ms, Component.translatable("gui.ls_furniture.furniture_decorations.tooltip_empty1"), mouseX, mouseY);
		if (mouseX > leftPos + 69 && mouseX < leftPos + 93 && mouseY > topPos + -25 && mouseY < topPos + -1)
			this.renderTooltip(ms, Component.translatable("gui.ls_furniture.furniture_decorations.tooltip_empty2"), mouseX, mouseY);
		if (mouseX > leftPos + 102 && mouseX < leftPos + 126 && mouseY > topPos + -25 && mouseY < topPos + -1)
			this.renderTooltip(ms, Component.translatable("gui.ls_furniture.furniture_decorations.tooltip_empty3"), mouseX, mouseY);
		if (mouseX > leftPos + 18 && mouseX < leftPos + 42 && mouseY > topPos + 107 && mouseY < topPos + 131)
			this.renderTooltip(ms, Component.translatable("gui.ls_furniture.furniture_decorations.tooltip_recipe_explainer"), mouseX, mouseY);
		if (mouseX > leftPos + 135 && mouseX < leftPos + 159 && mouseY > topPos + -25 && mouseY < topPos + -1)
			this.renderTooltip(ms, Component.translatable("gui.ls_furniture.furniture_decorations.tooltip_paths"), mouseX, mouseY);
		if (mouseX > leftPos + 168 && mouseX < leftPos + 192 && mouseY > topPos + -25 && mouseY < topPos + -1)
			this.renderTooltip(ms, Component.translatable("gui.ls_furniture.furniture_decorations.tooltip_decorations"), mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("ls_furniture:textures/screens/triangle_arrow_down.png"));
		this.blit(ms, this.leftPos + 22, this.topPos + 71, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("ls_furniture:textures/screens/triangle_arrow_down.png"));
		this.blit(ms, this.leftPos + 238, this.topPos + 71, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("ls_furniture:textures/screens/stone.png"));
		this.blit(ms, this.leftPos + 36, this.topPos + -25, 0, 0, 24, 24, 24, 24);

		RenderSystem.setShaderTexture(0, new ResourceLocation("ls_furniture:textures/screens/furniture_crafter_brown_background.png"));
		this.blit(ms, this.leftPos + 60, this.topPos + 8, 0, 0, 155, 74, 155, 74);

		RenderSystem.setShaderTexture(0, new ResourceLocation("ls_furniture:textures/screens/block.png"));
		this.blit(ms, this.leftPos + 14, this.topPos + 18, 0, 0, 14, 14, 14, 14);

		RenderSystem.setShaderTexture(0, new ResourceLocation("ls_furniture:textures/screens/block.png"));
		this.blit(ms, this.leftPos + 32, this.topPos + 18, 0, 0, 14, 14, 14, 14);

		RenderSystem.setShaderTexture(0, new ResourceLocation("ls_furniture:textures/screens/ingot_1.png"));
		this.blit(ms, this.leftPos + 13, this.topPos + 35, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("ls_furniture:textures/screens/dye.png"));
		this.blit(ms, this.leftPos + 31, this.topPos + 35, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("ls_furniture:textures/screens/tool.png"));
		this.blit(ms, this.leftPos + 22, this.topPos + 53, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("ls_furniture:textures/screens/tab_select.png"));
		this.blit(ms, this.leftPos + 164, this.topPos + -31, 0, 0, 32, 34, 32, 34);

		RenderSystem.setShaderTexture(0, new ResourceLocation("ls_furniture:textures/screens/computer.png"));
		this.blit(ms, this.leftPos + 168, this.topPos + -25, 0, 0, 24, 24, 24, 24);

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
		this.font.draw(poseStack, Component.translatable("gui.ls_furniture.furniture_decorations.label_furniture"), 4, 6, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.ls_furniture.furniture_decorations.label_recipe"), 230, 6, -12829636);
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
		imagebutton_tab_deselect1 = new ImageButton(this.leftPos + 65, this.topPos + -29, 32, 32, 0, 0, 32, new ResourceLocation("ls_furniture:textures/screens/atlas/imagebutton_tab_deselect1.png"), 32, 64, e -> {
			if (true) {
				LsFurnitureMod.PACKET_HANDLER.sendToServer(new FurnitureDecorationsButtonMessage(0, x, y, z));
				FurnitureDecorationsButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_tab_deselect1", imagebutton_tab_deselect1);
		this.addRenderableWidget(imagebutton_tab_deselect1);
		imagebutton_tab_deselect2 = new ImageButton(this.leftPos + 98, this.topPos + -29, 32, 32, 0, 0, 32, new ResourceLocation("ls_furniture:textures/screens/atlas/imagebutton_tab_deselect2.png"), 32, 64, e -> {
			if (true) {
				LsFurnitureMod.PACKET_HANDLER.sendToServer(new FurnitureDecorationsButtonMessage(1, x, y, z));
				FurnitureDecorationsButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_tab_deselect2", imagebutton_tab_deselect2);
		this.addRenderableWidget(imagebutton_tab_deselect2);
		imagebutton_tab_deselect_left_edge = new ImageButton(this.leftPos + 0, this.topPos + -29, 32, 32, 0, 0, 32, new ResourceLocation("ls_furniture:textures/screens/atlas/imagebutton_tab_deselect_left_edge.png"), 32, 64, e -> {
			if (true) {
				LsFurnitureMod.PACKET_HANDLER.sendToServer(new FurnitureDecorationsButtonMessage(2, x, y, z));
				FurnitureDecorationsButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_tab_deselect_left_edge", imagebutton_tab_deselect_left_edge);
		this.addRenderableWidget(imagebutton_tab_deselect_left_edge);
		imagebutton_oak_wood = new ImageButton(this.leftPos + 4, this.topPos + -25, 24, 24, 0, 0, 24, new ResourceLocation("ls_furniture:textures/screens/atlas/imagebutton_oak_wood.png"), 24, 48, e -> {
			if (true) {
				LsFurnitureMod.PACKET_HANDLER.sendToServer(new FurnitureDecorationsButtonMessage(3, x, y, z));
				FurnitureDecorationsButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:imagebutton_oak_wood", imagebutton_oak_wood);
		this.addRenderableWidget(imagebutton_oak_wood);
		imagebutton_iron_ingot = new ImageButton(this.leftPos + 69, this.topPos + -25, 24, 24, 0, 0, 24, new ResourceLocation("ls_furniture:textures/screens/atlas/imagebutton_iron_ingot.png"), 24, 48, e -> {
			if (true) {
				LsFurnitureMod.PACKET_HANDLER.sendToServer(new FurnitureDecorationsButtonMessage(4, x, y, z));
				FurnitureDecorationsButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:imagebutton_iron_ingot", imagebutton_iron_ingot);
		this.addRenderableWidget(imagebutton_iron_ingot);
		imagebutton_toddys = new ImageButton(this.leftPos + 102, this.topPos + -25, 24, 24, 0, 0, 24, new ResourceLocation("ls_furniture:textures/screens/atlas/imagebutton_toddys.png"), 24, 48, e -> {
			if (true) {
				LsFurnitureMod.PACKET_HANDLER.sendToServer(new FurnitureDecorationsButtonMessage(5, x, y, z));
				FurnitureDecorationsButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		});
		guistate.put("button:imagebutton_toddys", imagebutton_toddys);
		this.addRenderableWidget(imagebutton_toddys);
		imagebutton_question_mark = new ImageButton(this.leftPos + 22, this.topPos + 110, 16, 18, 0, 0, 18, new ResourceLocation("ls_furniture:textures/screens/atlas/imagebutton_question_mark.png"), 16, 36, e -> {
			if (true) {
				LsFurnitureMod.PACKET_HANDLER.sendToServer(new FurnitureDecorationsButtonMessage(6, x, y, z));
				FurnitureDecorationsButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		});
		guistate.put("button:imagebutton_question_mark", imagebutton_question_mark);
		this.addRenderableWidget(imagebutton_question_mark);
		imagebutton_tab_deselect = new ImageButton(this.leftPos + 131, this.topPos + -29, 32, 32, 0, 0, 32, new ResourceLocation("ls_furniture:textures/screens/atlas/imagebutton_tab_deselect.png"), 32, 64, e -> {
			if (true) {
				LsFurnitureMod.PACKET_HANDLER.sendToServer(new FurnitureDecorationsButtonMessage(7, x, y, z));
				FurnitureDecorationsButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		});
		guistate.put("button:imagebutton_tab_deselect", imagebutton_tab_deselect);
		this.addRenderableWidget(imagebutton_tab_deselect);
		imagebutton_path = new ImageButton(this.leftPos + 135, this.topPos + -25, 24, 24, 0, 0, 24, new ResourceLocation("ls_furniture:textures/screens/atlas/imagebutton_path.png"), 24, 48, e -> {
			if (true) {
				LsFurnitureMod.PACKET_HANDLER.sendToServer(new FurnitureDecorationsButtonMessage(8, x, y, z));
				FurnitureDecorationsButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		});
		guistate.put("button:imagebutton_path", imagebutton_path);
		this.addRenderableWidget(imagebutton_path);
		imagebutton_tab_deselect3 = new ImageButton(this.leftPos + 32, this.topPos + -29, 32, 32, 0, 0, 32, new ResourceLocation("ls_furniture:textures/screens/atlas/imagebutton_tab_deselect3.png"), 32, 64, e -> {
			if (true) {
				LsFurnitureMod.PACKET_HANDLER.sendToServer(new FurnitureDecorationsButtonMessage(9, x, y, z));
				FurnitureDecorationsButtonMessage.handleButtonAction(entity, 9, x, y, z);
			}
		});
		guistate.put("button:imagebutton_tab_deselect3", imagebutton_tab_deselect3);
		this.addRenderableWidget(imagebutton_tab_deselect3);
		imagebutton_stone = new ImageButton(this.leftPos + 37, this.topPos + -25, 24, 24, 0, 0, 24, new ResourceLocation("ls_furniture:textures/screens/atlas/imagebutton_stone.png"), 24, 48, e -> {
			if (true) {
				LsFurnitureMod.PACKET_HANDLER.sendToServer(new FurnitureDecorationsButtonMessage(10, x, y, z));
				FurnitureDecorationsButtonMessage.handleButtonAction(entity, 10, x, y, z);
			}
		});
		guistate.put("button:imagebutton_stone", imagebutton_stone);
		this.addRenderableWidget(imagebutton_stone);
		imagebutton_furniture_crafter_button_default = new ImageButton(this.leftPos + 61, this.topPos + 9, 17, 18, 0, 0, 18, new ResourceLocation("ls_furniture:textures/screens/atlas/imagebutton_furniture_crafter_button_default.png"), 17, 36, e -> {
			if (true) {
				LsFurnitureMod.PACKET_HANDLER.sendToServer(new FurnitureDecorationsButtonMessage(11, x, y, z));
				FurnitureDecorationsButtonMessage.handleButtonAction(entity, 11, x, y, z);
			}
		});
		guistate.put("button:imagebutton_furniture_crafter_button_default", imagebutton_furniture_crafter_button_default);
		this.addRenderableWidget(imagebutton_furniture_crafter_button_default);
		imagebutton_furniture_crafter_button_default1 = new ImageButton(this.leftPos + 78, this.topPos + 9, 17, 18, 0, 0, 18, new ResourceLocation("ls_furniture:textures/screens/atlas/imagebutton_furniture_crafter_button_default1.png"), 17, 36,
				e -> {
					if (true) {
						LsFurnitureMod.PACKET_HANDLER.sendToServer(new FurnitureDecorationsButtonMessage(12, x, y, z));
						FurnitureDecorationsButtonMessage.handleButtonAction(entity, 12, x, y, z);
					}
				});
		guistate.put("button:imagebutton_furniture_crafter_button_default1", imagebutton_furniture_crafter_button_default1);
		this.addRenderableWidget(imagebutton_furniture_crafter_button_default1);
	}
}
