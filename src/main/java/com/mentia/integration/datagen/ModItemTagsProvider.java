package com.mentia.integration.datagen;

import com.mentia.integration.item.ModItems;
import com.mentia.integration.tags.ModItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends FabricTagProvider.ItemTagProvider {

    public ModItemTagsProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }
    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        //木料资源可替换木板进行合成
        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(ModItems.BOARD_RESOURCE);
        //石料资源代替圆石进行合成
        getOrCreateTagBuilder(ItemTags.STONE_CRAFTING_MATERIALS)
                .add(ModItems.STONE_RESOURCE);
        getOrCreateTagBuilder(ItemTags.STONE_TOOL_MATERIALS)
                .add(ModItems.STONE_RESOURCE);
        //下届木料资源可替换下届木板进行合成

        getOrCreateTagBuilder(ModItemTags.Resource)
                .add(ModItems.BOARD_RESOURCE)
                .add(ModItems.STONE_RESOURCE)
                .add(ModItems.NETHER_BOARD_RESOURCE)
                .add(ModItems.NETHER_STONE_RESOURCE)
                .add(ModItems.END_STONE_RESOURCE);

    }
}
