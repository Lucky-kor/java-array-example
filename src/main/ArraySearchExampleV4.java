package main;

import java.util.Arrays;

public class ArraySearchExampleV4 {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};

        // for문을 사용한 배열 요소의 수정
        for (int i = 0; i < values.length; i++) {
            values[i] *= 2; // 각 요소의 값을 2배로 변경
        }
        System.out.println("for문 사용: " + Arrays.toString(values)); // [2, 4, 6, 8, 10]

        int[] failValues = {1, 2, 3, 4, 5};
        // 향상된 for문을 사용한 시도 (실패)
        for (int value : failValues) {
            value *= 2; // 이 코드는 원본 배열의 요소를 변경하지 않음
        }
        System.out.println("향상된 for문 사용: " + Arrays.toString(failValues)); // [2, 4, 6, 8, 10]
    }
}
