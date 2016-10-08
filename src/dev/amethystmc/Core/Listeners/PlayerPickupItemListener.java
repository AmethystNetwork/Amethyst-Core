package dev.amethystmc.Core.Listeners;

import org.bukkit.entity.Item;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

/**
 * Created by Ben on 10/8/2016.
 */
public class PlayerPickupItemListener implements Listener
{

    @EventHandler
    public void onPlayerPickupItemEvent(PlayerPickupItemEvent e)
    {

        Item i = e.getItem();
        ItemStack stack = i.getItemStack();
        ItemMeta meta = stack.getItemMeta();

        if (meta.getDisplayName() == null)
            return;

        if (meta.getDisplayName().equalsIgnoreCase("NoPickup"))
        {

            e.setCancelled(true);

        }

    }

}

