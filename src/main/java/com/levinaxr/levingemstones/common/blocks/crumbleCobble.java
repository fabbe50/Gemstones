package com.levinaxr.levingemstones.common.blocks;

import com.thefifthidiot.tficore.common.blocks.base.BlockBase;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.entity.monster.EntityEndermite;
import net.minecraft.entity.monster.EntitySilverfish;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;

import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class crumbleCobble extends BlockBase{

    public static Set<Class> lightFeetz = new HashSet<Class>();

    public crumbleCobble(Material material, MapColor mapColor, String blockName, float hardness, float resistance, @Nullable CreativeTabs tab) {
        super(material, mapColor, blockName, hardness, resistance, tab);

        //setLightFeetz(lightFeetz);
    }

    @Override
    public void onEntityWalk (World worldIn, BlockPos pos, Entity entityIn) {
        if (!lightFeetz.contains(entityIn.getClass())) {
            //Do Nothing
        } else {
            worldIn.destroyBlock(pos, false);
        }
    }

    @Override
    @Nullable
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return null;
    }

    /*
    @Override
    public BlockRenderLayer getBlockLayer()
    {
        return BlockRenderLayer.CUTOUT_MIPPED;
    }*/

    //Mobs that are considered light weight and should not to light to collapse the crumbleBlock
    public void setLightFeetz(Set<Class> lightFeetz) {
        lightFeetz.clear();
        //lightFeetz.add(Entity.class);
    }
}