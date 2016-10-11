package dev.amethystmc.Core.Utils;

import org.bukkit.Effect;
import org.bukkit.Location;

/**
 * Created by Ben on 10/11/2016.
 */
public class ParticleUtil
{

    public static void runHelixEffect(Location loc, Effect e)
    {
        double radius = 5;
        for (double y = 5; y >= 0; y -= 0.007) {
            radius = y / 3;
            double x = radius * Math.cos(3 * y);
            double z = radius * Math.sin(3 * y);
            double y2 = 5 - y;
            Location loc2 = new Location(loc.getWorld(), loc.getX() + x, loc.getY() + y2, loc.getZ() + z);
            loc2.getWorld().playEffect(loc2, e, 0);
        }
        for (double y = 5; y >= 0; y -= 0.007) {
            radius = y / 3;
            double x = -(radius * Math.cos(3 * y));
            double z = -(radius * Math.sin(3 * y));
            double y2 = 5 - y;
            Location loc2 = new Location(loc.getWorld(), loc.getX() + x, loc.getY() + y2, loc.getZ() + z);
            loc2.getWorld().playEffect(loc2, e, 0);
        }
    }

    public static void runDualHelixEffect(Location loc, Effect e, Effect e2)
    {
        double radius = 3;
        for (double y = 5; y >= 0; y -= 0.007) {
            radius = y / 2;
            double x = radius * Math.cos(3 * y);
            double z = radius * Math.sin(3 * y);
            double y2 = 5 - y;
            Location loc2 = new Location(loc.getWorld(), loc.getX() + x, loc.getY() + y2, loc.getZ() + z);
            loc2.getWorld().playEffect(loc2, e, 0);
        }
        for (double y = 5; y >= 0; y -= 0.007) {
            radius = y / 2;
            double x = -(radius * Math.cos(3 * y));
            double z = -(radius * Math.sin(3 * y));
            double y2 = 5 - y;
            Location loc2 = new Location(loc.getWorld(), loc.getX() + x, loc.getY() + y2, loc.getZ() + z);
            loc2.getWorld().playEffect(loc2, e2, 0);
        }
    }

    public static void runAboveHeadEffect(Location location, Effect effect, boolean v)
    {
        for (int i = 0; i <= 1; i += ((!v && (i == 3)) ? 2 : 1)) {
            location.getWorld().playEffect(location, effect, i);
        }
    }

    public static void runCircleEffect(Location loc, Effect e) {

        int x;
        int y = loc.getBlockY();
        int z;
        int r = 1;

        for (double i = 0.1; i < 360.0; i += 0.1) {
            double angle = Math.PI / 180;
            x = (int) (loc.getX() + r * Math.cos(angle));
            z = (int) (loc.getZ() + r * Math.sin(angle));

            Location loc2 = new Location(loc.getWorld(), loc.getX() + x, loc.getY() + y, loc.getZ() + z);
            loc.getWorld().playEffect(loc2, e, 0.3);
        }
    }

}

