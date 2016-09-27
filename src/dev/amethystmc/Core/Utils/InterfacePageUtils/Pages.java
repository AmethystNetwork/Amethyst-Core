package dev.amethystmc.Core.Utils.InterfacePageUtils;

import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ben on 9/27/2016.
 */
public class Pages
{

    public static List<PageData> info = new ArrayList<>();
    public static List<Page> pages = new ArrayList<>();

    public static void register(ItemStack stack, int slot)
    {

        info.add(new PageData(stack, slot));

        if (pages.isEmpty())
        {

            List<PageData> page = new ArrayList<>();
            page.add(new PageData(stack, slot));
            pages.add(new Page(page));
            return;

        }

        else
        {

            if (pages.get(pages.size() - 1).getItems().size() >= 15)
            {

                List<PageData> page = new ArrayList<>();
                page.add(new PageData(stack, slot));
                pages.add(new Page(page));
                return;

            }

            else
            {

                pages.get(pages.size() -1).getItems().add(new PageData(stack, slot));
                return;

            }

        }

    }

}

