package com.mentia.integration.datagen;

import com.mentia.integration.block.ModBlocks;
import com.mentia.integration.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {

    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.RESOURCE_TABLE);
        //木板
        addDrop(Blocks.OAK_PLANKS,resourceDrops(Blocks.OAK_PLANKS,ModItems.BOARD_RESOURCE,1.0f));
        addDrop(Blocks.SPRUCE_PLANKS,resourceDrops(Blocks.SPRUCE_PLANKS,ModItems.BOARD_RESOURCE,1.0f));
        addDrop(Blocks.BIRCH_PLANKS,resourceDrops(Blocks.BIRCH_PLANKS,ModItems.BOARD_RESOURCE,1.0f));
        addDrop(Blocks.JUNGLE_PLANKS,resourceDrops(Blocks.JUNGLE_PLANKS,ModItems.BOARD_RESOURCE,1.0f));
        addDrop(Blocks.ACACIA_PLANKS,resourceDrops(Blocks.ACACIA_PLANKS,ModItems.BOARD_RESOURCE,1.0f));
        addDrop(Blocks.DARK_OAK_PLANKS,resourceDrops(Blocks.DARK_OAK_PLANKS,ModItems.BOARD_RESOURCE,1.0f));
        addDrop(Blocks.MANGROVE_PLANKS,resourceDrops(Blocks.MANGROVE_PLANKS,ModItems.BOARD_RESOURCE,1.0f));
        addDrop(Blocks.CHERRY_PLANKS,resourceDrops(Blocks.CHERRY_PLANKS,ModItems.BOARD_RESOURCE,1.0f));
        addDrop(Blocks.BAMBOO_MOSAIC,resourceDrops(Blocks.BAMBOO_MOSAIC,ModItems.BOARD_RESOURCE,1.0f));
        addDrop(Blocks.BAMBOO_PLANKS,resourceDrops(Blocks.BAMBOO_PLANKS,ModItems.BOARD_RESOURCE,1.0f));
        addDrop(Blocks.CRIMSON_PLANKS,resourceDrops(Blocks.CRIMSON_PLANKS,ModItems.NETHER_BOARD_RESOURCE,1.0f));
        addDrop(Blocks.WARPED_PLANKS,resourceDrops(Blocks.WARPED_PLANKS,ModItems.NETHER_BOARD_RESOURCE,1.0f));
        //原木
        addDrop(Blocks.OAK_LOG,resourceDrops(Blocks.OAK_LOG,ModItems.BOARD_RESOURCE,4.0f));
        addDrop(Blocks.SPRUCE_LOG,resourceDrops(Blocks.SPRUCE_LOG,ModItems.BOARD_RESOURCE,4.0f));
        addDrop(Blocks.BIRCH_LOG,resourceDrops(Blocks.BIRCH_LOG,ModItems.BOARD_RESOURCE,4.0f));
        addDrop(Blocks.JUNGLE_LOG,resourceDrops(Blocks.JUNGLE_LOG,ModItems.BOARD_RESOURCE,4.0f));
        addDrop(Blocks.ACACIA_LOG,resourceDrops(Blocks.ACACIA_LOG,ModItems.BOARD_RESOURCE,4.0f));
        addDrop(Blocks.DARK_OAK_LOG,resourceDrops(Blocks.DARK_OAK_LOG,ModItems.BOARD_RESOURCE,4.0f));
        addDrop(Blocks.MANGROVE_LOG,resourceDrops(Blocks.MANGROVE_LOG,ModItems.BOARD_RESOURCE,4.0f));
        addDrop(Blocks.MANGROVE_ROOTS,resourceDrops(Blocks.MANGROVE_ROOTS,ModItems.BOARD_RESOURCE,4.0f));
        addDrop(Blocks.CHERRY_LOG,resourceDrops(Blocks.CHERRY_LOG,ModItems.BOARD_RESOURCE,4.0f));
        addDrop(Blocks.BAMBOO_BLOCK,resourceDrops(Blocks.BAMBOO_BLOCK,ModItems.BOARD_RESOURCE,4.0f));
        addDrop(Blocks.CRIMSON_STEM,resourceDrops(Blocks.CRIMSON_STEM,ModItems.NETHER_BOARD_RESOURCE,4.0f));
        addDrop(Blocks.WARPED_STEM,resourceDrops(Blocks.WARPED_STEM,ModItems.NETHER_BOARD_RESOURCE,4.0f));
        //木
        addDrop(Blocks.OAK_WOOD,resourceDrops(Blocks.OAK_WOOD,ModItems.BOARD_RESOURCE,4.0f));
        addDrop(Blocks.SPRUCE_WOOD,resourceDrops(Blocks.SPRUCE_WOOD,ModItems.BOARD_RESOURCE,4.0f));
        addDrop(Blocks.BIRCH_WOOD,resourceDrops(Blocks.BIRCH_WOOD,ModItems.BOARD_RESOURCE,4.0f));
        addDrop(Blocks.JUNGLE_WOOD,resourceDrops(Blocks.JUNGLE_WOOD,ModItems.BOARD_RESOURCE,4.0f));
        addDrop(Blocks.ACACIA_WOOD,resourceDrops(Blocks.ACACIA_WOOD,ModItems.BOARD_RESOURCE,4.0f));
        addDrop(Blocks.DARK_OAK_WOOD,resourceDrops(Blocks.DARK_OAK_WOOD,ModItems.BOARD_RESOURCE,4.0f));
        addDrop(Blocks.MANGROVE_WOOD,resourceDrops(Blocks.MANGROVE_WOOD,ModItems.BOARD_RESOURCE,4.0f));
        addDrop(Blocks.CHERRY_WOOD,resourceDrops(Blocks.CHERRY_WOOD,ModItems.BOARD_RESOURCE,4.0f));
        addDrop(Blocks.CRIMSON_HYPHAE,resourceDrops(Blocks.CRIMSON_HYPHAE,ModItems.NETHER_BOARD_RESOURCE,4.0f));
        addDrop(Blocks.WARPED_HYPHAE,resourceDrops(Blocks.WARPED_HYPHAE,ModItems.NETHER_BOARD_RESOURCE,4.0f));
        //去皮原木
        addDrop(Blocks.STRIPPED_OAK_LOG,resourceDrops(Blocks.STRIPPED_OAK_LOG,ModItems.BOARD_RESOURCE,4.0f));
        addDrop(Blocks.STRIPPED_MANGROVE_LOG,resourceDrops(Blocks.STRIPPED_MANGROVE_LOG,ModItems.BOARD_RESOURCE,4.0f));
        addDrop(Blocks.STRIPPED_BIRCH_LOG,resourceDrops(Blocks.STRIPPED_BIRCH_LOG,ModItems.BOARD_RESOURCE,4.0f));
        addDrop(Blocks.STRIPPED_SPRUCE_LOG,resourceDrops(Blocks.STRIPPED_SPRUCE_LOG,ModItems.BOARD_RESOURCE,4.0f));
        addDrop(Blocks.STRIPPED_JUNGLE_LOG,resourceDrops(Blocks.STRIPPED_JUNGLE_LOG,ModItems.BOARD_RESOURCE,4.0f));
        addDrop(Blocks.STRIPPED_ACACIA_LOG,resourceDrops(Blocks.STRIPPED_ACACIA_LOG,ModItems.BOARD_RESOURCE,4.0f));
        addDrop(Blocks.STRIPPED_DARK_OAK_LOG,resourceDrops(Blocks.STRIPPED_DARK_OAK_LOG,ModItems.BOARD_RESOURCE,4.0f));
        addDrop(Blocks.STRIPPED_CHERRY_LOG,resourceDrops(Blocks.STRIPPED_BIRCH_LOG,ModItems.BOARD_RESOURCE,4.0f));
        addDrop(Blocks.STRIPPED_BAMBOO_BLOCK,resourceDrops(Blocks.STRIPPED_BAMBOO_BLOCK,ModItems.BOARD_RESOURCE,4.0f));
        addDrop(Blocks.STRIPPED_CRIMSON_STEM,resourceDrops(Blocks.STRIPPED_CRIMSON_STEM,ModItems.NETHER_BOARD_RESOURCE,4.0f));
        addDrop(Blocks.STRIPPED_WARPED_STEM,resourceDrops(Blocks.STRIPPED_WARPED_STEM,ModItems.NETHER_BOARD_RESOURCE,4.0f));
        //去皮木
        addDrop(Blocks.STRIPPED_MANGROVE_WOOD,resourceDrops(Blocks.STRIPPED_MANGROVE_WOOD,ModItems.BOARD_RESOURCE,4.0f));
        addDrop(Blocks.STRIPPED_OAK_WOOD,resourceDrops(Blocks.STRIPPED_OAK_LOG,ModItems.BOARD_RESOURCE,4.0f));
        addDrop(Blocks.STRIPPED_BIRCH_WOOD,resourceDrops(Blocks.STRIPPED_BIRCH_LOG,ModItems.BOARD_RESOURCE,4.0f));
        addDrop(Blocks.STRIPPED_SPRUCE_WOOD,resourceDrops(Blocks.STRIPPED_SPRUCE_LOG,ModItems.BOARD_RESOURCE,4.0f));
        addDrop(Blocks.STRIPPED_JUNGLE_WOOD,resourceDrops(Blocks.STRIPPED_JUNGLE_LOG,ModItems.BOARD_RESOURCE,4.0f));
        addDrop(Blocks.STRIPPED_ACACIA_WOOD,resourceDrops(Blocks.STRIPPED_ACACIA_LOG,ModItems.BOARD_RESOURCE,4.0f));
        addDrop(Blocks.STRIPPED_DARK_OAK_WOOD,resourceDrops(Blocks.STRIPPED_DARK_OAK_LOG,ModItems.BOARD_RESOURCE,4.0f));
        addDrop(Blocks.STRIPPED_CHERRY_WOOD,resourceDrops(Blocks.STRIPPED_CHERRY_LOG,ModItems.BOARD_RESOURCE,4.0f));
        addDrop(Blocks.STRIPPED_CRIMSON_HYPHAE,resourceDrops(Blocks.STRIPPED_CRIMSON_STEM,ModItems.NETHER_BOARD_RESOURCE,4.0f));
        addDrop(Blocks.STRIPPED_WARPED_HYPHAE,resourceDrops(Blocks.STRIPPED_WARPED_STEM,ModItems.NETHER_BOARD_RESOURCE,4.0f));
        //木楼梯
        addDrop(Blocks.OAK_STAIRS,resourceDrops(Blocks.OAK_PLANKS,ModItems.BOARD_RESOURCE,1.0f));
        addDrop(Blocks.SPRUCE_STAIRS,resourceDrops(Blocks.SPRUCE_PLANKS,ModItems.BOARD_RESOURCE,1.0f));
        addDrop(Blocks.BIRCH_STAIRS,resourceDrops(Blocks.BIRCH_PLANKS,ModItems.BOARD_RESOURCE,1.0f));
        addDrop(Blocks.JUNGLE_STAIRS,resourceDrops(Blocks.JUNGLE_PLANKS,ModItems.BOARD_RESOURCE,1.0f));
        addDrop(Blocks.ACACIA_STAIRS,resourceDrops(Blocks.ACACIA_PLANKS,ModItems.BOARD_RESOURCE,1.0f));
        addDrop(Blocks.DARK_OAK_STAIRS,resourceDrops(Blocks.DARK_OAK_PLANKS,ModItems.BOARD_RESOURCE,1.0f));
        addDrop(Blocks.MANGROVE_STAIRS,resourceDrops(Blocks.MANGROVE_PLANKS,ModItems.BOARD_RESOURCE,1.0f));
        addDrop(Blocks.CHERRY_STAIRS,resourceDrops(Blocks.CHERRY_PLANKS,ModItems.BOARD_RESOURCE,1.0f));
        addDrop(Blocks.BAMBOO_STAIRS,resourceDrops(Blocks.BAMBOO_PLANKS,ModItems.BOARD_RESOURCE,1.0f));
        addDrop(Blocks.BAMBOO_MOSAIC_STAIRS,resourceDrops(Blocks.BAMBOO_PLANKS,ModItems.BOARD_RESOURCE,1.0f));
        addDrop(Blocks.CRIMSON_STAIRS,resourceDrops(Blocks.CRIMSON_PLANKS,ModItems.NETHER_BOARD_RESOURCE,1.0f));
        addDrop(Blocks.WARPED_STAIRS,resourceDrops(Blocks.WARPED_PLANKS,ModItems.NETHER_BOARD_RESOURCE,1.0f));
        //木台阶
        addDrop(Blocks.DARK_OAK_SLAB,resourceDrops(Blocks.DARK_OAK_PLANKS,ModItems.BOARD_RESOURCE,1.0f));
        addDrop(Blocks.MANGROVE_SLAB,resourceDrops(Blocks.MANGROVE_PLANKS,ModItems.BOARD_RESOURCE,1.0f));
        addDrop(Blocks.BIRCH_SLAB,resourceDrops(Blocks.BIRCH_PLANKS,ModItems.BOARD_RESOURCE,1.0f));
        addDrop(Blocks.OAK_SLAB,resourceDrops(Blocks.OAK_PLANKS,ModItems.BOARD_RESOURCE,1.0f));
        addDrop(Blocks.SPRUCE_SLAB,resourceDrops(Blocks.SPRUCE_PLANKS,ModItems.BOARD_RESOURCE,1.0f));
        addDrop(Blocks.ACACIA_SLAB,resourceDrops(Blocks.ACACIA_PLANKS,ModItems.BOARD_RESOURCE,1.0f));
        addDrop(Blocks.JUNGLE_SLAB,resourceDrops(Blocks.JUNGLE_PLANKS,ModItems.BOARD_RESOURCE,1.0f));
        addDrop(Blocks.CHERRY_SLAB,resourceDrops(Blocks.CHERRY_PLANKS,ModItems.BOARD_RESOURCE,1.0f));
        addDrop(Blocks.BAMBOO_SLAB,resourceDrops(Blocks.BAMBOO,ModItems.BOARD_RESOURCE,1.0f));
        addDrop(Blocks.BAMBOO_MOSAIC_SLAB,resourceDrops(Blocks.BAMBOO_MOSAIC,ModItems.BOARD_RESOURCE,1.0f));
        addDrop(Blocks.CRIMSON_SLAB,resourceDrops(Blocks.CRIMSON_PLANKS,ModItems.NETHER_BOARD_RESOURCE,1.0f));
        addDrop(Blocks.WARPED_SLAB,resourceDrops(Blocks.WARPED_PLANKS,ModItems.NETHER_BOARD_RESOURCE,1.0f));
        //木栅栏
        addDrop(Blocks.ACACIA_FENCE,resourceDrops(Blocks.ACACIA_PLANKS,ModItems.BOARD_RESOURCE,1.0f));
        addDrop(Blocks.JUNGLE_FENCE,resourceDrops(Blocks.JUNGLE_PLANKS,ModItems.BOARD_RESOURCE,1.0f));
        addDrop(Blocks.BIRCH_FENCE,resourceDrops(Blocks.BIRCH_PLANKS,ModItems.BOARD_RESOURCE,1.0f));
        addDrop(Blocks.OAK_FENCE,resourceDrops(Blocks.OAK_PLANKS,ModItems.BOARD_RESOURCE,1.0f));
        addDrop(Blocks.DARK_OAK_FENCE,resourceDrops(Blocks.DARK_OAK_PLANKS,ModItems.BOARD_RESOURCE,1.0f));
        addDrop(Blocks.SPRUCE_FENCE,resourceDrops(Blocks.SPRUCE_PLANKS,ModItems.BOARD_RESOURCE,1.0f));
        addDrop(Blocks.CHERRY_FENCE,resourceDrops(Blocks.CHERRY_PLANKS,ModItems.BOARD_RESOURCE,1.0f));
        addDrop(Blocks.BAMBOO_FENCE,resourceDrops(Blocks.BAMBOO_PLANKS,ModItems.BOARD_RESOURCE,1.0f));
        addDrop(Blocks.MANGROVE_FENCE,resourceDrops(Blocks.MANGROVE_PLANKS,ModItems.BOARD_RESOURCE,1.0f));
        addDrop(Blocks.CRIMSON_FENCE,resourceDrops(Blocks.CRIMSON_PLANKS,ModItems.NETHER_BOARD_RESOURCE,1.0f));
        addDrop(Blocks.WARPED_FENCE,resourceDrops(Blocks.WARPED_PLANKS,ModItems.NETHER_BOARD_RESOURCE,1.0f));
        //木栅栏门
        addDrop(Blocks.OAK_FENCE_GATE,resourceDrops(Blocks.OAK_PLANKS,ModItems.BOARD_RESOURCE,1.0f));
        addDrop(Blocks.MANGROVE_FENCE_GATE,resourceDrops(Blocks.MANGROVE_PLANKS,ModItems.BOARD_RESOURCE,1.0f));
        addDrop(Blocks.BIRCH_FENCE_GATE,resourceDrops(Blocks.BIRCH_PLANKS,ModItems.BOARD_RESOURCE,1.0f));
        addDrop(Blocks.SPRUCE_FENCE_GATE,resourceDrops(Blocks.SPRUCE_PLANKS,ModItems.BOARD_RESOURCE,1.0f));
        addDrop(Blocks.DARK_OAK_FENCE_GATE,resourceDrops(Blocks.DARK_OAK_PLANKS,ModItems.BOARD_RESOURCE,1.0f));
        addDrop(Blocks.ACACIA_FENCE_GATE,resourceDrops(Blocks.ACACIA_PLANKS,ModItems.BOARD_RESOURCE,1.0f));
        addDrop(Blocks.JUNGLE_FENCE_GATE,resourceDrops(Blocks.JUNGLE_PLANKS,ModItems.BOARD_RESOURCE,1.0f));
        addDrop(Blocks.CHERRY_FENCE_GATE,resourceDrops(Blocks.CHERRY_PLANKS,ModItems.BOARD_RESOURCE,1.0f));
        addDrop(Blocks.BAMBOO_FENCE_GATE,resourceDrops(Blocks.BAMBOO_PLANKS,ModItems.BOARD_RESOURCE,1.0f));
        addDrop(Blocks.CRIMSON_FENCE_GATE,resourceDrops(Blocks.CRIMSON_PLANKS,ModItems.NETHER_BOARD_RESOURCE,1.0f));
        addDrop(Blocks.WARPED_FENCE_GATE,resourceDrops(Blocks.WARPED_PLANKS,ModItems.NETHER_BOARD_RESOURCE,1.0f));

        //木按钮
        addDrop(Blocks.OAK_BUTTON,resourceDrops(Blocks.OAK_PLANKS,ModItems.BOARD_RESOURCE,1.0f));
        addDrop(Blocks.SPRUCE_BUTTON,resourceDrops(Blocks.SPRUCE_PLANKS,ModItems.BOARD_RESOURCE,1.0f));
        addDrop(Blocks.BIRCH_BUTTON,resourceDrops(Blocks.BIRCH_PLANKS,ModItems.BOARD_RESOURCE,1.0f));
        addDrop(Blocks.JUNGLE_BUTTON,resourceDrops(Blocks.JUNGLE_PLANKS,ModItems.BOARD_RESOURCE,1.0f));
        addDrop(Blocks.BAMBOO_BUTTON,resourceDrops(Blocks.BAMBOO_PLANKS,ModItems.BOARD_RESOURCE,1.0f));
        addDrop(Blocks.ACACIA_BUTTON,resourceDrops(Blocks.ACACIA_PLANKS,ModItems.BOARD_RESOURCE,1.0f));
        addDrop(Blocks.DARK_OAK_BUTTON,resourceDrops(Blocks.DARK_OAK_PLANKS,ModItems.BOARD_RESOURCE,1.0f));
        addDrop(Blocks.MANGROVE_BUTTON,resourceDrops(Blocks.MANGROVE_PLANKS,ModItems.BOARD_RESOURCE,1.0f));
        addDrop(Blocks.CHERRY_BUTTON,resourceDrops(Blocks.CHERRY_PLANKS,ModItems.BOARD_RESOURCE,1.0f));
        addDrop(Blocks.CRIMSON_BUTTON,resourceDrops(Blocks.CRIMSON_PLANKS,ModItems.NETHER_BOARD_RESOURCE,1.0f));
        addDrop(Blocks.WARPED_BUTTON,resourceDrops(Blocks.WARPED_PLANKS,ModItems.NETHER_BOARD_RESOURCE,1.0f));
        //木压力板
        //木门
        //木活板门

        //圆石相关
        addDrop(Blocks.STONE,resourceDrops(Blocks.STONE,ModItems.STONE_RESOURCE,1.0f));
        addDrop(Blocks.ANDESITE,resourceDrops(Blocks.ANDESITE,ModItems.STONE_RESOURCE,1.0f));
        addDrop(Blocks.ANDESITE_SLAB,resourceDrops(Blocks.ANDESITE_SLAB,ModItems.STONE_RESOURCE,1.0f));
        addDrop(Blocks.ANDESITE_STAIRS,resourceDrops(Blocks.ANDESITE_STAIRS,ModItems.STONE_RESOURCE,1.0f));
        addDrop(Blocks.ANDESITE_WALL,resourceDrops(Blocks.ANDESITE_WALL,ModItems.STONE_RESOURCE,1.0f));
        addDrop(Blocks.CALCITE,resourceDrops(Blocks.CALCITE,ModItems.STONE_RESOURCE,1.0f));
        addDrop(Blocks.CHISELED_DEEPSLATE,resourceDrops(Blocks.CHISELED_DEEPSLATE,ModItems.STONE_RESOURCE,1.0f));
        addDrop(Blocks.COBBLED_DEEPSLATE,resourceDrops(Blocks.COBBLED_DEEPSLATE,ModItems.STONE_RESOURCE,1.0f));
        addDrop(Blocks.COBBLED_DEEPSLATE_SLAB,resourceDrops(Blocks.COBBLED_DEEPSLATE_SLAB,ModItems.STONE_RESOURCE,1.0f));
        addDrop(Blocks.COBBLED_DEEPSLATE_STAIRS,resourceDrops(Blocks.COBBLED_DEEPSLATE_STAIRS,ModItems.STONE_RESOURCE,1.0f));
        addDrop(Blocks.COBBLED_DEEPSLATE_WALL,resourceDrops(Blocks.COBBLED_DEEPSLATE_WALL,ModItems.STONE_RESOURCE,1.0f));
        addDrop(Blocks.COBBLESTONE,resourceDrops(Blocks.COBBLESTONE,ModItems.STONE_RESOURCE,1.0f));
        addDrop(Blocks.COBBLESTONE_SLAB,resourceDrops(Blocks.COBBLESTONE_SLAB,ModItems.STONE_RESOURCE,1.0f));
        addDrop(Blocks.COBBLESTONE_STAIRS,resourceDrops(Blocks.COBBLESTONE_STAIRS,ModItems.STONE_RESOURCE,1.0f));
        addDrop(Blocks.COBBLESTONE_WALL,resourceDrops(Blocks.COBBLESTONE_WALL,ModItems.STONE_RESOURCE,1.0f));
        addDrop(Blocks.DEEPSLATE_BRICKS,resourceDrops(Blocks.DEEPSLATE_BRICKS,ModItems.STONE_RESOURCE,1.0f));
        addDrop(Blocks.DEEPSLATE_BRICK_SLAB,resourceDrops(Blocks.DEEPSLATE_BRICK_SLAB,ModItems.STONE_RESOURCE,1.0f));
        addDrop(Blocks.DEEPSLATE_BRICK_STAIRS,resourceDrops(Blocks.DEEPSLATE_BRICK_STAIRS,ModItems.STONE_RESOURCE,1.0f));
        addDrop(Blocks.DEEPSLATE_BRICK_WALL,resourceDrops(Blocks.DEEPSLATE_BRICK_WALL,ModItems.STONE_RESOURCE,1.0f));
        addDrop(Blocks.DEEPSLATE_TILES,resourceDrops(Blocks.DEEPSLATE_TILES,ModItems.STONE_RESOURCE,1.0f));
        addDrop(Blocks.DEEPSLATE_TILE_SLAB,resourceDrops(Blocks.DEEPSLATE_TILE_SLAB,ModItems.STONE_RESOURCE,1.0f));
        addDrop(Blocks.DEEPSLATE_TILE_STAIRS,resourceDrops(Blocks.DEEPSLATE_TILE_STAIRS,ModItems.STONE_RESOURCE,1.0f));
        addDrop(Blocks.DEEPSLATE_TILE_WALL,resourceDrops(Blocks.DEEPSLATE_TILE_WALL,ModItems.STONE_RESOURCE,1.0f));
        addDrop(Blocks.DIORITE,resourceDrops(Blocks.DIORITE,ModItems.STONE_RESOURCE,1.0f));
        addDrop(Blocks.DIORITE_SLAB,resourceDrops(Blocks.DIORITE_SLAB,ModItems.STONE_RESOURCE,1.0f));
        addDrop(Blocks.DIORITE_STAIRS,resourceDrops(Blocks.DIORITE_STAIRS,ModItems.STONE_RESOURCE,1.0f));
        addDrop(Blocks.DIORITE_WALL,resourceDrops(Blocks.DIORITE_WALL,ModItems.STONE_RESOURCE,1.0f));
        addDrop(Blocks.GRANITE,resourceDrops(Blocks.GRANITE,ModItems.STONE_RESOURCE,1.0f));
        addDrop(Blocks.GRANITE_SLAB,resourceDrops(Blocks.GRANITE_SLAB,ModItems.STONE_RESOURCE,1.0f));
        addDrop(Blocks.GRANITE_STAIRS,resourceDrops(Blocks.GRANITE_STAIRS,ModItems.STONE_RESOURCE,1.0f));
        addDrop(Blocks.GRANITE_WALL,resourceDrops(Blocks.GRANITE_WALL,ModItems.STONE_RESOURCE,1.0f));
        addDrop(Blocks.MOSSY_COBBLESTONE,resourceDrops(Blocks.MOSSY_COBBLESTONE,ModItems.STONE_RESOURCE,1.0f));
        addDrop(Blocks.MOSSY_COBBLESTONE_SLAB,resourceDrops(Blocks.MOSSY_COBBLESTONE_SLAB,ModItems.STONE_RESOURCE,1.0f));
        addDrop(Blocks.MOSSY_COBBLESTONE_STAIRS,resourceDrops(Blocks.MOSSY_COBBLESTONE_STAIRS,ModItems.STONE_RESOURCE,1.0f));
        addDrop(Blocks.MOSSY_COBBLESTONE_WALL,resourceDrops(Blocks.MOSSY_COBBLESTONE_WALL,ModItems.STONE_RESOURCE,1.0f));
        addDrop(Blocks.POLISHED_ANDESITE,resourceDrops(Blocks.POLISHED_ANDESITE,ModItems.STONE_RESOURCE,1.0f));
        addDrop(Blocks.POLISHED_ANDESITE_SLAB,resourceDrops(Blocks.POLISHED_ANDESITE_SLAB,ModItems.STONE_RESOURCE,1.0f));
        addDrop(Blocks.POLISHED_ANDESITE_STAIRS,resourceDrops(Blocks.POLISHED_ANDESITE_STAIRS,ModItems.STONE_RESOURCE,1.0f));
        addDrop(Blocks.POLISHED_DEEPSLATE,resourceDrops(Blocks.POLISHED_DEEPSLATE,ModItems.STONE_RESOURCE,1.0f));
        addDrop(Blocks.POLISHED_DIORITE_SLAB,resourceDrops(Blocks.POLISHED_DIORITE_SLAB,ModItems.STONE_RESOURCE,1.0f));
        addDrop(Blocks.POLISHED_DIORITE_STAIRS,resourceDrops(Blocks.POLISHED_DIORITE_STAIRS,ModItems.STONE_RESOURCE,1.0f));
        addDrop(Blocks.POLISHED_GRANITE,resourceDrops(Blocks.POLISHED_GRANITE,ModItems.STONE_RESOURCE,1.0f));
        addDrop(Blocks.POLISHED_GRANITE_SLAB,resourceDrops(Blocks.POLISHED_GRANITE_SLAB,ModItems.STONE_RESOURCE,1.0f));
        addDrop(Blocks.POLISHED_GRANITE_STAIRS,resourceDrops(Blocks.POLISHED_GRANITE_STAIRS,ModItems.STONE_RESOURCE,1.0f));
        addDrop(Blocks.POLISHED_DIORITE,resourceDrops(Blocks.POLISHED_DIORITE,ModItems.STONE_RESOURCE,1.0f));
        addDrop(Blocks.POLISHED_DIORITE_SLAB,resourceDrops(Blocks.POLISHED_DIORITE_SLAB,ModItems.STONE_RESOURCE,1.0f));
        addDrop(Blocks.POLISHED_DIORITE_STAIRS,resourceDrops(Blocks.POLISHED_DIORITE_STAIRS,ModItems.STONE_RESOURCE,1.0f));
        addDrop(Blocks.TUFF,resourceDrops(Blocks.TUFF,ModItems.STONE_RESOURCE,1.0f));



    }

    public LootTable.Builder resourceDrops(Block dropWithSilkTouch, Item drop, float count) {
        return dropsWithSilkTouch(
                dropWithSilkTouch,
                (LootPoolEntry.Builder<?>)this.applyExplosionDecay(dropWithSilkTouch, ItemEntry.builder(drop))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(count,count)))

        );
    }




}
