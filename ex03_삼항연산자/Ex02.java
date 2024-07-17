package ex03_삼항연산자;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("농구공의 개수 입력 : ");
        int n = sc.nextInt();
        int result = n % 5 == 0 ? n / 5 : n / 5 + 1;
        System.out.println("필요한 상자의 수 : "+result);
    }
}
