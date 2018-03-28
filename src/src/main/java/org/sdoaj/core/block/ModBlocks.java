package org.sdoaj.core.block;

import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.sdoaj.core.item.ItemWithModel;
import org.sdoaj.core.item.ModItems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ModBlocks {
    public static final List<BlockBasic> blocks = new ArrayList<>();

    public static final BlockOre vulcanite_ore = new BlockOre("vulcanite_ore", Material.ROCK,
            4, 30, "pickaxe", 3, new HashMap<Item, int[]>() {{
                put(ModItems.yellow_vulcanite_shard, new int[]{0, 3});
                put(ModItems.purple_vulcanite_shard, new int[]{0, 3});
            }});
    public static final BlockOre ichorstone = new BlockOre("ichorstone", Material.ROCK,
            4, 20, "pickaxe", 3, new HashMap<Item, int[]>() {{
                put(ModItems.ichor, new int[]{2, 4});
            }});

    public static final BlockOre skystone_ore = new BlockOre("skystone_ore", Material.ROCK,
            6, 50, "pickaxe", 4, new HashMap<Item, int[]>() {{
        put(ModItems.skystone, new int[]{2, 8});
    }});
    public static final BlockOre dragonite = new BlockOre("dragonite", Material.ROCK,
            6, 50, "pickaxe", 4, new HashMap<Item, int[]>() {{
        put(ModItems.dragonite_crystal, new int[]{3, 7});
    }});
    public static final BlockOre void_pearl_ore = new BlockOre("void_pearl_ore", Material.ROCK,
            6, 50, "pickaxe", 4, new HashMap<Item, int[]>() {{
        put(ModItems.void_pearl, new int[]{4, 6});
    }});

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        for (BlockBasic block : blocks) {
            block.initModel();
        }
    }
}
