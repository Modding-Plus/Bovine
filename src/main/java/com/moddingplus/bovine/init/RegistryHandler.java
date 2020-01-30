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
package com.moddingplus.bovine.init;

import com.moddingplus.bovine.Bovine;
import com.moddingplus.bovine.block.AlliumBulbBlock;
import com.moddingplus.bovine.entity.AlliumooEntity;
import com.moddingplus.bovine.item.AlliumAfroItem;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
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

    private static EntityType<?> ALLIUMOO = EntityType.Builder.create(AlliumooEntity::new, EntityClassification.CREATURE)
            .build(Bovine.MOD_ID + ":alliumoo").setRegistryName(Bovine.MOD_ID, "alliumoo");

    @SubscribeEvent
    public static void onItemRegistry(RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll(
                createItemFromBlock(BovineObjects.Blocks.ALLIUM_BULB, new Item.Properties().group(Bovine.ITEM_GROUP)),
                new AlliumAfroItem(),
                new SpawnEggItem(
                        ALLIUMOO,
                        0x461e66,
                        0xd2a6f6,
                        new Item.Properties().group(Bovine.ITEM_GROUP)
                ).setRegistryName(Bovine.MOD_ID, "alliumoo_spawn_egg")
        );
    }

    @SubscribeEvent
    public static void onEntityRegistry(RegistryEvent.Register<EntityType<?>> event)
    {
        event.getRegistry().registerAll(
                ALLIUMOO
        );

        onEntityWorldSpawnRegistry();
    }

    private static void onEntityWorldSpawnRegistry()
    {
        Biomes.PLAINS.getSpawns(ALLIUMOO.getClassification()).add(new Biome.SpawnListEntry(ALLIUMOO, 10, 1, 10));
    }

    private static Item createItemFromBlock(Block block, Item.Properties properties)
    {
        return new BlockItem(block, properties).setRegistryName(block.getRegistryName());
    }
}
