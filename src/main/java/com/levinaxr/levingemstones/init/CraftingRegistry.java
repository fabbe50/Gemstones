package com.levinaxr.levingemstones.init;

import com.thefifthidiot.tficore.utility.LogHelper;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingRegistry {

    public CraftingRegistry() {

    }

    //Adds custom recipes
    public static void init () {

        //<editor-fold desc="BLOCK: Crumbling Cobblestone">
        GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.crumbleCobble, 10),
                " S ",
                "SCS",
                " S ",
                'S', Items.STICK,
                'C', Blocks.COBBLESTONE
        );
        //</editor-fold>

        GameRegistry.addShapedRecipe(new ItemStack(Items.STICK, 9),
                "   ",
                " C ",
                "   ",
                'C', Blocks.COBBLESTONE
        );
    }
}
