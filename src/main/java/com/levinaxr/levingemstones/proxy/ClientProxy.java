package com.levinaxr.levingemstones.proxy;

import com.levinaxr.levingemstones.init.BlockRegistry;
import com.levinaxr.levingemstones.init.ItemRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {

    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
    }

    public void init(FMLInitializationEvent event) {
        super.init(event);

        BlockRegistry.renderInit(); //Register block-rendering
        ItemRegistry.renderInit(); //Register item-rendering
    }

    public void postInit(FMLPostInitializationEvent event) {
        super.postInit(event);
    }
}
