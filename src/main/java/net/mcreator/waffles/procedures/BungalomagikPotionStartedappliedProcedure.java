package net.mcreator.waffles.procedures;

@WafflesModElements.ModElement.Tag
public class BungalomagikPotionStartedappliedProcedure extends WafflesModElements.ModElement {

	public BungalomagikPotionStartedappliedProcedure(WafflesModElements instance) {
		super(instance, 28);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure BungalomagikPotionStartedapplied!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.LEVITATION, (int) 1, (int) 100, (false), (false)));

	}

}
