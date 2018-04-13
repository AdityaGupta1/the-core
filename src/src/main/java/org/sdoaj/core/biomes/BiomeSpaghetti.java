package org.sdoaj.core.biomes;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import org.sdoaj.core.Main;
import org.sdoaj.core.blocks.ModBlocks;
import org.sdoaj.core.fluids.ModFluids;

import java.util.Random;

public class BiomeSpaghetti extends Biome {
    private static final ModGenBlockBlob MEATBALL_GENERATOR = new ModGenBlockBlob(ModBlocks.meat_block, 0);
    private static final ModGenBlockBlob SAUCE_GENERATOR = new ModGenBlockBlob(ModFluids.sauce.getBlock(), 0);
    private static final ModGenBlockBlob[] generators = {MEATBALL_GENERATOR, SAUCE_GENERATOR};

    public BiomeSpaghetti(Biome.BiomeProperties properties) {
        super(properties);
        this.topBlock = this.fillerBlock = ModBlocks.spaghetti_block.getDefaultState();
        this.spawnableCreatureList.clear();
        this.spawnableMonsterList.clear();

        setRegistryName("spaghetti");
        ModBiomes.biomes.add(this);
    }

    @Override
    public void decorate(World world, Random rand, BlockPos pos) {
        if (net.minecraftforge.event.terraingen.TerrainGen.decorate(world, rand, pos,
                net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.ROCK)) {
            int i = rand.nextInt(3);

            for (int j = 0; j < i; ++j) {
                int k = rand.nextInt(16) + 8;
                int l = rand.nextInt(16) + 8;
                BlockPos blockPos = world.getHeight(pos.add(k, 0, l));
                // 75% chance of meatball, 25% chance of sauce
                generators[(int) (Main.random.nextDouble() + 0.25)].generate(world, rand, blockPos);
            }
        }

        super.decorate(world, rand, pos);
    }
}