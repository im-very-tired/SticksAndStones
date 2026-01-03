package net.blueplaid.sticksandstones.item;

import net.blueplaid.sticksandstones.SticksAndStones;
import net.blueplaid.sticksandstones.block.Modblocks;
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
    public static final Supplier<CreativeModeTab> STICK_AND_STONES_BLOCKS = CREATIVE_MODE_TAB.register("sticks_and_stones_blocks",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Modblocks.WATTLE_AND_DAUB.get()))
                    .title(Component.translatable("creativetab.sticksandstonescrafting.blocks"))
                    .displayItems((itemDisplayParameters, output) -> {

                        output.accept(Modblocks.WATTLE_AND_DAUB);
                        output.accept(Modblocks.WHITE_WATTLE_AND_DAUB);
                        output.accept(Modblocks.LIGHT_GRAY_WATTLE_AND_DAUB);
                        output.accept(Modblocks.GRAY_WATTLE_AND_DAUB);
                        output.accept(Modblocks.BLACK_WATTLE_AND_DAUB);
                        output.accept(Modblocks.BROWN_WATTLE_AND_DAUB);
                        output.accept(Modblocks.RED_WATTLE_AND_DAUB);
                        output.accept(Modblocks.ORANGE_WATTLE_AND_DAUB);
                        output.accept(Modblocks.YELLOW_WATTLE_AND_DAUB);
                        output.accept(Modblocks.LIME_WATTLE_AND_DAUB);
                        output.accept(Modblocks.GREEN_WATTLE_AND_DAUB);
                        output.accept(Modblocks.CYAN_WATTLE_AND_DAUB);
                        output.accept(Modblocks.LIGHT_BLUE_WATTLE_AND_DAUB);
                        output.accept(Modblocks.BLUE_WATTLE_AND_DAUB);
                        output.accept(Modblocks.PURPLE_WATTLE_AND_DAUB);
                        output.accept(Modblocks.MAGENTA_WATTLE_AND_DAUB);
                        output.accept(Modblocks.PINK_WATTLE_AND_DAUB);

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