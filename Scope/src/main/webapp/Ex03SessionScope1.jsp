<%@page import="javax.websocket.Session"%>
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
		session.setAttribute("nick", "순이");
		String nick = (String)session.getAttribute("nick");
	%>

	닉네임 :	<%=nick %><br>
	닉네임(EL) : ${sessionScope.nick}
	<br>

	<a href="Ex03SessionScope2.jsp">2페이지로 이동</a>

</body>
</html>