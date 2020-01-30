package com.moddingplus.bovine.entity.model;

import com.moddingplus.bovine.entity.AlliumooEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class AlliumooModel extends EntityModel<AlliumooEntity>
{
    private final RendererModel body;
    private final RendererModel A2;
    private final RendererModel bone5;
    private final RendererModel bone6;
    private final RendererModel bone7;
    private final RendererModel A3;
    private final RendererModel bone8;
    private final RendererModel bone9;
    private final RendererModel bone10;
    private final RendererModel A5;
    private final RendererModel bone14;
    private final RendererModel bone15;
    private final RendererModel bone16;
    private final RendererModel A;
    private final RendererModel bone4;
    private final RendererModel bone2;
    private final RendererModel bone3;
    private final RendererModel torso;
    private final RendererModel head;
    private final RendererModel A4;
    private final RendererModel bone11;
    private final RendererModel bone12;
    private final RendererModel bone13;
    private final RendererModel left_front_leg;
    private final RendererModel right_front_leg;
    private final RendererModel left_leg;
    private final RendererModel right_leg;

    public AlliumooModel()
    {
        textureWidth = 64;
        textureHeight = 64;

        body = new RendererModel(this);
        body.setRotationPoint(0.0F, 3.0F, 2.0F);

        A2 = new RendererModel(this);
        A2.setRotationPoint(-4.5F, 1.0F, 1.5F);
        setRotationAngle(A2, 0.0F, 0.0F, -0.2618F);
        body.addChild(A2);
        A2.cubeList.add(new ModelBox(A2, 0, 32, -0.5F, -7.0F, -0.5F, 1, 5, 1, 0.0F, false));
        A2.cubeList.add(new ModelBox(A2, 4, 32, -2.5F, -12.0F, -2.5F, 5, 5, 5, 0.0F, false));
        A2.cubeList.add(new ModelBox(A2, 13, 49, -3.5F, -13.0F, -2.5F, 7, 7, 0, 0.0F, false));
        A2.cubeList.add(new ModelBox(A2, 13, 49, -3.5F, -13.0F, 2.5F, 7, 7, 0, 0.0F, false));

        bone5 = new RendererModel(this);
        bone5.setRotationPoint(-2.5F, -9.0F, 0.5F);
        setRotationAngle(bone5, 0.0F, -1.5708F, 0.0F);
        A2.addChild(bone5);
        bone5.cubeList.add(new ModelBox(bone5, 13, 49, -4.0F, -4.0F, 0.0F, 7, 7, 0, 0.0F, false));
        bone5.cubeList.add(new ModelBox(bone5, 13, 49, -4.0F, -4.0F, -5.0F, 7, 7, 0, 0.0F, false));

        bone6 = new RendererModel(this);
        bone6.setRotationPoint(-0.5F, -12.0F, -0.5F);
        setRotationAngle(bone6, 1.5708F, 0.0F, 0.0F);
        A2.addChild(bone6);
        bone6.cubeList.add(new ModelBox(bone6, 13, 49, -3.0F, -3.0F, 0.0F, 7, 7, 0, 0.0F, false));

        bone7 = new RendererModel(this);
        bone7.setRotationPoint(-0.5F, -12.0F, -0.5F);
        setRotationAngle(bone7, 1.5708F, 0.0F, 0.0F);
        A2.addChild(bone7);
        bone7.cubeList.add(new ModelBox(bone7, 13, 49, -3.0F, -3.0F, -5.0F, 7, 7, 0, 0.0F, false));

        A3 = new RendererModel(this);
        A3.setRotationPoint(3.5F, -1.0F, -5.5F);
        setRotationAngle(A3, 0.1745F, 0.0F, 0.2618F);
        body.addChild(A3);
        A3.cubeList.add(new ModelBox(A3, 0, 32, -0.5F, -9.0F, -0.5F, 1, 9, 1, 0.0F, false));
        A3.cubeList.add(new ModelBox(A3, 4, 32, -2.5F, -14.0F, -2.5F, 5, 5, 5, 0.0F, false));
        A3.cubeList.add(new ModelBox(A3, 13, 49, -3.5F, -15.0F, -2.5F, 7, 7, 0, 0.0F, false));
        A3.cubeList.add(new ModelBox(A3, 13, 49, -3.5F, -15.0F, 2.5F, 7, 11, 0, 0.0F, false));

        bone8 = new RendererModel(this);
        bone8.setRotationPoint(-2.5F, -11.0F, 0.5F);
        setRotationAngle(bone8, 0.0F, -1.5708F, 0.0F);
        A3.addChild(bone8);
        bone8.cubeList.add(new ModelBox(bone8, 13, 49, -4.0F, -4.0F, 0.0F, 7, 11, 0, 0.0F, false));
        bone8.cubeList.add(new ModelBox(bone8, 13, 49, -4.0F, -4.0F, -5.0F, 7, 11, 0, 0.0F, false));

        bone9 = new RendererModel(this);
        bone9.setRotationPoint(-0.5F, -14.0F, -0.5F);
        setRotationAngle(bone9, 1.5708F, 0.0F, 0.0F);
        A3.addChild(bone9);
        bone9.cubeList.add(new ModelBox(bone9, 13, 49, -3.0F, -3.0F, 0.0F, 7, 7, 0, 0.0F, false));

        bone10 = new RendererModel(this);
        bone10.setRotationPoint(-0.5F, -14.0F, -0.5F);
        setRotationAngle(bone10, 1.5708F, 0.0F, 0.0F);
        A3.addChild(bone10);
        bone10.cubeList.add(new ModelBox(bone10, 13, 49, -3.0F, -3.0F, -5.0F, 7, 11, 0, 0.0F, false));

        A5 = new RendererModel(this);
        A5.setRotationPoint(5.5F, 4.0F, 1.5F);
        setRotationAngle(A5, -0.0873F, 0.4363F, 0.4363F);
        body.addChild(A5);
        A5.cubeList.add(new ModelBox(A5, 0, 32, -0.5F, -8.0F, -0.5F, 1, 11, 1, 0.0F, false));
        A5.cubeList.add(new ModelBox(A5, 4, 32, -2.5F, -13.0F, -2.5F, 5, 5, 5, 0.0F, false));
        A5.cubeList.add(new ModelBox(A5, 13, 49, -3.5F, -14.0F, -2.5F, 7, 7, 0, 0.0F, false));
        A5.cubeList.add(new ModelBox(A5, 13, 49, -3.5F, -14.0F, 2.5F, 7, 7, 0, 0.0F, false));

        bone14 = new RendererModel(this);
        bone14.setRotationPoint(-2.5F, -10.0F, 0.5F);
        setRotationAngle(bone14, 0.0F, -1.5708F, 0.0F);
        A5.addChild(bone14);
        bone14.cubeList.add(new ModelBox(bone14, 13, 49, -4.0F, -4.0F, 0.0F, 7, 7, 0, 0.0F, false));
        bone14.cubeList.add(new ModelBox(bone14, 13, 49, -4.0F, -4.0F, -5.0F, 7, 7, 0, 0.0F, false));

        bone15 = new RendererModel(this);
        bone15.setRotationPoint(-0.5F, -13.0F, -0.5F);
        setRotationAngle(bone15, 1.5708F, 0.0F, 0.0F);
        A5.addChild(bone15);
        bone15.cubeList.add(new ModelBox(bone15, 13, 49, -3.0F, -3.0F, 0.0F, 7, 7, 0, 0.0F, false));

        bone16 = new RendererModel(this);
        bone16.setRotationPoint(-0.5F, -13.0F, -0.5F);
        setRotationAngle(bone16, 1.5708F, 0.0F, 0.0F);
        A5.addChild(bone16);
        bone16.cubeList.add(new ModelBox(bone16, 13, 49, -3.0F, -3.0F, -5.0F, 7, 7, 0, 0.0F, false));

        A = new RendererModel(this);
        A.setRotationPoint(2.5F, -1.0F, 6.5F);
        setRotationAngle(A, -0.2618F, 0.0F, 0.0F);
        body.addChild(A);
        A.cubeList.add(new ModelBox(A, 0, 32, -0.5F, -12.0F, -0.5F, 1, 13, 1, 0.0F, false));
        A.cubeList.add(new ModelBox(A, 4, 32, -2.5F, -17.0F, -2.5F, 5, 5, 5, 0.0F, false));
        A.cubeList.add(new ModelBox(A, 13, 49, -3.5F, -18.0F, -2.5F, 7, 7, 0, 0.0F, false));
        A.cubeList.add(new ModelBox(A, 13, 49, -3.5F, -18.0F, 2.5F, 7, 7, 0, 0.0F, false));

        bone4 = new RendererModel(this);
        bone4.setRotationPoint(-2.5F, -14.0F, 0.5F);
        setRotationAngle(bone4, 0.0F, -1.5708F, 0.0F);
        A.addChild(bone4);
        bone4.cubeList.add(new ModelBox(bone4, 13, 49, -4.0F, -4.0F, 0.0F, 7, 7, 0, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 13, 49, -4.0F, -4.0F, -5.0F, 7, 7, 0, 0.0F, false));

        bone2 = new RendererModel(this);
        bone2.setRotationPoint(-0.5F, -17.0F, -0.5F);
        setRotationAngle(bone2, 1.5708F, 0.0F, 0.0F);
        A.addChild(bone2);
        bone2.cubeList.add(new ModelBox(bone2, 13, 49, -3.0F, -3.0F, 0.0F, 7, 7, 0, 0.0F, false));

        bone3 = new RendererModel(this);
        bone3.setRotationPoint(-0.5F, -17.0F, -0.5F);
        setRotationAngle(bone3, 1.5708F, 0.0F, 0.0F);
        A.addChild(bone3);
        bone3.cubeList.add(new ModelBox(bone3, 13, 49, -3.0F, -3.0F, -5.0F, 7, 7, 0, 0.0F, false));

        torso = new RendererModel(this);
        torso.setRotationPoint(0.0F, 1.0F, 4.0F);
        setRotationAngle(torso, -1.5708F, 0.0F, 0.0F);
        body.addChild(torso);
        torso.cubeList.add(new ModelBox(torso, 18, 4, -6.0F, -4.0F, -2.0F, 12, 18, 10, 0.0F, false));

        head = new RendererModel(this);
        head.setRotationPoint(0.0F, 21.0F, 0.0F);
        body.addChild(head);
        head.cubeList.add(new ModelBox(head, 22, 0, -5.0F, -25.0F, -12.0F, 1, 3, 1, 0.0F, false));
        head.cubeList.add(new ModelBox(head, 22, 0, 4.0F, -25.0F, -12.0F, 1, 3, 1, 0.0F, false));
        head.cubeList.add(new ModelBox(head, 0, 0, -4.0F, -24.0F, -14.0F, 8, 8, 6, 0.0F, false));

        A4 = new RendererModel(this);
        A4.setRotationPoint(-1.5F, -24.0F, -12.5F);
        setRotationAngle(A4, 0.1745F, 0.0F, 0.0F);
        head.addChild(A4);
        A4.cubeList.add(new ModelBox(A4, 0, 32, -0.5F, -4.0F, -0.5F, 1, 4, 1, 0.0F, false));
        A4.cubeList.add(new ModelBox(A4, 4, 32, -2.5F, -9.0F, -2.5F, 5, 5, 5, 0.0F, false));
        A4.cubeList.add(new ModelBox(A4, 13, 49, -3.5F, -10.0F, -2.5F, 7, 7, 0, 0.0F, false));
        A4.cubeList.add(new ModelBox(A4, 13, 49, -3.5F, -10.0F, 2.5F, 7, 11, 0, 0.0F, false));

        bone11 = new RendererModel(this);
        bone11.setRotationPoint(-2.5F, -6.0F, 0.5F);
        setRotationAngle(bone11, 0.0F, -1.5708F, 0.0F);
        A4.addChild(bone11);
        bone11.cubeList.add(new ModelBox(bone11, 13, 49, -4.0F, -4.0F, 0.0F, 7, 11, 0, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 13, 49, -4.0F, -4.0F, -5.0F, 7, 11, 0, 0.0F, false));

        bone12 = new RendererModel(this);
        bone12.setRotationPoint(-0.5F, -9.0F, -0.5F);
        setRotationAngle(bone12, 1.5708F, 0.0F, 0.0F);
        A4.addChild(bone12);
        bone12.cubeList.add(new ModelBox(bone12, 13, 49, -3.0F, -3.0F, 0.0F, 7, 7, 0, 0.0F, false));

        bone13 = new RendererModel(this);
        bone13.setRotationPoint(-0.5F, -9.0F, -0.5F);
        setRotationAngle(bone13, 1.5708F, 0.0F, 0.0F);
        A4.addChild(bone13);
        bone13.cubeList.add(new ModelBox(bone13, 13, 49, -3.0F, -3.0F, -5.0F, 7, 11, 0, 0.0F, false));

        left_front_leg = new RendererModel(this);
        left_front_leg.setRotationPoint(-8.0F, 16.0F, 8.0F);
        left_front_leg.cubeList.add(new ModelBox(left_front_leg, 0, 16, 10.0F, -4.0F, -16.0F, 4, 12, 4, 0.0F, false));

        right_front_leg = new RendererModel(this);
        right_front_leg.setRotationPoint(-8.0F, 16.0F, 8.0F);
        right_front_leg.cubeList.add(new ModelBox(right_front_leg, 0, 16, 2.0F, -4.0F, -16.0F, 4, 12, 4, 0.0F, false));

        left_leg = new RendererModel(this);
        left_leg.setRotationPoint(-8.0F, 16.0F, 8.0F);
        left_leg.cubeList.add(new ModelBox(left_leg, 0, 16, 10.0F, -4.0F, -3.0F, 4, 12, 4, 0.0F, false));

        right_leg = new RendererModel(this);
        right_leg.setRotationPoint(-8.0F, 16.0F, 8.0F);
        right_leg.cubeList.add(new ModelBox(right_leg, 0, 16, 2.0F, -4.0F, -3.0F, 4, 12, 4, 0.0F, false));
    }

    @Override
    public void render(AlliumooEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale)
    {
        body.render(scale);
        left_front_leg.render(scale);
        right_front_leg.render(scale);
        left_leg.render(scale);
        right_leg.render(scale);
    }

    public void setRotationAngle(RendererModel rendererModel, float x, float y, float z)
    {
        rendererModel.rotateAngleX = x;
        rendererModel.rotateAngleY = y;
        rendererModel.rotateAngleZ = z;
    }
}
