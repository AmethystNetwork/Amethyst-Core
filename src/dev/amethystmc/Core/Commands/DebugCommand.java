package dev.amethystmc.Core.Commands;

import dev.amethystmc.Core.Interfaces.Interfaces;
import dev.amethystmc.Core.NPC.NPC;
import dev.amethystmc.Core.Utils.CommandUtil;
import dev.amethystmc.Core.Utils.MessageUtil;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;

/**
 * Created by Ben on 9/27/2016.
 */
public class DebugCommand extends CommandUtil
{

    public DebugCommand(String command, String usage, String description)
    {
        super(command, usage, description);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {

        if (cmd.getName().equalsIgnoreCase("debug"))
        {

            Player p = (Player) sender;
            MessageUtil.sendClickableAndHoveringMessage(p, "&7Click to teleport to &e&lCosmetic Shop&7...", "&bClick to teleport", "/tp 94 111 45");

        }

        return true;

    }

}

