package net.mcreator.waffles.procedures;

@WafflesModElements.ModElement.Tag
public class BungofruitFoodEatenProcedure extends WafflesModElements.ModElement {

	public BungofruitFoodEatenProcedure(WafflesModElements instance) {
		super(instance, 40);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure BungofruitFoodEaten!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(BungalomagikPotion.potion, (int) 60, (int) 1, (false), (false)));

	}

}
