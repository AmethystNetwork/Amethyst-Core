package dev.amethystmc.Core.Database;

import java.sql.*;

/**
 * Created by Ben on 9/26/2016.
 */
public class DatabaseConnection
{

    private Connection connection;

    private String host = "sql9.freemysqlhosting.net";
    private String port = "3306";
    private String database = "sql9133088";
    private String username = "sql9133088";
    private String password = "zaP7LapsNX";

    public DatabaseConnection() {

        try {
            if (connection != null)
                return;

            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/" + database, username, password);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public ResultSet getResultSet(String qry) throws SQLException
    {
        PreparedStatement statement = connection.prepareStatement(qry);
        return statement.executeQuery();
    }

    public void executeUpdate(String qry) throws SQLException
    {
        PreparedStatement statement = connection.prepareStatement(qry);
        statement.executeUpdate();
        statement.close();
    }

    public void createTables()
    {
        try {
            executeUpdate("CREATE TABLE IF NOT EXISTS `PlayersHandler` (UUID VARCHAR(100), Rank VARCHAR(100), Tokens int(255), Tag VARCHAR(100), Color VARCHAR(100))");
            executeUpdate("CREATE TABLE IF NOT EXISTS `ReportsHandler` (Target VARCHAR(100), Reporter VARCHAR(100), Accusation VARCHAR(100), Date VARCHAR(100), Time VARCHAR(100))");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


