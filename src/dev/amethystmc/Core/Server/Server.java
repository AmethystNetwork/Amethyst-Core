package dev.amethystmc.Core.Server;

import org.bukkit.Bukkit;
import org.bukkit.Location;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.text.DecimalFormat;
import java.util.List;

/**
 * Created by Ben on 10/25/2016.
 */
public class Server
{

    private String name;
    private String info;
    private ServerMap map;
    private Location spawnLocation;
    private int maxPlayers;
    private boolean whitelisted;

    public Server(String name, String info, Location spawnLocation, int maxPlayers, boolean whitelisted)
    {

        this.name = name;
        this.info = info;
        this.spawnLocation = spawnLocation;
        this.maxPlayers = maxPlayers;
        this.whitelisted = whitelisted;

    }

    public Server(String name, String info, ServerMap map, Location spawnLocation, int maxPlayers, boolean whitelisted)
    {

        this.name = name;
        this.info = info;
        this.map = map;
        this.spawnLocation = spawnLocation;
        this.maxPlayers = maxPlayers;
        this.whitelisted = whitelisted;

    }

    public String getName()
    {

        return name;

    }

    public String getInfo()
    {

        return info;

    }

    public ServerMap getMap()
    {

        return map;

    }

    public Location getSpawnLocation()
    {

        return spawnLocation;

    }

    public int getMaxPlayers()
    {

        return maxPlayers;

    }

    public boolean isWhitelisted()
    {

        return whitelisted;

    }

}

