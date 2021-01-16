
package net.mcreator.waffles.item;

@WafflesModElements.ModElement.Tag
public class MoondustItem extends WafflesModElements.ModElement {

	@ObjectHolder("waffles:moondust")
	public static final Item block = null;

	public MoondustItem(WafflesModElements instance) {
		super(instance, 99);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(8).rarity(Rarity.RARE));
			setRegistryName("moondust");
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
