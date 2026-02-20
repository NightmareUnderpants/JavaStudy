package main.lab2; // ap 2009 - 1

import java.util.Random;

public class NumberCube
{
    /** @return an integer value between 1 and 6, inclusive
     */
    public int toss()
    {
        return new Random().nextInt(6);
    }
}
