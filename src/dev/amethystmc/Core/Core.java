package dev.amethystmc.Core;

import dev.amethystmc.Core.Commands.ServerCommand;
import dev.amethystmc.Core.Commands.WhitelistCommand;
import dev.amethystmc.Core.Listeners.*;
import dev.amethystmc.Core.Server.ServerHandler;
import dev.amethystmc.Core.Server.Servers;
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
        removeEntities();
        Servers.registerServers();

    }

    public void registerListeners()
    {

        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new PlayerJoinLisetner(), this);
        pm.registerEvents(new EntityDamageByEntityListener(), this);
        pm.registerEvents(new LeavesDecayListener(), this);
        pm.registerEvents(new InventoryClickListener(), this);

    }

    public void registerCommands()
    {

        WhitelistCommand whitelistCommand = new WhitelistCommand("Whitelist", "whitelist", "Whitelist Command");
        ServerCommand serverCommand = new ServerCommand("Server", "server", "Server Command");
        whitelistCommand.register();
        serverCommand.register();

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

