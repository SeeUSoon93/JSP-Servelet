<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%! private int abs(int num){
/* 			int result = 0;
			if(num<0){
				num*=-1;
			} */
		return num<0?num*-1:num;
	}
	%>
	<%= abs(5) %><br>
	<%= abs(-5) %>

</body>
</html>