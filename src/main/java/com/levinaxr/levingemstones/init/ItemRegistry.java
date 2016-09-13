package com.levinaxr.levingemstones.init;

import com.thefifthidiot.tficore.common.items.ItemBase;
import com.thefifthidiot.tficore.init.TFIItems;
import com.thefifthidiot.tficore.render.ItemRenderer;
import net.minecraft.item.Item;

public class ItemRegistry {

    public static final Item amethystGem;

    static {
        amethystGem = TFIItems.registerItem(new ItemBase("amethystGem", null));
    }

    public static void renderInit(){
        ItemRenderer.registerItem(amethystGem);
    }

    public static void init() {

    }
}
