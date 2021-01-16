
package net.mcreator.waffles.item;

@WafflesModElements.ModElement.Tag
public class NumfheartItem extends WafflesModElements.ModElement {

	@ObjectHolder("waffles:numfheart")
	public static final Item block = null;

	public NumfheartItem(WafflesModElements instance) {
		super(instance, 66);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).rarity(Rarity.EPIC));
			setRegistryName("numfheart");
		}

		@Override
		public boolean hasContainerItem() {
			return true;
		}

		@Override
		public ItemStack getContainerItem(ItemStack itemstack) {
			return new ItemStack(this);
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
