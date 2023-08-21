<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	request.setCharacterEncoding("UTF-8");

	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String nick = request.getParameter("nick");
	
	int cnt = 0;
	
	Class.forName("oracle.jdbc.driver.OracleDriver");

	String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
	String db_id = "SERVICE";
	String db_pw = "12345";

	Connection conn = DriverManager.getConnection(db_url, db_id, db_pw);
	
	if(conn != null){
		System.out.println("DB연결 성공!");
	}else{
		System.out.println("DB연결 실패!");
	}
	
	// 3.SQL문 실행
	String sql = "UPDATE WEBMEMBER SET NICK=? WHERE ID=? AND PW=?";
	
	PreparedStatement psmt = conn.prepareStatement(sql);
	
	psmt.setString(1, nick);
	psmt.setString(2, id);
	psmt.setString(3, pw);	
	
	cnt = psmt.executeUpdate();
	
	// 4.연결 끊음
	// - DB와 연결된 객체의 연결을 끊어준다 -> 역순
	
	if(psmt != null){
		psmt.close();
	}
	if(conn != null){
		conn.close();
	}
	
	if(cnt > 0 ){
		System.out.println("NICK 변경 성공!");
		response.sendRedirect("Main.jsp");
	}else {
		System.out.println("NICK 변경 실패!");
		response.sendRedirect("update.jsp");
	}
	
	
	%>
	
</body>
</html>