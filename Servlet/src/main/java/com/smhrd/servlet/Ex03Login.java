package com.smhrd.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex03Login")
public class Ex03Login extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		System.out.println("ID : " + id);
		System.out.println("PW : " + pw);

		// 2. 웹에 출력하기
		// 응답 문서에 대한 설정
		response.setContentType("text/html; charset=UTF-8");

		PrintWriter out = response.getWriter();

		out.print("<html>");
		out.print("<body>");
		out.print(id + "님 환영합니다!");
		out.print("</body>");
		out.print("</html>");
	}

}
