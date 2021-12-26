package com.overloaded.overloadedmod;

import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public class ModTools {

    public static void init() {

        Item.ToolMaterial hellstoneToolMaterial = EnumHelper.addToolMaterial("hellstoneToolMaterial", 5, 5000, 8.0F, 50.0F, 10);

    }

}
