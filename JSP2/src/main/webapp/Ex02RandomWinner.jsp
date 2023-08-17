<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body align = "center">
			<%
			request.setCharacterEncoding("UTF-8");
			String menu = request.getParameter("menu");
			String[] item = request.getParameterValues("item");
			
			Random rd = new Random();
			int rdNum = rd.nextInt(item.length);		
			%>
	<fieldset>
		<legend>랜덤당첨결과</legend>
		<%=menu %><br>
		<%=item[rdNum] %>
	</fieldset>
</body>
</html>