package main.lab3;

public class DownloadInfo
{
    private String _title;
    private int _timesDownloaded;

    /**
     * Creates a new instance with the given unique title and sets the
     * <p>
     * number of times downloaded to 1.
     *
     * @param title  the unique title of the downloaded song
     */
    public DownloadInfo(String title)
    {
        _title = title;
        _timesDownloaded = 1;
    }

    /** @return the title */
    public String getTitle()
    {
        return _title;
    }

    public int getDownloads()
    {
        return _timesDownloaded;
    }

    /** Increment the number times downloaded by 1 */
    public void incrementTimesDownloaded()
    {
        _timesDownloaded += 1;
    }
}
