package javaPractice;

import java.util.Arrays;
import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수입력 : ");
        int num = sc.nextInt();
        String numStr = String.valueOf(num);
        int sum = Arrays.stream(numStr.split("")).mapToInt(Integer::parseInt).sum();
        System.out.println("합은 " + sum + "입니다.");
    }
}