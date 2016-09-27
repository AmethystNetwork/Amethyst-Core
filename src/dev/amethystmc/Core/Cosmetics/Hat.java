package dev.amethystmc.Core.Cosmetics;

import dev.amethystmc.Core.Database.Players.Rank;
import dev.amethystmc.Core.Utils.ItemUtil;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

/**
 * Created by Ben on 9/26/2016.
 */
public enum Hat
{

    GLASS("Glass", ItemUtil.createItem(Material.GLASS, "&dGlass Hat", "&7Requires Rank:" + Rank.PREMIUM.getPrefix()), Rank.PREMIUM, 11),
    SPONGE("Sponge", ItemUtil.createItem(Material.SPONGE, "&dSponge Hat", "&7Requires Rank:" + Rank.PREMIUM.getPrefix()), Rank.PREMIUM, 12),
    CACTUS("Cactus", ItemUtil.createItem(Material.CACTUS, "&dCactus Hat", "&7Requires Rank:" + Rank.PREMIUM.getPrefix()), Rank.PREMIUM, 13),
    GRASS("Grass", ItemUtil.createItem(Material.GRASS, "&dGrass Hat", "&7Requires Rank:" + Rank.PREMIUM.getPrefix()), Rank.PREMIUM, 14),
    IRON("Iron", ItemUtil.createItem(Material.IRON_BLOCK, "&dIron Hat", "&7Requires Rank:" + Rank.PREMIUM.getPrefix()), Rank.PREMIUM, 15),
    GOLD("Gold", ItemUtil.createItem(Material.GOLD_BLOCK, "&dGold Hat", "&7Requires Rank:" + Rank.PREMIUM.getPrefix()), Rank.PREMIUM, 20),
    DIAMOND("Diamond", ItemUtil.createItem(Material.DIAMOND_BLOCK, "&dDiamond Hat", "&7Requires Rank:" + Rank.PREMIUM.getPrefix()), Rank.PREMIUM, 21),
    EMERALD("Emerald", ItemUtil.createItem(Material.EMERALD_BLOCK, "&dEmerald Hat", "&7Requires Rank:" + Rank.PREMIUM.getPrefix()), Rank.PREMIUM, 22),
    WOOD("Wood", ItemUtil.createItem(Material.WOOD, "&dWood Hat", "&7Requires Rank:" + Rank.PREMIUM.getPrefix()), Rank.PREMIUM, 23),
    WOOL("Wool", ItemUtil.createItem(Material.WOOL, "&dWool Hat", "&7Requires Rank:" + Rank.PREMIUM.getPrefix()), Rank.PREMIUM, 24),
    BRICK("Brick", ItemUtil.createItem(Material.BRICK, "&dCactus Hat", "&7Requires Rank:" + Rank.PREMIUM.getPrefix()), Rank.PREMIUM, 29),
    BEDROCK("Bedrock", ItemUtil.createItem(Material.BEDROCK, "&dBedrock Hat", "&7Requires Rank:" + Rank.PREMIUM.getPrefix()), Rank.PREMIUM, 30),
    OBSIDIAN("Obsidian", ItemUtil.createItem(Material.OBSIDIAN, "&dObsidian Hat", "&7Requires Rank:" + Rank.PREMIUM.getPrefix()), Rank.PREMIUM, 31),
    GLOWSTONE("GlowStone", ItemUtil.createItem(Material.GLOWSTONE, "&dGlowstone Hat", "&7Requires Rank:" + Rank.PREMIUM.getPrefix()), Rank.PREMIUM, 32),
    REDSTONE("Redstone", ItemUtil.createItem(Material.REDSTONE_BLOCK, "&dRedstone Hat", "&7Requires Rank:" + Rank.PREMIUM.getPrefix()), Rank.PREMIUM, 33),
    MELON("Melon", ItemUtil.createItem(Material.MELON_BLOCK, "&dMelon Hat", "&7Requires Rank:" + Rank.PREMIUM.getPrefix()), Rank.PREMIUM, 11),
    ICE("Ice", ItemUtil.createItem(Material.ICE, "&dIce Hat", "&7Requires Rank:" + Rank.PREMIUM.getPrefix()), Rank.PREMIUM, 12);

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

}

