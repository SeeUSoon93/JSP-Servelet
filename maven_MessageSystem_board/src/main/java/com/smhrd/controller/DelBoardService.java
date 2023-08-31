package com.smhrd.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smhrd.model.BoardDAO;
import com.smhrd.model.MemberDAO;

public class DelBoardService extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		String num = request.getParameter("num");
		
		System.out.println(num);
		int del = new BoardDAO().deleteBoard(num);			
		
		if(del != 0) {
			System.out.println("삭제 성공!");
		}else {
			System.out.println("삭제 실패...");
		}
		response.sendRedirect("BoardMain.jsp");	
	
	
	}

}
