
package net.mcreator.waffles.item;

@WafflesModElements.ModElement.Tag
public class BungaloShovelItem extends WafflesModElements.ModElement {

	@ObjectHolder("waffles:bungalo_shovel")
	public static final Item block = null;

	public BungaloShovelItem(WafflesModElements instance) {
		super(instance, 20);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
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
				return 10000;
			}

			public int getEnchantability() {
				return 100;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(BungaloPlanksBlock.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {

		}.setRegistryName("bungalo_shovel"));
	}

}
