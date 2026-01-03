package net.blueplaid.sticksandstones.util;

import net.blueplaid.sticksandstones.SticksAndStones;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class Modtags {
    public static class Blocks {

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(SticksAndStones.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> DAUBED_WATTLES = createTag("wattle_and_daub");

        private static TagKey<Item> createTag( String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(SticksAndStones.MOD_ID, name));
        }
    }
}
