/* =====================================================================
 * This class is distributed as part of the Bovine Mod.
 * Get the Source Code on github: https://github.com/Modding-Plus/Bovine
 *
 * Bovine is Open Source and distributed under the
 * MIT License: https://opensource.org/licenses/MIT
 *
 * File: BovineObjects.java
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
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BovineObjects
{
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Bovine.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Bovine.MOD_ID);
    public static final DeferredRegister<EntityType<?>> ENTITIES = new DeferredRegister<>(ForgeRegistries.ENTITIES, Bovine.MOD_ID);

    public static final RegistryObject<Block> ALLIUM_BULB = registerBlock(
            "allium_bulb",
            new AlliumBulbBlock(),
            new Item.Properties().group(Bovine.ITEM_GROUP)
    );
    public static final RegistryObject<Item> ALLIUM_AFRO = registerItem(
            "allium_afro",
            new AlliumAfroItem()
    );
    private static final EntityType<AlliumooEntity> ALLIUMOO_ENTITY_TYPE = EntityType.Builder.create(AlliumooEntity::new, EntityClassification.CREATURE).build(Bovine.MOD_ID + ":alliumoo");
    public static final RegistryObject<EntityType<AlliumooEntity>> ALLIUMOO = registerEntity(
            "alliumoo",
            ALLIUMOO_ENTITY_TYPE
    );
    public static final RegistryObject<Item> ALLIUMOO_SPAWN_EGG = registerItem(
            "alliumoo_spawn_egg",
            new SpawnEggItem(
                    ALLIUMOO_ENTITY_TYPE,
                    0x461e66,
                    0xd2a6f6,
                    new Item.Properties().group(Bovine.ITEM_GROUP)
            )
    );

    public static void register()
    {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ENTITIES.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    private static RegistryObject<Block> registerBlock(String name, Block block, Properties properties)
    {
        ITEMS.register(name, () -> new BlockItem(block, properties));
        return BLOCKS.register(name, () -> block);
    }

    private static RegistryObject<Item> registerItem(String name, Item item)
    {
        return ITEMS.register(name, () -> item);
    }

    private static <T extends Entity> RegistryObject<EntityType<T>> registerEntity(String name, EntityType<T> entityType)
    {
        return ENTITIES.register(name, () -> entityType);
    }

    public static void onEntityWorldSpawnRegistry(RegistryEvent.Register<EntityType<?>> event)
    {
        Biomes.PLAINS.getSpawns(ALLIUMOO_ENTITY_TYPE.getClassification()).add(new Biome.SpawnListEntry(ALLIUMOO_ENTITY_TYPE, 10, 1, 10));
    }
}
