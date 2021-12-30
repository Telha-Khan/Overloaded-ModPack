package com.overloaded.overloadedmod.entities;

import com.overloaded.overloadedmod.OverloadedMod;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

public class EntityDemonWizard {

    public static void mainRegistry() {
        registerEntity();
    }

    public static void registerEntity() {
        createEntity(EntityDemonWizardMob.class, "Demon Wizard", 0xEC4545, 0X001EFF);
    }

    public static void createEntity(Class entityClass, String entityName, int solidColor, int spotColor) {
        int randomId = EntityRegistry.findGlobalUniqueEntityId();
        EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
        EntityRegistry.registerModEntity(entityClass, entityName, randomId, OverloadedMod.instance, 64, 1, true);
        EntityRegistry.addSpawn(entityClass, 0, 0, 5, EnumCreatureType.creature, BiomeGenBase.extremeHillsPlus);

        createEgg(randomId, solidColor, spotColor);
    }

    private static void createEgg(int randomId, int solidColor, int spotColor) {

        EntityList.entityEggs.put(randomId, new EntityList.EntityEggInfo(randomId, solidColor, spotColor));

    }

}