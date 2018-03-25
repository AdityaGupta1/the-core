package org.sdoaj.core.armor;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.sdoaj.core.Main;

public class ModArmors {
    public static final ItemArmor.ArmorMaterial NETHER_ARMOR_MATERIAL =
            EnumHelper.addArmorMaterial("NETHER", Main.MODID + ":nether", 40,
            new int[]{4, 10, 7, 4}, 30, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 3F);
    public static final ItemArmor nether_helmet = new ItemArmor("nether_helmet", NETHER_ARMOR_MATERIAL, EntityEquipmentSlot.HEAD);
    public static final ItemArmor nether_chestplate = new ItemArmor("nether_chestplate", NETHER_ARMOR_MATERIAL, EntityEquipmentSlot.CHEST);
    public static final ItemArmor nether_leggings = new ItemArmor("nether_leggings", NETHER_ARMOR_MATERIAL, EntityEquipmentSlot.LEGS);
    public static final ItemArmor nether_boots = new ItemArmor("nether_boots", NETHER_ARMOR_MATERIAL, EntityEquipmentSlot.FEET);

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        nether_helmet.initModel();
        nether_chestplate.initModel();
        nether_leggings.initModel();
        nether_boots.initModel();
    }
}
