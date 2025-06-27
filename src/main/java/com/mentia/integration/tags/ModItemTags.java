package com.mentia.integration.tags;

import com.mentia.integration.ResourcesIntegration;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModItemTags {
    public static final TagKey<Item> BOARD_RESOURCE=of("board_source");
    public static final TagKey<Item> STONE_RESOURCE=of("stone_resource");
    public static final TagKey<Item> Resource=of("resource");
    private static TagKey<Item> of(String id) {
        return TagKey.of(RegistryKeys.ITEM, new Identifier(ResourcesIntegration.MOD_ID,id));
    }
}
