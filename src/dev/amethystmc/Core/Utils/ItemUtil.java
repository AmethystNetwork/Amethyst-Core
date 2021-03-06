package dev.amethystmc.Core.Utils;

import net.minecraft.server.v1_8_R3.NBTTagCompound;
import net.minecraft.server.v1_8_R3.NBTTagList;
import org.bukkit.Material;
import org.bukkit.craftbukkit.v1_8_R3.inventory.CraftItemStack;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;
import org.bukkit.potion.Potion;
import org.bukkit.potion.PotionType;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ben on 9/25/2016.
 */
public class ItemUtil 
{
    public static ItemStack createItem(Material material) {
        return new ItemStack(material);
    }

    public static ItemStack createItem(Material material, byte data) {
        ItemStack item = new ItemStack(material, 1, (byte) data);
        return item;
    }

    public static ItemStack createItem(Material material, String name) {
        ItemStack item = new ItemStack(material);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(MessageUtil.colorize(name));
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack createItem(Material material, byte data, String name) {
        ItemStack item = new ItemStack(material, 1, (byte) data);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(MessageUtil.colorize(name));
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack createItem(Material material, String name, String... lore) {
        ItemStack item = new ItemStack(material);
        ItemMeta meta = item.getItemMeta();

        List<String> lores = new ArrayList<>();
        for (String aLore : lore) {
            lores.add(MessageUtil.colorize(aLore));
        }
        meta.setDisplayName(MessageUtil.colorize(name));
        meta.setLore(lores);
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack createItem(Material material, byte data, String name, String... lore) {
        ItemStack item = new ItemStack(material, 1, (byte) data);
        ItemMeta meta = item.getItemMeta();

        List<String> lores = new ArrayList<>();
        for (String aLore : lore) {
            lores.add(MessageUtil.colorize(aLore));
        }
        meta.setDisplayName(MessageUtil.colorize(name));
        meta.setLore(lores);
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack createStack(Material material, int amount) {
        return new ItemStack(material, amount);
    }

    public static ItemStack createStack(Material material, int amount, byte data) {
        ItemStack item = new ItemStack(material, amount, (byte) data);
        return item;
    }

    public static ItemStack createStack(Material material, int amount, String name) {
        ItemStack item = new ItemStack(material, amount);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(MessageUtil.colorize(name));
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack createStack(Material material, int amount, byte data, String name) {
        ItemStack item = new ItemStack(material, amount, (byte) data);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(MessageUtil.colorize(name));
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack createStack(Material material, int amount, String name, String... lore) {
        ItemStack item = new ItemStack(material, amount);
        ItemMeta meta = item.getItemMeta();

        List<String> lores = new ArrayList<>();
        for (String aLore : lore) {
            lores.add(MessageUtil.colorize(aLore));
        }
        meta.setDisplayName(MessageUtil.colorize(name));
        meta.setLore(lores);
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack createStack(Material material, int amount, byte data, String name, String... lore) {
        ItemStack item = new ItemStack(material, amount, (byte) data);
        ItemMeta meta = item.getItemMeta();

        List<String> lores = new ArrayList<>();
        for (String aLore : lore) {
            lores.add(MessageUtil.colorize(aLore));
        }
        meta.setDisplayName(MessageUtil.colorize(name));
        meta.setLore(lores);
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack getPotion(PotionType type, boolean splash)
    {
        Potion pot = new Potion(type);
        pot.setSplash(splash);
        return pot.toItemStack(1);
    }

    public static ItemStack createSkull(String name, String displayName)
    {

        ItemStack item = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
        SkullMeta meta = (SkullMeta) item.getItemMeta();

        meta.setOwner(name);
        meta.setDisplayName(MessageUtil.colorize(displayName));

        item.setItemMeta(meta);

        return item;
    }

    public static ItemStack createSkull(String name, String displayName, String... lore)
    {

        ItemStack item = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
        SkullMeta meta = (SkullMeta) item.getItemMeta();

        List<String> lores = new ArrayList<>();
        for (String aLore : lore)
        {
            lores.add(MessageUtil.colorize(aLore));
        }

        meta.setOwner(name);
        meta.setDisplayName(MessageUtil.colorize(displayName));
        meta.setLore(lores);


        item.setItemMeta(meta);

        return item;
    }

    public static ItemStack addGlow(ItemStack item)
    {
        net.minecraft.server.v1_8_R3.ItemStack nmsStack = CraftItemStack.asNMSCopy(item);
        NBTTagCompound tag = null;
        if (!nmsStack.hasTag()) {
            tag = new NBTTagCompound();
            nmsStack.setTag(tag);
        }
        if (tag == null) {
            tag = nmsStack.getTag();
        }
        NBTTagList ench = new NBTTagList();
        tag.set("ench", ench);
        nmsStack.setTag(tag);
        return CraftItemStack.asCraftMirror(nmsStack);
    }
}


