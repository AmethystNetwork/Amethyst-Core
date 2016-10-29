package dev.amethystmc.Core.Listeners;

import dev.amethystmc.Core.Utils.TabUtil;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

/**
 * Created by Ben on 10/26/2016.
 */
public class PlayerJoinLisetner implements Listener
{

    @EventHandler
    public void onPlayerJoinEvent(PlayerJoinEvent e)
    {

        Player p = e.getPlayer();

        TabUtil.setPlayerList(p, "&d&lAmethystMC", "&bShop: &eshop.amethystmc.com" + "     " + "&bForums: &eamethystmc.com");

    }

}

