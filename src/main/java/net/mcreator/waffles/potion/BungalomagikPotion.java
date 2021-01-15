
package net.mcreator.waffles.potion;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.potion.Potion;
import net.minecraft.potion.EffectType;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effect;
import net.minecraft.entity.ai.attributes.AbstractAttributeMap;
import net.minecraft.entity.LivingEntity;

import net.mcreator.waffles.procedures.BungalomagikPotionStartedappliedProcedure;
import net.mcreator.waffles.procedures.BungalomagikPotionExpiresProcedure;
import net.mcreator.waffles.procedures.BungalomagikOnPotionActiveTickProcedure;
import net.mcreator.waffles.WafflesModElements;

import java.util.Map;
import java.util.HashMap;

@WafflesModElements.ModElement.Tag
public class BungalomagikPotion extends WafflesModElements.ModElement {
	@ObjectHolder("waffles:bungalomagik")
	public static final Effect potion = null;
	@ObjectHolder("waffles:bungalomagik")
	public static final Potion potionType = null;
	public BungalomagikPotion(WafflesModElements instance) {
		super(instance, 28);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@SubscribeEvent
	public void registerEffect(RegistryEvent.Register<Effect> event) {
		event.getRegistry().register(new EffectCustom());
	}

	@SubscribeEvent
	public void registerPotion(RegistryEvent.Register<Potion> event) {
		event.getRegistry().register(new PotionCustom());
	}
	public static class PotionCustom extends Potion {
		public PotionCustom() {
			super(new EffectInstance(potion, 3600));
			setRegistryName("bungalomagik");
		}
	}

	public static class EffectCustom extends Effect {
		private final ResourceLocation potionIcon;
		public EffectCustom() {
			super(EffectType.HARMFUL, -10092391);
			setRegistryName("bungalomagik");
			potionIcon = new ResourceLocation("waffles:textures/untitled.png");
		}

		@Override
		public String getName() {
			return "effect.bungalomagik";
		}

		@Override
		public boolean isBeneficial() {
			return true;
		}

		@Override
		public boolean isInstant() {
			return false;
		}

		@Override
		public boolean shouldRenderInvText(EffectInstance effect) {
			return true;
		}

		@Override
		public boolean shouldRender(EffectInstance effect) {
			return true;
		}

		@Override
		public boolean shouldRenderHUD(EffectInstance effect) {
			return true;
		}

		@Override
		public void applyAttributesModifiersToEntity(LivingEntity entity, AbstractAttributeMap attributeMapIn, int amplifier) {
			World world = entity.world;
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				BungalomagikPotionStartedappliedProcedure.executeProcedure($_dependencies);
			}
		}

		@Override
		public void performEffect(LivingEntity entity, int amplifier) {
			World world = entity.world;
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				BungalomagikOnPotionActiveTickProcedure.executeProcedure($_dependencies);
			}
		}

		@Override
		public void removeAttributesModifiersFromEntity(LivingEntity entity, AbstractAttributeMap attributeMapIn, int amplifier) {
			super.removeAttributesModifiersFromEntity(entity, attributeMapIn, amplifier);
			World world = entity.world;
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				BungalomagikPotionExpiresProcedure.executeProcedure($_dependencies);
			}
		}

		@Override
		public boolean isReady(int duration, int amplifier) {
			return true;
		}
	}
}
