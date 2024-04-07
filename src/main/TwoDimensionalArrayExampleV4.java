package main;

public class TwoDimensionalArrayExampleV4 {
    public static void main(String[] args) {
        // 학생별 과목 성적을 관리하는 2차원 배열
        int[][] grades = {
                {90, 70, 80}, // 첫 번째 학생의 국어, 영어, 수학 성적
                {95, 65, 75}, // 두 번째 학생의 국어, 영어, 수학 성적
                {70, 85, 90}  // 세 번째 학생의 국어, 영어, 수학 성적
        };

        // 게임 맵의 각 위치 정보를 저장하는 2차원 배열
        int[][] map = {
                {0, 1, 0},
                {0, 0, 1},
                {1, 1, 0}
        };
        // 여기서 0은 이동 가능한 위치, 1은 장애물을 의미할 수 있음
    }
}
