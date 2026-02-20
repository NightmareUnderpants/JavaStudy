package main.lab9_10;

import java.io.*;
import java.util.List;

public class FileReader
{
    public static List<PeopleData> LoadFile()
    {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.dat")))
        {
            return (List<PeopleData>) ois.readObject();
        }
        catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
