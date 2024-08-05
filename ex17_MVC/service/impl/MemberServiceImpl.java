package ex17_MVC.service.impl;

import ex17_MVC.model.MemberLoginDTO;
import ex17_MVC.model.MemberRegisterDTO;
import ex17_MVC.repository.MemberDAO;
import ex17_MVC.repository.impl.MemberDAOImpl;
import ex17_MVC.service.MemberService;

public class MemberServiceImpl implements MemberService {
    MemberDAO memberDAO = new MemberDAOImpl();

    @Override
    public String register(MemberRegisterDTO registerDTO) {
        return memberDAO.insertMember(registerDTO);
    }
    @Override
    public String login(MemberLoginDTO loginDTO) {
        return memberDAO.findMember(loginDTO);
    }
}
