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
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RegistryHandler {

    @SubscribeEvent
    public static void onBlockRegistry(RegistryEvent.Register<Block> event) {
        IForgeRegistry<Block> registry = event.getRegistry();

        registry.register(new AlliumBulbBlock());
    }

    @SubscribeEvent
    public static void onItemRegistry(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();

        registry.register(createItemFromBlock(BovineObjects.Blocks.ALLIUM_BULB, new Item.Properties().group(Bovine.ITEM_GROUP)));
        registry.register(new AlliumAfroItem());
    }

    private static Item createItemFromBlock(Block block, Item.Properties properties) {
        return new BlockItem(block, properties).setRegistryName(block.getRegistryName());
    }
}
