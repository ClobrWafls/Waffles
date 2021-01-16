
package net.mcreator.waffles.block;

import net.minecraft.block.material.Material;

@WafflesModElements.ModElement.Tag
public class NumfslabBlock extends WafflesModElements.ModElement {

	@ObjectHolder("waffles:numfslab")
	public static final Block block = null;

	public NumfslabBlock(WafflesModElements instance) {
		super(instance, 53);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends SlabBlock {

		public CustomBlock() {
			super(

					Block.Properties.create(Material.ROCK).sound(SoundType.SLIME).hardnessAndResistance(500f, 10000f).lightValue(0));

			setRegistryName("numfslab");
		}

		@Override
		public PushReaction getPushReaction(BlockState state) {
			return PushReaction.BLOCK;
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {

			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(NumfpiceItem.block, (int) (1)));
		}

	}

}
