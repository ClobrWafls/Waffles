
package net.mcreator.waffles.block;

import net.minecraft.block.material.Material;

@WafflesModElements.ModElement.Tag
public class NumfstairBlock extends WafflesModElements.ModElement {

	@ObjectHolder("waffles:numfstair")
	public static final Block block = null;

	public NumfstairBlock(WafflesModElements instance) {
		super(instance, 52);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends StairsBlock {

		public CustomBlock() {
			super(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(500f, 10000f)).getDefaultState(),

					Block.Properties.create(Material.ROCK).sound(SoundType.SLIME).hardnessAndResistance(500f, 10000f).lightValue(0).harvestLevel(3)
							.harvestTool(ToolType.PICKAXE));

			setRegistryName("numfstair");
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
