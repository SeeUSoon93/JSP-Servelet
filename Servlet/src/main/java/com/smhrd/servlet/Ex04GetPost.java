package com.smhrd.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex04GetPost")
public class Ex04GetPost extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 4. Post방식으로 요청했을 때 데이터 인코딩
		request.setCharacterEncoding("UTF-8");
		
		// 1. 요청데이터 가져오기
		String name = request.getParameter("name");
		System.out.println(name);
		
		// 2. 응답페이지에 대한 인코딩
		response.setContentType("text/html; charset=UTF-8");
		
		//3.요청방식 알아보는 메소드
		String method = request.getMethod();
		System.out.println("요청방식 : "+ method);
		
		PrintWriter out = response.getWriter();
		
		out.print("<html>");
		out.print("<body>");
		out.print(name + "님 환영합니다!");
		out.print("</body>");
		out.print("</html>");
	}

}
