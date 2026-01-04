package net.blueplaid.sticksandstones.block;

import net.blueplaid.sticksandstones.SticksAndStones;
import net.blueplaid.sticksandstones.item.Moditems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class Modblocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(SticksAndStones.MOD_ID);

    public static final DeferredBlock<Block> WATTLE_AND_DAUB = registerBlock("daubedwattle",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1f).requiresCorrectToolForDrops().sound(SoundType.PACKED_MUD)));//my peanits

    public static final DeferredBlock<Block> WHITE_WATTLE_AND_DAUB = registerBlock("whitedaubedwattle",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1f).requiresCorrectToolForDrops().sound(SoundType.PACKED_MUD)));//whermst

    public static final DeferredBlock<Block> ORANGE_WATTLE_AND_DAUB = registerBlock("orangedaubedwattle",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1f).requiresCorrectToolForDrops().sound(SoundType.PACKED_MUD)));

    public static final DeferredBlock<Block> MAGENTA_WATTLE_AND_DAUB = registerBlock("magentadaubedwattle",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1f).requiresCorrectToolForDrops().sound(SoundType.PACKED_MUD)));

    public static final DeferredBlock<Block> LIGHT_BLUE_WATTLE_AND_DAUB = registerBlock("lightbluedaubedwattle",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1f).requiresCorrectToolForDrops().sound(SoundType.PACKED_MUD)));

    public static final DeferredBlock<Block> YELLOW_WATTLE_AND_DAUB = registerBlock("yellowdaubedwattle",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1f).requiresCorrectToolForDrops().sound(SoundType.PACKED_MUD)));

    public static final DeferredBlock<Block> LIME_WATTLE_AND_DAUB = registerBlock("limedaubedwattle",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1f).requiresCorrectToolForDrops().sound(SoundType.PACKED_MUD)));

    public static final DeferredBlock<Block> PINK_WATTLE_AND_DAUB = registerBlock("pinkdaubedwattle",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1f).requiresCorrectToolForDrops().sound(SoundType.PACKED_MUD)));

    public static final DeferredBlock<Block> GRAY_WATTLE_AND_DAUB = registerBlock("graydaubedwattle",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1f).requiresCorrectToolForDrops().sound(SoundType.PACKED_MUD)));

    public static final DeferredBlock<Block> LIGHT_GRAY_WATTLE_AND_DAUB = registerBlock("lightgraydaubedwattle",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1f).requiresCorrectToolForDrops().sound(SoundType.PACKED_MUD)));

    public static final DeferredBlock<Block> CYAN_WATTLE_AND_DAUB = registerBlock("cyandaubedwattle",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1f).requiresCorrectToolForDrops().sound(SoundType.PACKED_MUD)));

    public static final DeferredBlock<Block> PURPLE_WATTLE_AND_DAUB = registerBlock("purpledaubedwattle",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1f).requiresCorrectToolForDrops().sound(SoundType.PACKED_MUD)));

    public static final DeferredBlock<Block> BLUE_WATTLE_AND_DAUB = registerBlock("bluedaubedwattle",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1f).requiresCorrectToolForDrops().sound(SoundType.PACKED_MUD)));//blue dabadedabadie

    public static final DeferredBlock<Block> BROWN_WATTLE_AND_DAUB = registerBlock("browndaubedwattle",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1f).requiresCorrectToolForDrops().sound(SoundType.PACKED_MUD)));

    public static final DeferredBlock<Block> GREEN_WATTLE_AND_DAUB = registerBlock("greendaubedwattle",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1f).requiresCorrectToolForDrops().sound(SoundType.PACKED_MUD)));

    public static final DeferredBlock<Block> RED_WATTLE_AND_DAUB = registerBlock("reddaubedwattle",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1f).requiresCorrectToolForDrops().sound(SoundType.PACKED_MUD)));

    public static final DeferredBlock<Block> BLACK_WATTLE_AND_DAUB = registerBlock("blackdaubedwattle",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1f).requiresCorrectToolForDrops().sound(SoundType.PACKED_MUD)));

    public static final DeferredBlock<Block> BRONZE_BLOCK = registerBlock("bronze_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.COPPER)));

    public static final DeferredBlock<Block> BLACKBRONZE_BLOCK = registerBlock("blackbronze_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.COPPER)));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block){
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        Moditems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
