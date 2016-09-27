package dev.amethystmc.Core.Listeners;

import dev.amethystmc.Core.Interfaces.Interfaces;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

/**
 * Created by Ben on 9/27/2016.
 */
public class InventoryClickListener implements Listener
{

    @EventHandler
    public void onInventoryClickEvent(InventoryClickEvent e)
    {

        Player p = (Player) e.getWhoClicked();
        int slot = e.getRawSlot();
        String name = e.getInventory().getName();

        if (name.equalsIgnoreCase(Interfaces.getHatInterface().getName()))
        {

            e.setCancelled(true);
            Interfaces.getHatInterface().click(p, slot);

        }

    }

}

