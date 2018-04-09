package org.sdoaj.core.armor;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import org.sdoaj.core.Main;
import org.sdoaj.core.item.ModItems;

public class ModArmors {
    public static final ItemArmor.ArmorMaterial NETHER_ARMOR_MATERIAL =
            EnumHelper.addArmorMaterial("NETHER", Main.MODID + ":nether", 40,
                    new int[]{4, 10, 7, 4}, 30, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 3F)
                    .setRepairItem(new ItemStack(ModItems.nether_core));
    public static final ItemArmor nether_helmet = new ItemArmor("nether_helmet", NETHER_ARMOR_MATERIAL, EntityEquipmentSlot.HEAD);
    public static final ItemArmor nether_chestplate = new ItemArmor("nether_chestplate", NETHER_ARMOR_MATERIAL, EntityEquipmentSlot.CHEST);
    public static final ItemArmor nether_leggings = new ItemArmor("nether_leggings", NETHER_ARMOR_MATERIAL, EntityEquipmentSlot.LEGS);
    public static final ItemArmor nether_boots = new ItemArmor("nether_boots", NETHER_ARMOR_MATERIAL, EntityEquipmentSlot.FEET);
}
