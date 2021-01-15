package net.mcreator.waffles.procedures;

@WafflesModElements.ModElement.Tag
public class CookedbungofruitFoodEatenProcedure extends WafflesModElements.ModElement {

	public CookedbungofruitFoodEatenProcedure(WafflesModElements instance) {
		super(instance, 42);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure CookedbungofruitFoodEaten!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		entity.attackEntityFrom(DamageSource.CACTUS, (float) 10);

	}

}
