package org.sdoaj.core.tools;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import org.sdoaj.core.items.ModItems;

public class ModTools {
    public static final Item.ToolMaterial NETHER_TOOL_MATERIAL = EnumHelper.addToolMaterial(
            "NETHER_TOOL_MATERIAL",4, 2666, 14f, 5.0f, 30)
            .setRepairItem(new ItemStack(ModItems.nether_core));
    public static final ItemSword nether_sword = new ItemSword("nether_sword", NETHER_TOOL_MATERIAL);
    public static final ItemAxe nether_axe = new ItemAxe("nether_axe", NETHER_TOOL_MATERIAL, 11.0f, -2.8f);
    public static final ItemPickaxe nether_pickaxe = new ItemPickaxe("nether_pickaxe", NETHER_TOOL_MATERIAL);
    public static final ItemShovel nether_shovel = new ItemShovel("nether_shovel", NETHER_TOOL_MATERIAL);

    public static final Item.ToolMaterial ENDER_TOOL_MATERIAL = EnumHelper.addToolMaterial(
            "ENDER_TOOL_MATERIAL",5, 4096, 15f, 6.0f, 30)
            .setRepairItem(new ItemStack(ModItems.ender_core));
    public static final ItemSword ender_sword = new ItemSword("ender_sword", ENDER_TOOL_MATERIAL);
    public static final ItemAxe ender_axe = new ItemAxe("ender_axe", ENDER_TOOL_MATERIAL, 12.0f, -2.6f);
    public static final ItemPickaxe ender_pickaxe = new ItemPickaxe("ender_pickaxe", ENDER_TOOL_MATERIAL);
    public static final ItemShovel ender_shovel = new ItemShovel("ender_shovel", ENDER_TOOL_MATERIAL);
}
