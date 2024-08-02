package ex16_jdbc;

import java.sql.*;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====회원가입====");
        System.out.print("ID : ");
        String id = sc.nextLine();
        System.out.print("Password : ");
        String password = sc.nextLine();
        System.out.print("Name : ");
        String name = sc.nextLine();
        System.out.print("Gender : ");
        String gender = sc.nextLine();
        System.out.print("Age : ");
        int age = sc.nextInt();
        sc.nextLine();

        String url = "jdbc:oracle:thin:@localhost:1521:XE";
        String oracleUser = "hrd";
        String oraclePassword = "12345";

        try (Connection conn = DriverManager.getConnection(url, oracleUser, oraclePassword);
             PreparedStatement pstmt = conn.prepareStatement("Insert INTO USERS VALUES(?,?,?,?,?)");) {
            System.out.println("Oracle 데이터베이스 연결 성공");

            pstmt.setString(1, id);
            pstmt.setString(2, password);
            pstmt.setString(3, name);
            pstmt.setString(4, gender);
            pstmt.setInt(5, age);
            pstmt.executeUpdate();

            System.out.println("회원 가입 성공!");
        } catch (SQLException e) {
            System.err.println("데이터베이스 연결 또는 쿼리 실행 중 오류 발생: " + e.getMessage());
        }
    }
}
