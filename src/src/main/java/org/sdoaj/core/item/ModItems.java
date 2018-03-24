package org.sdoaj.core.item;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {
    public static ItemBasic yellow_vulcanite_shard = new ItemBasic("yellow_vulcanite_shard");
    public static ItemBasic purple_vulcanite_shard = new ItemBasic("purple_vulcanite_shard");
    public static ItemBasic ichor = new ItemBasic("ichor");
    public static ItemBasic nether_ingot = new ItemBasic("nether_ingot");
    public static ItemBasic nether_core = new ItemBasic("nether_core");

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        yellow_vulcanite_shard.initModel();
        purple_vulcanite_shard.initModel();
        ichor.initModel();
        nether_ingot.initModel();
        nether_core.initModel();
    }
}
