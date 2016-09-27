package dev.amethystmc.Core.Cosmetics.ArrowTrails.Listeners;

import dev.amethystmc.Core.Cosmetics.ArrowTrails.Trail;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileLaunchEvent;

/**
 * Created by Ben on 9/27/2016.
 */
public class ProjectileLaunchListener implements Listener
{

    @EventHandler
    public void onProjectileLaunchEvent(ProjectileLaunchEvent e)
    {

        if (e.getEntity().getShooter() != null)
        {

            if (e.getEntity().getShooter() instanceof Player)
            {

                if (e.getEntity() instanceof Arrow)
                {

                    Player p = (Player) e.getEntity().getShooter();
                    if (Trail.hasTrail(p))
                    {

                        Trail.getTrail(p).addArrow((Arrow) e.getEntity());

                    }

                }

            }

        }

    }

}

