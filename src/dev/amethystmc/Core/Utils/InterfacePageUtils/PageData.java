package dev.amethystmc.Core.Utils.InterfacePageUtils;

import org.bukkit.inventory.ItemStack;

/**
 * Created by Ben on 9/27/2016.
 */
public class PageData
{

    private ItemStack stack;
    private int slot;

    public PageData(ItemStack stack, int slot)
    {

        this.stack = stack;
        this.slot = slot;

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

