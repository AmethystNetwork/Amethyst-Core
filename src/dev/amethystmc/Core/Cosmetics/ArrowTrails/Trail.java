package dev.amethystmc.Core.Cosmetics.ArrowTrails;

import dev.amethystmc.Core.Core;
import net.minecraft.server.v1_8_R3.EnumParticle;
import net.minecraft.server.v1_8_R3.PacketPlayOutWorldParticles;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.*;

/**
 * Created by Ben on 9/27/2016.
 */
public class Trail
{

    private static Map<UUID, Trail> players = new HashMap<>();

    private EnumParticle e;

    private List<Arrow> arrows = new ArrayList<>();

    public Trail(EnumParticle e)
    {

        this.e = e;

    }

    public void addArrow(Arrow a)
    {

        arrows.add(a);

    }

    public void tick()
    {

        for (Arrow a : arrows)
        {

            if (a.isOnGround() || a.isDead() || a == null)
            {

                arrows.remove(a);
                return;

            }

            else
            {

                particle(a.getLocation());

            }

        }

    }

    private void particle(Location loc)
    {

        PacketPlayOutWorldParticles packet = new PacketPlayOutWorldParticles(e, true, (float) loc.getX(), (float) loc.getY(), (float) loc.getZ(), 0, 0, 0, 0, 15, null);

        for (Player online : Bukkit.getOnlinePlayers())
        {

            ((CraftPlayer) online).getHandle().playerConnection.sendPacket(packet);

        }

    }

    public static void addTrail(Player p, EnumParticle e)
    {

        players.put(p.getUniqueId(), new Trail(e));

    }

    public static void removeTrail(Player p)
    {

        players.remove(p.getUniqueId());

    }

    public static Trail getTrail(Player p)
    {

        return players.get(p.getUniqueId());

    }

    public static boolean hasTrail(Player p)
    {

        return players.containsKey(p.getUniqueId());

    }

    public static void startArrows()
    {

        new BukkitRunnable()
        {
            @Override
            public void run() {
                for (Trail t : players.values())
                {

                    t.tick();

                }
            }
        }.runTaskTimerAsynchronously(Core.getInstance(), 0, 1);

    }


}

