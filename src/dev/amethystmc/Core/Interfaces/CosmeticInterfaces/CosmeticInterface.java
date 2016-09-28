package dev.amethystmc.Core.Interfaces.CosmeticInterfaces;

import dev.amethystmc.Core.Cosmetics.Cosmetic;
import dev.amethystmc.Core.Cosmetics.Hat;
import dev.amethystmc.Core.Interfaces.Interfaces;
import dev.amethystmc.Core.Utils.InterfaceUtil;
import dev.amethystmc.Core.Utils.ItemUtil;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

/**
 * Created by Ben on 9/27/2016.
 */
public class CosmeticInterface extends InterfaceUtil
{

    @Override
    public String getName() {
        return "Cosmetics";
    }

    @Override
    public void open(Player p) {

        Inventory inv = Bukkit.createInventory(p, 54, getName());

        inv.setItem(49, ItemUtil.createSkull(p.getName(), "&a&l&nCosmetic Info", "&c&nComing Soon..."));


        for (Cosmetic cosmetic : Cosmetic.values())
        {

            inv.setItem(cosmetic.getSlot(), cosmetic.getStack());

        }

        p.openInventory(inv);

    }

    @Override
    public void click(Player p, int slot)
    {

        switch (slot) {

            case 11:
                p.playSound(p.getLocation(), Sound.NOTE_PLING, 10, 10);
                Interfaces.getHatInterface().open(p);
                break;
            case 12:
                p.playSound(p.getLocation(), Sound.NOTE_PLING, 10, 10);
                Interfaces.getGadgetInterface().open(p);
                break;
            case 13:
                p.playSound(p.getLocation(), Sound.NOTE_PLING, 10, 10);
                Interfaces.getTagInterface().open(p);
                break;
            case 14:
                p.playSound(p.getLocation(), Sound.NOTE_PLING, 10, 10);
                Interfaces.getTrailInterface().open(p);
                break;

        }

    }
}

