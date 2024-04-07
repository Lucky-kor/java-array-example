package main;

public class ArraySearchExampleV1 {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25};

        System.out.println("numbers 배열의 요소는 총 : " + numbers.length + "개 입니다.");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
