package main.lab7;

public class Lab7
{
    public static void main(String[] args)
    {
        String str = "1207 558844 г. Владивосток, и тд... 12345678900";

        if (Util7.isCorrect(str))
            System.out.println("Is correct!");
        else
            System.out.println("Isn't correct!");

        str = "120a 558844 г. Владивост9к, и тд... 12345y78900";

        if (Util7.isCorrect(str))
            System.out.println("Is correct!");
        else
            System.out.println("Isn't correct!");
    }
}
