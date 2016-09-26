package dev.amethystmc.Core;

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

    }

    public static Core getInstance()
    {

        return instance;

    }

}

