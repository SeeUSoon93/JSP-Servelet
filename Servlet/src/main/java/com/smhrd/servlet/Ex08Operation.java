package com.smhrd.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex08Operation")
public class Ex08Operation extends HttpServlet {


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		String opr = request.getParameter("opr");
		int result = 0;
		
		if (opr.equals("+")) {
			result = num1 + num2;
		}else if (opr.equals("-")) {
			result = num1 - num2;
		}else if (opr.equals("*")) {
			result = num1 * num2;
		}else{
			result = num1 / num2;
		}		
		
		PrintWriter out = response.getWriter();
		
		out.print("<html>");
		out.print("<body>");
		out.printf("%s%s%s=%d", num1,opr,num2,result);
		out.print("</body>");
		out.print("</html>");
	}

}
