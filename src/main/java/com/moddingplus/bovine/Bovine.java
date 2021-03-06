/* =====================================================================
 * This class is distributed as part of the Bovine Mod.
 * Get the Source Code on github: https://github.com/Modding-Plus/Bovine
 *
 * Bovine is Open Source and distributed under the
 * MIT License: https://opensource.org/licenses/MIT
 *
 * File: Bovine.java
 * Date: 2020-01-24
 * Revision:
 * Author: Trikzon
 * ===================================================================== */
package com.moddingplus.bovine;

import com.moddingplus.bovine.init.BovineObjects;
import com.moddingplus.bovine.init.ClientHandler;
import net.minecraft.entity.EntityType;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Bovine.MOD_ID)
public class Bovine
{
    public static final String MOD_ID = "bovine";

    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    public Bovine()
    {
        MinecraftForge.EVENT_BUS.register(ClientHandler.class);
        FMLJavaModLoadingContext.get().getModEventBus().addGenericListener(
                EntityType.class, BovineObjects::onEntityWorldSpawnRegistry
        );

        BovineObjects.register();
    }

    public static final ItemGroup ITEM_GROUP = new ItemGroup(MOD_ID)
    {
        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(BovineObjects.ALLIUM_BULB.get());
        }
    };
}
