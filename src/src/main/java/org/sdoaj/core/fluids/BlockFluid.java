package org.sdoaj.core.fluids;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.item.Item;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.sdoaj.core.Main;
import org.sdoaj.core.blocks.BlockWithModel;
import org.sdoaj.core.blocks.ModBlocks;

public class BlockFluid extends BlockFluidClassic implements BlockWithModel {
    BlockFluid(FluidBasic fluid, Material material) {
        super(fluid, material);
        setRegistryName(new ResourceLocation(Main.MODID, "fluids/" + fluid.getName()));
        setUnlocalizedName(fluidName);
        ModBlocks.blocks.add(this);
    }

    public String getName() {
        return fluidName;
    }

    @SideOnly(Side.CLIENT)
    void render() {
        ModelLoader.setCustomStateMapper(this, new StateMap.Builder().ignore(LEVEL).build());
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}