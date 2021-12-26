package com.overloaded.overloadedmod.entities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelFallenSamurai extends ModelBase{

    public ModelRenderer rightarm;
    public ModelRenderer leftleg;
    public ModelRenderer head;
    public ModelRenderer body;
    public ModelRenderer leftarm;
    public ModelRenderer rightleg;

    public ModelFallenSamurai() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.body = new ModelRenderer(this, 16, 16);
        this.body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F);
        this.leftarm = new ModelRenderer(this, 40, 16);
        this.leftarm.mirror = true;
        this.leftarm.setRotationPoint(5.1F, 2.0F, -0.0F);
        this.leftarm.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(leftarm, 0.0F, 0.0F, -0.045553093477052F);
        this.leftleg = new ModelRenderer(this, 0, 16);
        this.leftleg.mirror = true;
        this.leftleg.setRotationPoint(2.0F, 12.0F, 0.0F);
        this.leftleg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.rightleg = new ModelRenderer(this, 0, 16);
        this.rightleg.setRotationPoint(-2.0F, 12.0F, 0.0F);
        this.rightleg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.head = new ModelRenderer(this, 0, 2);
        this.head.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.head.addBox(-4.0F, -8.0F, -4.0F, 8, 6, 8, 0.0F);
        this.rightarm = new ModelRenderer(this, 40, 16);
        this.rightarm.setRotationPoint(-5.1F, 2.0F, 0.0F);
        this.rightarm.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(rightarm, 0.0F, 0.0F, 0.045553093477052F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.body.render(f5);
        this.leftarm.render(f5);
        this.leftleg.render(f5);
        this.rightleg.render(f5);
        this.head.render(f5);
        this.rightarm.render(f5);
    }


    public void setRotationAngles(float p_78087_1_, float p_78087_2_, float p_78087_3_, float p_78087_4_, float p_78087_5_, float p_78087_6_, Entity p_78087_7_) {
        this.head.rotateAngleY = p_78087_4_ / 57.295776F;
        this.head.rotateAngleX = p_78087_5_ / 57.295776F;
        this.rightarm.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F + 3.1415927F) * 2.0F * p_78087_2_ * 0.5F;
        this.leftarm.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F) * 2.0F * p_78087_2_ * 0.5F;
        this.rightarm.rotateAngleZ = 0.0F;
        this.leftarm.rotateAngleZ = 0.0F;
        this.rightleg.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F) * 1.4F * p_78087_2_;
        this.leftleg.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F + 3.1415927F) * 1.4F * p_78087_2_;
        this.rightleg.rotateAngleY = 0.0F;
        this.leftleg.rotateAngleY = 0.0F;
        if (this.isRiding) {
            this.rightarm.rotateAngleX += -0.62831855F;
            this.leftarm.rotateAngleX += -0.62831855F;
            this.rightleg.rotateAngleX = -1.2566371F;
            this.leftleg.rotateAngleX = -1.2566371F;
            this.rightleg.rotateAngleY = 0.31415927F;
            this.leftleg.rotateAngleY = -0.31415927F;
        }
        this.rightarm.rotateAngleY = 0.0F;
        this.leftarm.rotateAngleY = 0.0F;
        if (this.onGround > -9990.0F) {
            float var8 = this.onGround;
            this.body.rotateAngleY = MathHelper.sin(MathHelper.sqrt_float(var8) * 3.1415927F * 2.0F) * 0.2F;
            this.rightarm.rotationPointZ = MathHelper.sin(this.body.rotateAngleY) * 5.0F;
            this.rightarm.rotationPointX = -MathHelper.cos(this.body.rotateAngleY) * 5.0F;
            this.leftarm.rotationPointZ = -MathHelper.sin(this.body.rotateAngleY) * 5.0F;
            this.leftarm.rotationPointX = MathHelper.cos(this.body.rotateAngleY) * 5.0F;
            this.rightarm.rotateAngleY += this.body.rotateAngleY;
            this.leftarm.rotateAngleY += this.body.rotateAngleY;
            this.leftarm.rotateAngleX += this.body.rotateAngleY;
            var8 = 1.0F - this.onGround;
            var8 *= var8;
            var8 *= var8;
            var8 = 1.0F - var8;
            float var9 = MathHelper.sin(var8 * 3.1415927F);
            float var10 = MathHelper.sin(this.onGround * 3.1415927F) * -(this.head.rotateAngleX - 0.7F) * 0.75F;
            this.rightarm.rotateAngleX = (float)(this.rightarm.rotateAngleX - var9 * 1.2D + var10);
            this.rightarm.rotateAngleY += this.body.rotateAngleY * 2.0F;
            this.rightarm.rotateAngleZ = MathHelper.sin(this.onGround * 3.1415927F) * -0.4F;
        }
        this.rightarm.rotateAngleZ += MathHelper.cos(p_78087_3_ * 0.09F) * 0.05F + 0.05F;
        this.leftarm.rotateAngleZ -= MathHelper.cos(p_78087_3_ * 0.09F) * 0.05F + 0.05F;
        this.rightarm.rotateAngleX += MathHelper.sin(p_78087_3_ * 0.067F) * 0.05F;
        this.leftarm.rotateAngleX -= MathHelper.sin(p_78087_3_ * 0.067F) * 0.05F;
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
