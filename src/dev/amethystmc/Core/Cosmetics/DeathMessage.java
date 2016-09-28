package dev.amethystmc.Core.Cosmetics;

import dev.amethystmc.Core.Database.Players.Rank;
import dev.amethystmc.Core.Utils.ItemUtil;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

/**
 * Created by Ben on 9/27/2016.
 */
public enum DeathMessage
{

    YOU_GOT_ME_THIS_TIME("You got me this time", "&bYou got me this time!", ItemUtil.createItem(Material.ANVIL, "&bYou got me this time!"), Rank.PREMIUM, 11),
    YOLO("You Only Live Once", "&cYou Only Live Once!", ItemUtil.createItem(Material.ANVIL, "&cYou Only Live Once!"), Rank.PREMIUM, 12);

    String name;
    String deathMessage;
    ItemStack stack;
    Rank requiredRank;
    int slot;

    DeathMessage(String name, String deathMessage, ItemStack stack, Rank requiredRank, int slot)
    {

        this.name = name;
        this.deathMessage = deathMessage;
        this.stack = stack;
        this.requiredRank = requiredRank;
        this.slot = slot;

    }

    public String getName()
    {

        return name;

    }

    public String getDeathMessage()
    {

        return deathMessage;

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

