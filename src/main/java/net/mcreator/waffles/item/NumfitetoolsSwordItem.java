
package net.mcreator.waffles.item;

@WafflesModElements.ModElement.Tag
public class NumfitetoolsSwordItem extends WafflesModElements.ModElement {

	@ObjectHolder("waffles:numfitetools_sword")
	public static final Item block = null;

	public NumfitetoolsSwordItem(WafflesModElements instance) {
		super(instance, 71);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 0;
			}

			public float getEfficiency() {
				return 20f;
			}

			public float getAttackDamage() {
				return 38f;
			}

			public int getHarvestLevel() {
				return 1000;
			}

			public int getEnchantability() {
				return 700;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(NumfiteItem.block, (int) (1)));
			}
		}, 3, -3f, new Item.Properties().group(ItemGroup.COMBAT)) {

		}.setRegistryName("numfitetools_sword"));
	}

}
