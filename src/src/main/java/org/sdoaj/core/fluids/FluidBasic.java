package org.sdoaj.core.fluids;

import net.minecraft.block.material.Material;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;

public class FluidBasic extends Fluid {
    private int mapColor = 0xFFFFFFFF;
    private SoundEvent emptySound = SoundEvents.ITEM_BUCKET_EMPTY;
    private SoundEvent fillSound = SoundEvents.ITEM_BUCKET_FILL;
    private Material material = Material.LAVA;

    public FluidBasic(String fluidName, ResourceLocation still, ResourceLocation flowing, int mapColor) {
        super(fluidName, still, flowing);
        setColor(mapColor);
        ModFluids.fluids.add(this);
    }

    @Override
    public int getColor() {
        return mapColor;
    }

    @Override
    public SoundEvent getEmptySound() {
        return emptySound;
    }

    @Override
    public SoundEvent getFillSound() {
        return fillSound;
    }

    public FluidBasic setMaterial(Material material) {
        this.material = material;
        return this;
    }

    public Material getMaterial() {
        return material;
    }

    @Override
    public boolean doesVaporize(FluidStack fluidStack) {
        return block != null && block.getDefaultState().getMaterial() == getMaterial();
    }
}