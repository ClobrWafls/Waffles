package net.mcreator.waffles.procedures;

@WafflesModElements.ModElement.Tag
public class NumflordPlayerCollidesWithThisEntityProcedure extends WafflesModElements.ModElement {

	public NumflordPlayerCollidesWithThisEntityProcedure(WafflesModElements instance) {
		super(instance, 93);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure NumflordPlayerCollidesWithThisEntity!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NAUSEA, (int) 60, (int) 1, (false), (false)));

	}

}
