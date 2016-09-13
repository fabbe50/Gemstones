package com.levinaxr.levingemstones.proxy;

import com.levinaxr.levingemstones.init.ItemRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event) {
        //BlockRegistry.init();	//Initialize Blocks
        ItemRegistry.init();	//Initialize Items
    }

    public void init(FMLInitializationEvent event) {
        //RecipeRegistry.registerRecipe();
        //SmeltingRegistry.registerSmelting();
    }

    public void postInit(FMLPostInitializationEvent event) {

    }
}
