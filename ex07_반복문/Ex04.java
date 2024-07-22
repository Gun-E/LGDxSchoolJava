package ex07_반복문;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n = 0;

//        while (true) {
//            System.out.print("숫자 입력 : ");
//            n = sc.nextInt();
//            if (n == -1) break;
//            list.add(n);
//        }
//        while (n != -1) {
//            System.out.print("숫자 입력 : ");
//            n = sc.nextInt();
//            if (n != -1) list.add(n);
//        }
        do {
            System.out.print("숫자 입력 : ");
            n = sc.nextInt();
            if (n != -1) list.add(n);
        } while (n != -1);

        int odd = (int) list.stream().mapToInt(i -> i).filter(i -> i % 2 != 0).count();
        int even = (int) list.stream().mapToInt(i -> i).filter(i -> i % 2 == 0).count();

        System.out.println("홀수 개수 : " + odd);
        System.out.println("짝수 개수 : " + even);
    }
}
