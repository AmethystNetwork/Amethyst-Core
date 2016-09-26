package dev.amethystmc.Core.Commands;

import dev.amethystmc.Core.Utils.CommandUtil;
import dev.amethystmc.Core.Utils.MessageUtil;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * Created by Ben on 9/25/2016.
 */
public class HelpCommand extends CommandUtil
{

    public HelpCommand(String command, String usage, String description)
    {
        super(command, usage, description);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {

        if (cmd.getName().equalsIgnoreCase("help"))
        {

            Player p = (Player) sender;
            MessageUtil.sendRawMessage(p, "&7&m------------------------------");
            MessageUtil.sendRawMessage(p, "&a/list &7(View online players)");
            MessageUtil.sendRawMessage(p, "&a/find &7(Find a player on the network)");
            MessageUtil.sendRawMessage(p, "&a/fiend &7(Coming soon)");
            MessageUtil.sendRawMessage(p, "&a/party &7(Coming soon)");
            MessageUtil.sendRawMessage(p, "&7&m------------------------------");

        }

        return true;

    }

}

