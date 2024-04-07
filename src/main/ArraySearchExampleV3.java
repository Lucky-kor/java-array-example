package main;

public class ArraySearchExampleV3 {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25};

        System.out.println("numbers 배열의 요소는 총 : " + numbers.length + "개 입니다.");

        int index = 0;

        while (index < numbers.length) {
            System.out.printf("Numbers의 %d번째 요소는 %d입니다.%n", index, numbers[index]);
            index++;
        }
    }
}
