package com.levinaxr.levingemstones.init;


import com.google.common.collect.Lists;
import com.levinaxr.levingemstones.Reference;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.item.*;
import net.minecraft.entity.passive.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.*;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.ConfigCategory;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import net.minecraft.entity.monster.*;

import java.util.List;

import static com.levinaxr.levingemstones.common.blocks.crumbleCobble.lightFeetz;

public class ConfigurationHandler {

    public static ConfigurationHandler configuration = new ConfigurationHandler();

    static Configuration configFile;

    public static ConfigCategory crumbleBlock;

    public static void init(FMLPreInitializationEvent event) {

        configFile = new Configuration(event.getSuggestedConfigurationFile(), "trialFile", false);

        MinecraftForge.EVENT_BUS.register(configuration);

        setConfig();
    }

    public static void setConfig() {

        {
            crumbleBlacklist();
        }

        Property prop;

        if(configFile.hasChanged()) {
            configFile.save();
        }
    }

    @SubscribeEvent
    public void update(ConfigChangedEvent.OnConfigChangedEvent event) {
        if(event.getModID().equals(Reference.MOD_ID)) {
            setConfig();
        }
    }

    public static void crumbleBlacklist(){
        Property prop;

        List<String> propOrder = Lists.newArrayList();
        int i = 0;

        String cat = "category";
        crumbleBlock = configFile.getCategory(cat);


        prop = configFile.get(cat, "PLAYER", true);
        prop.setComment("Entities that'll not trigger (destroy) the crumbling blocks.\nNote: true means they'll break it and false means the opposite! (caps sensitive)");
        if (prop.getBoolean()) lightFeetz.add(EntityPlayer.class);
        propOrder.add(i, prop.getName()); i++;


        //###########
        //# PASSIVE #
        //###########

        prop = configFile.get(cat, "BAT", false);
        prop.setComment("Passive Mobs:");
        if (prop.getBoolean()) lightFeetz.add(EntityBat.class);
        propOrder.add(i, prop.getName()); i++;

        prop = configFile.get(cat, "CHICKEN", false);
        if (prop.getBoolean()) lightFeetz.add(EntityChicken.class);
        propOrder.add(i, prop.getName()); i++;

        prop = configFile.get(cat, "COW", true);
        if (prop.getBoolean()) lightFeetz.add(EntityCow.class);
        propOrder.add(i, prop.getName()); i++;

        prop = configFile.get(cat, "HORSE", true);
        if (prop.getBoolean()) lightFeetz.add(EntityHorse.class);
        propOrder.add(i, prop.getName()); i++;

        prop = configFile.get(cat, "MOOSHROOM", true);
        if (prop.getBoolean()) lightFeetz.add(EntityMooshroom.class);
        propOrder.add(i, prop.getName()); i++;

        prop = configFile.get(cat, "PIG", true);
        if (prop.getBoolean()) lightFeetz.add(EntityPig.class);
        propOrder.add(i, prop.getName()); i++;

        prop = configFile.get(cat, "RABBIT", true);
        if (prop.getBoolean()) lightFeetz.add(EntityRabbit.class);
        propOrder.add(i, prop.getName()); i++;

        prop = configFile.get(cat, "SHEEP", true);
        if (prop.getBoolean()) lightFeetz.add(EntitySheep.class);
        propOrder.add(i, prop.getName()); i++;

        prop = configFile.get(cat, "SQUID", false);
        if (prop.getBoolean()) lightFeetz.add(EntitySquid.class);
        propOrder.add(i, prop.getName()); i++;

        prop = configFile.get(cat, "VILLAGER", true);
        if (prop.getBoolean()) lightFeetz.add(EntityVillager.class);
        propOrder.add(i, prop.getName()); i++;

        //###########
        //# NEUTRAL #
        //###########

        prop = configFile.get(cat, "CAVE_SPIDER", false);
        prop.setComment("Neutral Mobs:");
        if (prop.getBoolean()) lightFeetz.add(EntityCaveSpider.class);
        propOrder.add(i, prop.getName()); i++;

        prop = configFile.get(cat, "ENDERMAN", true);
        if (prop.getBoolean()) lightFeetz.add(EntityEnderman.class);
        propOrder.add(i, prop.getName()); i++;

        prop = configFile.get(cat, "POLAR_BEAR", true);
        if (prop.getBoolean()) lightFeetz.add(EntityPolarBear.class);
        propOrder.add(i, prop.getName()); i++;

        prop = configFile.get(cat, "SPIDER", false);
        if (prop.getBoolean()) lightFeetz.add(EntitySpider.class);
        propOrder.add(i, prop.getName()); i++;

        prop = configFile.get(cat, "ZOMBIE_PIGMAN", true);
        if (prop.getBoolean()) lightFeetz.add(EntityPigZombie.class);
        propOrder.add(i, prop.getName()); i++;

        //###########
        //# HOSTILE #
        //###########

        prop = configFile.get(cat, "BLAZE", true);
        prop.setComment("Hostile Mobs:");
        if (prop.getBoolean()) lightFeetz.add(EntityBlaze.class);
        propOrder.add(i, prop.getName()); i++;

        prop = configFile.get(cat, "CREEPER", true);
        if (prop.getBoolean()) lightFeetz.add(EntityCreeper.class);
        propOrder.add(i, prop.getName()); i++;

        prop = configFile.get(cat, "ENDERMITE", false);
        if (prop.getBoolean()) lightFeetz.add(EntityEndermite.class);
        propOrder.add(i, prop.getName()); i++;

        prop = configFile.get(cat, "GHAST", true);
        if (prop.getBoolean()) lightFeetz.add(EntityGhast.class);
        propOrder.add(i, prop.getName()); i++;

        prop = configFile.get(cat, "GUARDIAN", true);
        if (prop.getBoolean()) lightFeetz.add(EntityGuardian.class);
        propOrder.add(i, prop.getName()); i++;

        prop = configFile.get(cat, "MAGMA_CUBE", true);
        if (prop.getBoolean()) lightFeetz.add(EntityMagmaCube.class);
        propOrder.add(i, prop.getName()); i++;

        prop = configFile.get(cat, "SHULKER", true);
        if (prop.getBoolean()) lightFeetz.add(EntityShulker.class);
        propOrder.add(i, prop.getName()); i++;

        prop = configFile.get(cat, "GEOFF", false);
        if (prop.getBoolean()) lightFeetz.add(EntitySilverfish.class);
        propOrder.add(i, prop.getName()); i++;

        prop = configFile.get(cat, "SKELETON", false);
        if (prop.getBoolean()) lightFeetz.add(EntitySkeleton.class);
        propOrder.add(i, prop.getName()); i++;

        prop = configFile.get(cat, "SLIME", false);
        if (prop.getBoolean()) lightFeetz.add(EntitySlime.class);
        propOrder.add(i, prop.getName()); i++;

        prop = configFile.get(cat, "WITCH", true);
        if (prop.getBoolean()) lightFeetz.add(EntityWitch.class);
        propOrder.add(i, prop.getName()); i++;

        prop = configFile.get(cat, "ZOMBIE", true);
        if (prop.getBoolean()) lightFeetz.add(EntityZombie.class);
        propOrder.add(i, prop.getName()); i++;

        //############
        //# TAMEABLE #
        //############

        prop = configFile.get(cat, "OCELOT", false);
        prop.setComment("Tameable Mobs:");
        if (prop.getBoolean()) lightFeetz.add(EntityOcelot.class);
        propOrder.add(i, prop.getName()); i++;

        prop = configFile.get(cat, "WOLF", true);
        if (prop.getBoolean()) lightFeetz.add(EntityWolf.class);
        propOrder.add(i, prop.getName()); i++;

        //###########
        //# UTILITY #
        //###########

        prop = configFile.get(cat, "IRON_GOLEM", true);
        prop.setComment("Utility Mobs:");
        if (prop.getBoolean()) lightFeetz.add(EntityIronGolem.class);
        propOrder.add(i, prop.getName()); i++;

        prop = configFile.get(cat, "SNOW_GOLEM", true);
        if (prop.getBoolean()) lightFeetz.add(EntitySnowman.class);
        propOrder.add(i, prop.getName()); i++;

        //########
        //# BOSS #
        //########

        prop = configFile.get(cat, "WITHER", true);
        prop.setComment("Boss Mobs:");
        if (prop.getBoolean()) lightFeetz.add(EntityWither.class);
        propOrder.add(i, prop.getName()); i++;

        //############
        //# RIDEABLE #
        //############

        prop = configFile.get(cat, "BOAT", true);
        prop.setComment("Ridable:");
        if (prop.getBoolean()) lightFeetz.add(EntityBoat.class);
        propOrder.add(i, prop.getName()); i++;

        prop = configFile.get(cat, "MINECART", true);
        if (prop.getBoolean()) {
            lightFeetz.add(EntityMinecart.class);
            lightFeetz.add(EntityMinecartChest.class);
            lightFeetz.add(EntityMinecartCommandBlock.class);
            lightFeetz.add(EntityMinecartContainer.class);
            lightFeetz.add(EntityMinecartEmpty.class);
            lightFeetz.add(EntityMinecartFurnace.class);
            lightFeetz.add(EntityMinecartHopper.class);
            lightFeetz.add(EntityMinecartMobSpawner.class);
            lightFeetz.add(EntityMinecartTNT.class);
        }
        propOrder.add(i, prop.getName()); i++;

        //#############
        //# THROWABLE #
        //#############

        prop = configFile.get(cat, "ARROW", false);
        prop.setComment("Throwable:");
        if (prop.getBoolean()) {
            lightFeetz.add(EntityArrow.class);
            lightFeetz.add(EntitySpectralArrow.class);
            lightFeetz.add(EntityTippedArrow.class);
        }
        propOrder.add(i, prop.getName()); i++;

        prop = configFile.get(cat, "EGG", false);
        if (prop.getBoolean()) lightFeetz.add(EntityEgg.class);
        propOrder.add(i, prop.getName()); i++;

        prop = configFile.get(cat, "ITEM", false);
        if (prop.getBoolean()) lightFeetz.add(EntityItem.class);
        propOrder.add(i, prop.getName()); i++;

        prop = configFile.get(cat, "SNOWBALL", false);
        if (prop.getBoolean()) lightFeetz.add(EntitySnowball.class);
        propOrder.add(i, prop.getName()); i++;

        crumbleBlock.setPropertyOrder(propOrder);

        //############
        //# TEMPLATE #
        //############
        /*
        prop = configFile.get(cat, "", true);
        if (prop.getBoolean()) lightFeetz.add(Entity.class);
        propOrder.add(i, prop.getName()); i++;
        */
    }
}
