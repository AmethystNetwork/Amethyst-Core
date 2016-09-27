package dev.amethystmc.Core.Cosmetics;

import dev.amethystmc.Core.Database.Players.Rank;
import dev.amethystmc.Core.Utils.ItemUtil;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

/**
 * Created by Ben on 9/27/2016.
 */
public enum Cosmetic {

    /*
    TODO Add Wardrobe, Pets, Particles,
     */

    HATS("Hats", ItemUtil.createItem(Material.BEACON, "&eHats", "&7Get cool hats", "&7to wear around the whole network!"), Rank.PREMIUM, 11),
    GADGETS("Gadgets", ItemUtil.createItem(Material.FIREWORK, "&eGadgets", "&7Throw a party in the lobby with", "&7some of these super cool", "&7gadgets!"), Rank.PREMIUM, 12),
    TAGS("Tags", ItemUtil.createItem(Material.NAME_TAG, "&eTags", "&7Show off your tag when you chat", "&7in game!"), Rank.PREMIUM, 13),
    ARROW_TRAILS("Arrow Trails", ItemUtil.createItem(Material.ARROW, "&eArrow Trails", "&7Shoot super cool particles", "&7from your bow!"), Rank.PREMIUM, 14),
    DEATH_MESSAGES("Death Messages", ItemUtil.createItem(Material.ANVIL, "&eDeath Messages", "&7Give a brief message when you die in a game!"), Rank.PREMIUM, 15),
    VICTORY_MESSAGES("Victory Messages", ItemUtil.createItem(Material.EMERALD, "&eVictory Messages", "&7Show off your victory", "&7with a unique message!"), Rank.PREMIUM, 20),
    CHAT_COLOR("Chat Color", ItemUtil.createItem(Material.BOOK, "&eChat Color", "&7Change your color", "&7in chat with this", "&7super cool feature!"), Rank.PREMIUM, 21),
    WARDROBE("Wardrobe", ItemUtil.createItem(Material.DIAMOND_CHESTPLATE, "&eWardrobe", "&7Change your style", "&7in the lobby with", "&7these cool outfits!"), Rank.PREMIUM, 22),
    PETS("Pets", ItemUtil.createItem(Material.BONE, "&ePets", "&7Grab a pet that will", "&7follow you around the lobby!"), Rank.PREMIUM, 23),
    PARTICLES("Particles", ItemUtil.createItem(Material.BLAZE_POWDER, "&eParticles", "&7Walk around in style with", "&7these particle effects!"), Rank.PREMIUM, 24),
    CRATE("Crate", ItemUtil.createItem(Material.CHEST, "&eCrate", "&7Unlock super cool", "&7and unique cosmetics", "&7from this crate!"), Rank.PREMIUM, 31);


    String name;
    ItemStack stack;
    Rank requiredRank;
    int slot;

    Cosmetic(String name, ItemStack stack, Rank requiredRank, int slot) {

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

