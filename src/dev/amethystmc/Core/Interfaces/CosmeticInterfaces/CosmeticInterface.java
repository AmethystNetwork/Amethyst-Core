package dev.amethystmc.Core.Interfaces.CosmeticInterfaces;

import dev.amethystmc.Core.Cosmetics.Cosmetic;
import dev.amethystmc.Core.Cosmetics.Hat;
import dev.amethystmc.Core.Database.Players.AmethystPlayer;
import dev.amethystmc.Core.Interfaces.Interfaces;
import dev.amethystmc.Core.Utils.InterfaceUtil;
import dev.amethystmc.Core.Utils.ItemUtil;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

/**
 * Created by Ben on 9/27/2016.
 */
public class CosmeticInterface extends InterfaceUtil
{

    @Override
    public String getName() {
        return "Cosmetics";
    }

    @Override
    public void open(Player p) {

        Inventory inv = Bukkit.createInventory(p, 45, getName());
        AmethystPlayer ap = new AmethystPlayer(p);

        inv.setItem(Cosmetic.HATS.getSlot(), ItemUtil.createItem(Material.BEACON, "&e&l&nHats", " ", "&7&nDescription:", "&fSelect a super cool hat to wear", "&facross the whole network in all the lobbies!", " ", "&7&nCurrent Hat:", "&f" + ap.getHat().getName(), " ", "&7&nRequired Rank:", "&fPremium"));
        inv.setItem(Cosmetic.GADGETS.getSlot(), ItemUtil.createItem(Material.FIREWORK, "&e&l&nGadgets", " ", "&7&nDescription:", "&fThrow a party with some of these", "&ffun gadgets that work across the whole network!", " ", "&7&nCurrent Gadget:", "&f" + ap.getGadget().getName(), " ", "&7&nRequired Rank:", "&fPremium"));
        inv.setItem(Cosmetic.TAGS.getSlot(), ItemUtil.createItem(Material.NAME_TAG, "&e&l&nTags", " ", "&7&nDescription:", "&fShow off your supporter tags by", "&ftalking in chat on the whole network!", " ", "&7&nCurrent Tag:", "&f" + ap.getTag().getName(), " ", "&7&nRequired Rank:", "&fPremium"));
        inv.setItem(Cosmetic.ARROW_TRAILS.getSlot(), ItemUtil.createItem(Material.ARROW, "&e&l&nArrow Trails", " ", "&7&nDescription:", "&fShoot unique arrow effects by selecting", "&fany Arrow Trail from this menu!", " ", "&7&nCurrent Trail:", "&f" + ap.getTrail().getName(), " ", "&7&nRequired Rank:", "&fPremium"));
        inv.setItem(Cosmetic.DEATH_MESSAGES.getSlot(), ItemUtil.createItem(Material.ANVIL, "&e&l&nDeath Messages", " ", "&7&nDescription:", "&fGive a breif message in chat after", "&fyou die in any of our gamemodes!", " ", "&7&nCurrent Death Message:", "&f" + ap.getDeathMessage().getName(), " ", "&7&nRequired Rank:", "&fPremium"));
        inv.setItem(Cosmetic.VICTORY_MESSAGES.getSlot(), ItemUtil.createItem(Material.EMERALD, "&e&l&nVictory Messages", " ", "&7&nDescription:", "&fLet everybody know you won the game", "&fby shouting a message in game after you win!", " ", "&7&nCurrent Victory Message:", "&fNone", " ", "&7&nRequired Rank:", "&fPremium"));
        inv.setItem(Cosmetic.CHAT_COLOR.getSlot(), ItemUtil.createItem(Material.BOOK, "&e&l&nChat Color", " ", "&7&nDescription:", "&fChange the color of your chat by", "&fselecting a color from this menu!", " ", "&7&nCurrent Chat Color:", "&fNone", " ", "&7&nRequired Rank:", "&fPremium"));
        inv.setItem(Cosmetic.WARDROBE.getSlot(), ItemUtil.createItem(Material.DIAMOND_CHESTPLATE, "&e&l&nWardrobe", " ", "&7&nDescription:", "&fCustomize your outfit in the network by", "&fselecting any of the wardrobe items!", " ", "&7&nCurrent Wardrobe:", "&fNone", " ", "&7&nRequired Rank:", "&fPremium"));
        inv.setItem(Cosmetic.PETS.getSlot(), ItemUtil.createItem(Material.BONE, "&e&l&nPets", " ", "&7&nDescription:", "&fGrab a pet that will follow you around", "&fthe whole network. You can even ride", "&fyour pet too!", " ", "&7&nCurrent Pet:", "&fNone", " ", "&7&nRequired Rank:", "&fPremium"));
        inv.setItem(Cosmetic.PARTICLES.getSlot(), ItemUtil.createItem(Material.BLAZE_POWDER, "&e&l&nParticles", " ", "&7&nDescription:", "&fSelect a nice particle effect to show up", "&fbehind you as you walk around the network!", " ", "&7&nCurrent Particles:", "&fNone", " ", "&7&nRequired Rank:", "&fPremium"));
        inv.setItem(Cosmetic.CRATE.getSlot(), ItemUtil.createItem(Material.CHEST, "&e&l&nCrate", " ", "&7&nDescription:", "&fUnlock unique cosmetic items from this crate.", "&fItems contain, Hats, Gadgets, and Particles!", " ", "&7&nCrate Keys:", "&fNone", " ", "&7&nRequired Rank:", "&fPremium"));

        p.openInventory(inv);

    }

    @Override
    public void click(Player p, int slot)
    {

        switch (slot) {

            case 11:
                p.playSound(p.getLocation(), Sound.NOTE_PLING, 10, 10);
                Interfaces.getHatInterface().open(p);
                break;
            case 12:
                p.playSound(p.getLocation(), Sound.NOTE_PLING, 10, 10);
                Interfaces.getGadgetInterface().open(p);
                break;
            case 13:
                p.playSound(p.getLocation(), Sound.NOTE_PLING, 10, 10);
                Interfaces.getTagInterface().open(p);
                break;
            case 14:
                p.playSound(p.getLocation(), Sound.NOTE_PLING, 10, 10);
                Interfaces.getTrailInterface().open(p);
                break;
            case 15:
                p.playSound(p.getLocation(), Sound.NOTE_PLING, 10, 10);
                Interfaces.getDeathMessageInterface().open(p);
                break;

        }

    }
}

