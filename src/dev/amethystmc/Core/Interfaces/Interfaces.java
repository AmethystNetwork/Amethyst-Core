package dev.amethystmc.Core.Interfaces;

import dev.amethystmc.Core.Interfaces.WhitelistInterfaces.WhitelistInterface;
import dev.amethystmc.Core.Interfaces.WhitelistInterfaces.WhitelistedPlayersInterface;

/**
 * Created by Ben on 10/24/2016.
 */
public class Interfaces
{

    private static WhitelistInterface whitelistInterface = new WhitelistInterface();
    private static WhitelistedPlayersInterface whitelistedPlayersInterface = new WhitelistedPlayersInterface();

    public static WhitelistInterface getWhitelistInterface()
    {

        return whitelistInterface;

    }

    public static WhitelistedPlayersInterface getWhitelistedPlayersInterface()
    {

        return whitelistedPlayersInterface;

    }

}

