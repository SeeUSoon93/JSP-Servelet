<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	Hello World!
	<br><br>
	<!-- HTML 주석 -->
	<%-- JSP 주석
		JSP안에서 자바코드를 사용하고 싶으면 스크립트릿이라는 것을 사용한다
	 --%>	
	
	<%
		String name = "김군순";
		int age = 31;
		String result = "";
		if(age >= 19){
			result = "성인";
		}else{
			result = "청소년";
		}	
	%>
	
	<%-- java의 값을 web browser에 출력하기 위해 사용 : 표현식 --%>	
	
	나는 <%= name %> 이라 하고<br>
	<%= result %> 이요!
	
	<br>
	
	<hr color = 'red' size='<%= age%>'>
	
	
</body>
</html>