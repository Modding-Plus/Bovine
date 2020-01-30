package com.moddingplus.bovine.init;

import com.moddingplus.bovine.Bovine;
import com.moddingplus.bovine.entity.AlliumooEntity;
import com.moddingplus.bovine.entity.renderer.AlliumooRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
@OnlyIn(Dist.CLIENT)
public class ClientHandler
{
    @SubscribeEvent
    public static void onFMLClientSetup(FMLClientSetupEvent event)
    {
        RenderingRegistry.registerEntityRenderingHandler(AlliumooEntity.class, new AlliumooRenderer.RenderFactory());
    }
}
