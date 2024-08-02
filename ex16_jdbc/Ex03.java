package ex16_jdbc;

import java.sql.*;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====로그인====");
        System.out.print("ID : ");
        String id = sc.nextLine();
        System.out.print("Password : ");
        String password = sc.nextLine();

        String url = "jdbc:oracle:thin:@localhost:1521:XE";
        String oracleUser = "hrd";
        String oraclePassword = "12345";

        try (Connection conn = DriverManager.getConnection(url, oracleUser, oraclePassword);
             PreparedStatement pstmt = conn.prepareStatement("SELECT NAME FROM users WHERE user_id = ? AND password = ?");) {

            pstmt.setString(1, id);
            pstmt.setString(2, password);

            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                String name = rs.getString("name");
                System.out.println(name + "님 환영합니다 !");
            } else {
                System.out.println("로그인 실패");
            }
        } catch (SQLException e) {
            System.err.println("데이터베이스 연결 또는 쿼리 실행 중 오류 발생: " + e.getMessage());
        }
    }
}
