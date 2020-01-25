package com.moddingplus.bovine.item;

import com.moddingplus.bovine.Bovine;
import com.moddingplus.bovine.registry.BovineArmorMaterials;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;

public class AlliumAfroItem extends ArmorItem {

    public AlliumAfroItem() {
        super(BovineArmorMaterials.ALLIUM_AFRO, EquipmentSlotType.HEAD, new Item.Properties().group(Bovine.ITEM_GROUP));
        setRegistryName(Bovine.MOD_ID, "allium_afro");
    }
}
