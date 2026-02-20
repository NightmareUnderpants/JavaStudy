package main.lab9_10;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.util.List;

public class FileSaver
{
    public static void SaveFile(List<PeopleData> list)
    {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.dat")))
        {
            oos.writeObject(list);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
