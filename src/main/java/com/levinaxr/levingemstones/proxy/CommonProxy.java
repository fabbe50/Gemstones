package com.levinaxr.levingemstones.proxy;

import com.levinaxr.levingemstones.init.ConfigurationHandler;
import com.levinaxr.levingemstones.init.ItemRegistry;
import com.levinaxr.levingemstones.init.BlockRegistry;
import com.levinaxr.levingemstones.init.CraftingRegistry;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event) {
        ConfigurationHandler.init(event);    //Reads and handles the config
        BlockRegistry.init();	//Initialize Blocks
        ItemRegistry.init();	//Initialize Items
    }

    public void init(FMLInitializationEvent event) {
        CraftingRegistry.init();
        //SmeltingRegistry.registerSmelting();
    }

    public void postInit(FMLPostInitializationEvent event) {

    }
}
