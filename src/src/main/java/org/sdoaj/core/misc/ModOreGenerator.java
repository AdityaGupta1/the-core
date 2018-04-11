package org.sdoaj.core.misc;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;
import org.sdoaj.core.blocks.ModBlocks;

import java.util.Random;

public class ModOreGenerator implements IWorldGenerator {
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        switch (world.provider.getDimension()) {
            // overworld
            case 0:
                break;
            // nether
            case -1:
                generateNether(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
                break;
            // end
            case 1:
                generateEnd(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
                break;
        }
    }

    private void generateNether(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        generateOre(new NetherGenMineable(ModBlocks.vulcanite_ore.getDefaultState(),
                3 + random.nextInt(4)), world, random, chunkX * 16, chunkZ * 16, 0, 256, 32);
        generateOre(new NetherGenMineable(ModBlocks.ichorstone.getDefaultState(),
                2 + random.nextInt(3)), world, random, chunkX * 16, chunkZ * 16, 0, 256, 20);
    }

    private void generateEnd(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        generateOre(new EndGenMineable(ModBlocks.skystone_ore.getDefaultState(),
                4 + random.nextInt(5)), world, random, chunkX * 16, chunkZ * 16, 0, 256, 16);
        generateOre(new EndGenMineable(ModBlocks.dragonite.getDefaultState(),
                4 + random.nextInt(2)), world, random, chunkX * 16, chunkZ * 16, 0, 256, 24);
        generateOre(new EndGenMineable(ModBlocks.void_pearl_ore.getDefaultState(),
                1 + random.nextInt(3)), world, random, chunkX * 16, chunkZ * 16, 0, 256, 8);
    }

    private void generateOre(WorldGenMinable generator, World world, Random random, int x, int z, int minY, int maxY, int chances) {
        int deltaY = maxY - minY;

        for (int i = 0; i < chances; i++) {
            BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));
            generator.generate(world, random, pos);
        }
    }
}
