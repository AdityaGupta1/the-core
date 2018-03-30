package org.sdoaj.core.item;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.ArrayList;
import java.util.List;

public class ModItems {
    public static final List<ItemWithModel> items = new ArrayList<>();

    public static final ItemBasic yellow_vulcanite_shard = new ItemBasic("yellow_vulcanite_shard");
    public static final ItemBasic purple_vulcanite_shard = new ItemBasic("purple_vulcanite_shard");
    public static final ItemBasic ichor = new ItemBasic("ichor");
    public static final ItemBasic nether_ingot = new ItemBasic("nether_ingot");
    public static final ItemBasic nether_core = new ItemBasic("nether_core");

    public static final ItemBasic skystone = new ItemBasic("skystone");
    public static final ItemBasic dragonite_crystal = new ItemBasic("dragonite_crystal");
    public static final ItemBasic void_pearl = new ItemBasic("void_pearl");
    public static final ItemBasic ender_core = new ItemBasic("ender_core");

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        for (ItemWithModel item : items) {
            item.initModel();
        }
    }
}
