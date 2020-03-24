package com.moddingplus.bovine.entity.model;

import com.moddingplus.bovine.entity.AlliumooEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class AlliumooModel extends EntityModel<AlliumooEntity>
{
    private final ModelRenderer body;
    private final ModelRenderer A2;
    private final ModelRenderer bone5;
    private final ModelRenderer bone6;
    private final ModelRenderer bone7;
    private final ModelRenderer A3;
    private final ModelRenderer bone8;
    private final ModelRenderer bone9;
    private final ModelRenderer bone10;
    private final ModelRenderer A5;
    private final ModelRenderer bone14;
    private final ModelRenderer bone15;
    private final ModelRenderer bone16;
    private final ModelRenderer A;
    private final ModelRenderer bone4;
    private final ModelRenderer bone2;
    private final ModelRenderer bone3;
    private final ModelRenderer torso;
    private final ModelRenderer head;
    private final ModelRenderer A4;
    private final ModelRenderer bone11;
    private final ModelRenderer bone12;
    private final ModelRenderer bone13;
    private final ModelRenderer left_front_leg;
    private final ModelRenderer right_front_leg;
    private final ModelRenderer left_leg;
    private final ModelRenderer right_leg;

    public AlliumooModel()
    {
        textureWidth = 64;
        textureHeight = 64;

        body = new ModelRenderer(this);
        body.setRotationPoint(0.0F, 3.0F, 2.0F);

        A2 = new ModelRenderer(this);
        A2.setRotationPoint(-4.5F, 1.0F, 1.5F);
        setRotationAngle(A2, 0.0F, 0.0F, -0.2618F);
        body.addChild(A2);
        addBox(A2, 0, 32, -0.5F, -7.0F, -0.5F, 1, 5, 1, 0.0F, false);
        addBox(A2, 4, 32, -2.5F, -12.0F, -2.5F, 5, 5, 5, 0.0F, false);
        addBox(A2, 13, 49, -3.5F, -13.0F, -2.5F, 7, 7, 0, 0.0F, false);
        addBox(A2, 13, 49, -3.5F, -13.0F, 2.5F, 7, 7, 0, 0.0F, false);

        bone5 = new ModelRenderer(this);
        bone5.setRotationPoint(-2.5F, -9.0F, 0.5F);
        setRotationAngle(bone5, 0.0F, -1.5708F, 0.0F);
        A2.addChild(bone5);
        addBox(bone5, 13, 49, -4.0F, -4.0F, 0.0F, 7, 7, 0, 0.0F, false);
        addBox(bone5, 13, 49, -4.0F, -4.0F, -5.0F, 7, 7, 0, 0.0F, false);

        bone6 = new ModelRenderer(this);
        bone6.setRotationPoint(-0.5F, -12.0F, -0.5F);
        setRotationAngle(bone6, 1.5708F, 0.0F, 0.0F);
        A2.addChild(bone6);
        addBox(bone6, 13, 49, -3.0F, -3.0F, 0.0F, 7, 7, 0, 0.0F, false);

        bone7 = new ModelRenderer(this);
        bone7.setRotationPoint(-0.5F, -12.0F, -0.5F);
        setRotationAngle(bone7, 1.5708F, 0.0F, 0.0F);
        A2.addChild(bone7);
        addBox(bone7, 13, 49, -3.0F, -3.0F, -5.0F, 7, 7, 0, 0.0F, false);

        A3 = new ModelRenderer(this);
        A3.setRotationPoint(3.5F, -1.0F, -5.5F);
        setRotationAngle(A3, 0.1745F, 0.0F, 0.2618F);
        body.addChild(A3);
        addBox(A3, 0, 32, -0.5F, -9.0F, -0.5F, 1, 9, 1, 0.0F, false);
        addBox(A3, 4, 32, -2.5F, -14.0F, -2.5F, 5, 5, 5, 0.0F, false);
        addBox(A3, 13, 49, -3.5F, -15.0F, -2.5F, 7, 7, 0, 0.0F, false);
        addBox(A3, 13, 49, -3.5F, -15.0F, 2.5F, 7, 11, 0, 0.0F, false);

        bone8 = new ModelRenderer(this);
        bone8.setRotationPoint(-2.5F, -11.0F, 0.5F);
        setRotationAngle(bone8, 0.0F, -1.5708F, 0.0F);
        A3.addChild(bone8);
        addBox(bone8, 13, 49, -4.0F, -4.0F, 0.0F, 7, 11, 0, 0.0F, false);
        addBox(bone8, 13, 49, -4.0F, -4.0F, -5.0F, 7, 11, 0, 0.0F, false);

        bone9 = new ModelRenderer(this);
        bone9.setRotationPoint(-0.5F, -14.0F, -0.5F);
        setRotationAngle(bone9, 1.5708F, 0.0F, 0.0F);
        A3.addChild(bone9);
        addBox(bone9, 13, 49, -3.0F, -3.0F, 0.0F, 7, 7, 0, 0.0F, false);

        bone10 = new ModelRenderer(this);
        bone10.setRotationPoint(-0.5F, -14.0F, -0.5F);
        setRotationAngle(bone10, 1.5708F, 0.0F, 0.0F);
        A3.addChild(bone10);
        addBox(bone10, 13, 49, -3.0F, -3.0F, -5.0F, 7, 11, 0, 0.0F, false);

        A5 = new ModelRenderer(this);
        A5.setRotationPoint(5.5F, 4.0F, 1.5F);
        setRotationAngle(A5, -0.0873F, 0.4363F, 0.4363F);
        body.addChild(A5);
        addBox(A5, 0, 32, -0.5F, -8.0F, -0.5F, 1, 11, 1, 0.0F, false);
        addBox(A5, 4, 32, -2.5F, -13.0F, -2.5F, 5, 5, 5, 0.0F, false);
        addBox(A5, 13, 49, -3.5F, -14.0F, -2.5F, 7, 7, 0, 0.0F, false);
        addBox(A5, 13, 49, -3.5F, -14.0F, 2.5F, 7, 7, 0, 0.0F, false);

        bone14 = new ModelRenderer(this);
        bone14.setRotationPoint(-2.5F, -10.0F, 0.5F);
        setRotationAngle(bone14, 0.0F, -1.5708F, 0.0F);
        A5.addChild(bone14);
        addBox(bone14, 13, 49, -4.0F, -4.0F, 0.0F, 7, 7, 0, 0.0F, false);
        addBox(bone14, 13, 49, -4.0F, -4.0F, -5.0F, 7, 7, 0, 0.0F, false);

        bone15 = new ModelRenderer(this);
        bone15.setRotationPoint(-0.5F, -13.0F, -0.5F);
        setRotationAngle(bone15, 1.5708F, 0.0F, 0.0F);
        A5.addChild(bone15);
        addBox(bone15, 13, 49, -3.0F, -3.0F, 0.0F, 7, 7, 0, 0.0F, false);

        bone16 = new ModelRenderer(this);
        bone16.setRotationPoint(-0.5F, -13.0F, -0.5F);
        setRotationAngle(bone16, 1.5708F, 0.0F, 0.0F);
        A5.addChild(bone16);
        addBox(bone16, 13, 49, -3.0F, -3.0F, -5.0F, 7, 7, 0, 0.0F, false);

        A = new ModelRenderer(this);
        A.setRotationPoint(2.5F, -1.0F, 6.5F);
        setRotationAngle(A, -0.2618F, 0.0F, 0.0F);
        body.addChild(A);
        addBox(A, 0, 32, -0.5F, -12.0F, -0.5F, 1, 13, 1, 0.0F, false);
        addBox(A, 4, 32, -2.5F, -17.0F, -2.5F, 5, 5, 5, 0.0F, false);
        addBox(A, 13, 49, -3.5F, -18.0F, -2.5F, 7, 7, 0, 0.0F, false);
        addBox(A, 13, 49, -3.5F, -18.0F, 2.5F, 7, 7, 0, 0.0F, false);

        bone4 = new ModelRenderer(this);
        bone4.setRotationPoint(-2.5F, -14.0F, 0.5F);
        setRotationAngle(bone4, 0.0F, -1.5708F, 0.0F);
        A.addChild(bone4);
        addBox(bone4, 13, 49, -4.0F, -4.0F, 0.0F, 7, 7, 0, 0.0F, false);
        addBox(bone4, 13, 49, -4.0F, -4.0F, -5.0F, 7, 7, 0, 0.0F, false);

        bone2 = new ModelRenderer(this);
        bone2.setRotationPoint(-0.5F, -17.0F, -0.5F);
        setRotationAngle(bone2, 1.5708F, 0.0F, 0.0F);
        A.addChild(bone2);
        addBox(bone2, 13, 49, -3.0F, -3.0F, 0.0F, 7, 7, 0, 0.0F, false);

        bone3 = new ModelRenderer(this);
        bone3.setRotationPoint(-0.5F, -17.0F, -0.5F);
        setRotationAngle(bone3, 1.5708F, 0.0F, 0.0F);
        A.addChild(bone3);
        addBox(bone3, 13, 49, -3.0F, -3.0F, -5.0F, 7, 7, 0, 0.0F, false);

        torso = new ModelRenderer(this);
        torso.setRotationPoint(0.0F, 1.0F, 4.0F);
        setRotationAngle(torso, -1.5708F, 0.0F, 0.0F);
        body.addChild(torso);
        addBox(torso, 18, 4, -6.0F, -4.0F, -2.0F, 12, 18, 10, 0.0F, false);

        head = new ModelRenderer(this);
        head.setRotationPoint(0.0F, 21.0F, 0.0F);
        body.addChild(head);
        addBox(head, 22, 0, -5.0F, -25.0F, -12.0F, 1, 3, 1, 0.0F, false);
        addBox(head, 22, 0, 4.0F, -25.0F, -12.0F, 1, 3, 1, 0.0F, false);
        addBox(head, 0, 0, -4.0F, -24.0F, -14.0F, 8, 8, 6, 0.0F, false);

        A4 = new ModelRenderer(this);
        A4.setRotationPoint(-1.5F, -24.0F, -12.5F);
        setRotationAngle(A4, 0.1745F, 0.0F, 0.0F);
        head.addChild(A4);
        addBox(A4, 0, 32, -0.5F, -4.0F, -0.5F, 1, 4, 1, 0.0F, false);
        addBox(A4, 4, 32, -2.5F, -9.0F, -2.5F, 5, 5, 5, 0.0F, false);
        addBox(A4, 13, 49, -3.5F, -10.0F, -2.5F, 7, 7, 0, 0.0F, false);
        addBox(A4, 13, 49, -3.5F, -10.0F, 2.5F, 7, 11, 0, 0.0F, false);

        bone11 = new ModelRenderer(this);
        bone11.setRotationPoint(-2.5F, -6.0F, 0.5F);
        setRotationAngle(bone11, 0.0F, -1.5708F, 0.0F);
        A4.addChild(bone11);
        addBox(bone11, 13, 49, -4.0F, -4.0F, 0.0F, 7, 11, 0, 0.0F, false);
        addBox(bone11, 13, 49, -4.0F, -4.0F, -5.0F, 7, 11, 0, 0.0F, false);

        bone12 = new ModelRenderer(this);
        bone12.setRotationPoint(-0.5F, -9.0F, -0.5F);
        setRotationAngle(bone12, 1.5708F, 0.0F, 0.0F);
        A4.addChild(bone12);
        addBox(bone12, 13, 49, -3.0F, -3.0F, 0.0F, 7, 7, 0, 0.0F, false);

        bone13 = new ModelRenderer(this);
        bone13.setRotationPoint(-0.5F, -9.0F, -0.5F);
        setRotationAngle(bone13, 1.5708F, 0.0F, 0.0F);
        A4.addChild(bone13);
        addBox(bone13, 13, 49, -3.0F, -3.0F, -5.0F, 7, 11, 0, 0.0F, false);

        left_front_leg = new ModelRenderer(this);
        left_front_leg.setRotationPoint(-8.0F, 16.0F, 8.0F);
        addBox(left_front_leg, 0, 16, 10.0F, -4.0F, -16.0F, 4, 12, 4, 0.0F, false);

        right_front_leg = new ModelRenderer(this);
        right_front_leg.setRotationPoint(-8.0F, 16.0F, 8.0F);
        addBox(right_front_leg, 0, 16, 2.0F, -4.0F, -16.0F, 4, 12, 4, 0.0F, false);

        left_leg = new ModelRenderer(this);
        left_leg.setRotationPoint(-8.0F, 16.0F, 8.0F);
        addBox(left_leg, 0, 16, 10.0F, -4.0F, -3.0F, 4, 12, 4, 0.0F, false);

        right_leg = new ModelRenderer(this);
        right_leg.setRotationPoint(-8.0F, 16.0F, 8.0F);
        addBox(right_leg, 0, 16, 2.0F, -4.0F, -3.0F, 4, 12, 4, 0.0F, false);
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
        body.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
        left_front_leg.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
        right_front_leg.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
        left_leg.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
        right_leg.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
    }

    @Override
    public void setRotationAngles(AlliumooEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch)
    {

    }

    public void setRotationAngle(ModelRenderer ModelRenderer, float x, float y, float z)
    {
        ModelRenderer.rotateAngleX = x;
        ModelRenderer.rotateAngleY = y;
        ModelRenderer.rotateAngleZ = z;
    }
}
