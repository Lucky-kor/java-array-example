package main;

import java.util.Arrays;

public class TwoDimensionalArrayExampleV1 {
    public static void main(String[] args) {
        // 2차원 배열의 선언 및 초기화
        int[][] numbers = new int[3][2];

        // 2차원 배열에 값 할당
        numbers[0][0] = 1;
        numbers[0][1] = 2;
        numbers[1][0] = 3;
        numbers[1][1] = 4;
        numbers[2][0] = 5;
        numbers[2][1] = 6;

        for(int[] arr: numbers) {
            System.out.println(Arrays.toString(arr));
        }

    }
}
