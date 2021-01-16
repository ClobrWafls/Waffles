
package net.mcreator.waffles.enchantment;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.DamageSource;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.enchantment.Enchantment;

import net.mcreator.waffles.item.BungaloArmorItem;
import net.mcreator.waffles.WafflesModElements;

@WafflesModElements.ModElement.Tag
public class BillyEnchantment extends WafflesModElements.ModElement {
	@ObjectHolder("waffles:billy")
	public static final Enchantment enchantment = null;
	public BillyEnchantment(WafflesModElements instance) {
		super(instance, 59);
	}

	@Override
	public void initElements() {
		elements.enchantments.add(() -> new CustomEnchantment(EquipmentSlotType.MAINHAND).setRegistryName("billy"));
	}
	public static class CustomEnchantment extends Enchantment {
		public CustomEnchantment(EquipmentSlotType... slots) {
			super(Enchantment.Rarity.UNCOMMON, EnchantmentType.ARMOR, slots);
		}

		@Override
		public int getMinLevel() {
			return 15;
		}

		@Override
		public int getMaxLevel() {
			return 40;
		}

		@Override
		public int calcModifierDamage(int level, DamageSource source) {
			return level * 8;
		}

		@Override
		public boolean canApplyAtEnchantingTable(ItemStack stack) {
			if (stack.getItem() == new ItemStack(BungaloArmorItem.helmet, (int) (1)).getItem())
				return true;
			if (stack.getItem() == new ItemStack(BungaloArmorItem.body, (int) (1)).getItem())
				return true;
			if (stack.getItem() == new ItemStack(BungaloArmorItem.legs, (int) (1)).getItem())
				return true;
			if (stack.getItem() == new ItemStack(BungaloArmorItem.boots, (int) (1)).getItem())
				return true;
			return false;
		}

		@Override
		public boolean isTreasureEnchantment() {
			return false;
		}

		@Override
		public boolean isCurse() {
			return false;
		}

		@Override
		public boolean isAllowedOnBooks() {
			return true;
		}
	}
}
