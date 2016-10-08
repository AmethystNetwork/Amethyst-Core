package dev.amethystmc.Core.NPC;

import dev.amethystmc.Core.Utils.MessageUtil;
import net.minecraft.server.v1_8_R3.Entity;
import net.minecraft.server.v1_8_R3.NBTTagCompound;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftEntity;
import org.bukkit.entity.*;

/**
 * Created by Ben on 10/4/2016.
 */
public class VillagerNPC
{

    public void spawnVillagerNPC(Location loc, String displayName, String nameLine1, String nameLine2, Villager.Profession profession) {

        final Villager v = (Villager) Bukkit.getWorld("world").spawn(loc, Villager.class);
        Entity nms = ((CraftEntity) v).getHandle();
        NBTTagCompound tag = new NBTTagCompound();
        nms.c(tag);
        tag.setInt("NoAI", 1);
        nms.f(tag);

        v.setProfession(profession);
        v.setCustomName(MessageUtil.colorize(displayName));

        Location holoLoc = v.getLocation().add(0, 0.07, 0);

        ArmorStand a = (ArmorStand) Bukkit.getWorld("world").spawn(holoLoc, ArmorStand.class);
        a.setGravity(false);
        a.setVisible(false);
        a.setCustomNameVisible(true);
        a.setCustomName(MessageUtil.colorize(nameLine1));

        Location holoLoc2 = holoLoc.add(0, 0.22, 0);

        ArmorStand a2 = (ArmorStand) Bukkit.getWorld("world").spawn(holoLoc2, ArmorStand.class);
        a2.setGravity(false);
        a2.setVisible(false);
        a2.setCustomNameVisible(true);
        a2.setCustomName(MessageUtil.colorize(nameLine2));
    }

}

