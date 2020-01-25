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
package com.moddingplus.bovine.registry;

import com.moddingplus.bovine.Bovine;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.registries.ObjectHolder;

import javax.annotation.Nonnull;

public class BovineObjects
{
    @SuppressWarnings("ConstantConditions")
    @Nonnull
    private static <T> T sneakyNull()
    {
        return null;
    }

    @ObjectHolder(Bovine.MOD_ID)
    public static class Blocks
    {
        public static final Block ALLIUM_BULB = sneakyNull();
    }

    @ObjectHolder(Bovine.MOD_ID)
    public static class Items
    {
        public static final Item ALLIUM_BULB = sneakyNull();

        public static final Item ALLIUM_AFRO = sneakyNull();
    }
}
