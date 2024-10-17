package org.zombie.angelring;

import org.zombie.angelring.accessory.AngelRingAccessory;
import org.zombie.angelring.items.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.world.item.CreativeModeTabs;

public final class FabricLibMod implements ModInitializer {

    @Override
    public void onInitialize() {
        CommonMod.init();
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT).register(entries -> entries.accept(ModItems.ANGEL_RING.get()));
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT).register(entries -> entries.accept(ModItems.DIAMOND_RING.get()));
        AngelRingAccessory.init();
    }
}