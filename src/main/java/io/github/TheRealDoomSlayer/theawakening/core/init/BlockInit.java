package io.github.TheRealDoomSlayer.theawakening.core.init;

import io.github.TheRealDoomSlayer.theawakening.TheAwakening;
import io.github.TheRealDoomSlayer.theawakening.core.FlammableRotatedPillarBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
	
	private BlockInit() {
	    // TODO Auto-generated constructor stub
    }
	
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, TheAwakening.MODID);


    public static final RegistryObject<Block> PYRIUM_BLOCK = BLOCKS.register("pyrium_block", () -> 
        new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL, MaterialColor.CRIMSON_NYLIUM).requiresCorrectToolForDrops().strength(55.0F, 1200.0F)));

    public static final RegistryObject<Block> PYRIUM_ORE = BLOCKS.register("pyrium_ore", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.ANCIENT_DEBRIS).requiresCorrectToolForDrops().strength(25.0F, 1200.0F)));




    public static final RegistryObject<Block> EXODENDRON_LOG = BLOCKS.register("exodendron_log", () ->
    new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).requiresCorrectToolForDrops().strength(2.0f, 2.0f)));

    public static final RegistryObject<Block> STRIPPED_EXODENDRON_LOG = BLOCKS.register("stripped_exodendron_log", () ->
    new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).requiresCorrectToolForDrops().strength(2.0f, 2.0f)));

    public static final RegistryObject<Block> EXODENDRON_WOOD = BLOCKS.register("exodendron_wood", () ->
    new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).requiresCorrectToolForDrops().strength(2.0f, 2.0f)));

    public static final RegistryObject<Block> EXODENDRON_PLANKS = BLOCKS.register("exodendron_planks", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).requiresCorrectToolForDrops().strength(2.0f, 2.0f)) {
    @Override
    public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
        return true;

    }

    @Override
    public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
        return 20;
    }

    @Override
    public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
        return 5;
        }
    });

  }