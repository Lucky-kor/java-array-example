package main;

import java.util.Arrays;

public class TwoDimensionalArrayExampleV2 {
    public static void main(String[] args) {
        // 초기값을 가진 2차원 배열의 선언 및 초기화
        int[][] matrix = {
                {1, 2},
                {3, 4},
                {5, 6}
        };

        for(int[] arr: matrix) {
            System.out.println(Arrays.toString(arr));
        }
    }
}
