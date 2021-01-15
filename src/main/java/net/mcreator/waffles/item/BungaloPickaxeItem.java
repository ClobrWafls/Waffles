
package net.mcreator.waffles.item;

@WafflesModElements.ModElement.Tag
public class BungaloPickaxeItem extends WafflesModElements.ModElement {

	@ObjectHolder("waffles:bungalo_pickaxe")
	public static final Item block = null;

	public BungaloPickaxeItem(WafflesModElements instance) {
		super(instance, 17);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
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
				return 120;
			}

			public int getEnchantability() {
				return 100;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(BungaloPlanksBlock.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {

		}.setRegistryName("bungalo_pickaxe"));
	}

}
