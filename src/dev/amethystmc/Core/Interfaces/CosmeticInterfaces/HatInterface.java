package dev.amethystmc.Core.Interfaces.CosmeticInterfaces;

import dev.amethystmc.Core.Utils.InterfacePageUtils.Page;
import dev.amethystmc.Core.Utils.InterfacePageUtils.PageData;
import dev.amethystmc.Core.Utils.InterfacePageUtils.Pages;
import dev.amethystmc.Core.Utils.InterfaceUtil;
import dev.amethystmc.Core.Utils.ItemUtil;
import org.bukkit.Bukkit;
import org.bukkit.Material;
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

        Page page = Pages.pages.get(0);

        for (PageData data : page.getItems())
        {

            inv.setItem(data.getSlot(), data.getStack());

        }

        p.openInventory(inv);

    }

    @Override
    public void click(Player p, int slot)
    {

        switch (slot) {

            case 40:
                int pages = 1;
                Page page = null;

                if (!(Pages.pages.size() >= pages))
                {
                    p.closeInventory();
                    return;
                }

                page = Pages.pages.get(pages - 1);

                Inventory inv = Bukkit.createInventory(p, 45, "Hats");
                inv.setItem(39, ItemUtil.createItem(Material.ARROW, "&dPrevious Page"));
                inv.setItem(41, ItemUtil.createItem(Material.ARROW, "&dNext Page"));

                for (PageData data : page.getItems())
                {

                    inv.setItem(data.getSlot(), data.getStack());

                }

                p.openInventory(inv);
                break;
            case 39:
                open(p);
        }

    }
}

