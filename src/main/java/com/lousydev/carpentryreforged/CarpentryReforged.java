package com.lousydev.carpentryreforged;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("carpentryreforged")
public class CarpentryReforged
{
    public CarpentryReforged()
    {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);

        MinecraftForge.EVENT_BUS.register(this);
    }

    public static final Logger LOGGER = LogManager.getLogger();

    public void setup(final FMLCommonSetupEvent event)
    {

    }

    public void enqueueIMC(final InterModEnqueueEvent event)
    {

    }

    public void processIMC(final InterModProcessEvent event)
    {

    }

    public void doClientStuff(final FMLClientSetupEvent event)
    {

    }
}
