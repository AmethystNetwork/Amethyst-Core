package dev.amethystmc.Core.NPC;

/**
 * Created by Ben on 10/5/2016.
 */
public class NPC
{

    private static VillagerNPC villagerNPC = new VillagerNPC();
    private static ZombieNPC zombieNPC = new ZombieNPC();
    private static HologramNPC hologramNPC = new HologramNPC();

    public static VillagerNPC getVillagerNPC()
    {

        return villagerNPC;

    }

    public static ZombieNPC getZombieNPC()
    {

        return zombieNPC;

    }

    public static HologramNPC getHologramNPC()
    {

        return hologramNPC;

    }

}

