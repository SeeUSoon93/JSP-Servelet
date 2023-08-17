<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- Servlet에서 -->
    <!-- 데이터 자체를 인코딩 : setCharacterEncoding -->
    <!-- 웹 브라우저한테 인코딩 방식 알려주기 : response.setContentType("") -->
    
    <!-- JSP에서 -->
    <!-- contentType : 웹 브라우저한테 형식은 text형식이고 html파일이고
    				   인코딩방식은 UTF-8이다라고 알려주는 역할 -->
	<!-- pageEncoding : JSP 소스코드 자체를 인코딩 하는 것-->
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"> <!-- HTML 인코딩 방식 -->
<title>Insert title here</title>
</head>
<body>
	<!-- JSP파일 -> Servlet 파일로 변환 -> 톰캣이 html 파일로 만들어줌 -->
	<h1>안녕하세요</h1>

</body>
</html>