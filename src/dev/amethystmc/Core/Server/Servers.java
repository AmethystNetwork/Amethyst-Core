package dev.amethystmc.Core.Server;

import dev.amethystmc.Core.Utils.MessageUtil;
import org.bukkit.Bukkit;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ben on 10/25/2016.
 */
public class Servers
{

    private static List<Server> servers = new ArrayList<>();

    private static Server hubServer = new Server(MessageUtil.colorize("&dHub 1"), MessageUtil.colorize("&eHub Server 1"), Bukkit.getWorld("world").getSpawnLocation(), 100, false);

    public static Server getHubServer()
    {

        return hubServer;

    }

    public static void registerServers()
    {

        servers.add(hubServer);

    }

    public static List<Server> getServers()
    {

        return servers;

    }

}

