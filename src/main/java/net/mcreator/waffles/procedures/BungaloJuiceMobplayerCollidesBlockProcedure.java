package net.mcreator.waffles.procedures;

@WafflesModElements.ModElement.Tag
public class BungaloJuiceMobplayerCollidesBlockProcedure extends WafflesModElements.ModElement {

	public BungaloJuiceMobplayerCollidesBlockProcedure(WafflesModElements instance) {
		super(instance, 27);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure BungaloJuiceMobplayerCollidesBlock!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NAUSEA, (int) 60, (int) 10, (false), (false)));

	}

}
