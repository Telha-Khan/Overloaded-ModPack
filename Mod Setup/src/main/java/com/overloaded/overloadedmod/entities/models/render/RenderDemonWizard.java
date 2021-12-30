package com.overloaded.overloadedmod.entities.models.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderDemonWizard extends RenderLiving {

    private static final ResourceLocation mobTextures = new ResourceLocation("overloaded:textures/entities/demon_wizard.png");

    public RenderDemonWizard(ModelBase par1ModelBase, float par2) {

        super(par1ModelBase, par2);
    }

    protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
        return mobTextures;
    }

}
