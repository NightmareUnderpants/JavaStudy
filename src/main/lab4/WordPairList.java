package main.lab4;

import java.util.ArrayList;

public class WordPairList
{
    private ArrayList<WordPair> allPairs;

    public WordPairList (String[] words)
    {
        allPairs = new ArrayList<>();

        for (int i = 0; i < words.length; i++)
        {
            int j = i + 1;
            while (j < words.length)
            {
                WordPair pair = new WordPair(words[i], words[j]);
                allPairs.add(pair);

                j++;
            }
        }
    }

    public int numMatches()
    {
        int count = 0;

        for (WordPair pair : allPairs)
        {
            if (pair.getFirst().equals(pair.getSecond()))
                count++;
        }

        return count;
    }

    public void DisplayList()
    {
        for (WordPair pair : allPairs) {
            System.out.print("(\"" + pair.getFirst() + "\", \"" + pair.getSecond() + "\") ");
        }

        System.out.println();
    }
}
