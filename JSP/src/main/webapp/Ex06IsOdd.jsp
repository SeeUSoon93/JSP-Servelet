<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<% int sum = 21;%>
	<%!
		public String isOdd(int num){			
			if(num%2==0){
				return "은 짝수입니다!";
			}else{
				return "은 홀수입니다!";
			}
	}
	%>
	<%=sum + isOdd(sum)%>	
	
</body>
</html>