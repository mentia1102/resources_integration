package com.mentia.integration.datagen;

import com.mentia.integration.block.ModBlocks;
import com.mentia.integration.tags.ModBlockTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Blocks;
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

        getOrCreateTagBuilder(ModBlockTags.BOARD_INTEGRATION)
                .add(Blocks.ACACIA_PLANKS)
                .add(Blocks.BIRCH_PLANKS)
                .add(Blocks.DARK_OAK_PLANKS)
                .add(Blocks.OAK_PLANKS)
                .add(Blocks.JUNGLE_PLANKS)
                .add(Blocks.SPRUCE_PLANKS)
//                .add(Blocks.CRIMSON_PLANKS)
//                .add(Blocks.WARPED_PLANKS)
                .add(Blocks.MANGROVE_PLANKS)
                .add(Blocks.BAMBOO_PLANKS)
                .add(Blocks.BAMBOO_MOSAIC);

                //.forceAddTag(BlockTags.PLANKS)//木板
                //.forceAddTag(BlockTags.WOODEN_SLABS)//木台阶
                //.forceAddTag(BlockTags.WOODEN_STAIRS)//木楼梯
                //.forceAddTag(BlockTags.WOODEN_TRAPDOORS)//木活板门
                //.forceAddTag(BlockTags.WOODEN_DOORS)//木门
                //.forceAddTag(BlockTags.WOODEN_BUTTONS)//木按钮
                //.forceAddTag(BlockTags.WOODEN_FENCES)//木栅栏
                //.forceAddTag(BlockTags.WOODEN_PRESSURE_PLATES)//木压力板
                //.forceAddTag(BlockTags.LOGS)//原木
                //.forceAddTag(BlockTags.SPRUCE_LOGS);//去皮原木
    }
}