package main;

public class VariableArrayExampleV2 {
    public static void main(String[] args) {
        // 가변 배열의 선언과 동시에 초기화
        int[][] grades = {
                {90, 80, 70},    // 첫 번째 학생의 성적
                {95, 85},        // 두 번째 학생의 성적
                {100, 88, 92, 95} // 세 번째 학생의 성적
        };

        // 배열 출력
        for (int i = 0; i < grades.length; i++) {
            System.out.print("학생 " + (i+1) + "의 성적: ");
            for (int j = 0; j < grades[i].length; j++) {
                System.out.print(grades[i][j] + " ");
            }
            System.out.println();
        }
    }
}
