package io.github.TheRealDoomSlayer.theawakening.core.world.features.gen;

import io.github.TheRealDoomSlayer.theawakening.core.init.BlockInit;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.util.Lazy;

public enum OreType {
  PYRIUM_ORE (Lazy.of(BlockInit.PYRIUM_ORE), 5, 20, 35, 4);


    private final Lazy<Block> block;
private final int maxVeinSize;
private final int minHeight;
private final int maxHeight;
private final int veinsPerChunk;

    OreType(Lazy<Block> block, int maxVeinSize, int minHeight, int maxHeight, int veinsPerChunk) {
        this.block = block;
        this.maxVeinSize = maxVeinSize;
        this.minHeight = minHeight;
        this.maxHeight = maxHeight;
        this.veinsPerChunk = veinsPerChunk;
    }

    public Lazy<Block> getBlock() {
        return block;
    }

    public int getMaxVeinSize() {
        return maxVeinSize;
    }

    public int getMinHeight() {
        return minHeight;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public int getVeinsPerChunk() {
        return veinsPerChunk;
    }

  public static OreType get(Block block) {
      for (OreType ore : values()) {
          if (block == ore.block) {
              return ore;
          }
      }
      return null;

  }

}


