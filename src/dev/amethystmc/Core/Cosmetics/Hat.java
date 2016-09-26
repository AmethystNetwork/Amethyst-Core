package dev.amethystmc.Core.Cosmetics;

import dev.amethystmc.Core.Database.Players.Rank;
import org.bukkit.Material;

/**
 * Created by Ben on 9/26/2016.
 */
public enum Hat
{

    GLASS("Glass", "&dGlass Hat", Material.GLASS, Rank.PREMIUM, 10),
    SPONGE("Sponge", "&dSponge Hat", Material.SPONGE, Rank.PREMIUM, 11),
    CACTUS("Cactus", "&Cactus Hat", Material.CACTUS, Rank.PREMIUM, 12), ;

    String name;
    String displayName;
    Material material;
    Rank requiredRank;
    int slot;

    Hat(String name, String displayName, Material material, Rank requiredRank, int slot)
    {

        this.name = name;
        this.displayName = displayName;
        this.material = material;
        this.requiredRank = requiredRank;
        this.slot = slot;

    }

}

