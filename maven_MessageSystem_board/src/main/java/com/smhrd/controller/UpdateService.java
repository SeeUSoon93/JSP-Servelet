package com.smhrd.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smhrd.command.Command;
import com.smhrd.model.MemberDAO;
import com.smhrd.model.MemberDTO;

public class UpdateService implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		String email = request.getParameter("email");
		String pw = request.getParameter("pw");
		String tel = request.getParameter("tel");
		String address = request.getParameter("address");

		System.out.println(email + pw + tel + address);

		MemberDTO dto = new MemberDTO(email, pw, tel, address);
		int cnt = new MemberDAO().update(dto);

		if (cnt > 0) {
			System.out.println("정보수정 성공!");
			HttpSession session = request.getSession();
			session.setAttribute("loginInfo", dto);
		} else {
			System.out.println("정보수정 실패...");
		}
	
		return "Main.jsp";
	}

}
