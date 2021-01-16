
package net.mcreator.waffles.block;

import net.minecraft.block.material.Material;

@WafflesModElements.ModElement.Tag
public class NumfstoneBlock extends WafflesModElements.ModElement {

	@ObjectHolder("waffles:numfstone")
	public static final Block block = null;

	public NumfstoneBlock(WafflesModElements instance) {
		super(instance, 51);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {

		public CustomBlock() {
			super(

					Block.Properties.create(Material.ROCK).sound(SoundType.SLIME).hardnessAndResistance(500f, 10000f).lightValue(0).harvestLevel(1)
							.harvestTool(ToolType.PICKAXE));

			setRegistryName("numfstone");
		}

		@Override
		public boolean isBeaconBase(BlockState state, IWorldReader world, BlockPos pos, BlockPos beacon) {
			return true;
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
