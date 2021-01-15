package net.mcreator.waffles.procedures;

@WafflesModElements.ModElement.Tag
public class SuperbungalojuiceMobplayerCollidesBlockProcedure extends WafflesModElements.ModElement {

	public SuperbungalojuiceMobplayerCollidesBlockProcedure(WafflesModElements instance) {
		super(instance, 47);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure SuperbungalojuiceMobplayerCollidesBlock!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		for (int index0 = 0; index0 < (int) (4); index0++) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 1);
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 2);
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}

	}

}
