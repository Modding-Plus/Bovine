package com.moddingplus.bovine;

import com.moddingplus.bovine.registry.BovineObjects;
import com.moddingplus.bovine.registry.RegistryHandler;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Bovine.MOD_ID)
public class Bovine {

    public static final String MOD_ID = "bovine";

    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    public Bovine() {
        MinecraftForge.EVENT_BUS.register(RegistryHandler.class);
    }

    public static final ItemGroup ITEM_GROUP = new ItemGroup(MOD_ID) {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(BovineObjects.Items.ALLIUM_BULB);
        }
    };
}
