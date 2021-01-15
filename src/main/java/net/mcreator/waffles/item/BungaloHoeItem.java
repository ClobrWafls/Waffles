
package net.mcreator.waffles.item;

@WafflesModElements.ModElement.Tag
public class BungaloHoeItem extends WafflesModElements.ModElement {

	@ObjectHolder("waffles:bungalo_hoe")
	public static final Item block = null;

	public BungaloHoeItem(WafflesModElements instance) {
		super(instance, 21);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 0;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 0f;
			}

			public int getHarvestLevel() {
				return 100000;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(BungaloPlanksBlock.block, (int) (1)));
			}
		}, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {

		}.setRegistryName("bungalo_hoe"));
	}

}
