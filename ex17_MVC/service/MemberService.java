package ex17_MVC.service;


import ex17_MVC.model.MemberLoginDTO;
import ex17_MVC.model.MemberRegisterDTO;

public interface MemberService {
    String login(MemberLoginDTO loginDTO);
    String register(MemberRegisterDTO registerDTO);
}
