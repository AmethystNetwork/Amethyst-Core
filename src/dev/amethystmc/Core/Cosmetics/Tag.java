package dev.amethystmc.Core.Cosmetics;

import dev.amethystmc.Core.Database.Players.Rank;
import dev.amethystmc.Core.Utils.ItemUtil;
import dev.amethystmc.Core.Utils.MessageUtil;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Created by Ben on 9/27/2016.
 */
public enum  Tag
{

    GOD("God", "&7[&6God&7]", ItemUtil.createItem(Material.NAME_TAG, "&7[&6God&7]"), Rank.PREMIUM, 11),
    PVP("PVP", "&7[&3PVP&7]", ItemUtil.createItem(Material.NAME_TAG, "&7[&3PVP&7]"), Rank.PREMIUM, 12),
    EGIRL("EGirl", "&7[&5EGirl&7]", ItemUtil.createItem(Material.NAME_TAG, "&7[&5EGirl&7]"), Rank.PREMIUM, 13),
    AMETHYST("Amethyst", "&7[&dAmethyst&7]", ItemUtil.createItem(Material.NAME_TAG, "&7[&dAmethyst&7]"), Rank.PREMIUM, 14),
    TRYHARD("Tryhard", "&7[&cTryHard&7]", ItemUtil.createItem(Material.NAME_TAG, "&7[&cTryHard&7]"), Rank.PREMIUM, 15),
    BOSS("Boss", "&7[&9Boss&7]", ItemUtil.createItem(Material.NAME_TAG, "&7[&9Boss&7]"), Rank.PREMIUM, 20),
    KILLER("Killer", "&7[&eKiller&7]", ItemUtil.createItem(Material.NAME_TAG, "&7[&eKiller&7]"), Rank.PREMIUM, 21),
    SWAG("Swag", "&7[&2Swag&7]", ItemUtil.createItem(Material.NAME_TAG, "&7[&2Swag&7]"), Rank.PREMIUM, 22),
    BANNED("Banned", "&7[&4Banned&7]", ItemUtil.createItem(Material.NAME_TAG, "&7[&4Banned&7]"), Rank.PREMIUM, 23),
    NONE("None", " ", ItemUtil.createItem(Material.AIR), Rank.MEMBER, 34);

    public String name;
    public String tag;
    public ItemStack stack;
    public Rank requiredRank;
    public int slot;

    Tag(String name, String tag, ItemStack stack, Rank requiredRank, int slot)
    {

        this.name = name;
        this.tag = tag;
        this.stack = stack;
        this.requiredRank = requiredRank;
        this.slot = slot;

    }

    public String getName()
    {

        return name;

    }

    public String getTag()
    {

        return tag;

    }

    public ItemStack getStack()
    {

        return stack;

    }

    public Rank getRequiredRank()
    {

        return requiredRank;

    }

    public int getSlot()
    {

        return slot;

    }

    private static Map<UUID, Tag> players = new HashMap<>();

    public static void addTag(Player p, Tag t)
    {

        players.put(p.getUniqueId(), t);

    }

    public static void removeTag(Player p)
    {

        players.remove(p.getUniqueId());

    }

    public static Tag getTag(Player p)
    {

        return players.get(p.getUniqueId());

    }

    public static boolean hasTag(Player p)
    {

        return players.containsKey(p.getUniqueId());

    }

}

