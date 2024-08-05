package ex17_MVC.controller;


import ex17_MVC.model.MemberLoginDTO;
import ex17_MVC.model.MemberRegisterDTO;
import ex17_MVC.service.MemberService;
import ex17_MVC.service.impl.MemberServiceImpl;
import ex17_MVC.view.MemberLogin;
import ex17_MVC.view.MemberRegister;

public class MemberController {

    public MemberService memberService = new MemberServiceImpl();

    public String registerMember() {
        MemberRegisterDTO member = MemberRegister.registerMember();
        return memberService.register(member);
    }
    public String login() {
        MemberLoginDTO member = MemberLogin.login();
        return memberService.login(member);
    }
}
