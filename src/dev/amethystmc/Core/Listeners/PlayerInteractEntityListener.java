package dev.amethystmc.Core.Listeners;

import dev.amethystmc.Core.Cosmetics.Hat;
import dev.amethystmc.Core.Database.Players.AmethystPlayer;
import dev.amethystmc.Core.Interfaces.Interfaces;
import dev.amethystmc.Core.Utils.MessageUtil;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;

/**
 * Created by Ben on 10/5/2016.
 */
public class PlayerInteractEntityListener implements Listener
{

    @EventHandler
    public void onPlayerInteractEntityEvent(PlayerInteractEntityEvent e)
    {

        Player p = e.getPlayer();
        AmethystPlayer ap = new AmethystPlayer(p);
        Entity v = e.getRightClicked();

        if (!(v instanceof Villager))
            return;

        Villager villager = (Villager) v;

        if (villager.getCustomName() == null)
            return;

        if (villager.getCustomName().equalsIgnoreCase(MessageUtil.colorize("&7&oCosmetics")))
        {

            e.setCancelled(true);
            Interfaces.getCosmeticInterface().open(p);

        }

    }

}

