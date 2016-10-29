package dev.amethystmc.Core.Commands;

import dev.amethystmc.Core.Server.ServerHandler;
import dev.amethystmc.Core.Server.Servers;
import dev.amethystmc.Core.Utils.CommandUtil;
import dev.amethystmc.Core.Utils.MessageUtil;
import net.minecraft.server.v1_8_R3.MinecraftServer;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.v1_8_R3.SpigotTimings;
import org.bukkit.entity.Player;

/**
 * Created by Ben on 10/25/2016.
 */
public class ServerCommand extends CommandUtil
{

    public ServerCommand(String command, String usage, String description)
    {
        super(command, usage, description);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {

        Player p = (Player) sender;

        if (cmd.getName().equalsIgnoreCase("server") && args.length <= 0)
        {

            MessageUtil.sendRawMessage(p, "&e/server performance");
            MessageUtil.sendRawMessage(p, "&e/server create <name>");
            MessageUtil.sendRawMessage(p, "&e/server remove <name>");

        }

        else if (args[0].equalsIgnoreCase("performance") && args.length == 1)
        {

            MessageUtil.sendRawMessage(p, "&7&m----------------------------------------");
            MessageUtil.sendRawMessage(p, "&6Server &8» " + Servers.getHubServer().getName());
            MessageUtil.sendRawMessage(p, "&6Info &8» " + Servers.getHubServer().getInfo());
            MessageUtil.sendRawMessage(p, "&6TPS &8» &b" + ServerHandler.getTPS());
            MessageUtil.sendRawMessage(p, "&6Performance &8» " + ServerHandler.determineTPSRange());
            MessageUtil.sendRawMessage(p, "&6Lag Percentage&8» &f" + ServerHandler.determineLagPercentage());
            MessageUtil.sendRawMessage(p, "&6Memory Used &8» &f" + String.valueOf(ServerHandler.getUsedRam()) + "%");
            MessageUtil.sendRawMessage(p, "&6Players &8» &a" + Bukkit.getOnlinePlayers().size() + "/100");
            MessageUtil.sendRawMessage(p, "&7&m----------------------------------------");

        }

        else if (args[0].equalsIgnoreCase("create") && args.length == 2)
        {

            MessageUtil.sendDeveloperMessage(p, "&cComing Soon!");

        }

        else if (args[0].equalsIgnoreCase("remove") && args.length == 2)
        {

            MessageUtil.sendDeveloperMessage(p, "&cComing Soon!");

        }

        return true;

    }

}

