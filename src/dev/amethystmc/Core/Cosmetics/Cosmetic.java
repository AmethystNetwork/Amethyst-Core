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

    HATS("Hats", Rank.PREMIUM, 11),
    GADGETS("Gadgets", Rank.PREMIUM, 12),
    TAGS("Tags", Rank.PREMIUM, 13),
    ARROW_TRAILS("Arrow Trails", Rank.PREMIUM, 14),
    DEATH_MESSAGES("Death Messages", Rank.PREMIUM, 15),
    VICTORY_MESSAGES("Victory Messages", Rank.PREMIUM, 20),
    CHAT_COLOR("Chat Color", Rank.PREMIUM, 21),
    WARDROBE("Wardrobe", Rank.PREMIUM, 22),
    PETS("Pets", Rank.PREMIUM, 23),
    PARTICLES("Particles", Rank.PREMIUM, 24),
    CRATE("Crate", Rank.PREMIUM, 31);


    String name;
    Rank requiredRank;
    int slot;

    Cosmetic(String name, Rank requiredRank, int slot) {

        this.name = name;
        this.requiredRank = requiredRank;
        this.slot = slot;

    }

    public String getName()
    {

        return name;

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

