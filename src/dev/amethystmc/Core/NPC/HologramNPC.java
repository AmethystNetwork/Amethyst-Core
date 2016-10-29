package dev.amethystmc.Core.NPC;

import dev.amethystmc.Core.Utils.MessageUtil;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.ArmorStand;

/**
 * Created by Ben on 10/18/2016.
 */
public class HologramNPC
{

    public void spawnHologram(Location loc, String line)
    {

        ArmorStand a = (ArmorStand) Bukkit.getWorld("world").spawn(loc, ArmorStand.class);
        a.setGravity(false);
        a.setVisible(false);
        a.setCustomNameVisible(true);
        a.setCustomName(MessageUtil.colorize(line));

    }

    public void spawnHologram(Location loc, String line, String line2)
    {

        ArmorStand a = (ArmorStand) Bukkit.getWorld("world").spawn(loc, ArmorStand.class);
        a.setGravity(false);
        a.setVisible(false);
        a.setCustomNameVisible(true);
        a.setCustomName(MessageUtil.colorize(line));

        Location holoLoc2 = loc.add(0, 0.22, 0);

        ArmorStand a2 = (ArmorStand) Bukkit.getWorld("world").spawn(holoLoc2, ArmorStand.class);
        a2.setGravity(false);
        a2.setVisible(false);
        a2.setCustomNameVisible(true);
        a2.setCustomName(MessageUtil.colorize(line2));

    }

    public void spawnHologram(Location loc, String line, String line2, String line3)
    {

        ArmorStand a = (ArmorStand) Bukkit.getWorld("world").spawn(loc, ArmorStand.class);
        a.setGravity(false);
        a.setVisible(false);
        a.setCustomNameVisible(true);
        a.setCustomName(MessageUtil.colorize(line));

        Location holoLoc2 = loc.add(0, 0.22, 0);

        ArmorStand a2 = (ArmorStand) Bukkit.getWorld("world").spawn(holoLoc2, ArmorStand.class);
        a2.setGravity(false);
        a2.setVisible(false);
        a2.setCustomNameVisible(true);
        a2.setCustomName(MessageUtil.colorize(line2));

        Location holoLoc3 = holoLoc2.add(0, 0.22, 0);

        ArmorStand a3 = (ArmorStand) Bukkit.getWorld("world").spawn(holoLoc3, ArmorStand.class);
        a3.setGravity(false);
        a3.setVisible(false);
        a3.setCustomNameVisible(true);
        a3.setCustomName(MessageUtil.colorize(line3));

    }

    public void spawnHologram(Location loc, String line, String line2, String line3, String line4)
    {

        ArmorStand a = (ArmorStand) Bukkit.getWorld("world").spawn(loc, ArmorStand.class);
        a.setGravity(false);
        a.setVisible(false);
        a.setCustomNameVisible(true);
        a.setCustomName(MessageUtil.colorize(line));

        Location holoLoc2 = loc.add(0, 0.22, 0);

        ArmorStand a2 = (ArmorStand) Bukkit.getWorld("world").spawn(holoLoc2, ArmorStand.class);
        a2.setGravity(false);
        a2.setVisible(false);
        a2.setCustomNameVisible(true);
        a2.setCustomName(MessageUtil.colorize(line2));

        Location holoLoc3 = holoLoc2.add(0, 0.22, 0);

        ArmorStand a3 = (ArmorStand) Bukkit.getWorld("world").spawn(holoLoc3, ArmorStand.class);
        a3.setGravity(false);
        a3.setVisible(false);
        a3.setCustomNameVisible(true);
        a3.setCustomName(MessageUtil.colorize(line3));

        Location holoLoc4 = holoLoc3.add(0, 0.22, 0);

        ArmorStand a4 = (ArmorStand) Bukkit.getWorld("world").spawn(holoLoc4, ArmorStand.class);
        a4.setGravity(false);
        a4.setVisible(false);
        a4.setCustomNameVisible(true);
        a4.setCustomName(MessageUtil.colorize(line4));

    }

    public void spawnHologram(Location loc, String line, String line2, String line3, String line4, String line5)
    {

        ArmorStand a = (ArmorStand) Bukkit.getWorld("world").spawn(loc, ArmorStand.class);
        a.setGravity(false);
        a.setVisible(false);
        a.setCustomNameVisible(true);
        a.setCustomName(MessageUtil.colorize(line));

        Location holoLoc2 = loc.add(0, 0.22, 0);

        ArmorStand a2 = (ArmorStand) Bukkit.getWorld("world").spawn(holoLoc2, ArmorStand.class);
        a2.setGravity(false);
        a2.setVisible(false);
        a2.setCustomNameVisible(true);
        a2.setCustomName(MessageUtil.colorize(line2));

        Location holoLoc3 = holoLoc2.add(0, 0.22, 0);

        ArmorStand a3 = (ArmorStand) Bukkit.getWorld("world").spawn(holoLoc3, ArmorStand.class);
        a3.setGravity(false);
        a3.setVisible(false);
        a3.setCustomNameVisible(true);
        a3.setCustomName(MessageUtil.colorize(line3));

        Location holoLoc4 = holoLoc3.add(0, 0.22, 0);

        ArmorStand a4 = (ArmorStand) Bukkit.getWorld("world").spawn(holoLoc4, ArmorStand.class);
        a4.setGravity(false);
        a4.setVisible(false);
        a4.setCustomNameVisible(true);
        a4.setCustomName(MessageUtil.colorize(line4));

        Location holoLoc5 = holoLoc4.add(0, 0.22, 0);

        ArmorStand a5 = (ArmorStand) Bukkit.getWorld("world").spawn(holoLoc5, ArmorStand.class);
        a5.setGravity(false);
        a5.setVisible(false);
        a5.setCustomNameVisible(true);
        a5.setCustomName(MessageUtil.colorize(line5));
    }

}

