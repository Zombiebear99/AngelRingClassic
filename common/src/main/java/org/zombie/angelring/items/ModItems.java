package org.zombie.angelring.items;

import net.minecraft.world.item.Rarity;
import org.zombie.angelring.CommonMod;
import net.minecraft.world.item.Item;

import java.util.function.Supplier;

public record ModItems() implements CommonItemRegistryInterface {
    public static final Supplier<Item> ANGEL_RING = CommonItemRegistryInterface.registerItem(CommonMod.MOD_ID, "angelring",
            AngelRingItem::new);

    public static final Supplier<Item> DIAMOND_RING = CommonItemRegistryInterface.registerItem(CommonMod.MOD_ID, "diamondring",
            DiamondRingItem::new);

    public static void init() {
    }
}
