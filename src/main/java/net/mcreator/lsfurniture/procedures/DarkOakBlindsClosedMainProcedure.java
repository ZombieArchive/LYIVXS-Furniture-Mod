package net.mcreator.lsfurniture.procedures;

import net.minecraft.world.level.LevelAccessor;

public class DarkOakBlindsClosedMainProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		DarkOakBlindsClosedEndProProcedure.execute(world, x, y, z);
		DarkOakBlindsClosedNoneProProcedure.execute(world, x, y, z);
	}
}
