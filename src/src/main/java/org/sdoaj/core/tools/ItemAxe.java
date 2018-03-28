package org.sdoaj.core.tools;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.sdoaj.core.item.ItemWithModel;
import org.sdoaj.core.item.ModItems;
import org.sdoaj.core.misc.ModCreativeTabs;

public class ItemAxe extends net.minecraft.item.ItemAxe implements ItemWithModel {
    public ItemAxe(String name, ToolMaterial material, float damage, float speed) {
        super(material, damage, speed);
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
