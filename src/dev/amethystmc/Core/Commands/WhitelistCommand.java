package dev.amethystmc.Core.Commands;

import dev.amethystmc.Core.Interfaces.Interfaces;
import dev.amethystmc.Core.Utils.CommandUtil;
import dev.amethystmc.Core.Utils.MessageUtil;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * Created by Ben on 10/24/2016.
 */
public class WhitelistCommand extends CommandUtil
{

    public WhitelistCommand(String command, String usage, String description)
    {
        super(command, usage, description);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {

        Player p = (Player) sender;

        if (cmd.getName().equalsIgnoreCase("whitelist") && args.length <= 0)
        {

            Interfaces.getWhitelistInterface().open(p);

        }

        else if (args[0].equalsIgnoreCase("add") && args.length == 2)
        {

            OfflinePlayer player = Bukkit.getOfflinePlayer(args[1]);
            Bukkit.getWhitelistedPlayers().add(player);
            MessageUtil.sendRawMessage(p, "&aAdded &e" + player.getName() + "&a to the Whitelist!");

        }

        else if (args[0].equalsIgnoreCase("remove") && args.length == 2)
        {

            OfflinePlayer player = Bukkit.getOfflinePlayer(args[1]);
            Bukkit.getWhitelistedPlayers().remove(player);
            MessageUtil.sendRawMessage(p, "&cRemoved &e" + player.getName() + "&c from the Whitelist!");

        }

        return true;

    }

}


