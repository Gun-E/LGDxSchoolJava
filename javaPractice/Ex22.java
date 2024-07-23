package javaPractice;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자1입력 >> ");
        int num1 = sc.nextInt();
        System.out.print("숫자2입력 >> ");
        int num2 = sc.nextInt();

        BigInteger b1 = BigInteger.valueOf(num1);
        BigInteger b2 = BigInteger.valueOf(num2);

        BigInteger gcd = b1.gcd(b2);
        BigInteger lcm = b1.multiply(b2).divide(gcd).abs();
        System.out.println("최대공약수 : " + gcd);
        System.out.println("최소공배수 : " + lcm);
    }
}