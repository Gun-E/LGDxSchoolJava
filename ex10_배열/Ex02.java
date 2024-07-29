package ex10_배열;

import java.util.Arrays;

public class Ex02 {
    public static void main(String[] args) {
        // 정수형 데이터를 담을 수 있는 배열 array 선언
        int[] array;

        // 정수형 데이터 10개 담을 수 있도록 배열 생성
        array = new int[10];

        // 각각의 인덱스에 1~20까지의 랜덤수로 초기화
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20) +1;
        }

        // 배열의 전체 값 출력
        for (int j : array) System.out.print(j + " ");
        System.out.println();

        // 배열에 들어있는 데이터의 합 출력
        int sum = Arrays.stream(array).sum();
        System.out.println(sum);

        // 배열 안에 들어있는 데이터의 평균 출력
        float mean = sum / (float)array.length;
        System.out.println(mean);

        // 배열 안에 들어있는 짝수만 출력
        Arrays.stream(array).filter(value -> value % 2 == 0).forEach(value -> System.out.print(value + " "));
    }
}
