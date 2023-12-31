package com.smhrd.frontcontroller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.smhrd.command.Command;
import com.smhrd.controller.BoardService;
import com.smhrd.controller.DelBoardService;
import com.smhrd.controller.DeleteService;
import com.smhrd.controller.IdCheckService;
import com.smhrd.controller.JoinService;
import com.smhrd.controller.LoginService;
import com.smhrd.controller.UpdateService;
import com.smhrd.controller.logout;
import com.smhrd.model.BoardDAO;
import com.smhrd.model.BoardVO;
import com.smhrd.model.MemberDAO;
import com.smhrd.model.MemberDTO;

public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// url mapping -> *.do
		// * = 전체
		// .do 확장자가 붙으면 전부 FrontController로 모임
		System.out.println("[FrontController]");

		// 어디서 요청이 들어왔는지 확인
		String uri = request.getRequestURI();
		System.out.println("들어온 요청 : " + uri);

		// 프로젝트 이름 확인
		String project = request.getContextPath();
		System.out.println("프로젝트 : " + project);

		// 문자열 잘라내기 -> uri
		// substring(start) -> start부터 끝까지 잘라주는 메소드
		// substring(start, end) -> start부터 end전까지 잘라주는 메소드
		uri = uri.substring(project.length() + 1);
		System.out.println("자르기 : " + uri);

		request.setCharacterEncoding("UTF-8");
		String moveURL = null;
		Command service = null;

		if (uri.equals("LoginService.do")) {
			service = new LoginService();

		} else if (uri.equals("JoinService.do")) {
			service = new JoinService();

		} else if (uri.equals("logout.do")) {
			service = new logout();

		} else if (uri.equals("UpdateService.do")) {
			service = new UpdateService();

		} else if (uri.equals("IdCheckService.do")) {
			service = new IdCheckService();

		} else if (uri.equals("DeleteService.do")) {
			service = new DeleteService();

		} else if (uri.equals("BoardService.do")) {
			service = new BoardService();

		} else if (uri.equals("DelBoardService.do")) {
			service = new DelBoardService();

		}
		moveURL = service.execute(request, response);
		if (moveURL != null) {
			response.sendRedirect(moveURL);
		}
	}

}
