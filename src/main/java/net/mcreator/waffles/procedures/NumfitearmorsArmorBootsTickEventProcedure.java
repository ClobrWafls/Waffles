package net.mcreator.waffles.procedures;

@WafflesModElements.ModElement.Tag
public class NumfitearmorsArmorBootsTickEventProcedure extends WafflesModElements.ModElement {

	public NumfitearmorsArmorBootsTickEventProcedure(WafflesModElements instance) {
		super(instance, 88);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure NumfitearmorsArmorBootsTickEvent!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.JUMP_BOOST, (int) 60, (int) 3, (false), (false)));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.LUCK, (int) 60, (int) 1, (false), (false)));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.HERO_OF_THE_VILLAGE, (int) 60, (int) 1, (false), (false)));

	}

}
