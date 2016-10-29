package dev.amethystmc.Core.Server;

/**
 * Created by Ben on 10/25/2016.
 */
public class ServerMap
{

    private String name;
    private String author;
    private String folderName;

    public ServerMap(String name, String author, String folderName)
    {

        this.name = name;
        this.author = author;
        this.folderName = folderName;

    }

    public String getName()
    {

        return name;

    }

    public String getAuthor()
    {

        return author;

    }

    public String getFolderName()
    {

        return folderName;

    }

}
