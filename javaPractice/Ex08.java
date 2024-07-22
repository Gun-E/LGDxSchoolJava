package javaPractice;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        do {
            int rand1 = (int) (Math.random() * 10);
            int rand2 = (int) (Math.random() * 10);
            System.out.print(rand1 + " + " + rand2 + " = ");
            int n = sc.nextInt();
            if (rand1 + rand2 == n) System.out.println("SUCCESS!");
            else {
                count++;
                System.out.println("Fail...");
            }
        } while (count < 5);
        System.out.println("GAME OVER!");
    }
}
