package org.zombie.angelring.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import org.jetbrains.annotations.NotNull;

public class DiamondRingItem extends Item {

    public DiamondRingItem() {
        super(new Properties().stacksTo(1).rarity(Rarity.EPIC).fireResistant());
    }

    @Override
    public boolean isFoil(@NotNull ItemStack stack) {
        return false;
    }

}
