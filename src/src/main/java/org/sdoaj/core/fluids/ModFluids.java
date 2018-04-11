package org.sdoaj.core.fluids;

import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.FluidRegistry;
import org.sdoaj.core.Main;

import java.util.ArrayList;

public class ModFluids {
    static final ArrayList<FluidBasic> fluids = new ArrayList<>();

    public static final FluidBasic sauce = (FluidBasic) new FluidBasic("sauce",
            new ResourceLocation(Main.MODID,"sauce_still"),
            new ResourceLocation(Main.MODID, "sauce_flow"), 0xFF000000)
            .setMaterial(Material.LAVA).setGaseous(false).setDensity(1000).setLuminosity(5)
            .setViscosity(9000).setTemperature(340);

    public static void init() {
        for (FluidBasic fluid : fluids) {
            FluidRegistry.registerFluid(fluid);
            FluidRegistry.addBucketForFluid(fluid);
        }
    }
}
