package dev.amethystmc.Core.Cosmetics;

import dev.amethystmc.Core.Cosmetics.ArrowTrails.Trail;
import dev.amethystmc.Core.Database.Players.Rank;
import dev.amethystmc.Core.Utils.ItemUtil;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Created by Ben on 9/27/2016.
 */
public enum ArrowTrail
{

    FLAME("Flame", ItemUtil.createItem(Material.BLAZE_POWDER, "&dFlame Trail"), Rank.PREMIUM, 11),
    WATER("Water", ItemUtil.createItem(Material.WATER_BUCKET, "&dWater Trail"), Rank.PREMIUM, 12),
    SLIME("Slime", ItemUtil.createItem(Material.SLIME_BALL, "&dSlime Trail"), Rank.PREMIUM, 13),
    FIREWORK("Firework", ItemUtil.createItem(Material.FIREWORK, "&dFirework Trail"), Rank.PREMIUM, 14),
    SMOKE("Smoke", ItemUtil.createItem(Material.FIREWORK_CHARGE, "&dSmoke Trail"), Rank.PREMIUM, 15),
    SNOW("Snow", ItemUtil.createItem(Material.SNOW_BALL, "&dSnow Trail"), Rank.PREMIUM, 20),
    HEART("Heart", ItemUtil.createItem(Material.REDSTONE, "&dHeart Trail"), Rank.PREMIUM, 21),
    EMERALD("Emerald", ItemUtil.createItem(Material.EMERALD, "&dEmerald Trail"), Rank.PREMIUM, 22),
    ENCHANTMENT("Enchantment", ItemUtil.createItem(Material.EXP_BOTTLE, "&dEnchantment Trail"), Rank.PREMIUM, 23),
    REMOVE("Remove", ItemUtil.createItem(Material.BARRIER, "&cRemove Trail"), Rank.MEMBER, 24),
    NONE("None", ItemUtil.createItem(Material.AIR), Rank.MEMBER, 25);

    String name;
    ItemStack stack;
    Rank requiredRank;
    int slot;

    ArrowTrail(String name, ItemStack stack, Rank requiredRank, int slot)
    {

        this.name = name;
        this.stack = stack;
        this.requiredRank = requiredRank;
        this.slot = slot;

    }

    public String getName()
    {

        return name;

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

    private static Map<UUID, ArrowTrail> players = new HashMap<>();

    public static void addTrail(Player p, ArrowTrail t)
    {

        players.put(p.getUniqueId(), t);

    }

    public static void removeTrail(Player p)
    {

        players.remove(p.getUniqueId());

    }

    public static ArrowTrail getTrail(Player p)
    {

        return players.get(p.getUniqueId());

    }

    public static boolean hasTrail(Player p)
    {

        return players.containsKey(p.getUniqueId());

    }
}

