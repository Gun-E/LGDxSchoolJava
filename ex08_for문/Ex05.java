package ex08_for문;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 입력 : ");
        int n = sc.nextInt();

        System.out.print(n+"의 약수 : ");
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                list.add(i);
                if (i != n / i) {
                    list.add(n / i);
                }
            }
        }

        List<Integer> sortedNumbers = list.stream().sorted().toList();
        sortedNumbers.forEach(x -> System.out.print(x + " "));
    }
}
