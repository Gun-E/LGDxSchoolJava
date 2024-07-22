package ex07_반복문;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        String id = "Lgedx";
        int pw = 1234;
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("아이디 : ");
            String inputId = sc.nextLine();

            System.out.print("비밀번호 : ");
            int inputPw = sc.nextInt();
            sc.nextLine();

            if(inputId.equals(id) && inputPw == pw) break;

            System.out.println("로그인 실패");
        }
        System.out.println("로그인 성공!");
    }
}
