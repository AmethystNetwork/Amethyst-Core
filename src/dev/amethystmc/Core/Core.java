package dev.amethystmc.Core;

import dev.amethystmc.Core.Commands.DebugCommand;
import dev.amethystmc.Core.Cosmetics.ArrowTrails.Listeners.ProjectileLaunchListener;
import dev.amethystmc.Core.Cosmetics.ArrowTrails.Trail;
import dev.amethystmc.Core.Listeners.InventoryClickListener;
import org.bukkit.Bukkit;
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

    }

    public void registerListeners()
    {

        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new InventoryClickListener(), this);
        pm.registerEvents(new ProjectileLaunchListener(), this);

    }

    public void registerCommands()
    {

        DebugCommand debugCommand = new DebugCommand("Debug", "debug", "Debug Command");
        debugCommand.register();

    }

    public static Core getInstance()
    {

        return instance;

    }

}

