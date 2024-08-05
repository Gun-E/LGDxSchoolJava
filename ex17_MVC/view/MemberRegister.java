package ex17_MVC.view;

import ex17_MVC.model.MemberRegisterDTO;

import java.util.Scanner;

public class MemberRegister {
    public static MemberRegisterDTO registerMember() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=====회원가입=====");
        System.out.print("ID : ");
        String id = sc.nextLine();
        System.out.print("Password : ");
        String password = sc.nextLine();
        System.out.print("Name : ");
        String name = sc.nextLine();
        System.out.print("Age : ");
        int age = sc.nextInt();
        sc.nextLine();
        return new MemberRegisterDTO(id, password, name, age);
    }
}
