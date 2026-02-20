package main.lab2;

import java.io.Console;

public class Lab2
{
    public static void main(String[] args) {
        NumberCube cube = new NumberCube();

        int[] tosses = CubeUtils.getCubeTosses(cube, 10);

        for (int num : tosses) {
            System.out.print(num + " ");
        }

        int longest = CubeUtils.getLongestRun(tosses);

        if (longest != -1)
            System.out.println("\nLongest index is " + longest + " start with number " + tosses[longest]);
    }
}
