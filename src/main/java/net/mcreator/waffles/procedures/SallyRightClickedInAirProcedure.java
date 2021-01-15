package net.mcreator.waffles.procedures;

@WafflesModElements.ModElement.Tag
public class SallyRightClickedInAirProcedure extends WafflesModElements.ModElement {

	public SallyRightClickedInAirProcedure(WafflesModElements instance) {
		super(instance, 48);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure SallyRightClickedInAir!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				System.err.println("Failed to load dependency world for procedure SallyRightClickedInAir!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");
		IWorld world = (IWorld) dependencies.get("world");

		if (world instanceof World && !world.getWorld().isRemote && entity instanceof LivingEntity) {
			ArrowEntity entityToSpawn = new ArrowEntity(world.getWorld(), (LivingEntity) entity);
			entityToSpawn.shoot(entity.getLookVec().x, entity.getLookVec().y, entity.getLookVec().z, (float) 2, 0);
			entityToSpawn.setDamage((float) 6);
			entityToSpawn.setKnockbackStrength((int) 7);
			world.addEntity(entityToSpawn);

		}

	}

}
