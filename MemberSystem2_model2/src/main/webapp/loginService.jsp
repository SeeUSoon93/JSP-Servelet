<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
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
	String sql = "SELECT * FROM WEBMEMBER WHERE ID = ? AND PW = ?";
	
	PreparedStatement psmt = conn.prepareStatement(sql);
	
	psmt.setString(1, id);
	psmt.setString(2, pw);		
	
	ResultSet rs = psmt.executeQuery();
	
	if(rs.next()){
		System.out.println("로그인 성공!");
		response.sendRedirect("Main.jsp?id="+id);
	}else {
		System.out.println("로그인 실패!");
		response.sendRedirect("login.jsp");
	}

	
	// 4.연결 끊음
	// - DB와 연결된 객체의 연결을 끊어준다 -> 역순
	
	if( rs != null){
		rs.close();
	}
	if(psmt != null){
		psmt.close();
	}
	if(conn != null){
		conn.close();
	}
	

	
	%>
</body>
</html>