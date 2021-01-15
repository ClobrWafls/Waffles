package net.mcreator.waffles.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.waffles.WafflesModElements;

import java.util.Map;

@WafflesModElements.ModElement.Tag
public class BungalomagikOnPotionActiveTickProcedure extends WafflesModElements.ModElement {
	public BungalomagikOnPotionActiveTickProcedure(WafflesModElements instance) {
		super(instance, 29);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure BungalomagikOnPotionActiveTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.MAGIC, (float) 5);
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.INSTANT_HEALTH, (int) 60, (int) 2, (false), (false)));
	}
}
