package main.lab2;

public class CubeUtils
{
    public static int[] getCubeTosses(NumberCube cube, int numTosses)
    {
        int[] tossesArray = new int[numTosses];

        int toss = 0;
        for (int i = 0; i < numTosses; i++)
        {
            toss = cube.toss();
            tossesArray[i] = toss;
        }

        return tossesArray;
    }

    public static int getLongestRun(int[] values)
    {
        int i = 1;
        int size = values.length;

        int indexSeries = -1;
        int tempIndex = -1;
        int tempSeries = 0;
        int longestSeries = 0;

        while (i < size - 1)
        {
            if (values[i - 1] == values[i])
                tempIndex = i - 1;

            while (i < size - 1 && values[i - 1] == values[i])
            {
                tempSeries++;
                i++;
            }

            if (tempSeries > longestSeries) {
                indexSeries = tempIndex;
                longestSeries = tempSeries;
            }

            tempSeries = 0;
            i++;
        }

        if (longestSeries > 0)
            return indexSeries;
        else
            return -1;
    }
}
