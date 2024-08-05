package ex17_MVC.repository.impl;

import ex17_MVC.model.MemberLoginDTO;
import ex17_MVC.model.MemberRegisterDTO;
import ex17_MVC.repository.MemberDAO;

import java.sql.*;

public class MemberDAOImpl implements MemberDAO {
    private final String url = "jdbc:oracle:thin:@localhost:1521:XE";
    private final String oracleUser = "hrd";
    private final String oraclePassword = "12345";

    @Override
    public String insertMember(MemberRegisterDTO member) {
        try (Connection conn = DriverManager.getConnection(url, oracleUser, oraclePassword);
             PreparedStatement pstmt = conn.prepareStatement("Insert INTO USERS VALUES(?,?,?,?)");) {

            pstmt.setString(1, member.getId());
            pstmt.setString(2, member.getPw());
            pstmt.setString(3, member.getName());
            pstmt.setInt(4, member.getAge());
            pstmt.executeUpdate();
            return "회원가입 성공!";
        } catch (SQLException e) {
            return "데이터베이스 연결 또는 쿼리 실행 중 오류 발생: "+e.getMessage();
        }
    }

    @Override
    public String findMember(MemberLoginDTO member) {
        try (Connection conn = DriverManager.getConnection(url, oracleUser, oraclePassword);
             PreparedStatement pstmt = conn.prepareStatement("SELECT NAME FROM users where USER_ID=? and PASSWORD=?");) {

            pstmt.setString(1, member.getId());
            pstmt.setString(2, member.getPw());
            pstmt.executeUpdate();
            ResultSet rs = pstmt.executeQuery();

            String username;
            if (rs.next()) {
                username = rs.getString("name");
                return username+"님 환영합니다!";
            }
            else return "로그인 실패.";
        } catch (SQLException e) {
            return "데이터베이스 연결 또는 쿼리 실행 중 오류 발생: " + e.getMessage();
        }
    }
}
