package dev.amethystmc.Core.Utils.InterfacePageUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ben on 9/27/2016.
 */
public class Page
{

    private List<PageData> items = new ArrayList<>();

    public Page(List<PageData> items)
    {

        this.items = items;

    }

    public List<PageData> getItems()
    {

        return items;

    }

}

