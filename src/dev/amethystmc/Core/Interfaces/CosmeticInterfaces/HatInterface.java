package dev.amethystmc.Core.Interfaces.CosmeticInterfaces;

import dev.amethystmc.Core.Utils.InterfaceUtil;
import org.bukkit.Bukkit;
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

        p.openInventory(inv);

    }

    @Override
    public void click(Player p, int slot) {

    }
}

