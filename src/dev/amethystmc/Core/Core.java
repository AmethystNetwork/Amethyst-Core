package dev.amethystmc.Core;

import dev.amethystmc.Core.Commands.DebugCommand;
import dev.amethystmc.Core.Cosmetics.ArrowTrails.Listeners.ProjectileLaunchListener;
import dev.amethystmc.Core.Cosmetics.ArrowTrails.Trail;
import dev.amethystmc.Core.Listeners.EntityDamageByEntityListener;
import dev.amethystmc.Core.Listeners.InventoryClickListener;
import dev.amethystmc.Core.Listeners.PlayerInteractEntityListener;
import dev.amethystmc.Core.Listeners.PlayerPickupItemListener;
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
        registerCommands();
        Trail.startArrows();
        removeEntities();

    }

    public void registerListeners()
    {

        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new InventoryClickListener(), this);
        pm.registerEvents(new ProjectileLaunchListener(), this);
        pm.registerEvents(new PlayerInteractEntityListener(), this);
        pm.registerEvents(new PlayerPickupItemListener(), this);
        pm.registerEvents(new EntityDamageByEntityListener(), this);

    }

    public void registerCommands()
    {

        DebugCommand debugCommand = new DebugCommand("Debug", "debug", "Debug Command");
        debugCommand.register();

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

