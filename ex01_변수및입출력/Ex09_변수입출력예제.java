package ex01_변수및입출력;

import java.util.Scanner;

public class Ex09_변수입출력예제 {
    public static void main(String[] args) {
        // 문제 이름 주소 호수 입력받고 출력하기
        Scanner sc = new Scanner(System.in);
        System.out.print("이름 : ");
        String name = sc.nextLine();
        System.out.print("주소 : ");
        String address = sc.nextLine();
        System.out.print("호수 : ");
        int num = sc.nextInt();

        System.out.println("이름 : "+ name + ", 주소 : " + address + ", 호수 : " + num);
    }
}
