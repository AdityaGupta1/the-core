package org.sdoaj.core.dimensions;

import net.minecraft.world.DimensionType;
import net.minecraftforge.common.DimensionManager;
import org.sdoaj.core.Main;

public class ModDimensions {

    public static DimensionType fsmDimensionType;

    public static void init() {
        registerDimensionTypes();
        registerDimensions();
    }

    private static void registerDimensionTypes() {
        fsmDimensionType = DimensionType.register(Main.MODID, "_fsm", 13, FSMWorldProvider.class, false);
    }

    private static void registerDimensions() {
        DimensionManager.registerDimension(fsmDimensionType.getId(), fsmDimensionType);
    }
}