package org.sdoaj.core.fluids;

import net.minecraft.block.material.Material;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;
import org.sdoaj.core.Main;

public class FluidBasic extends Fluid {
    private SoundEvent emptySound = SoundEvents.ITEM_BUCKET_EMPTY;
    private SoundEvent fillSound = SoundEvents.ITEM_BUCKET_FILL;
    private Material material = Material.WATER;

    public FluidBasic(String fluidName, int color) {
        super(fluidName, new ResourceLocation(Main.MODID,"blocks/fluids/" + fluidName + "_still"),
                new ResourceLocation(Main.MODID,"blocks/fluids/" + fluidName + "_flow"));
        setColor(color);
        ModFluids.fluids.add(this);
    }

    @Override
    public int getColor() {
        return 0xFFFFFFFF;
    }

    @Override
    public SoundEvent getEmptySound() {
        return emptySound;
    }

    @Override
    public SoundEvent getFillSound() {
        return fillSound;
    }

    public Material getMaterial() {
        return material;
    }

    public FluidBasic setMaterial(Material material) {
        this.material = material;
        return this;
    }

    @Override
    public boolean doesVaporize(FluidStack fluidStack) {
        return block != null && block.getDefaultState().getMaterial() == getMaterial();
    }
}