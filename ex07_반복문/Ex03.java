package ex07_반복문;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        int n = 0;

//        while (n != -1) {
//            System.out.print("숫자 입력 : ");
//            n = sc.nextInt();
//            if (n != -1) {
//                list.add(n);
//            }
//        }
//        while (true) {
//            System.out.print("숫자 입력 : ");
//            n = sc.nextInt();
//            if (n == -1) break;
//            list.add(n);
//        }
        do {
            System.out.print("숫자 입력 : ");
            n = sc.nextInt();
            if (n != -1) {
                list.add(n);
            }
        } while (n != -1);

        int sum = list.stream().mapToInt(i -> i).sum();
        System.out.println("누적결과 : " + sum);
    }

}
