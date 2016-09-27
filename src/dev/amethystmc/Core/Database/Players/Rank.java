package dev.amethystmc.Core.Database.Players;

/**
 * Created by Ben on 9/26/2016.
 */
public enum Rank
{

    OWNER("Owner", "&4[Owner]", "&f", 5, 10),
    SRADMIN("SrAdmin", "&4[Sr.Admin]", "&f", 5, 9),
    DEV("Dev", "&c[Dev]", "&f", 5, 10),
    ADMIN("Admin", "&c[Admin]", "&f", 5, 8),
    MOD("Mod", "&6[Mod]", "&f", 5, 7),
    JRMOD("JrMod", "&a[Jr.Mod]", "&f", 5, 6),

    JRDEV("JrDev", "&c[Jr.Dev]", "&f", 5, 5),
    VIP("VIP", "&5[VIP]", "&f", 5, 5),
    BUILDER("Builder", "&2[Builder]", "&f", 5, 5),

    PLATINUM("Platinum", "&9[Platinum]", "&f", 4, 4),
    ELITE("Elite", "&3[Elite]", "&f", 3, 3),
    PREMIUM("Premium", "&b[Premium]", "&f", 2, 2),

    MEMBER("Member", "&7", "&7", 1, 1);

    String name;
    String prefix;
    String chatColor;
    int multiplier;
    int id;

    Rank(String name, String prefix, String chatColor, int multiplier, int id)
    {

        this.name = name;
        this.prefix = prefix;
        this.chatColor = chatColor;
        this.multiplier = multiplier;
        this.id = id;

    }

    public String getName()
    {

        return name;

    }

    public String getPrefix()
    {

        return prefix;

    }

    public String getChatColor()
    {

        return chatColor;

    }

    public int getMultiplier()
    {

        return multiplier;

    }

    public int getId()
    {

        return id;

    }

}

