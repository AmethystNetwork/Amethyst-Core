package dev.amethystmc.Core.Server;

import com.sun.jna.IntegerType;
import dev.amethystmc.Core.Core;
import dev.amethystmc.Core.NPC.NPC;
import dev.amethystmc.Core.NPC.VillagerNPC;
import dev.amethystmc.Core.Utils.MessageUtil;
import org.bukkit.Bukkit;
import org.bukkit.Effect;
import org.bukkit.entity.Villager;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.text.DecimalFormat;

/**
 * Created by Ben on 10/25/2016.
 */
public class ServerHandler
{

    public static String getTPS()
    {

        String name1 = Bukkit.getServer().getClass().getPackage().getName();
        String version = name1.substring(name1.lastIndexOf('.') + 1);

        Class<?> mcsclass = null;

        DecimalFormat format = new DecimalFormat("##.##");

        Object si = null;
        Field tpsField = null;

        try {
            mcsclass = Class.forName("net.minecraft.server." + version + "." + "MinecraftServer");

            si = mcsclass.getMethod("getServer").invoke(null);

            tpsField = si.getClass().getField("recentTps");

        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException | NoSuchFieldException e) {
            e.printStackTrace();
        }

        double[] tps = null;

        try {
            tps = ((double[]) tpsField.get(si));

        } catch (IllegalArgumentException e) { e.printStackTrace(); } catch (IllegalAccessException e) { e.printStackTrace();}

        return format.format(tps[0]);
    }

    public static String determineTPSRange()
    {

        double tps = Double.valueOf(getTPS());

        if (tps >= 19.75)
        {

            return MessageUtil.colorize("&a&lGREAT");

        }

        else if (tps >= 19.50 && tps < 19.75)
        {

            return MessageUtil.colorize("&6&lGOOD");

        }

        else {
            return MessageUtil.colorize("&c&lPOOR");
        }

    }

    public static String determineLagPercentage()
    {

        double tps = Double.valueOf(getTPS());
        double lag = Math.round((1.0D - tps / 20.0D) * 100.0D);

        return lag + "%";

    }

    public static double getUsedRam()
    {

        double total = Runtime.getRuntime().maxMemory();
        double free = Runtime.getRuntime().freeMemory();
        double used = total - free;
        double usedPercent = (used / total) * 100;

        return Math.round(usedPercent);

    }

    public static void freeUpRam()
    {

        Runtime.getRuntime().gc();

    }

}

