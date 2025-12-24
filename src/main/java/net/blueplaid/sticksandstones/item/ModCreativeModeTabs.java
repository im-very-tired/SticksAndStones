package net.blueplaid.sticksandstones.item;

import net.blueplaid.sticksandstones.SticksAndStones;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SticksAndStones.MOD_ID);

    public static final Supplier<CreativeModeTab> STICK_AND_STONES_ITEMS = CREATIVE_MODE_TAB.register("sticks_and_stones_items",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Moditems.FIRESTARTER.get()))
                    .title(Component.translatable("creativetab.sticksandstonescrafting.items"))
                    .displayItems((itemDisplayParameters, output) -> {

                        output.accept(Moditems.FIRESTARTER);

                    }).build());

    public static final Supplier<CreativeModeTab> STICK_AND_STONES_METAL = CREATIVE_MODE_TAB.register("sticks_and_stones_metal",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Moditems.BRONZEINGOT.get()))
                    .title(Component.translatable("creativetab.sticksandstonescrafting.metal"))
                    .displayItems((itemDisplayParameters, output) -> {

                        output.accept(Moditems.BRONZEINGOT);
                        output.accept(Moditems.BLACKBRONZEINGOT);
                        output.accept(Moditems.TININGOT);
                        output.accept(Moditems.SILVERINGOT);

                    }).build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
