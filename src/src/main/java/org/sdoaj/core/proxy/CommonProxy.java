package org.sdoaj.core.proxy;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;
import org.sdoaj.core.block.ModBlocks;
import org.sdoaj.core.item.ModItems;
import org.sdoaj.core.misc.ModOreGenerator;

import java.util.ArrayList;

@Mod.EventBusSubscriber
public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event) {
        GameRegistry.registerWorldGenerator(new ModOreGenerator(), 1);
    }

    public void init(FMLInitializationEvent event) {

    }

    public void postInit(FMLPostInitializationEvent event) {

    }

    private static ArrayList<Block> blocks = new ArrayList<>();

    private static void registerBlock(Block block, IForgeRegistry<Block> registry) {
        registry.register(block);
        blocks.add(block);
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        IForgeRegistry<Block> registry = event.getRegistry();

        registerBlock(ModBlocks.vulcanite_ore, registry);
        registerBlock(ModBlocks.ichorstone, registry);
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();

        registerItemBlocks(registry);

        registry.register(ModItems.yellow_vulcanite_shard);
        registry.register(ModItems.purple_vulcanite_shard);
        registry.register(ModItems.ichor);
        registry.register(ModItems.nether_ingot);
        registry.register(ModItems.nether_core);
    }

    private static void registerItemBlocks(IForgeRegistry<Item> registry) {
        for (Block block : blocks) {
            registry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
        }
    }
}


