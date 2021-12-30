package com.overloaded.overloadedmod;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;
import net.minecraft.util.FoodStats;

public class ModFood {

    public static void init() {

        //10 hunger

        //9 hunger

        //8 hunger

        //7 hunger

        //6 hunger

        //5 hunger
        Item ramen = new ItemFood(10, 0.7F, false).setUnlocalizedName("ramen").setTextureName(OverloadedMod.MODID + ":ramen").setCreativeTab(CreativeTabs.tabFood);
        GameRegistry.registerItem(ramen, ramen.getUnlocalizedName());

        //4 hunger

        //3 hunger

        //2 hunger

        //1 hunger

        //0.5 hunger
        Item cheese = new ItemFood(1, 0.3F, false).setUnlocalizedName("cheese").setTextureName(OverloadedMod.MODID + ":cheese").setMaxStackSize(16).setCreativeTab(CreativeTabs.tabFood);
        GameRegistry.registerItem(cheese, cheese.getUnlocalizedName());
        Item pepper = new ItemFood(1, 0.3F, false).setUnlocalizedName("pepper").setTextureName(OverloadedMod.MODID + ":pepper").setMaxStackSize(8).setPotionEffect("8171462").setCreativeTab(CreativeTabs.tabFood);
        GameRegistry.registerItem(pepper, pepper.getUnlocalizedName());




    }

}
