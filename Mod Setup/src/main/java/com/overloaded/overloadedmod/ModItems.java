package com.overloaded.overloadedmod;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModItems {

    public static void init() {

        //HellStone
        Item hellstone_gem = new Item().setUnlocalizedName("hellstone_gem").setTextureName(OverloadedMod.MODID + ":hellstone_gem").setCreativeTab(CreativeTabs.tabMaterials);
        GameRegistry.registerItem(hellstone_gem, hellstone_gem.getUnlocalizedName());
        
        Item hellstone_dust = new Item().setUnlocalizedName("hellstone_dust").setTextureName(OverloadedMod.MODID + ":hellstone_dust").setCreativeTab(CreativeTabs.tabMaterials);
        GameRegistry.registerItem(hellstone_dust, hellstone_dust.getUnlocalizedName());

    }

}
