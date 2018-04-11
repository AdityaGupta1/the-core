package org.sdoaj.core.armor;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.sdoaj.core.items.ItemWithModel;
import org.sdoaj.core.items.ModItems;
import org.sdoaj.core.misc.ModCreativeTabs;

public class ItemArmor extends net.minecraft.item.ItemArmor implements ItemWithModel {
    public ItemArmor(String name, ArmorMaterial material, EntityEquipmentSlot slot) {
        super(material, 0, slot);
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
