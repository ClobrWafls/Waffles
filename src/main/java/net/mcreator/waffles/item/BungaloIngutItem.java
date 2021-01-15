
package net.mcreator.waffles.item;

@WafflesModElements.ModElement.Tag
public class BungaloIngutItem extends WafflesModElements.ModElement {

	@ObjectHolder("waffles:bungalo_ingut")
	public static final Item block = null;

	public BungaloIngutItem(WafflesModElements instance) {
		super(instance, 18);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(64).rarity(Rarity.EPIC));
			setRegistryName("bungalo_ingut");
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
