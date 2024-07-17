package ex02_연산자.산술연산자;

import java.util.List;
import java.util.Scanner;

public class Ex04_산술연산자 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> list = List.of("Java", "Python", "Crawling");

        int sum = list.stream()
                .mapToInt(s -> {
                    System.out.print(s + " 입력 : ");
                    return sc.nextInt();
                }).sum();

        double average = (double) sum / list.size();

        System.out.println("합계 : " + sum);
        System.out.println("평균 : " + average);
    }
}
