package net.mcreator.waffles.procedures;

@WafflesModElements.ModElement.Tag
public class NumfitearmorsArmorLeggingsTickEventProcedure extends WafflesModElements.ModElement {

	public NumfitearmorsArmorLeggingsTickEventProcedure(WafflesModElements instance) {
		super(instance, 87);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure NumfitearmorsArmorLeggingsTickEvent!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 60, (int) 3, (false), (false)));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.RESISTANCE, (int) 60, (int) 1, (false), (false)));

	}

}
