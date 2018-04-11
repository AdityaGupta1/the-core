package org.sdoaj.core.tools;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.sdoaj.core.items.ItemWithModel;
import org.sdoaj.core.items.ModItems;
import org.sdoaj.core.misc.ModCreativeTabs;

public class ItemPickaxe extends net.minecraft.item.ItemPickaxe implements ItemWithModel {
    public ItemPickaxe(String name, ToolMaterial material) {
        super(material);
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(ModCreativeTabs.tabCore);
        ModItems.items.add(this);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
