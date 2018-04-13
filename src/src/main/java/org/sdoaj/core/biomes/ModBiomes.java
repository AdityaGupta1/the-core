package org.sdoaj.core.biomes;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeManager;

import java.util.ArrayList;

public class ModBiomes {
    public static ArrayList<Biome> biomes = new ArrayList<>();

    public static final Biome spaghetti = new BiomeSpaghetti((new Biome.BiomeProperties("Spaghetti"))
            .setBaseHeight(0.125F).setHeightVariation(0.05F).setTemperature(1.0F).setRainfall(0.0F).setRainDisabled());

    public static void init() {
        BiomeManager.addBiome(BiomeManager.BiomeType.DESERT, new BiomeManager.BiomeEntry(spaghetti, 0));
    }
}
