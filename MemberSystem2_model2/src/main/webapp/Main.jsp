<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
ul {
	display: flex;
	list-style-type: none;
	font-size: 1.25rem;
	align-items: center
}

.container {
	display: flex;
	/* background-color: #ffffff; */
	padding: 0 10%;
	justify-content: space-between;
}

li {
	margin: 0 15px;
	/* background-color: #ffffff; */
	/* padding: 15px 0px; */
}

li:hover {
	color: #008acc;
	text-decoration: underline;
	text-underline-position: under;
	cursor: pointer;
}
</style>
</head>
<body>
	<%
	String nick = request.getParameter("nick");
	if(nick != null){%>
	<%=nick %>님 환영합니다~
	<%}
	String id = (String)session.getAttribute("id"); if(id != null){%>
	<%=id %>님 환영합니다~
	<%}%>


	<ul>
		<li><a href="login.jsp">로그인</a></li>
		<li><a href="join.jsp">회원가입</a></li>
		<li><a href="update.jsp">회원정보수정</a></li>
		<li><a href="delete.jsp">회원탈퇴</a></li>
		<li><a href="selecte.jsp">회원목록보기</a></li>
	</ul>
</body>
</html>
