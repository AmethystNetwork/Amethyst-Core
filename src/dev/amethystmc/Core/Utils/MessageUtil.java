package dev.amethystmc.Core.Utils;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

/**
 * Created by Ben on 9/25/2016.
 */
public class MessageUtil
{

    public static String PREFIX = colorize("&dAmethystMC &7» ");
    public static String DEV_PREFIX = colorize("&dAmethyst &2&lD&d&lE&e&lV &7» ");

    public static void sendNoPermissionMessage(Player p)
    {

        p.sendMessage(PREFIX + "&cYou don't have permission for this!");

    }

    public static void sendSomethingIsBrokenMessage(Player p)
    {

        p.sendMessage(DEV_PREFIX + "&4UH OH! Something has broken!");

    }

    public static void sendRawMessage(Player p, String... msg)
    {

        for (String message : msg)
        {

            p.sendMessage(PREFIX + message);

        }

    }

    public static void sendDeveloperMessage(Player p, String... msg)
    {

        for (String message : msg)
        {

            p.sendMessage(DEV_PREFIX + message);

        }

    }

    public static String colorize(String input)
    {

        return ChatColor.translateAlternateColorCodes('&', input);

    }

}

