package com.smhrd.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smhrd.model.MemberDAO;
import com.smhrd.model.MemberDTO;
@WebServlet("/LoginService")
public class LoginService extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		String email = request.getParameter("email");
		String pw = request.getParameter("pw");
		
		System.out.println(email+pw);
		
		MemberDTO dto = new MemberDTO(email, pw);
		
		MemberDAO dao = new MemberDAO();	
		
		MemberDTO loginInfo = dao.login(dto);		
		
		
		if(loginInfo != null) {
			System.out.println("로그인 성공!");
			
			HttpSession session = request.getSession();				
			session.setAttribute("loginInfo", loginInfo);			
		}else {
			System.out.println("로그인 실패...");
		}
		response.sendRedirect("Main.jsp");

	}

}
