<%@page import="com.smhrd.model.BoardVO"%>
<%@page import="com.smhrd.model.BoardDAO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<title>Forty by HTML5 UP</title>
		<meta charset="utf-8" />
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<!--[if lte IE 8]><script src="assets/js/ie/html5shiv.js"></script><![endif]-->
		<link rel="stylesheet" href="assetsBoard/css/main.css" />
		<link rel="stylesheet" href="assetsBoard/css/board.css" />
		<!--[if lte IE 9]><link rel="stylesheet" href="assets/css/ie9.css" /><![endif]-->
		<!--[if lte IE 8]><link rel="stylesheet" href="assets/css/ie8.css" /><![endif]-->
		
</head>
<body>		
			<!-- Q17. 게시글 목록 조회 기능 -->
			<!-- Q18. 게시글 목록 세부페이지 기능(제목을 클릭하면 세부페이지 BoardDetail.jsp로 이동)-->
			<div id="board">
				<table id = "list">
					<tr>
						<td>번호</td>
						<td>제목</td>
						<td>작성자</td>
						<td>시간</td>
					</tr>
					<% BoardDAO dao = new BoardDAO();
						ArrayList<BoardVO> showBoard = (ArrayList)dao.showBoard();
						System.out.println(showBoard.size());
						for(int i = 0; i<showBoard.size(); i++){%>
					<tr>
						<td><%= i+1 %></td>
						<td><a href="BoardDetail.jsp?num=<%= showBoard.get(i).getNum() %>"><%= showBoard.get(i).getTitle() %></a></td>
						<td><%= showBoard.get(i).getWriter() %></td>
						<td><%= showBoard.get(i).getB_date() %></td>
						<td><a href="DelBoardService.do?num=<%=showBoard.get(i).getNum()%>">X</a></td>
					</tr>
					<%} %>
				
				</table>
				
				<a href="Main.jsp"><button id="writer">홈으로가기</button></a>
				<a href="BoardWrite.jsp"><button id="writer">작성하러가기</button></a>
			</div>


			<!-- Scripts -->
			<script src="assets/js/jquery.min.js"></script>
			<script src="assets/js/jquery.scrolly.min.js"></script>
			<script src="assets/js/jquery.scrollex.min.js"></script>
			<script src="assets/js/skel.min.js"></script>
			<script src="assets/js/util.js"></script>
			<!--[if lte IE 8]><script src="assets/js/ie/respond.min.js"></script><![endif]-->
			<script src="assets/js/main.js"></script>
</body>
</html>