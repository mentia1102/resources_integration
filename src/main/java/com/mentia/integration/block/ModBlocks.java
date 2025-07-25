package com.mentia.integration.block;


import com.mentia.integration.ResourcesIntegration;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block RESOURCE_TABLE= registerBlocks("resource_table",new Block(AbstractBlock.Settings.copy(Blocks.STONE)));

    private static Block registerBlocks(String name, Block block) {
        registerBlockItems(name, block);
        return Registry.register(Registries.BLOCK,new Identifier(ResourcesIntegration.MOD_ID, name),block);
    }

    private static Item registerBlockItems(String name, Block block) {
        return Registry.register(Registries.ITEM,new Identifier(ResourcesIntegration.MOD_ID,name),
                new BlockItem(block,new FabricItemSettings()));
    }

    public static void registerModBlocks() {

    }
}
