package main.lab3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lab3
{
    public static void main(String[] args)
    {
        MusicDownloads music = new MusicDownloads();

        List<String> songTitles = new ArrayList<>(Arrays.asList(
                "Lights", "Aqualung", "Soul Sister", "Go Now", "Lights", "Soul Sister"
        ));

        music.updateDownloads(songTitles);

        for (String titles : songTitles)
        {
            DownloadInfo info = music.getDownloadInfo(titles);
            System.out.println("Music: " + info.getTitle() + "; Downloads: " + info.getDownloads());
        }
    }
}
