package main;

public class VariableArrayExampleV3 {
    public static void main(String[] args) {
        // 가변 배열을 이용한 다양한 크기의 데이터 저장
        String[][] groups = new String[3][];
        groups[0] = new String[]{"John", "Sarah"};
        groups[1] = new String[]{"Mike"};
        groups[2] = new String[]{"Lily", "Emma", "Emily"};

        // 그룹별 구성원 출력
        for (int i = 0; i < groups.length; i++) {
            System.out.print("그룹 " + (i+1) + ": ");
            for (String name : groups[i]) {
                System.out.print(name + " ");
            }
            System.out.println();
        }
    }
}
