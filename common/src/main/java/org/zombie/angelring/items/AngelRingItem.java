package org.zombie.angelring.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import org.jetbrains.annotations.NotNull;

public class AngelRingItem extends Item {

    public AngelRingItem() {
        super(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC).fireResistant());
    }

    @Override
    public boolean isFoil(@NotNull ItemStack stack) {
        return false;
    }

//    @Override
//    public boolean isValidRepairItem(@NotNull ItemStack stack, ItemStack ingredient) {
//        return ingredient.is(CommonMod.RING_REPAIR);
//    }
}
