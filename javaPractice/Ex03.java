package javaPractice;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력 : ");
        int n = sc.nextInt();
        if (n % 10 >= 5) n = n - n % 10 + 10;
        else n = n - n % 10;
        System.out.println("반올림 수 :" + n);
    }
}
