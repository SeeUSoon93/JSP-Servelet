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
	// 1. 쿠키 생성(삭제시켜주는 메소드가 없기 때문에 같은 name의 쿠키를 생성해서 유효기간 변경)
	Cookie newjeans = new Cookie("test","CookieImade");
	
	// 2. 유효기간 0초
	newjeans.setMaxAge(0);
	
	// 3. 쿠키를 클라이언트에게 전송
	response.addCookie(newjeans);
		
	%>
	
	<a href="Ex02getCookie.jsp">쿠키확인</a>
</body>
</html>