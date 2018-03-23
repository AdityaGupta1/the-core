package org.sdoaj.core.block;

import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.sdoaj.core.item.ModItems;

import java.util.HashMap;

public class ModBlocks {
    public static BlockBasic vulcanite_ore = new BlockOre("vulcanite_ore", Material.ROCK,
            4, 30, "pickaxe", 3, new HashMap<Item, int[]>() {{
                put(ModItems.yellow_vulcanite_shard, new int[]{0, 3});
                put(ModItems.purple_vulcanite_shard, new int[]{0, 3});
            }});
    public static BlockBasic ichorstone = new BlockOre("ichorstone", Material.ROCK,
            4, 20, "pickaxe", 3, new HashMap<Item, int[]>() {{
                put(ModItems.ichor, new int[]{2, 4});
    }});


    @SideOnly(Side.CLIENT)
    public static void initModels() {
        vulcanite_ore.initModel();
        ichorstone.initModel();
    }
}
