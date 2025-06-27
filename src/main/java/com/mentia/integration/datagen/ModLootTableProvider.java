package com.mentia.integration.datagen;

import com.mentia.integration.block.ModBlocks;
import com.mentia.integration.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;

public class ModLootTableProvider extends FabricBlockLootTableProvider {

    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.RESOURCE_TABLE);
        addDrop(Blocks.STONE,resourceDrops(Blocks.STONE,ModItems.STONE_RESOURCE));
        
        //addDrop(Blocks.STONE,resourceDrops(Blocks.STONE,ModItems.STONE_RESOURCE));
        //addDrop(Blocks.OAK_PLANKS,ModItems.BOARD_RESOURCE);
    }



    public LootTable.Builder resourceDrops(Block dropWithSilkTouch, Item drop) {
        return dropsWithSilkTouch(
                dropWithSilkTouch,
                (LootPoolEntry.Builder<?>)this.applyExplosionDecay(dropWithSilkTouch, ItemEntry.builder(drop))
        );
    }
}
