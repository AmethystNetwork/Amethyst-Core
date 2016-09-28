package dev.amethystmc.Core.Cosmetics;

import dev.amethystmc.Core.Database.Players.Rank;
import dev.amethystmc.Core.Utils.ItemUtil;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

/**
 * Created by Ben on 9/27/2016.
 */
public enum Cosmetic
{

    HATS("Hats", ItemUtil.createItem(Material.BEACON, "&e&l&nHats", " ", "&7&nDescription", "&fSelect a super cool hat to wear", "&facross the whole network in all the lobbies!"), Rank.PREMIUM, 11),
    GADGETS("Gadgets", ItemUtil.createItem(Material.FIREWORK, "&e&l&nGadgets", " ", "&7&nDescription", "&fThrow a party with some of these", "&ffun gadgets that work across the whole network!"), Rank.PREMIUM, 12),
    TAGS("Tags", ItemUtil.createItem(Material.NAME_TAG, "&e&l&nTags", " ", "&7&nDescription", "&fShow off your supporter tags by", "&ftalking in chat on the whole network!"), Rank.PREMIUM, 13),
    ARROW_TRAILS("Arrow Trails", ItemUtil.createItem(Material.ARROW, "&e&l&nArrow Trails", " ", "&7&nDescription", "&fShoot unique arrow effects by selecting", "&fany Arrow Trail from this menu!"), Rank.PREMIUM, 14),
    DEATH_MESSAGES("Death Messages", ItemUtil.createItem(Material.ANVIL, "&e&l&nDeath Messages", " ", "&7&nDescription", "&fGive a breif message in chat after", "&fyou die in any of our gamemodes!"), Rank.PREMIUM, 15),
    VICTORY_MESSAGES("Victory Messages", ItemUtil.createItem(Material.EMERALD, "&e&l&nVictory Messages", " ", "&7&nDescription", "&fLet everybody know you won the game", "&fby shouting a message in game after you win!"), Rank.PREMIUM, 20),
    CHAT_COLOR("Chat Color", ItemUtil.createItem(Material.BOOK, "&e&l&nChat Color", "&7Change your color", " ", "&7&nDescription", "&fChange the color of your chat by", "&fselecting a color from this menu!"), Rank.PREMIUM, 21),
    WARDROBE("Wardrobe", ItemUtil.createItem(Material.DIAMOND_CHESTPLATE, "&e&l&nWardrobe", " ", "&7&nDescription", "&fCustomize your outfit in the network by", "&fselecting any of the wardrobe items!"), Rank.PREMIUM, 22),
    PETS("Pets", ItemUtil.createItem(Material.BONE, "&e&l&nPets", " ", "&7&nDescription", "&fGrab a pet that will follow you around", "&fthe whole network. You can even ride", "&fyour pet too!"), Rank.PREMIUM, 23),
    PARTICLES("Particles", ItemUtil.createItem(Material.BLAZE_POWDER, "&e&l&nParticles", " ", "&7&nDescription", "&fSelect a nice particle effect to show up", "&fbehind you as you walk around the network!"), Rank.PREMIUM, 24),
    CRATE("Crate", ItemUtil.createItem(Material.CHEST, "&e&l&nCrate", " ", "&7&nDescription", "&fUnlock unique cosmetic items from this crate.", "&fItems contain, Hats, Gadgets, and Particles!"), Rank.PREMIUM, 31);


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

