package dev.amethystmc.Core.Interfaces.CosmeticInterfaces;

import dev.amethystmc.Core.Cosmetics.Hat;
import dev.amethystmc.Core.Database.Players.AmethystPlayer;
import dev.amethystmc.Core.Interfaces.Interfaces;
import dev.amethystmc.Core.Utils.InterfaceUtil;
import dev.amethystmc.Core.Utils.ItemUtil;
import dev.amethystmc.Core.Utils.MessageUtil;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

/**
 * Created by Ben on 9/26/2016.
 */
public class HatInterface extends InterfaceUtil
{


    @Override
    public String getName() {
        return "Hats";
    }

    @Override
    public void open(Player p) {

        Inventory inv = Bukkit.createInventory(p, 54, getName());

        inv.setItem(49, ItemUtil.createItem(Material.WOOD_DOOR, "&aGo Back"));


        for (Hat hat : Hat.values())
        {

            inv.setItem(hat.getSlot(), hat.getStack());

        }

        p.openInventory(inv);

    }

    @Override
    public void click(Player p, int slot)
    {

        AmethystPlayer ap = new AmethystPlayer(p);

        switch (slot) {

            case 11:
                p.playSound(p.getLocation(), Sound.NOTE_PLING, 10, 10);
                p.getInventory().setHelmet(Hat.GLASS.getStack());
                Hat.addHat(p, Hat.GLASS);
                MessageUtil.sendRawMessage(p, "&aYou have selected the &eGlass Hat&a!");
                break;
            case 12:
                p.playSound(p.getLocation(), Sound.NOTE_PLING, 10, 10);
                p.getInventory().setHelmet(Hat.SPONGE.getStack());
                Hat.addHat(p, Hat.SPONGE);
                MessageUtil.sendRawMessage(p, "&aYou have selected the &eSponge Hat&a!");
                break;
            case 13:
                p.playSound(p.getLocation(), Sound.NOTE_PLING, 10, 10);
                p.getInventory().setHelmet(Hat.CACTUS.getStack());
                Hat.addHat(p, Hat.CACTUS);
                MessageUtil.sendRawMessage(p, "&aYou have selected the &eCactus Hat&a!");
                break;
            case 14:
                p.playSound(p.getLocation(), Sound.NOTE_PLING, 10, 10);
                p.getInventory().setHelmet(Hat.GRASS.getStack());
                Hat.addHat(p, Hat.GRASS);
                MessageUtil.sendRawMessage(p, "&aYou have selected the &eGrass Hat&a!");
                break;
            case 15:
                p.playSound(p.getLocation(), Sound.NOTE_PLING, 10, 10);
                p.getInventory().setHelmet(Hat.IRON.getStack());
                Hat.addHat(p, Hat.IRON);
                MessageUtil.sendRawMessage(p, "&aYou have selected the &eIron Hat&a!");
                break;
            case 20:
                p.playSound(p.getLocation(), Sound.NOTE_PLING, 10, 10);
                p.getInventory().setHelmet(Hat.GOLD.getStack());
                Hat.addHat(p, Hat.GOLD);
                MessageUtil.sendRawMessage(p, "&aYou have selected the &eGold Hat&a!");
                break;
            case 21:
                p.playSound(p.getLocation(), Sound.NOTE_PLING, 10, 10);
                p.getInventory().setHelmet(Hat.DIAMOND.getStack());
                Hat.addHat(p, Hat.DIAMOND);
                MessageUtil.sendRawMessage(p, "&aYou have selected the &eDiamond Hat&a!");
                break;
            case 22:
                p.playSound(p.getLocation(), Sound.NOTE_PLING, 10, 10);
                p.getInventory().setHelmet(Hat.EMERALD.getStack());
                Hat.addHat(p, Hat.EMERALD);
                MessageUtil.sendRawMessage(p, "&aYou have selected the &eEmerald Hat&a!");
                break;
            case 23:
                p.playSound(p.getLocation(), Sound.NOTE_PLING, 10, 10);
                p.getInventory().setHelmet(Hat.WOOD.getStack());
                Hat.addHat(p, Hat.WOOD);
                MessageUtil.sendRawMessage(p, "&aYou have selected the &eWood Hat&a!");
                break;
            case 24:
                p.playSound(p.getLocation(), Sound.NOTE_PLING, 10, 10);
                p.getInventory().setHelmet(Hat.WOOL.getStack());
                Hat.addHat(p, Hat.WOOL);
                MessageUtil.sendRawMessage(p, "&aYou have selected the &eWool Hat&a!");
                break;
            case 29:
                p.playSound(p.getLocation(), Sound.NOTE_PLING, 10, 10);
                p.getInventory().setHelmet(Hat.BRICK.getStack());
                Hat.addHat(p, Hat.BRICK);
                MessageUtil.sendRawMessage(p, "&aYou have selected the &eBrick Hat&a!");
                break;
            case 30:
                p.playSound(p.getLocation(), Sound.NOTE_PLING, 10, 10);
                p.getInventory().setHelmet(Hat.BEDROCK.getStack());
                Hat.addHat(p, Hat.BEDROCK);
                MessageUtil.sendRawMessage(p, "&aYou have selected the &eBedrock Hat&a!");
                break;
            case 31:
                p.playSound(p.getLocation(), Sound.NOTE_PLING, 10, 10);
                p.getInventory().setHelmet(Hat.OBSIDIAN.getStack());
                Hat.addHat(p, Hat.OBSIDIAN);
                MessageUtil.sendRawMessage(p, "&aYou have selected the &eObsidian Hat&a!");
                break;
            case 32:
                p.playSound(p.getLocation(), Sound.NOTE_PLING, 10, 10);
                p.getInventory().setHelmet(Hat.PATCLONE.getStack());
                Hat.addHat(p, Hat.PATCLONE);
                MessageUtil.sendRawMessage(p, "&aYou have selected the &ePatClone Hat&a!");
                break;
            case 33:
                p.playSound(p.getLocation(), Sound.NOTE_PLING, 10, 10);
                p.getInventory().setHelmet(Hat.DEVGOLEM.getStack());
                Hat.addHat(p, Hat.DEVGOLEM);
                MessageUtil.sendRawMessage(p, "&aYou have selected the &eDevGolem Hat&a!");
                break;
            case 49:
                p.playSound(p.getLocation(), Sound.DOOR_CLOSE, 10, 10);
                Interfaces.getCosmeticInterface().open(p);
                break;
        }

    }
}

