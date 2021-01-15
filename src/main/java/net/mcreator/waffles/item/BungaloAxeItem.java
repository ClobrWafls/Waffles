
package net.mcreator.waffles.item;

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
				return 250;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 0f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(BungaloPlanksBlock.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {

		}.setRegistryName("bungalo_axe"));
	}

}
