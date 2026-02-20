package main.lab4;

public class Lab4
{
    public static void main(String[] args)
    {
        String[] words = {"the", "more", "the", "merrier"};

        WordPairList pairList = new WordPairList(words);
        pairList.DisplayList();
        System.out.println(pairList.numMatches());

        String[] moreWords = {"the", "red", "fox", "the", "red"};

        pairList = new WordPairList(moreWords);
        pairList.DisplayList();
        System.out.println(pairList.numMatches());
    }
}
