package dev.amethystmc.Core.Database.Players;

import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ben on 9/26/2016.
 */
public class AmethystPlayer {

    //DatabaseConnection dbconnection = new DatabaseConnection();
    Player p;
    List<Player> staffChat = new ArrayList<>();
    List<String> staffMembers = new ArrayList<>();


    public AmethystPlayer(Player p)
    {

        this.p = p;

    }

    /*public Rank getRank() {
        UUID uuid = p.getUniqueId();

        try {
            ResultSet resultSet = dbconnection.getResultSet("SELECT Rank FROM PlayersHandler WHERE UUID='" + uuid.toString() + "'");
            if (resultSet.next()) {
                for (Rank rank : Rank.values()) {
                    if (rank.getName().equals(resultSet.getString("Rank"))) {
                        return rank;
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


    public void setRank(Rank rank) {
        UUID uuid = p.getUniqueId();

        if (!hasRank()) {
            try {

                dbconnection.executeUpdate("INSERT INTO `PlayersHandler`(`UUID`, `Rank`) VALUES ('" + uuid.toString() + "','" + rank.getName() + "')");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            try {
                dbconnection.executeUpdate("UPDATE PlayersHandler SET Rank='" + rank.getName() + "' WHERE UUID='" + uuid.toString() + "'");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean hasRank() {
        UUID uuid = p.getUniqueId();

        try {
            ResultSet rs = dbconnection.getResultSet("SELECT Rank FROM PlayersHandler WHERE UUID='" + uuid.toString() + "'");
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    public int getTokens() {
        UUID uuid = p.getUniqueId();

        try {
            ResultSet resultSet = dbconnection.getResultSet("SELECT Tokens FROM PlayersHandler WHERE UUID='" + uuid.toString() + "'");
            if (resultSet.next()) {
                return resultSet.getInt("Tokens");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }


    public void addTokens(int tokens) {
        UUID uuid = p.getUniqueId();

        try {
            int addedTokens = getTokens() + tokens;
            dbconnection.executeUpdate("UPDATE PlayersHandler SET Tokens='" + addedTokens + "' WHERE UUID='" + uuid.toString() + "'");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean hasTokens() {
        UUID uuid = p.getUniqueId();

        try {
            ResultSet rs = dbconnection.getResultSet("SELECT Tokens FROM PlayersHandler WHERE UUID='" + uuid.toString() + "'");
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public String getTagFromSQL() {
        UUID uuid = p.getUniqueId();

        try {
            ResultSet resultSet = dbconnection.getResultSet("SELECT Tag FROM PlayersHandler WHERE UUID='" + uuid.toString() + "'");
            if (resultSet.next()) {
                String tag = resultSet.getString("Tag");
                return tag;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


    public void setTagInSQL(String tag) {
        UUID uuid = p.getUniqueId();

        if (!hasTag()) {
            try {

                dbconnection.executeUpdate("INSERT INTO `PlayersHandler`(`UUID`, `Tag`) VALUES ('" + uuid.toString() + "','" + tag.toString() + "')");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            try {
                dbconnection.executeUpdate("UPDATE PlayersHandler SET Tag='" + tag.toString() + "' WHERE UUID='" + uuid.toString() + "'");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean hasTag() {
        UUID uuid = p.getUniqueId();

        try {
            ResultSet rs = dbconnection.getResultSet("SELECT Tag FROM PlayersHandler WHERE UUID='" + uuid.toString() + "'");
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    public String getColor() {
        UUID uuid = p.getUniqueId();

        try {
            ResultSet resultSet = dbconnection.getResultSet("SELECT Color FROM PlayersHandler WHERE UUID='" + uuid.toString() + "'");
            if (resultSet.next()) {
                String color = resultSet.getString("Color");
                return color;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


    public void setColor(String color) {
        UUID uuid = p.getUniqueId();

        if (!hasColor()) {
            try {

                dbconnection.executeUpdate("INSERT INTO `PlayersHandler`(`UUID`, `Color`) VALUES ('" + uuid.toString() + "','" + color.toString() + "')");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            try {
                dbconnection.executeUpdate("UPDATE PlayersHandler SET Color='" + color.toString() + "' WHERE UUID='" + uuid.toString() + "'");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean hasColor() {
        UUID uuid = p.getUniqueId();

        try {
            ResultSet rs = dbconnection.getResultSet("SELECT Color FROM PlayersHandler WHERE UUID='" + uuid.toString() + "'");
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    public void addPlayerToStaffChat()
    {

        staffChat.add(p);
        MessageUtil.sendStaffMessage(p, "&aYou have been added to Staff Chat!");

    }

    public void removePlayerFromStaffChat()
    {

        staffChat.remove(p);
        MessageUtil.sendStaffMessage(p, "&cYou have been removed from Staff Chat!");
    }

    public boolean isStaffChatEnabled()
    {

        if (staffChat.contains(p)) {

            return true;

        } else {

            return false;

        }
    }*/

}


