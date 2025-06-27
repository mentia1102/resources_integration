package com.mentia.integration.datagen;

import com.mentia.integration.block.ModBlocks;
import com.mentia.integration.tags.ModBlockTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends FabricTagProvider.BlockTagProvider{

    public ModBlockTagsProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output,registriesFuture);
    }
    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.RESOURCE_TABLE);

        getOrCreateTagBuilder(ModBlockTags.BOARD_RESOURCE)
                .forceAddTag(BlockTags.PLANKS)
                .forceAddTag(BlockTags.WOODEN_SLABS)
                .forceAddTag(BlockTags.WOODEN_STAIRS)
                .forceAddTag(BlockTags.WOODEN_TRAPDOORS)
                .forceAddTag(BlockTags.WOODEN_DOORS)
                .forceAddTag(BlockTags.WOODEN_BUTTONS)
                .forceAddTag(BlockTags.WOODEN_FENCES)
                .forceAddTag(BlockTags.WOODEN_PRESSURE_PLATES)
                .forceAddTag(BlockTags.LOGS);
    }
}