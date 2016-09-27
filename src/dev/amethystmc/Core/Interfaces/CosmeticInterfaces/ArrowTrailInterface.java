package dev.amethystmc.Core.Interfaces.CosmeticInterfaces;

import dev.amethystmc.Core.Cosmetics.ArrowTrail;
import dev.amethystmc.Core.Cosmetics.ArrowTrails.Trail;
import dev.amethystmc.Core.Cosmetics.Cosmetic;
import dev.amethystmc.Core.Interfaces.Interfaces;
import dev.amethystmc.Core.Utils.InterfaceUtil;
import dev.amethystmc.Core.Utils.ItemUtil;
import dev.amethystmc.Core.Utils.MessageUtil;
import net.minecraft.server.v1_8_R3.EnumParticle;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

/**
 * Created by Ben on 9/27/2016.
 */
public class ArrowTrailInterface extends InterfaceUtil
{

    @Override
    public String getName() {
        return "Arrow Trails";
    }

    @Override
    public void open(Player p) {

        Inventory inv = Bukkit.createInventory(p, 45, getName());

        inv.setItem(40, ItemUtil.createItem(Material.WOOD_DOOR, "&aGo Back"));


        for (ArrowTrail trail : ArrowTrail.values())
        {

            inv.setItem(trail.getSlot(), trail.getStack());

        }

        p.openInventory(inv);

    }

    @Override
    public void click(Player p, int slot)
    {

        switch (slot) {

            case 11:
                p.playSound(p.getLocation(), Sound.NOTE_PLING, 10, 10);
                Trail.addTrail(p, EnumParticle.FLAME);
                p.closeInventory();
                MessageUtil.sendRawMessage(p, "&aYou have selected the &eFlame Trail");
                break;
            case 12:
                p.playSound(p.getLocation(), Sound.NOTE_PLING, 10, 10);
                Trail.addTrail(p, EnumParticle.DRIP_WATER);
                p.closeInventory();
                MessageUtil.sendRawMessage(p, "&aYou have selected the &eWater Trail");
                break;
            case 13:
                p.playSound(p.getLocation(), Sound.NOTE_PLING, 10, 10);
                Trail.addTrail(p, EnumParticle.SLIME);
                p.closeInventory();
                MessageUtil.sendRawMessage(p, "&aYou have selected the &eSlime Trail");
                break;
            case 14:
                p.playSound(p.getLocation(), Sound.NOTE_PLING, 10, 10);
                Trail.addTrail(p, EnumParticle.FIREWORKS_SPARK);
                p.closeInventory();
                MessageUtil.sendRawMessage(p, "&aYou have selected the &eFirework Trail");
                break;
            case 15:
                p.playSound(p.getLocation(), Sound.NOTE_PLING, 10, 10);
                Trail.addTrail(p, EnumParticle.SMOKE_NORMAL);
                p.closeInventory();
                MessageUtil.sendRawMessage(p, "&aYou have selected the &eSmoke Trail");
                break;
            case 20:
                p.playSound(p.getLocation(), Sound.NOTE_PLING, 10, 10);
                Trail.addTrail(p, EnumParticle.SNOW_SHOVEL);
                p.closeInventory();
                MessageUtil.sendRawMessage(p, "&aYou have selected the &eSnow Trail");
                break;
            case 21:
                p.playSound(p.getLocation(), Sound.NOTE_PLING, 10, 10);
                Trail.addTrail(p, EnumParticle.HEART);
                p.closeInventory();
                MessageUtil.sendRawMessage(p, "&aYou have selected the &eHeart Trail");
                break;
            case 22:
                p.playSound(p.getLocation(), Sound.NOTE_PLING, 10, 10);
                Trail.addTrail(p, EnumParticle.VILLAGER_HAPPY);
                p.closeInventory();
                MessageUtil.sendRawMessage(p, "&aYou have selected the &eEmerald Trail");
                break;
            case 23:
                p.playSound(p.getLocation(), Sound.NOTE_PLING, 10, 10);
                Trail.addTrail(p, EnumParticle.ENCHANTMENT_TABLE);
                p.closeInventory();
                MessageUtil.sendRawMessage(p, "&aYou have selected the &eEnchantment Trail");
                break;
            case 24:
                p.playSound(p.getLocation(), Sound.NOTE_PLING, 10, 10);
                Trail.removeTrail(p);
                p.closeInventory();
                MessageUtil.sendRawMessage(p, "&cYou have removed your trail");
                break;
            case 40:
                p.playSound(p.getLocation(), Sound.NOTE_PLING, 10, 10);
                Interfaces.getCosmeticInterface().open(p);
                break;

        }

    }
}

