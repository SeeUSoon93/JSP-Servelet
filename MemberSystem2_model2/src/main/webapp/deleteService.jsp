<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
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
	// - 사용하고 싶은 SQL문장 작성 및 SQL문장 실행
	//   SQL문장을 완성시키고 실행할 수 있는 객체 필요
	// -> PreparedStatement 객체 -> Connection객체를 통해 받아옴
	
	String sql = "DELETE FROM WEBMEMBER WHERE ID = ? and PW = ?";
	
	PreparedStatement psmt = conn.prepareStatement(sql);
	
	psmt.setString(1, id);
	psmt.setString(2, pw);
	
	
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
		System.out.println("회원탈퇴 성공!");
		response.sendRedirect("Main.jsp");
	}else {
		System.out.println("회원탈퇴 실패!");
		response.sendRedirect("delete.jsp");
	}
	
	
	%>
</body>
</html>