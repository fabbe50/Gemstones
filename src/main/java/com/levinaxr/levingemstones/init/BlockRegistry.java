package com.levinaxr.levingemstones.init;

import com.levinaxr.levingemstones.common.blocks.crumbleCobble;
import com.thefifthidiot.tficore.common.blocks.base.BlockBase;

import com.thefifthidiot.tficore.init.TFIBlocks;
import com.thefifthidiot.tficore.render.BlockRenderer;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class BlockRegistry {

    public static final Block crumbleCobble = new crumbleCobble(Material.ROCK, MapColor.GRAY, "crumbleCobble", 0.5f, 0.5f, null);


    public static void init() {
        TFIBlocks.addBlock(crumbleCobble);
    }

    public static void renderInit() {
        BlockRenderer.registerBlock(crumbleCobble);
    }
}
