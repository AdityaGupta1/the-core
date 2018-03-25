package org.sdoaj.core.tools;

import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModTools {
    public static final Item.ToolMaterial NETHER_TOOL_MATERIAL = EnumHelper.addToolMaterial("NETHER_TOOL_MATERIAL",
            4, 2666, 14f, 5.0f, 30);
    public static final ItemSword nether_sword = new ItemSword("nether_sword", NETHER_TOOL_MATERIAL);
    public static final ItemAxe nether_axe = new ItemAxe("nether_axe", NETHER_TOOL_MATERIAL, 11.0f, -2.8f);
    public static final ItemPickaxe nether_pickaxe = new ItemPickaxe("nether_pickaxe", NETHER_TOOL_MATERIAL);
    public static final ItemShovel nether_shovel = new ItemShovel("nether_shovel", NETHER_TOOL_MATERIAL);

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        nether_sword.initModel();
        nether_axe.initModel();
        nether_pickaxe.initModel();
        nether_shovel.initModel();
    }
}
