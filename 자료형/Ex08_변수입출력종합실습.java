package 자료형;

import java.util.Scanner;

public class Ex08_변수입출력종합실습 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름 : ");
        String name = sc.nextLine();
        System.out.print("주소 : ");
        String address = sc.nextLine();
        System.out.print("호수 : ");
        int num = sc.nextInt();

        num = 2;
        System.out.println("이름 : "+ name + ", 주소 : " + address + ", 호수 : " + num);

    }
}
