package dev.amethystmc.Core.Interfaces.WhitelistInterfaces;

import dev.amethystmc.Core.Interfaces.Interfaces;
import dev.amethystmc.Core.Utils.InterfaceUtil;
import dev.amethystmc.Core.Utils.ItemUtil;
import dev.amethystmc.Core.Utils.MessageUtil;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

/**
 * Created by Ben on 10/24/2016.
 */
public class WhitelistInterface extends InterfaceUtil
{

    boolean whitelist = Bukkit.hasWhitelist();

    @Override
    public String getName()
    {

        return "Whitelist";

    }

    @Override
    public void open(Player p)
    {

        Inventory inv = Bukkit.createInventory(p, 9, getName());

        inv.setItem(0, ItemUtil.createItem(Material.EMERALD, "&aEnabled Whitelist"));
        inv.setItem(4, ItemUtil.createItem(Material.PAPER, "&fView Whitelisted Players"));
        inv.setItem(8, ItemUtil.createItem(Material.REDSTONE, "&cDisable Whitelist"));

        p.openInventory(inv);

    }

    @Override
    public void click(Player p, int slot)
    {

        switch (slot) {

            case 0:
                Bukkit.setWhitelist(true);
                p.playSound(p.getLocation(), Sound.LEVEL_UP, 10, 10);
                MessageUtil.sendRawMessage(p, "&aYou Enabled The Whitelist");
                break;
            case 4:
                Interfaces.getWhitelistedPlayersInterface().open(p);
                p.playSound(p.getLocation(), Sound.NOTE_PLING, 10, 10);
                break;
            case 8:
                Bukkit.setWhitelist(false);
                p.playSound(p.getLocation(), Sound.LEVEL_UP, 10, 10);
                MessageUtil.sendRawMessage(p, "&cYou Disabled The Whitelist");

        }

    }
}

