package com.smhrd.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smhrd.model.MemberDAO;
import com.smhrd.model.MemberDTO;

public class DeleteService extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		String email = request.getParameter("email");
		
		System.out.println(email);
		int del = new MemberDAO().deleteMember(email);			
		
		if(del != 0) {
			System.out.println("삭제 성공!");
		}else {
			System.out.println("삭제 실패...");
		}
		response.sendRedirect("ShowMember.jsp");
	}

}
