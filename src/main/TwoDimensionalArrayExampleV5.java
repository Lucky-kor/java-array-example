package main;

import java.util.Arrays;

public class TwoDimensionalArrayExampleV5 {
    public static void main(String[] args) {
        int[][] kcal = new int[][]{
                {1982, 2098, 2130},
                {2242, 2431, 2198},
                {2365, 1997, 1932},
                {2278, 2391, 2006}
        };

        System.out.println(Arrays.toString(kcal));
        System.out.println(Arrays.toString(kcal[0]));
    }
}
