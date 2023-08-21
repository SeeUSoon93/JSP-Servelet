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
	// 세션 값 설정 setAttribute(name(String), value(Object));	
	session.setAttribute("id","내가 만든 쿠키");
	session.setAttribute("age",20);
	// 어차피 서버가 알아서 세션 아이디 부여해줄 거기 때문에 따로 응답할 필요 없이 저장만 해주면 됨
	
	%>
	
	<a href="Ex05GetSession.jsp">세션확인</a>


</body>
</html>