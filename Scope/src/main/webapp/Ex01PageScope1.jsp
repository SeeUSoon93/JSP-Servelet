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
	// page 영역에 값 저장 .setAttribute(name,value);
	pageContext.setAttribute("nick", "순이몬스터");
	
	// page 영역에 값 가져오기 .getAttribute(name);
	/* String nick = (String)pageContext.getAttribute("nick"); */	
	%>
	
	<%-- 닉네임 : <%=nick %> --%>
	닉네임(EL) : ${nick}
	
	<a href="Ex01PageScope2.jsp">2페이지로 이동</a>
</body>
</html>