package com.smhrd.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex07Select")
public class Ex07Select extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// post방식의 인코딩
		request.setCharacterEncoding("UTF-8");
		
		String[] name = request.getParameterValues("name");
		
		Random rd = new Random();
		int result = rd.nextInt(name.length);
		
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		out.print("<html>");
		out.print("<body>");
		out.print("<h2>");
		out.print("오늘은 너가 쏴라~");
		out.print("</h2>");		
		out.print("<h1>");
		out.print(name[result]+"!!");
		out.print("</h1>");		
		out.print("</body>");
		out.print("</html>");		
		

	}
}
