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

@WebServlet("/updateService")
public class updateService extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");

		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String nick = request.getParameter("nick");
				
		PreparedStatement psmt = null;

		int cnt = 0;

		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "SERVICE";
			String db_pw = "12345";

			conn = DriverManager.getConnection(db_url, db_id, db_pw);

			if (conn != null) {
				System.out.println("DB연결 성공!");
			} else {
				System.out.println("DB연결 실패!");
			}
			String sql = "UPDATE WEBMEMBER SET NICK=? WHERE ID=? AND PW=?";

			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, nick);
			psmt.setString(2, id);
			psmt.setString(3, pw);	
			
			cnt = psmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
				try {
					if (psmt != null) {
					psmt.close();
					}
					if (conn != null) {
						conn.close();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
		}
		if(cnt > 0 ){
			System.out.println("NICK 변경 성공!");
			response.sendRedirect("Main.jsp");
		}else {
			System.out.println("NICK 변경 실패!");
			response.sendRedirect("update.jsp");
		}

	}

}
