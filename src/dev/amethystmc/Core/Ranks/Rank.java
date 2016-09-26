package dev.amethystmc.Core.Ranks;

/**
 * Created by Ben on 9/25/2016.
 */
public enum Rank
{

    OWNER("Owner", "&7[&4Owner&7]", "&f", 5, 10),
    SRADMIN("SrAdmin", "&7[&4Sr.Admin&7]", "&f", 5, 9),
    DEV("Dev", "&7[&4Dev&7]", "&f", 5, 10),
    ADMIN("Admin", "&7[&cAdmin&7]", "&f", 5, 8),
    MOD("Mod", "&7[&6Mod&7]", "&f", 5, 7),
    JRMOD("JrMod", "&7[&aJr.Mod&7]", "&f", 5, 6),

    JRDEV("JrDev", "&7[&4Jr.Dev&7]", "&f", 5, 5),
    VIP("VIP", "&7[&5VIP&7]", "&f", 5, 5),
    BUILDER("Builder", "&7[&2Builder&7]", "&f", 5, 5),

    PLATINUM("Platinum", "&7[&9Platinum&7]", "&f", 4, 4),
    ELITE("Elite", "&7[&3Elite&7]", "&f", 3, 3),
    PREMIUM("Premium", "&7[&bPremium&7]", "&f", 2, 2),

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

