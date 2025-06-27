package com.mentia.integration.datagen;

import com.mentia.integration.block.ModBlocks;
import com.mentia.integration.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class ModEnUsLangProvider extends FabricLanguageProvider {
    public ModEnUsLangProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(ModItems.BOARD_RESOURCE, "Board Resource");
        translationBuilder.add(ModItems.STONE_RESOURCE, "Stone Resource");
        translationBuilder.add(ModItems.NETHER_BOARD_RESOURCE, "Nether Board Resource");
        translationBuilder.add(ModItems.NETHER_STONE_RESOURCE, "Nether Stone Resource");
        translationBuilder.add(ModItems.END_STONE_RESOURCE, "End Stone Resource");

        translationBuilder.add(ModBlocks.RESOURCE_TABLE, "Resource Table");
        translationBuilder.add("itemGroup.test_group", "test group");
    }
}
