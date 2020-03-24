/* =====================================================================
 * This class is distributed as part of the Bovine Mod.
 * Get the Source Code on github: https://github.com/Modding-Plus/Bovine
 *
 * Bovine is Open Source and distributed under the
 * MIT License: https://opensource.org/licenses/MIT
 *
 * File: AlliumAfroModel.java
 * Date: 2020-01-24
 * Revision:
 * Author: Trikzon
 * ===================================================================== */
package com.moddingplus.bovine.item.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.ArmorStandEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class AlliumAfroModel extends BipedModel
{
    private final ModelRenderer bone;

    public AlliumAfroModel()
    {
        super(1.0f);
        textureWidth = 64;
        textureHeight = 64;

        bone = new ModelRenderer(this, 0, 0);
        bone.setRotationPoint(-8.0F, -16.0F, 6.0F);
        bone.rotateAngleX = 20.0f;
        addBox(bone, 0, 32, 3.0F, -6.0F, -13.0F, 10, 10, 10, 0.0F, false);
        addBox(bone, 12, 52, 2.0F, -7.0F, -3.0F, 12, 12, 0, 0.0F, false);
        addBox(bone, 12, 52, 2.0F, -7.0F, -13.0F, 12, 12, 0, 0.0F, false);
        addBox(bone, 12, 52, 2.0F, -7.0F, -13.0F, 12, 12, 0, 0.0F, false);
        addBox(bone, 12, 52, 2.0F, -7.0F, -3.0F, 12, 12, 0, 0.0F, false);

        this.bipedHeadwear.addChild(bone);
    }

    public void addBox(
            ModelRenderer bone, int texOffX, int texOffY,
            float x, float y, float z, float width, float height,
            float depth, float delta, boolean mirror)
    {
        bone.setTextureOffset(texOffX, texOffY).addBox(x, y, z, width, height, depth, delta, mirror);
    }

    @Override
    public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha)
    {
        super.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
    }

    // NOTE: Copied from Botania Code. Thank you for being open source and helping modders like me :)
    // https://github.com/Vazkii/Botania/blob/master/src/main/java/vazkii/botania/client/model/armor/ModelArmor.java
    //
    // [VanillaCopy] ArmorStandArmorModel.setRotationAngles because armor stands are dumb
    // This fixes the armor "breathing" and helmets always facing south on armor stands
    @Override
    public void setRotationAngles(LivingEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch)
    {
        if (!(entity instanceof ArmorStandEntity))
        {
            super.setRotationAngles(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            return;
        }

        ArmorStandEntity entityIn = (ArmorStandEntity) entity;
        this.bipedHead.rotateAngleX = ((float) Math.PI / 180F) * entityIn.getHeadRotation().getX();
        this.bipedHead.rotateAngleY = ((float) Math.PI / 180F) * entityIn.getHeadRotation().getY();
        this.bipedHead.rotateAngleZ = ((float) Math.PI / 180F) * entityIn.getHeadRotation().getZ();
        this.bipedHead.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.bipedBody.rotateAngleX = ((float) Math.PI / 180F) * entityIn.getBodyRotation().getX();
        this.bipedBody.rotateAngleY = ((float) Math.PI / 180F) * entityIn.getBodyRotation().getY();
        this.bipedBody.rotateAngleZ = ((float) Math.PI / 180F) * entityIn.getBodyRotation().getZ();
        this.bipedLeftArm.rotateAngleX = ((float) Math.PI / 180F) * entityIn.getLeftArmRotation().getX();
        this.bipedLeftArm.rotateAngleY = ((float) Math.PI / 180F) * entityIn.getLeftArmRotation().getY();
        this.bipedLeftArm.rotateAngleZ = ((float) Math.PI / 180F) * entityIn.getLeftArmRotation().getZ();
        this.bipedRightArm.rotateAngleX = ((float) Math.PI / 180F) * entityIn.getRightArmRotation().getX();
        this.bipedRightArm.rotateAngleY = ((float) Math.PI / 180F) * entityIn.getRightArmRotation().getY();
        this.bipedRightArm.rotateAngleZ = ((float) Math.PI / 180F) * entityIn.getRightArmRotation().getZ();
        this.bipedLeftLeg.rotateAngleX = ((float) Math.PI / 180F) * entityIn.getLeftLegRotation().getX();
        this.bipedLeftLeg.rotateAngleY = ((float) Math.PI / 180F) * entityIn.getLeftLegRotation().getY();
        this.bipedLeftLeg.rotateAngleZ = ((float) Math.PI / 180F) * entityIn.getLeftLegRotation().getZ();
        this.bipedLeftLeg.setRotationPoint(1.9F, 11.0F, 0.0F);
        this.bipedRightLeg.rotateAngleX = ((float) Math.PI / 180F) * entityIn.getRightLegRotation().getX();
        this.bipedRightLeg.rotateAngleY = ((float) Math.PI / 180F) * entityIn.getRightLegRotation().getY();
        this.bipedRightLeg.rotateAngleZ = ((float) Math.PI / 180F) * entityIn.getRightLegRotation().getZ();
        this.bipedRightLeg.setRotationPoint(-1.9F, 11.0F, 0.0F);
        this.bipedHeadwear.copyModelAngles(this.bipedHead);
    }

    protected void setRotateAngle(ModelRenderer ModelRenderer, float x, float y, float z)
    {
        ModelRenderer.rotateAngleX = x;
        ModelRenderer.rotateAngleY = y;
        ModelRenderer.rotateAngleZ = z;
    }
}
