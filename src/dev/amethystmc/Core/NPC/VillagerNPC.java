package dev.amethystmc.Core.NPC;

import dev.amethystmc.Core.Utils.MessageUtil;
import net.minecraft.server.v1_8_R3.Entity;
import net.minecraft.server.v1_8_R3.NBTTagCompound;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftEntity;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Villager;

/**
 * Created by Ben on 10/4/2016.
 */
public class VillagerNPC
{

    public void spawnVillagerNPC(Location loc, String name, String displayName, Villager.Profession profession)
    {

        Villager v = (Villager) Bukkit.getWorld("world").spawn(loc, Villager.class);
        Entity nms = ((CraftEntity) v).getHandle();
        NBTTagCompound tag = new NBTTagCompound();
        nms.c(tag);
        tag.setInt("NoAI", 1);
        nms.f(tag);

        v.setProfession(profession);
        v.setCustomName(MessageUtil.colorize(name));

        Location holoLoc = v.getLocation().add(0, 0.15, 0);

        ArmorStand a = (ArmorStand) Bukkit.getWorld("world").spawn(holoLoc, ArmorStand.class);
        a.setGravity(false);
        a.setVisible(false);
        a.setCustomNameVisible(true);
        a.setCustomName(MessageUtil.colorize(displayName));


    }

}

