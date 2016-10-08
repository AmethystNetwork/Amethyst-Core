package dev.amethystmc.Core.Interfaces.CosmeticInterfaces;

import dev.amethystmc.Core.Cosmetics.Hat;
import dev.amethystmc.Core.Database.Players.AmethystPlayer;
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
 * Created by Ben on 9/26/2016.
 */
public class HatInterface extends InterfaceUtil
{


    @Override
    public String getName() {
        return "Hats";
    }

    @Override
    public void open(Player p) {

        Inventory inv = Bukkit.createInventory(p, 54, getName());

        inv.setItem(49, ItemUtil.createItem(Material.WOOD_DOOR, "&aGo Back"));


        for (Hat hat : Hat.values())
        {

            inv.setItem(hat.getSlot(), hat.getStack());

        }

        p.openInventory(inv);

    }

    @Override
    public void click(Player p, int slot)
    {

        AmethystPlayer ap = new AmethystPlayer(p);

        switch (slot) {

            case 11:
                p.playSound(p.getLocation(), Sound.NOTE_PLING, 10, 10);
                p.getInventory().setHelmet(Hat.GLASS.getStack());
                ap.setHat(Hat.GLASS);
                MessageUtil.sendRawMessage(p, "&aYou have selected the &eGlass Hat&a!");
                break;

            case 49:
                p.playSound(p.getLocation(), Sound.DOOR_CLOSE, 10, 10);
                Interfaces.getCosmeticInterface().open(p);
                break;
        }

    }
}

