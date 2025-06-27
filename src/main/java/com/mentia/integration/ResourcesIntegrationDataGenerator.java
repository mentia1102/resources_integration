package com.mentia.integration;

import com.mentia.integration.datagen.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class ResourcesIntegrationDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModModelsProvider::new);
		pack.addProvider(ModEnUsLangProvider::new);
		pack.addProvider(ModZhCnLangProvider::new);
		pack.addProvider(ModBlockTagsProvider::new);
		pack.addProvider(ModLootTableProvider::new);
		pack.addProvider(ModRecipesProvider::new);
		pack.addProvider(ModItemTagsProvider::new);
	}
}
