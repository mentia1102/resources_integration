package com.mentia.integration.datagen;

import com.mentia.integration.block.ModBlocks;
import com.mentia.integration.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class ModZhCnLangProvider extends FabricLanguageProvider {
    public ModZhCnLangProvider(FabricDataOutput dataOutput) {
        super(dataOutput, "zh_cn");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(ModItems.BOARD_RESOURCE, "木料资源");
        translationBuilder.add(ModItems.STONE_RESOURCE, "石料资源");
        translationBuilder.add(ModItems.NETHER_BOARD_RESOURCE, "下届木料资源");
        translationBuilder.add(ModItems.NETHER_STONE_RESOURCE, "下届石料资源");
        translationBuilder.add(ModItems.END_STONE_RESOURCE, "末地石料资源");

        translationBuilder.add(ModBlocks.RESOURCE_TABLE, "资源工作台");
        translationBuilder.add("itemGroup.test_group", "测试组");
    }
}
