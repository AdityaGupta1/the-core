package org.sdoaj.core.proxy;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;
import org.sdoaj.core.armor.ModArmors;
import org.sdoaj.core.biomes.ModBiomes;
import org.sdoaj.core.blocks.BlockBasic;
import org.sdoaj.core.blocks.BlockWithModel;
import org.sdoaj.core.blocks.ModBlocks;
import org.sdoaj.core.dimensions.ModDimensions;
import org.sdoaj.core.fluids.FluidBasic;
import org.sdoaj.core.fluids.ModFluids;
import org.sdoaj.core.items.ModItems;
import org.sdoaj.core.misc.ModOreGenerator;
import org.sdoaj.core.tools.ModTools;

@Mod.EventBusSubscriber
public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event) {
        ModDimensions.init();
        GameRegistry.registerWorldGenerator(new ModOreGenerator(), 1);

        new ModTools();
        new ModArmors();
        new ModFluids().init();
    }

    public void init(FMLInitializationEvent event) {
        ModBiomes.init();
    }

    public void postInit(FMLPostInitializationEvent event) {

    }

    @SubscribeEvent
    public static void registerBiomes(RegistryEvent.Register<Biome> event) {
        for (Biome biome : ModBiomes.biomes) {
            event.getRegistry().register(biome);
        }
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        IForgeRegistry<Block> registry = event.getRegistry();

        registry.registerAll(ModBlocks.blocks.toArray(new Block[0]));
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();
        registerItemBlocks(registry);
        registry.registerAll(ModItems.items.toArray(new Item[0]));
    }

    private static void registerItemBlocks(IForgeRegistry<Item> registry) {
        for (BlockWithModel blockWithModel : ModBlocks.blocks) {
            Block block = (Block) blockWithModel;
            registry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
        }
    }

    @SubscribeEvent
    public static void renderFluids(ModelRegistryEvent event) {
        ModFluids.renderFluids();
    }
}


