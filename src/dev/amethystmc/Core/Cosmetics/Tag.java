package dev.amethystmc.Core.Cosmetics;

import dev.amethystmc.Core.Utils.ItemUtil;
import dev.amethystmc.Core.Utils.MessageUtil;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

/**
 * Created by Ben on 9/27/2016.
 */
public enum  Tag
{

    GOD("God", "&7[&6God&7]", ItemUtil.createItem(Material.NAME_TAG, "&7[&6God&7]"), 11),
    PVP("PVP", "&7[&3PVP&7]", ItemUtil.createItem(Material.NAME_TAG, "&7[&3PVP&7]"), 12),
    EGIRL("EGirl", "&7[&dEGirl&7]", ItemUtil.createItem(Material.NAME_TAG, "&7[&dEGirl&7]"), 13),
    AMETHYST("Amethyst", "&7[&dAmethyst&7]", ItemUtil.createItem(Material.NAME_TAG, "&7[&dAmethyst&7]"), 14),
    TRYHARD("Tryhard", "&7[&cTryHard&7]", ItemUtil.createItem(Material.NAME_TAG, "&7[&cTryHard&7]"), 15),
    BOSS("Boss", "&7[&9Boss&7]", ItemUtil.createItem(Material.NAME_TAG, "&7[&9Boss&7]"), 20),
    KILLER("Killer", "&7[&eKiller&7]", ItemUtil.createItem(Material.NAME_TAG, "&7[&eKiller&7]"), 21),
    SWAG("Swag", "&7[&2Swag&7]", ItemUtil.createItem(Material.NAME_TAG, "&7[&2Swag&7]"), 22),
    BANNED("Banned", "&7[&4Banned&7]", ItemUtil.createItem(Material.NAME_TAG, "&7[&4Banned&7]"), 23);

    public String name;
    public String tag;
    public ItemStack stack;
    public int slot;

    Tag(String name, String tag, ItemStack stack, int slot)
    {

        this.name = name;
        this.tag = tag;
        this.stack = stack;
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

    public int getSlot()
    {

        return slot;

    }

}

