package net.mcreator.waffles.procedures;

import net.minecraftforge.fml.server.ServerLifecycleHooks;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.server.MinecraftServer;

import net.mcreator.waffles.WafflesModElements;

import java.util.Map;

@WafflesModElements.ModElement.Tag
public class NumflordOnInitialEntitySpawnProcedure extends WafflesModElements.ModElement {
	public NumflordOnInitialEntitySpawnProcedure(WafflesModElements instance) {
		super(instance, 94);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		{
			MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
			if (mcserv != null)
				mcserv.getPlayerList().sendMessage(new StringTextComponent("NumfLord had risen"));
		}
	}
}
