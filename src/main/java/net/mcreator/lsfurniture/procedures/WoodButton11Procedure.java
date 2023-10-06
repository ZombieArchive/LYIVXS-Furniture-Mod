package net.mcreator.lsfurniture.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.lsfurniture.init.LsFurnitureModItems;
import net.mcreator.lsfurniture.init.LsFurnitureModBlocks;

import java.util.function.Supplier;
import java.util.Map;

public class WoodButton11Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			ItemStack _setstack = new ItemStack(LsFurnitureModBlocks.ANY_PLANKS.get());
			_setstack.setCount(1);
			((Slot) _slots.get(5)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			ItemStack _setstack = new ItemStack(Blocks.AIR);
			_setstack.setCount(1);
			((Slot) _slots.get(6)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			ItemStack _setstack = new ItemStack(Blocks.AIR);
			_setstack.setCount(1);
			((Slot) _slots.get(7)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			ItemStack _setstack = new ItemStack(Blocks.AIR);
			_setstack.setCount(1);
			((Slot) _slots.get(8)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			ItemStack _setstack = new ItemStack(LsFurnitureModItems.SAW.get());
			_setstack.setCount(1);
			((Slot) _slots.get(9)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			ItemStack _setstack = new ItemStack(LsFurnitureModBlocks.OAK_SHELVE.get());
			_setstack.setCount(1);
			((Slot) _slots.get(47)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
		OakShelveRecipeProcedure.execute(world, x, y, z, entity);
		DarkOakShelveRecipeProcedure.execute(world, x, y, z, entity);
		SpruceShelveRecipeProcedure.execute(world, x, y, z, entity);
		AcaciaShelveRecipeProcedure.execute(world, x, y, z, entity);
		BirchShelveRecipeProcedure.execute(world, x, y, z, entity);
		JungleShelveRecipeProcedure.execute(world, x, y, z, entity);
		MangroveShelveRecipeProcedure.execute(world, x, y, z, entity);
		CrimsonShelveRecipeProcedure.execute(world, x, y, z, entity);
		WarpedShelveRecipeProcedure.execute(world, x, y, z, entity);
	}
}
