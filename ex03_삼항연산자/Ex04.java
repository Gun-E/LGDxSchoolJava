package ex03_삼항연산자;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("노동시간을 입력하세요 : ");
        int n = sc.nextInt();
        int result = n > 8 ? (int)((n - 8) * 5000 + (n - 8) * (5000 * 1.5)) : n * 5000;
        System.out.println("총임금은" + result + "원 입니다");
    }
}
