package com.mentia.integration.item;

import com.mentia.integration.ResourcesIntegration;
import com.mentia.integration.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;


public class ModItemGroup {
    public static final ItemGroup TEST_GROUP= Registry.register(Registries.ITEM_GROUP,
            new Identifier(ResourcesIntegration.MOD_ID, "resource_integration"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.test_group")).icon(
                    ()->new ItemStack(ModBlocks.RESOURCE_TABLE)).entries((displayContext, entries) -> {
                entries.add(ModItems.BOARD_RESOURCE);
                entries.add(ModBlocks.RESOURCE_TABLE);
                entries.add(ModItems.STONE_RESOURCE);
                entries.add(ModItems.NETHER_STONE_RESOURCE);
                entries.add(ModItems.END_STONE_RESOURCE);
                entries.add(ModItems.NETHER_BOARD_RESOURCE);
            }).build());

    public static void registerItemGroup() {

    }
}
