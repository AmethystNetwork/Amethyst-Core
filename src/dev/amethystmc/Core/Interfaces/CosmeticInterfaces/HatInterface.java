package dev.amethystmc.Core.Interfaces.CosmeticInterfaces;

import dev.amethystmc.Core.Cosmetics.Hat;
import dev.amethystmc.Core.Utils.InterfaceUtil;
import dev.amethystmc.Core.Utils.ItemUtil;
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

        Inventory inv = Bukkit.createInventory(p, 45, getName());

        inv.setItem(40, ItemUtil.createItem(Material.ARROW, "&dNext Page"));


        for (Hat hat : Hat.values())
        {

            inv.setItem(hat.getSlot(), hat.getStack());

        }

        p.openInventory(inv);

    }

    @Override
    public void click(Player p, int slot)
    {

        switch (slot) {

            case 40:
                p.playSound(p.getLocation(), Sound.DOOR_CLOSE, 10, 10);
                p.closeInventory();
                break;
        }

    }
}

