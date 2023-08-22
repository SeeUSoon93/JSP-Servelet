package com.smhrd.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/JoinService")
public class JoinService extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");

		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String nick = request.getParameter("nick");
		Connection conn = null;
		PreparedStatement psmt = null;

		int cnt = 0;

		// 0. 사용하고자 하는 DBMS 드라이버를 프로젝트에 추가

		try {
			// 1.드라이버 동적로딩
			// - 사용하는 DBMS에 맞는 드라이버를 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2.데이터베이스 연결
			// - 드라이버를 통해서 내가 사용하는 DBMS와의 연결
			// 데이터베이스 연결을 하기 위해서는 현재 내가 사용하는 DBMS의
			// 주소, 계정, 비밀번호가 필요하다
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "SERVICE";
			String db_pw = "12345";

			conn = DriverManager.getConnection(db_url, db_id, db_pw);

			if (conn != null) {
				System.out.println("DB연결 성공!");
			} else {
				System.out.println("DB연결 실패!");
			}

			// 3.SQL문 실행
			// - 사용하고 싶은 SQL문장 작성 및 SQL문장 실행
			// SQL문장을 완성시키고 실행할 수 있는 객체 필요
			// -> PreparedStatement 객체 -> Connection객체를 통해 받아옴
			String sql = "INSERT INTO WEBMEMBER VALUES(?,?,?)";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, nick);

			cnt = psmt.executeUpdate();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			// 4.연결 끊음
			// - DB와 연결된 객체의 연결을 끊어준다 -> 역순

			try {
				if (psmt != null) {
					psmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (cnt > 0) {
			System.out.println("회원가입 성공!");
			response.sendRedirect("Main.jsp");
		} else {
			System.out.println("회원가입 실패!");
			response.sendRedirect("join.jsp");
		}
	}

}
