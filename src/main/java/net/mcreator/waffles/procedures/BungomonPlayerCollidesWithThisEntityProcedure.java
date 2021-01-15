package net.mcreator.waffles.procedures;

@WafflesModElements.ModElement.Tag
public class BungomonPlayerCollidesWithThisEntityProcedure extends WafflesModElements.ModElement {

	public BungomonPlayerCollidesWithThisEntityProcedure(WafflesModElements instance) {
		super(instance, 46);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure BungomonPlayerCollidesWithThisEntity!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(BungalomagikPotion.potion, (int) 60, (int) 1, (false), (false)));

	}

}
