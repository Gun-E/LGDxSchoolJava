package ex08_for문;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        for (int i = 21; i <= 57; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 96; i >= 53; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 2씩 증가
        for (int i = 21; i <= 57; i += 2) {
            System.out.print(i + " ");
        }
        // 홀수 판별
//        for (int i = 21; i <= 57; i++) {
//            if (i % 2 == 1)
//                System.out.print(i+" ");
//        }
        System.out.println();

        // 정수를 입력받아서 1부터 입력받은 정수까지 차례대로 출력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 두 개의 정수를 입력받아서 작은수부터 큰수까지 차례대로 출력
        int n1 = sc.nextInt(), n2 = sc.nextInt();

        int min = Integer.min(n1, n2);
        int max = Integer.max(n1, n2);

        for (int i = min; i <= max; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 숫자 2개를 입력 받아서 두 수 사이의 총합을 출력
        // ex) 2, 9입력 -> 2+3+4+5+6+7+8+9의 총합 출력
        int num1 = sc.nextInt(), num2 = sc.nextInt();
        int sum = 0;
        int min1 = Integer.min(num1, num2);
        int max1 = Integer.max(num1, num2);

        for (int i = min1; i <= max1; i++) {
            sum += i;
        }
        System.out.println(sum);

        // 1~100까지의 3의 배수를 출력
        for (int i = 3; i <= 100; i += 3) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 정수를 입력받아 그 수의 배수를 차례로 10개 출력
        Scanner sc2 = new Scanner(System.in);
        int input = sc2.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.print(input * i + " ");
        }
        System.out.println();

        // 1~100까지의 3의 배수의 합을 출력
        int sum2 = 0;
        for (int i = 3; i <= 100; i += 3) {
            sum2 += i;
        }
        System.out.println(sum2);
    }
}
