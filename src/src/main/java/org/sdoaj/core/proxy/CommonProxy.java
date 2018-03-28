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
import org.sdoaj.core.armor.ModArmors;
import org.sdoaj.core.block.BlockBasic;
import org.sdoaj.core.block.ModBlocks;
import org.sdoaj.core.item.ModItems;
import org.sdoaj.core.misc.ModOreGenerator;
import org.sdoaj.core.tools.ModTools;

@Mod.EventBusSubscriber
public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event) {
        GameRegistry.registerWorldGenerator(new ModOreGenerator(), 1);

        new ModTools();
        new ModArmors();
    }

    public void init(FMLInitializationEvent event) {

    }

    public void postInit(FMLPostInitializationEvent event) {

    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(ModBlocks.blocks.toArray(new BlockBasic[0]));
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();
        registerItemBlocks(registry);
        registry.registerAll(ModItems.items.toArray(new Item[0]));
    }

    private static void registerItemBlocks(IForgeRegistry<Item> registry) {
        for (Block block : ModBlocks.blocks) {
            registry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
        }
    }
}


