package dev.amethystmc.Core.Listeners;

import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

/**
 * Created by Ben on 10/8/2016.
 */
public class EntityDamageByEntityListener implements Listener
{

    @EventHandler
    public void onEntityDamageByEntityEvent(EntityDamageByEntityEvent e)
    {

        Entity damager = e.getDamager();
        Entity damaged = e.getEntity();

        if (damager instanceof Player && damaged instanceof Villager || damaged instanceof Bat || damaged instanceof ArmorStand)
        {

            e.setCancelled(true);

        }

    }

}

