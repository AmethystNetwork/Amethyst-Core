package dev.amethystmc.Core;

import dev.amethystmc.Core.Commands.DebugCommand;
import dev.amethystmc.Core.Cosmetics.Hat;
import dev.amethystmc.Core.Listeners.InventoryClickListener;
import dev.amethystmc.Core.Utils.InterfacePageUtils.Pages;
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
        registerHats();

    }

    public void registerListeners()
    {

        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new InventoryClickListener(), this);

    }

    public void registerCommands()
    {

        DebugCommand debugCommand = new DebugCommand("Debug", "debug", "Debug Command");
        debugCommand.register();

    }

    public void registerHats()
    {

        for (Hat hat : Hat.values())
        {

            Pages.register(hat.getStack(), hat.getSlot());

        }

    }

    public static Core getInstance()
    {

        return instance;

    }

}

