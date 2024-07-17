package ex03_삼항연산자;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하세요 : ");
        int n = sc.nextInt();
        String result = n % 2 == 0 ? "홀" : "짝";
        System.out.println(n + "는(은) " + result + "수입니다.");
    }
}
