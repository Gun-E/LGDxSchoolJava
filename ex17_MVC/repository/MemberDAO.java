package ex17_MVC.repository;


import ex17_MVC.model.MemberLoginDTO;
import ex17_MVC.model.MemberRegisterDTO;

public interface MemberDAO {
    String insertMember(MemberRegisterDTO member);
    String findMember(MemberLoginDTO member);
}
