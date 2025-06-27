package com.mentia.integration.tags;

import com.mentia.integration.ResourcesIntegration;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModBlockTags {
    public static final TagKey<Block> RESOURCE_TABLE=of("resource_table");
    public static final TagKey<Block> BOARD_RESOURCE=of("board_source");//所有该标签的方块破坏后掉落木料资源
    private static TagKey<Block> of(String id) {
        return TagKey.of(RegistryKeys.BLOCK, new Identifier(ResourcesIntegration.MOD_ID,id));
    }
}
