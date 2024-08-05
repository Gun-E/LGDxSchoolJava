package ex17_MVC.view;

import ex17_MVC.controller.MemberController;

import java.util.Scanner;

public class MemberView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MemberController controller = new MemberController();
        System.out.println("==== 회원 관리 ====");
        while (true){
            System.out.println("1.회원가입 2.로그인 3.종료");
            System.out.print("번호 입력 : ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    String result = controller.registerMember();
                    System.out.println(result);
                }
                case 2 -> {
                    String result = controller.login();
                    System.out.println(result);
                }
                case 3 -> {
                    System.out.println("프로그램을 종료합니다.");
                    return;
                }
                default -> System.out.println("잘못된 입력입니다. 다시 시도하세요.");
            }
        }
    }
}
