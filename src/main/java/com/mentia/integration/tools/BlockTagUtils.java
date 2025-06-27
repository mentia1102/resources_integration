package com.mentia.integration.tools;

import net.minecraft.block.Block;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.Collection;
import java.util.Collections;

public class BlockTagUtils {
    /**
     * 获取指定方块标签包含的所有方块
     * @param tagKey 方块标签键
     * @return 包含所有匹配方块的不可变集合，若标签不存在则返回空集合
     */
    public static Collection<Block> getBlocksInTag(TagKey<Block> tagKey) {
        return Registries.BLOCK.getOrCreateEntryList(tagKey)
                .stream()
                .map(entry -> entry.value())
                .toList();
    }



}