package ex16_jdbc;

import java.sql.*;

public class Ex01 {
    public static void main(String[] args) {
        String url = "jdbc:oracle:thin:@localhost:1521:XE";
        String user = "hrd";
        String password = "12345";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM users")) {
            System.out.println("Oracle 데이터베이스 연결 성공");

            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                String userId = rs.getString("user_id");
                String username = rs.getString("name");
                String gender = rs.getString("gender");
                int age = rs.getInt("age");
                System.out.println("ID : " + userId + "\t\t이름 : " + username + "\t\t성별 : " + gender + "\t\t나이 : " + age);
            }
        } catch (SQLException e) {
            System.err.println("데이터베이스 연결 또는 쿼리 실행 중 오류 발생: " + e.getMessage());
        }
    }
}
