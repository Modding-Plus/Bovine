package com.moddingplus.bovine.init;

import com.moddingplus.bovine.entity.renderer.AlliumooRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
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
        // Apparently this is what is needed for transparency now
        RenderTypeLookup.setRenderLayer(BovineObjects.ALLIUM_BULB.get(), RenderType.getCutout());

        RenderingRegistry.registerEntityRenderingHandler(BovineObjects.ALLIUMOO.get(), new AlliumooRenderer.RenderFactory());
    }
}
