package com.overloaded.overloadedmod.entities.models.render;

import com.overloaded.overloadedmod.OverloadedMod;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderFallenSamurai extends RenderLiving{

    private static final ResourceLocation mobTextures = new ResourceLocation( "overloaded:textures/entities/fallen_samurai.png");

    public RenderFallenSamurai(ModelBase par1ModelBase, float par2) {

        super(par1ModelBase, par2);
    }

    protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
        return mobTextures;
    }

}
