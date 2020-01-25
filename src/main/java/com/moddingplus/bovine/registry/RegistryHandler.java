/* =====================================================================
 * This class is distributed as part of the Bovine Mod.
 * Get the Source Code on github: https://github.com/Modding-Plus/Bovine
 *
 * Bovine is Open Source and distributed under the
 * MIT License: https://opensource.org/licenses/MIT
 *
 * File: RegistryHandler.java
 * Date: 2020-01-24
 * Revision:
 * Author: Trikzon
 * ===================================================================== */
package com.moddingplus.bovine.registry;

import com.moddingplus.bovine.Bovine;
import com.moddingplus.bovine.block.AlliumBulbBlock;
import com.moddingplus.bovine.item.AlliumAfroItem;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RegistryHandler
{
    @SubscribeEvent
    public static void onBlockRegistry(RegistryEvent.Register<Block> event)
    {
        event.getRegistry().registerAll(
                new AlliumBulbBlock()
        );
    }

    @SubscribeEvent
    public static void onItemRegistry(RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll(
                createItemFromBlock(BovineObjects.Blocks.ALLIUM_BULB, new Item.Properties().group(Bovine.ITEM_GROUP)),
                new AlliumAfroItem()
        );
    }

    private static Item createItemFromBlock(Block block, Item.Properties properties)
    {
        return new BlockItem(block, properties).setRegistryName(block.getRegistryName());
    }
}
