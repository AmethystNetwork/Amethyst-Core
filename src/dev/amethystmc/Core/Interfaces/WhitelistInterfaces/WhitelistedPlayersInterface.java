package dev.amethystmc.Core.Interfaces.WhitelistInterfaces;

import dev.amethystmc.Core.Utils.InterfaceUtil;
import dev.amethystmc.Core.Utils.ItemUtil;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

/**
 * Created by Ben on 10/24/2016.
 */
public class WhitelistedPlayersInterface extends InterfaceUtil
{


    @Override
    public String getName()
    {

        return "Whitelisted Players";

    }

    @Override
    public void open(Player p)
    {

        Inventory inv = Bukkit.createInventory(p, 54, getName());

        int slot = 0;

        for (OfflinePlayer whitelisted : Bukkit.getWhitelistedPlayers())
        {

            inv.setItem(slot, ItemUtil.createSkull(whitelisted.getName(), "&a" + whitelisted.getName()));
            slot += 1;

        }

        p.openInventory(inv);

    }

    @Override
    public void click(Player p, int slot) {

    }
}

