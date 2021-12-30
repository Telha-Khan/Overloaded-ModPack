package com.overloaded.overloadedmod.entities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

/**
 * ModelFallenSamurai - Undefined
 * Created using Tabula 4.1.1
 */
public class ModelDemonWizard extends ModelBase {
    public ModelRenderer head;
    public ModelRenderer body;
    public ModelRenderer rightLeg;
    public ModelRenderer leftLeg;
    public ModelRenderer rightArm;
    public ModelRenderer leftArm;
    public ModelRenderer hat;
    public ModelRenderer jacket;
    public ModelRenderer rightArmSleeve;
    public ModelRenderer leftArmSleeve;
    public ModelRenderer rightLegPants;
    public ModelRenderer leftLegPants;

    public ModelDemonWizard() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.body = new ModelRenderer(this, 16, 16);
        this.body.setRotationPoint(-1.0F, -5.0F, 2.0F);
        this.body.addBox(0.0F, 0.0F, 0.0F, 8, 12, 4, 0.0F);
        this.rightLeg = new ModelRenderer(this, 0, 16);
        this.rightLeg.setRotationPoint(-1.0F, 7.0F, 2.0F);
        this.rightLeg.addBox(0.0F, 0.0F, 0.0F, 4, 12, 4, 0.0F);
        this.rightLegPants = new ModelRenderer(this, 0, 32);
        this.rightLegPants.setRotationPoint(-1.0F, 7.0F, 2.0F);
        this.rightLegPants.addBox(0.0F, 0.0F, 0.0F, 4, 12, 4, 0.3F);
        this.leftArm = new ModelRenderer(this, 32, 48);
        this.leftArm.setRotationPoint(7.0F, -5.0F, 2.0F);
        this.leftArm.addBox(0.0F, 0.0F, 0.0F, 4, 12, 4, 0.0F);
        this.leftLegPants = new ModelRenderer(this, 0, 48);
        this.leftLegPants.setRotationPoint(3.0F, 7.0F, 2.0F);
        this.leftLegPants.addBox(0.0F, 0.0F, 0.0F, 4, 12, 4, 0.3F);
        this.hat = new ModelRenderer(this, 32, 0);
        this.hat.setRotationPoint(-1.0F, -13.0F, 0.0F);
        this.hat.addBox(0.0F, 0.0F, 0.0F, 8, 8, 8, 1.0F);
        this.setRotateAngle(hat, 0.0F, 0.0F, -0.0017453292519943296F);
        this.leftArmSleeve = new ModelRenderer(this, 48, 48);
        this.leftArmSleeve.setRotationPoint(7.0F, -5.0F, 2.0F);
        this.leftArmSleeve.addBox(0.0F, 0.0F, 0.0F, 4, 12, 4, 0.4F);
        this.leftLeg = new ModelRenderer(this, 16, 48);
        this.leftLeg.setRotationPoint(3.0F, 7.0F, 2.0F);
        this.leftLeg.addBox(0.0F, 0.0F, 0.0F, 4, 12, 4, 0.0F);
        this.head = new ModelRenderer(this, 0, 0);
        this.head.setRotationPoint(-1.0F, -13.0F, 0.0F);
        this.head.addBox(0.0F, 0.0F, 0.0F, 8, 8, 8, 0.0F);
        this.rightArmSleeve = new ModelRenderer(this, 40, 32);
        this.rightArmSleeve.setRotationPoint(-5.0F, -5.0F, 2.0F);
        this.rightArmSleeve.addBox(0.0F, 0.0F, 0.0F, 4, 12, 4, 0.4F);
        this.setRotateAngle(rightArmSleeve, 4.960524086056721E-16F, 6.200655107570901E-17F, -6.200655107570901E-16F);
        this.jacket = new ModelRenderer(this, 16, 32);
        this.jacket.setRotationPoint(-1.0F, -4.0F, 2.0F);
        this.jacket.addBox(0.0F, 0.0F, 0.0F, 8, 12, 4, 1.0F);
        this.rightArm = new ModelRenderer(this, 40, 16);
        this.rightArm.setRotationPoint(-5.0F, -5.0F, 2.0F);
        this.rightArm.addBox(0.0F, 0.0F, 0.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(rightArm, 0.0F, -2.2942423898012334E-15F, -1.2401310215141802E-16F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.body.render(f5);
        this.rightLeg.render(f5);
        this.rightLegPants.render(f5);
        this.leftArm.render(f5);
        this.leftLegPants.render(f5);
        this.hat.render(f5);
        this.leftArmSleeve.render(f5);
        this.leftLeg.render(f5);
        this.head.render(f5);
        this.rightArmSleeve.render(f5);
        this.jacket.render(f5);
        this.rightArm.render(f5);
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {

        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.head.rotateAngleY = f3 / (180F / (float)Math.PI);
        this.hat.rotateAngleY = f3 / (180F / (float)Math.PI);
        this.head.rotateAngleX = f4 / (180F / (float)Math.PI);
        this.hat.rotateAngleX = f4 / (180F / (float)Math.PI);
        this.rightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
        this.rightArmSleeve.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
        this.leftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
        this.leftArmSleeve.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
        this.rightArm.rotateAngleZ = 0.0F;
        this.rightArmSleeve.rotateAngleZ = 0.0F;
        this.leftArm.rotateAngleZ = 0.0F;
        this.leftArmSleeve.rotateAngleZ = 0.0F;
        this.rightLeg.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
        this.rightLegPants.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
        this.leftLeg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
        this.leftLegPants.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
        this.rightLeg.rotateAngleY = 0.0F;
        this.rightLegPants.rotateAngleY = 0.0F;
        this.leftLeg.rotateAngleY = 0.0F;
        this.leftLegPants.rotateAngleY = 0.0F;

    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
