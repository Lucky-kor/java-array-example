package main;

public class VariableArrayExampleV1 {
    public static void main(String[] args) {
        // 가변 배열의 선언
        int[][] variableArray = new int[4][];

        // 내부 배열 선언 전의 배열의 형태 확인
        for(int[] arr : variableArray) {
            System.out.println(arr);
        }
        // 각 행에 다른 크기의 배열 할당
        variableArray[0] = new int[2]; // 첫 번째 행에 2개의 요소
        variableArray[1] = new int[3]; // 두 번째 행에 3개의 요소
        variableArray[2] = new int[1]; // 세 번째 행에 1개의 요소
        variableArray[3] = new int[4]; // 네 번째 행에 4개의 요소

        // 배열 초기화
        int value = 1;
        for (int i = 0; i < variableArray.length; i++) {
            for (int j = 0; j < variableArray[i].length; j++) {
                variableArray[i][j] = value++;
            }
        }

        // 배열 출력
        for (int[] row : variableArray) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
