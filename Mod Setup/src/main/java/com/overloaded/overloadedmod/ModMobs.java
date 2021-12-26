package com.overloaded.overloadedmod;

import com.overloaded.overloadedmod.entities.EntityFallenSamurai;
import com.overloaded.overloadedmod.entities.EntityFallenSamuraiMob;
import com.overloaded.overloadedmod.entities.models.ModelFallenSamurai;
import com.overloaded.overloadedmod.entities.models.render.RenderFallenSamurai;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ModMobs {

    public static void init() {

        EntityFallenSamurai.mainRegistry();
        RenderingRegistry.registerEntityRenderingHandler(EntityFallenSamuraiMob.class, new RenderFallenSamurai(new ModelFallenSamurai(), 0));

    }

}
