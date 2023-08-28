package com.smhrd.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smhrd.model.MemberDAO;
import com.smhrd.model.MemberDTO;

public class LoginService extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		String email = request.getParameter("email");
		String pw = request.getParameter("pw");

		// System.out.println(id+"/"+pw+"/"+nick);

		MemberDTO dto = new MemberDTO(email, pw, null,null);
		
		MemberDAO dao = new MemberDAO();
		
		MemberDTO info = dao.login(dto);
		
		if(info != null) {
			System.out.println(info.getEmail()+" 로그인 성공!");
			response.sendRedirect("Main.jsp");
		}else {
			System.out.println("로그인 실패...");
			response.sendRedirect("Main.jsp");
		}
	
	
	
	
	}

}
