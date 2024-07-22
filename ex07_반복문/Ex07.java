package ex07_반복문;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] count = {0, 0};

        do {
            int rand1 = (int) (Math.random() * 10);
            int rand2 = (int) (Math.random() * 10);

            System.out.print(rand1 + " + " + rand2 + " = ");
            int n = sc.nextInt();

            if (rand1 + rand2 == n) {
                count[0]++;
                System.out.println("SUCCESS!");
            } else {
                count[1]++;
                System.out.println("Fail...");
            }

            System.out.print("계속 하시겠습니까? ");
        } while (!sc.next().equals("N"));

        System.out.println("종료!");
        System.out.println("맞춘개수 : " + count[0]);
        System.out.println("틀린개수 : " + count[1]);
    }
}
