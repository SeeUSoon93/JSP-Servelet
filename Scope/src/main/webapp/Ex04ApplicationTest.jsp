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
	// application 영역에 값 넣어보기
	application.setAttribute("name", "군순");
	// session 영역에 값 넣기
	session.setAttribute("name", "주희");
	%>
</body>
</html>