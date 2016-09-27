package dev.amethystmc.Core.Interfaces;

import dev.amethystmc.Core.Interfaces.CosmeticInterfaces.*;

/**
 * Created by Ben on 9/26/2016.
 */
public class Interfaces
{

    private static CosmeticInterface cosmeticInterface = new CosmeticInterface();
    private static HatInterface hatInterface = new HatInterface();
    private static GadgetInterface gadgetInterface = new GadgetInterface();
    private static TagInterface tagInterface = new TagInterface();
    private static ArrowTrailInterface trailInterface = new ArrowTrailInterface();

    public static CosmeticInterface getCosmeticInterface()
    {

        return cosmeticInterface;

    }

    public static HatInterface getHatInterface()
    {

        return hatInterface;

    }

    public static GadgetInterface getGadgetInterface()
    {

        return gadgetInterface;

    }

    public static TagInterface getTagInterface()
    {

        return tagInterface;

    }

    public static ArrowTrailInterface getTrailInterface()
    {

        return trailInterface;

    }

}

