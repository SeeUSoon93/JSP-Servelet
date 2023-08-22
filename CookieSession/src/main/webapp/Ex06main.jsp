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
		String name = (String)session.getAttribute("name");
	%>
	
	<!-- session 이 만료되었을때는 clickSession.jsp로 보내기 -->
	<% if(name != null){ %>	
	<%= name %>님 환영합니다.
	<a href="Ex06RemoveSession">로그아웃</a>
	<%}else{ %>
		<script type="text/javascript">
			alert('10초동안 아무런 행동을 하지않아 로그아웃 됩니다.');
			location.href='Ex06ClickSession.jsp';
		</script>		
	<% } %>
</body>
</html>