package net.mcreator.waffles.procedures;

@WafflesModElements.ModElement.Tag
public class BungalomagikPotionExpiresProcedure extends WafflesModElements.ModElement {

	public BungalomagikPotionExpiresProcedure(WafflesModElements instance) {
		super(instance, 30);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure BungalomagikPotionExpires!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.GLOWING, (int) 60, (int) 1, (false), (false)));

	}

}
