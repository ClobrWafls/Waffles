
package net.mcreator.waffles.item;

@WafflesModElements.ModElement.Tag
public class NumfcoreItem extends WafflesModElements.ModElement {

	@ObjectHolder("waffles:numfcore")
	public static final Item block = null;

	public NumfcoreItem(WafflesModElements instance) {
		super(instance, 68);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).rarity(Rarity.EPIC));
			setRegistryName("numfcore");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

	}

}
