package dev.amethystmc.Core.Utils;

import org.bukkit.entity.Player;

/**
 * Created by Ben on 9/25/2016.
 */
public abstract class InterfaceUtil
{

    public abstract String getName();
    public abstract void open(Player p);
    public abstract void click(Player p, int slot);

}

