package com.smhrd.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import com.smhrd.model.MemberDAO;
import com.smhrd.model.MemberDTO;

@WebServlet("/UpdateService")
public class UpdateService extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		// 세션에서 가져오기
//		HttpSession session = request.getSession();
//		MemberDTO login = (MemberDTO)session.getAttribute("loginInfo");
//		
//		String email = login.getEmail();		
//		
		// form태그에서 가져오기
		String email = request.getParameter("email");		
		String pw = request.getParameter("pw");
		String tel = request.getParameter("tel");
		String address = request.getParameter("address");
		
		System.out.println(email+pw+tel+address);
		
		MemberDTO dto = new MemberDTO(email, pw, tel, address);
		
		MemberDAO dao = new MemberDAO();
		
		int cnt = dao.update(dto);		
		
		if(cnt > 0) {
			System.out.println("정보수정 성공!");
			HttpSession session = request.getSession();			
			session.setAttribute("loginInfo", dto);
		}else {
			System.out.println("정보수정 실패...");
		}
		response.sendRedirect("Main.jsp");

	}

}
