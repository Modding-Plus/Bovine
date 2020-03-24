package com.moddingplus.bovine.entity.renderer;

import com.moddingplus.bovine.Bovine;
import com.moddingplus.bovine.entity.AlliumooEntity;
import com.moddingplus.bovine.entity.model.AlliumooModel;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.IRenderFactory;

import javax.annotation.Nullable;

@OnlyIn(Dist.CLIENT)
public class AlliumooRenderer extends LivingRenderer<AlliumooEntity, AlliumooModel>
{
    public AlliumooRenderer(EntityRendererManager rendererManager)
    {
        super(rendererManager, new AlliumooModel(), 0f);
    }

    @Nullable
    @Override
    public ResourceLocation getEntityTexture(AlliumooEntity entity)
    {
        return new ResourceLocation(Bovine.MOD_ID, "textures/entity/alliumoo_adult.png");
    }

    public static class RenderFactory implements IRenderFactory<AlliumooEntity>
    {
        @Override
        public EntityRenderer<? super AlliumooEntity> createRenderFor(EntityRendererManager manager)
        {
            return new AlliumooRenderer(manager);
        }
    }
}
