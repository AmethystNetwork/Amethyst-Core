package dev.amethystmc.Core.Commands;

import dev.amethystmc.Core.Database.Players.AmethystPlayer;
import dev.amethystmc.Core.Database.Players.Rank;
import dev.amethystmc.Core.Utils.CommandUtil;
import dev.amethystmc.Core.Utils.MessageUtil;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * Created by Ben on 9/26/2016.
 */
public class StaffChatCommand extends CommandUtil
{

    public StaffChatCommand(String command, String usage, String description)
    {
        super(command, usage, description);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {

        if (cmd.getName().equalsIgnoreCase("staffchat"))
        {

            Player p = (Player) sender;
            AmethystPlayer ap = new AmethystPlayer(p);

            if (ap.getRank().getId() >= Rank.JRMOD.getId())
            {

                if (ap.isStaffChatEnabled() == true)
                {

                    ap.removePlayerFromStaffChat();

                }

                else
                {

                    ap.addPlayerToStaffChat();

                }

            }

        }

        return true;

    }

}

