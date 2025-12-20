package net.blueplaid.sticksandstones.item;

import net.blueplaid.sticksandstones.SticksAndStones;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class Moditems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SticksAndStones.MOD_ID);

    public static final DeferredItem<Item> BRONZEINGOT = ITEMS.register("bronzeingot",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> BLACKBRONZEINGOT = ITEMS.register("blackbronzeingot",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> TININGOT = ITEMS.register("tiningot",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
