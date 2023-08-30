package com.smhrd.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smhrd.model.MemberDAO;
import com.smhrd.model.MemberDTO;

public class JoinService extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String nick = request.getParameter("nick");

		// System.out.println(id+"/"+pw+"/"+nick);

		MemberDTO dto = new MemberDTO(id, pw, nick);
		
		MemberDAO dao = new MemberDAO();
		
		int cnt = dao.join(dto);
		
		if(cnt > 0) {
			System.out.println("회원가입 성공!");
			response.sendRedirect("main.jsp");
		}else {
			System.out.println("회원가입 실패...");
			response.sendRedirect("join.jsp");
		}

	}

}