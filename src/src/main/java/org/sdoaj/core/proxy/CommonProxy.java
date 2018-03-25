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
import static org.sdoaj.core.item.ModItems.*;
import static org.sdoaj.core.block.ModBlocks.*;
import static org.sdoaj.core.tools.ModTools.*;
import static org.sdoaj.core.armor.ModArmors.*;
import org.sdoaj.core.misc.ModOreGenerator;

import java.util.ArrayList;
import java.util.Arrays;

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

    private static void registerBlock(IForgeRegistry<Block> registry, Block... blocks) {
        for (Block block : blocks) {
            registry.register(block);
        }

        CommonProxy.blocks.addAll(Arrays.asList(blocks));
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        IForgeRegistry<Block> registry = event.getRegistry();

        registerBlock(registry,
                vulcanite_ore,
                ichorstone
        );
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();

        registerItemBlocks(registry);

        registry.registerAll(
                yellow_vulcanite_shard,
                purple_vulcanite_shard,
                ichor,
                nether_ingot,
                nether_core,

                nether_sword,
                nether_axe,
                nether_pickaxe,
                nether_shovel,

                nether_helmet,
                nether_chestplate,
                nether_leggings,
                nether_boots
        );
    }

    private static void registerItemBlocks(IForgeRegistry<Item> registry) {
        for (Block block : blocks) {
            registry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
        }
    }
}


