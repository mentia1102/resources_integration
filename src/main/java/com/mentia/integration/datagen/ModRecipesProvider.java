package com.mentia.integration.datagen;

import com.mentia.integration.ResourcesIntegration;
import com.mentia.integration.block.ModBlocks;
import com.mentia.integration.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.client.tutorial.TutorialManager;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipesProvider extends FabricRecipeProvider {
    public ModRecipesProvider(FabricDataOutput output) {
        super(output);
    }

    public static final List<ItemConvertible> STONE_RESOURCE_RECIPE = List.of(ModItems.STONE_RESOURCE);

    @Override
    public void generate(Consumer<RecipeJsonProvider> consumer) {
        //石料资源烧石头
        offerSmelting(consumer,STONE_RESOURCE_RECIPE, RecipeCategory.MISC, Items.STONE,0.7f,200,"stone");
        //木料资源加石料资源合成资源工作台
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RESOURCE_TABLE,1)
                .pattern("**")
                .pattern("##")
                .input('*',ModItems.BOARD_RESOURCE)
                .input('#',ModItems.STONE_RESOURCE)
                .criterion(hasItem(ModItems.BOARD_RESOURCE),conditionsFromItem(ModItems.BOARD_RESOURCE))
                .offerTo(consumer,new Identifier(ResourcesIntegration.MOD_ID,"resource_table"));
//        石料资源合成发射器，投掷器
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Blocks.DISPENSER,1)
                .pattern("###")
                .pattern("#S#")
                .pattern("#*#")
                .input('#',ModItems.STONE_RESOURCE)
                .input('S',Items.BOW)
                .input('*',Items.REDSTONE)
                .criterion(hasItem(ModItems.STONE_RESOURCE),conditionsFromItem(ModItems.STONE_RESOURCE))
                .offerTo(consumer,new Identifier(ResourcesIntegration.MOD_ID,"dispenser"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Blocks.DROPPER,1)
                .pattern("###")
                .pattern("# #")
                .pattern("#*#")
                .input('#',ModItems.STONE_RESOURCE)
                .input('*',Items.REDSTONE)
                .criterion(hasItem(ModItems.STONE_RESOURCE),conditionsFromItem(ModItems.STONE_RESOURCE))
                .offerTo(consumer,new Identifier(ResourcesIntegration.MOD_ID,"dropper"));

    }
}
