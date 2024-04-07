package main;

import java.util.Arrays;

public class TwoDimensionalArrayExampleV3 {
    public static void main(String[] args) {
        // 가변 배열의 선언 및 초기화
        int[][] variableArray = new int[3][];
        variableArray[0] = new int[3]; // 첫 번째 행은 3개의 열
        variableArray[1] = new int[2]; // 두 번째 행은 2개의 열
        variableArray[2] = new int[4]; // 세 번째 행은 4개의 열

        for(int[] arr: variableArray) {
            System.out.println(Arrays.toString(arr));
        }
    }
}
