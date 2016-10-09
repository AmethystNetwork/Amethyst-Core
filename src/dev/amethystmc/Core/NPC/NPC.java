package dev.amethystmc.Core.NPC;

/**
 * Created by Ben on 10/5/2016.
 */
public class NPC
{

    private static VillagerNPC villagerNPC = new VillagerNPC();
    private static ZombieNPC zombieNPC = new ZombieNPC();

    public static VillagerNPC getVillagerNPC()
    {

        return villagerNPC;

    }

    public static ZombieNPC getZombieNPC()
    {

        return zombieNPC;

    }

}

