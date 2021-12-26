package com.overloaded.overloadedmod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = OverloadedMod.MODID, version = OverloadedMod.VERSION, name = OverloadedMod.NAME)
public class OverloadedMod
{
    public static final String MODID = "overloaded";
    public static final String VERSION = "Alpha 1.0";
    public static final String NAME = "Overloaded Mod";

    @Mod.Instance("overloaded")
    public static OverloadedMod instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        ModItems.init();
        ModTools.init();

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
