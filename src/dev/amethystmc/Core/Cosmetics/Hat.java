package dev.amethystmc.Core.Cosmetics;

import dev.amethystmc.Core.Cosmetics.ArrowTrails.Trail;
import dev.amethystmc.Core.Database.Players.Rank;
import dev.amethystmc.Core.Utils.ItemUtil;
import net.minecraft.server.v1_8_R3.EnumParticle;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Created by Ben on 9/26/2016.
 */
public enum Hat
{

    GLASS("Glass", ItemUtil.createItem(Material.GLASS, "&dGlass Hat"), Rank.PREMIUM, 11),
    SPONGE("Sponge", ItemUtil.createItem(Material.SPONGE, "&dSponge Hat"), Rank.PREMIUM, 12),
    CACTUS("Cactus", ItemUtil.createItem(Material.CACTUS, "&dCactus Hat"), Rank.PREMIUM, 13),
    GRASS("Grass", ItemUtil.createItem(Material.GRASS, "&dGrass Hat"), Rank.PREMIUM, 14),
    IRON("Iron", ItemUtil.createItem(Material.IRON_BLOCK, "&dIron Hat"), Rank.PREMIUM, 15),
    GOLD("Gold", ItemUtil.createItem(Material.GOLD_BLOCK, "&dGold Hat"), Rank.PREMIUM, 20),
    DIAMOND("Diamond", ItemUtil.createItem(Material.DIAMOND_BLOCK, "&dDiamond Hat"), Rank.PREMIUM, 21),
    EMERALD("Emerald", ItemUtil.createItem(Material.EMERALD_BLOCK, "&dEmerald Hat"), Rank.PREMIUM, 22),
    WOOD("Wood", ItemUtil.createItem(Material.WOOD, "&dWood Hat"), Rank.PREMIUM, 23),
    WOOL("Wool", ItemUtil.createItem(Material.WOOL, "&dWool Hat"), Rank.PREMIUM, 24),
    BRICK("Brick", ItemUtil.createItem(Material.BRICK, "&dCactus Hat"), Rank.PREMIUM, 29),
    BEDROCK("Bedrock", ItemUtil.createItem(Material.BEDROCK, "&dBedrock Hat"), Rank.PREMIUM, 30),
    OBSIDIAN("Obsidian", ItemUtil.createItem(Material.OBSIDIAN, "&dObsidian Hat"), Rank.PREMIUM, 31),
    GLOWSTONE("GlowStone", ItemUtil.createItem(Material.GLOWSTONE, "&dGlowstone Hat"), Rank.PREMIUM, 32),
    REDSTONE("Redstone", ItemUtil.createItem(Material.REDSTONE_BLOCK, "&dRedstone Hat"), Rank.PREMIUM, 33),
    NONE("None", ItemUtil.createItem(Material.AIR), Rank.MEMBER, 34);

    String name;
    ItemStack stack;
    Rank requiredRank;
    int slot;

    Hat(String name, ItemStack stack, Rank requiredRank, int slot)
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

    private static Map<UUID, Hat> players = new HashMap<>();

    public static void addHat(Player p, Hat h)
    {

        players.put(p.getUniqueId(), h);

    }

    public static void removeHat(Player p)
    {

        players.remove(p.getUniqueId());

    }

    public static Hat getHat(Player p)
    {

        return players.get(p.getUniqueId());

    }

    public static boolean hasHat(Player p)
    {

        return players.containsKey(p.getUniqueId());

    }

}

