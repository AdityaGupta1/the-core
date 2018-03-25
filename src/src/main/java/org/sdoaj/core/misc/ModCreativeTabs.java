package org.sdoaj.core.misc;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import org.sdoaj.core.item.ModItems;

public class ModCreativeTabs {
    public static final CreativeTabs tabCore = (new CreativeTabs("tabCore") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ModItems.nether_core);
        }
    });
}
