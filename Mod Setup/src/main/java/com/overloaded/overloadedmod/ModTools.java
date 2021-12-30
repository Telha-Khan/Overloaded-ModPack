package com.overloaded.overloadedmod;

import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public class ModTools {

    public static void init() {
        //AntimatterTools
        Item.ToolMaterial AntimatterToolMaterial = EnumHelper.addToolMaterial("AntimatterToolMaterial", 9, 5000, 5, 257, 8);
        Item antimatterGreatsword = new ItemAntiSword();

    }

}
