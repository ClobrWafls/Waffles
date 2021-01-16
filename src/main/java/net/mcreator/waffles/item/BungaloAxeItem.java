
package net.mcreator.waffles.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.waffles.block.BungaloPlanksBlock;
import net.mcreator.waffles.WafflesModElements;

@WafflesModElements.ModElement.Tag
public class BungaloAxeItem extends WafflesModElements.ModElement {
	@ObjectHolder("waffles:bungalo_axe")
	public static final Item block = null;
	public BungaloAxeItem(WafflesModElements instance) {
		super(instance, 18);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 0;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 13f;
			}

			public int getHarvestLevel() {
				return 100000;
			}

			public int getEnchantability() {
				return 100;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(BungaloPlanksBlock.block, (int) (1)));
			}
		}, 1, 0f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("bungalo_axe"));
	}
}
