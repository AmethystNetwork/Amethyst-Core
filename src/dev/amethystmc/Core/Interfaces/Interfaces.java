package dev.amethystmc.Core.Interfaces;

import dev.amethystmc.Core.Interfaces.CosmeticInterfaces.HatInterface;

/**
 * Created by Ben on 9/26/2016.
 */
public class Interfaces
{

    private static HatInterface hatInterface = new HatInterface();

    public static HatInterface getHatInterface()
    {

        return hatInterface;

    }

}

