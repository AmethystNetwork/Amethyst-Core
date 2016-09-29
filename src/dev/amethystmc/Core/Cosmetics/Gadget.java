package dev.amethystmc.Core.Cosmetics;

import dev.amethystmc.Core.Database.Players.Rank;
import dev.amethystmc.Core.Utils.ItemUtil;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

/**
 * Created by Ben on 9/27/2016.
 */
public enum Gadget
{

    PAINTBALL_GUN("Paintball Gun", ItemUtil.createItem(Material.DIAMOND_BARDING, "&dPaintball Gun"), Rank.PREMIUM, 11),
    EGG_CANNON("Egg Cannon", ItemUtil.createItem(Material.EGG, "&dEgg Cannon"), Rank.PREMIUM, 12),
    JUMP_PAD("Jump Pad", ItemUtil.createItem(Material.GOLD_PLATE, "&dJump Pad"), Rank.PREMIUM, 13),
    TNT_FOUNTAIN("TnT Fountain", ItemUtil.createItem(Material.TNT, "&dTnT Fountain"), Rank.PREMIUM, 14),
    EXPLOSIVE_BOW("Explosive Bow", ItemUtil.createItem(Material.BOW, "&dExplosive Bow"), Rank.PREMIUM, 15),
    FLYING_PIG("Flying Pig", ItemUtil.createItem(Material.SADDLE, "&dFlying Pig"), Rank.PREMIUM, 20),
    FIREWORK("Firework", ItemUtil.createItem(Material.FIREWORK, "&dFirework"), Rank.PREMIUM, 21);

    String name;
    ItemStack stack;
    Rank requiredRank;
    int slot;

    Gadget(String name, ItemStack stack, Rank requiredRank, int slot)
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

