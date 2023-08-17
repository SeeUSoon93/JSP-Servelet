package com.smhrd.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex06Join")
public class Ex06Join extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// post방식의 인코딩
		request.setCharacterEncoding("UTF-8");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String nick = request.getParameter("nick");
		String gender = request.getParameter("gender");
		// 동일한 name으로 여러개의 값을 가져오는 방법
		String[] hobby = request.getParameterValues("hobby");
		
		System.out.println(id);
		System.out.println(pw);
		System.out.println(nick);
		System.out.println(gender);
		for(int i = 0; i < hobby.length; i++) {
			System.out.println(hobby[i]);
		}
		
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		out.print("<html>");
		out.print("<body>");
		out.print(id + "님 환영합니다!");
		out.print("</body>");
		out.print("</html>");
		
	}

}
