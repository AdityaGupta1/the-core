package org.sdoaj.core.fluids;

import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.FluidRegistry;

import java.util.ArrayList;

public class ModFluids {
    public static final ArrayList<FluidBasic> fluids = new ArrayList<>();

    public static final FluidBasic sauce = (FluidBasic) new FluidBasic("sauce",
            0xFF000000).setMaterial(Material.WATER).setGaseous(false).setDensity(1000)
            .setLuminosity(5).setViscosity(9000).setTemperature(340);

    public static void init() {
        for (FluidBasic fluid : fluids) {
            FluidRegistry.registerFluid(fluid);
            FluidRegistry.addBucketForFluid(fluid);
            fluid.setBlock(new BlockFluid(fluid, fluid.getMaterial()));
        }
    }

    public static void renderFluids() {
        for (FluidBasic fluid : fluids) {
            ((BlockFluid) fluid.getBlock()).render();
        }
    }
}
