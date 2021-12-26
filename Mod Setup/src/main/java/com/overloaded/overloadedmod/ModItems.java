package com.overloaded.overloadedmod;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModItems {

    public static void init() {

        //HellStone
        Item hellstone = new Item().setUnlocalizedName("hellstone").setTextureName(OverloadedMod.MODID + ":hellstone").setCreativeTab(CreativeTabs.tabMaterials);
        GameRegistry.registerItem(hellstone, hellstone.getUnlocalizedName());
        Item hellstone_dust = new Item().setUnlocalizedName("hellstone_dust").setTextureName(OverloadedMod.MODID + ":hellstone_dust").setCreativeTab(CreativeTabs.tabMaterials);
        GameRegistry.registerItem(hellstone_dust, hellstone_dust.getUnlocalizedName());

<<<<<<< Updated upstream

=======
>>>>>>> Stashed changes
    }

}
