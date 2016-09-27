package dev.amethystmc.Core.Interfaces.CosmeticInterfaces;

import dev.amethystmc.Core.Cosmetics.Gadget;
import dev.amethystmc.Core.Cosmetics.Tag;
import dev.amethystmc.Core.Interfaces.Interfaces;
import dev.amethystmc.Core.Utils.InterfaceUtil;
import dev.amethystmc.Core.Utils.ItemUtil;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

/**
 * Created by Ben on 9/27/2016.
 */
public class TagInterface extends InterfaceUtil
{


    @Override
    public String getName() {
        return "Tags";
    }

    @Override
    public void open(Player p) {

        Inventory inv = Bukkit.createInventory(p, 45, getName());

        inv.setItem(40, ItemUtil.createItem(Material.WOOD_DOOR, "&aGo Back"));


        for (Tag tag : Tag.values())
        {

            inv.setItem(tag.getSlot(), tag.getStack());

        }

        p.openInventory(inv);

    }

    @Override
    public void click(Player p, int slot)
    {

        switch (slot) {

            case 40:
                p.playSound(p.getLocation(), Sound.DOOR_CLOSE, 10, 10);
                Interfaces.getCosmeticInterface().open(p);
                break;
        }

    }
}

