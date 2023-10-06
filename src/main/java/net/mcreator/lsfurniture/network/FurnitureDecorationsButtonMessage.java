
package net.mcreator.lsfurniture.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.lsfurniture.world.inventory.FurnitureDecorationsMenu;
import net.mcreator.lsfurniture.procedures.OpenWoodMenuProcedure;
import net.mcreator.lsfurniture.procedures.OpenTeddysMenuProcedure;
import net.mcreator.lsfurniture.procedures.OpenStoneMenuProcedure;
import net.mcreator.lsfurniture.procedures.OpenPathsMenuProcedure;
import net.mcreator.lsfurniture.procedures.OpenMetalMenuProcedure;
import net.mcreator.lsfurniture.procedures.OpenExplainerMenuProcedure;
import net.mcreator.lsfurniture.procedures.FurnitureStoneGUIIsOpenedProcedure;
import net.mcreator.lsfurniture.procedures.DecorationsButton1Procedure;
import net.mcreator.lsfurniture.procedures.DecorationsButton0Procedure;
import net.mcreator.lsfurniture.LsFurnitureMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class FurnitureDecorationsButtonMessage {
	private final int buttonID, x, y, z;

	public FurnitureDecorationsButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public FurnitureDecorationsButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(FurnitureDecorationsButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(FurnitureDecorationsButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level;
		HashMap guistate = FurnitureDecorationsMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			OpenMetalMenuProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			OpenTeddysMenuProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			OpenWoodMenuProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			OpenWoodMenuProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			OpenMetalMenuProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 5) {

			OpenTeddysMenuProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 6) {

			OpenExplainerMenuProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 7) {

			OpenPathsMenuProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 8) {

			OpenPathsMenuProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 9) {

			OpenStoneMenuProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 10) {

			FurnitureStoneGUIIsOpenedProcedure.execute(entity);
		}
		if (buttonID == 11) {

			DecorationsButton0Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 12) {

			DecorationsButton1Procedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		LsFurnitureMod.addNetworkMessage(FurnitureDecorationsButtonMessage.class, FurnitureDecorationsButtonMessage::buffer, FurnitureDecorationsButtonMessage::new, FurnitureDecorationsButtonMessage::handler);
	}
}
