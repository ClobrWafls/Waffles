
package net.mcreator.waffles.block;

import net.minecraft.block.material.Material;

@WafflesModElements.ModElement.Tag
public class SuperbungalojuiceBlock extends WafflesModElements.ModElement {

	@ObjectHolder("waffles:superbungalojuice")
	public static final FlowingFluidBlock block = null;

	@ObjectHolder("waffles:superbungalojuice_bucket")
	public static final Item bucket = null;

	public static FlowingFluid flowing = null;
	public static FlowingFluid still = null;

	private ForgeFlowingFluid.Properties fluidproperties = null;

	public SuperbungalojuiceBlock(WafflesModElements instance) {
		super(instance, 47);

		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@SubscribeEvent
	public void registerFluids(RegistryEvent.Register<Fluid> event) {
		event.getRegistry().register(still);
		event.getRegistry().register(flowing);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void clientLoad(FMLClientSetupEvent event) {
		RenderTypeLookup.setRenderLayer(still, RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(flowing, RenderType.getTranslucent());
	}

	@Override
	public void initElements() {
		fluidproperties = new ForgeFlowingFluid.Properties(() -> still, () -> flowing,
				FluidAttributes.builder(new ResourceLocation("waffles:blocks/adk"), new ResourceLocation("waffles:blocks/adk")).luminosity(0)
						.density(1000).viscosity(1000)).bucket(() -> bucket).block(() -> block);

		still = (FlowingFluid) new ForgeFlowingFluid.Source(fluidproperties).setRegistryName("superbungalojuice");
		flowing = (FlowingFluid) new ForgeFlowingFluid.Flowing(fluidproperties).setRegistryName("superbungalojuice_flowing");

		elements.blocks.add(() -> new FlowingFluidBlock(still, Block.Properties.create(Material.WATER)) {

			@Override
			public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
				super.onEntityCollision(state, world, pos, entity);
				int x = pos.getX();
				int y = pos.getY();
				int z = pos.getZ();
				{
					Map<String, Object> $_dependencies = new HashMap<>();

					$_dependencies.put("entity", entity);

					SuperbungalojuiceMobplayerCollidesBlockProcedure.executeProcedure($_dependencies);
				}
			}
		}.setRegistryName("superbungalojuice"));

		elements.items.add(() -> new BucketItem(still, new Item.Properties().containerItem(Items.BUCKET).maxStackSize(1).group(ItemGroup.MISC))
				.setRegistryName("superbungalojuice_bucket"));
	}

}
