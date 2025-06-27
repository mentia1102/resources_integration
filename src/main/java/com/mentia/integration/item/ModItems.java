package com.mentia.integration.item;

import com.mentia.integration.ResourcesIntegration;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;


public class ModItems {
    public static final Item BOARD_RESOURCE=registerItems("board_resource",new Item(new FabricItemSettings().maxCount(640)));
    public static final Item STONE_RESOURCE=registerItems("stone_resource",new Item(new FabricItemSettings().maxCount(640)));
    public static final Item NETHER_BOARD_RESOURCE=registerItems("nether_timber_resource",new Item(new FabricItemSettings().maxCount(640)));
    public static final Item NETHER_STONE_RESOURCE=registerItems("nether_stone_resource",new Item(new FabricItemSettings().maxCount(640)));
    public static final Item END_STONE_RESOURCE=registerItems("end_stone_resource",new Item(new FabricItemSettings().maxCount(640)));

    private static void addItemsToIG(FabricItemGroupEntries fabricItemGroupEntries) {
        //将物品添加到fabric的物品组
        fabricItemGroupEntries.add(BOARD_RESOURCE);
        fabricItemGroupEntries.add(STONE_RESOURCE);
    }

    //在Test.onInitialize()中初始化
    public static void registerModItems(){
        //将物品添加到MC物品栏
        //ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIG);
    }

    //简化后的注册方法
    public static Item registerItems(String id, Item item){
        return Registry.register(Registries.ITEM,new Identifier(ResourcesIntegration.MOD_ID,id),item);
    }

    //三个官方提供的注册方法
    public static Item register(String id, Item item) {
        return register(new Identifier(id), item);
    }

    public static Item register(Identifier id, Item item) {
        return register(RegistryKey.of(Registries.ITEM.getKey(), id), item);
    }

    public static Item register(RegistryKey<Item> key, Item item) {
        if (item instanceof BlockItem) {
            ((BlockItem)item).appendBlocks(Item.BLOCK_ITEMS, item);
        }

        return Registry.register(Registries.ITEM, key, item);
    }
}
