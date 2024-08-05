package ex17_MVC.view;

import ex17_MVC.model.MemberLoginDTO;

import java.util.Scanner;

public class MemberLogin {

    public static MemberLoginDTO login() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=====로그인=====");
        System.out.print("ID : ");
        String id = sc.nextLine();
        System.out.print("Password : ");
        String password = sc.nextLine();
        return new MemberLoginDTO(id, password);
    }
}
