
package net.mcreator.waffles.item;

@WafflesModElements.ModElement.Tag
public class NumfitetoolsShovelItem extends WafflesModElements.ModElement {

	@ObjectHolder("waffles:numfitetools_shovel")
	public static final Item block = null;

	public NumfitetoolsShovelItem(WafflesModElements instance) {
		super(instance, 72);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 0;
			}

			public float getEfficiency() {
				return 20f;
			}

			public float getAttackDamage() {
				return 8f;
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
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {

		}.setRegistryName("numfitetools_shovel"));
	}

}
