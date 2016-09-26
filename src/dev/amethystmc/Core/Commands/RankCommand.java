package dev.amethystmc.Core.Commands;

import dev.amethystmc.Core.Database.Players.AmethystPlayer;
import dev.amethystmc.Core.Database.Players.Rank;
import dev.amethystmc.Core.Utils.CommandUtil;
import dev.amethystmc.Core.Utils.MessageUtil;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Ben on 9/26/2016.
 */
public class RankCommand extends CommandUtil
{

    public RankCommand(String command, String usage, String description)
    {
        super(command, usage, description);
    }


    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {

        if (sender instanceof Player) {
            Player p = (Player) sender;
            AmethystPlayer ap = new AmethystPlayer(p);
            if (ap.getRank().getId() < Rank.SRADMIN.getId()) {
                MessageUtil.sendNoPermissionMessage(p, Rank.SRADMIN);
                return false;
            }
        }
        else if (sender instanceof ConsoleCommandSender)
        {
            Rank rank = Rank.SRADMIN;
        }
        if (args.length < 2 || args[1] == null) {
            MessageUtil.sendRawMessage(sender, "&e/rank set <player> <rank>");
            return false;
        }
        String rankStr = args[2];
        Rank newRank = null;

        switch (rankStr.toLowerCase()) {
            case "member":
                newRank = Rank.MEMBER;
                break;
            case "premium":
                newRank = Rank.PREMIUM;
                break;
            case "elite":
                newRank = Rank.ELITE;
                break;
            case "platinum":
                newRank = Rank.PLATINUM;
                break;
            case "builder":
                newRank = Rank.BUILDER;
                break;
            case "vip":
                newRank = Rank.VIP;
                break;
            case "jrdev":
                newRank = Rank.JRDEV;
            case "jrmod":
                newRank = Rank.JRMOD;
                break;
            case "mod":
                newRank = Rank.MOD;
                break;
            case "admin":
                newRank = Rank.ADMIN;
                break;
            case "dev":
                newRank = Rank.DEV;
                break;
            case "sradmin":
                newRank = Rank.SRADMIN;
                break;
            case "owner":
                newRank = Rank.OWNER;
                break;
        }

        if (newRank == null) {
            MessageUtil.sendRawMessage(sender, "&e/rank set <player> <rank>");
            return false;
        }

        try {
            Player p = Bukkit.getPlayer(args[1]);
            AmethystPlayer ap = new AmethystPlayer(p);

            ap.setRank(newRank);
            MessageUtil.sendRawMessage(sender, "&ePlayers rank has been set to " + newRank.getPrefix());
            MessageUtil.sendRawMessage(p, "&eYour rank has been set to " + newRank.getPrefix());
        }
        catch (NullPointerException ex) {
        }

        return false;
    }

    public List<String> onTabComplete(CommandSender sender, Command cmd, String label, String[] args)
    {
        if (args.length == 2) {
            List<String> players = new ArrayList<>();
            for (Player ps : Bukkit.getOnlinePlayers()) {
                players.add(ps.getDisplayName());
            }
            return players;
        }
        else if (args.length == 3) {
            return Arrays.asList("member", "premium", "elite", "platinum", "builder", "vip", "jrdev", "jrmod", "mod", "admin", "dev", "sradmin", "owner");
        }
        return null;
    }

}


