package dev.amethystmc.Core;

import dev.amethystmc.Core.Listeners.*;
import org.bukkit.Bukkit;
import org.bukkit.entity.*;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Ben on 9/25/2016.
 */
public class Core extends JavaPlugin
{

    private static Core instance;


    public void onEnable()
    {

        instance = this;
        registerListeners();
        removeEntities();

    }

    public void registerListeners()
    {

        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new EntityDamageByEntityListener(), this);
        pm.registerEvents(new LeavesDecayListener(), this);

    }

    public void removeEntities()
    {

        for (Entity e : Bukkit.getWorld("world").getEntities())
        {

            if (!(e instanceof Player))
                e.remove();

        }

    }

    public static Core getInstance()
    {

        return instance;

    }

}

