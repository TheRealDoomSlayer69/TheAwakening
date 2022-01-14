package io.github.TheRealDoomSlayer.theawakening.core;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;

public class FlammableRotatedPillarBlock extends RotatedPillarBlock{

	public FlammableRotatedPillarBlock(Properties properties) {
		super(properties);
		// TODO Auto-generated constructor stub
	}
 
	
	@Override
 public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
	return true;
		
	}
 
  @Override
  public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
        return 5;
    }
  
  @Override
  public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
        return 5;
    }
}