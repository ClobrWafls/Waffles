package net.mcreator.waffles.procedures;

@WafflesModElements.ModElement.Tag
public class NurmfStoneEntityWalksOnTheBlockProcedure extends WafflesModElements.ModElement {

	public NurmfStoneEntityWalksOnTheBlockProcedure(WafflesModElements instance) {
		super(instance, 54);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure NurmfStoneEntityWalksOnTheBlock!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).attackEntityFrom(new DamageSource("Nurmf!").setDamageBypassesArmor(), (float) 1);
		}

	}

}
