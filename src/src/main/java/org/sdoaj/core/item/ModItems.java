package org.sdoaj.core.item;

import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.HashMap;

public class ModItems {
    public static ItemBasic yellow_vulcanite_shard = new ItemBasic("yellow_vulcanite_shard");
    public static ItemBasic purple_vulcanite_shard = new ItemBasic("purple_vulcanite_shard");
    public static ItemBasic ichor = new ItemBasic("ichor");

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        yellow_vulcanite_shard.initModel();
        purple_vulcanite_shard.initModel();
        ichor.initModel();
    }
}
