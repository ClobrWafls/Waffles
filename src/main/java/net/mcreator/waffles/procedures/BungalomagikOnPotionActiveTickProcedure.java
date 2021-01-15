package net.mcreator.waffles.procedures;

@WafflesModElements.ModElement.Tag
public class BungalomagikOnPotionActiveTickProcedure extends WafflesModElements.ModElement {

	public BungalomagikOnPotionActiveTickProcedure(WafflesModElements instance) {
		super(instance, 29);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure BungalomagikOnPotionActiveTick!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		entity.attackEntityFrom(DamageSource.MAGIC, (float) 5);

	}

}
