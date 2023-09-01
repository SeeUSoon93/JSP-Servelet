package com.smhrd.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smhrd.command.Command;
import com.smhrd.model.MemberDAO;
import com.smhrd.model.MemberDTO;

public class LoginService implements Command{

	public String execute(HttpServletRequest request, HttpServletResponse response) {
		String email = request.getParameter("email");
		String pw = request.getParameter("pw");
		System.out.println(email + pw);

		MemberDTO dto = new MemberDTO(email, pw);
		MemberDTO loginInfo = new MemberDAO().login(dto);

		if (loginInfo != null) {
			HttpSession session = request.getSession();
			session.setAttribute("loginInfo", loginInfo);
		} else {
		}
		return "Main.jsp";
	}

}
