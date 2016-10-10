package dev.amethystmc.Core.Listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.LeavesDecayEvent;

/**
 * Created by Ben on 10/10/2016.
 */
public class LeavesDecayListener implements Listener
{

    @EventHandler
    public void onLeafDecayEvent(LeavesDecayEvent e)
    {

        e.setCancelled(true);

    }

}

