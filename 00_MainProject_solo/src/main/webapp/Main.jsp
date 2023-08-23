<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>나만의 바텐더, 마텐더</title>
<link rel="stylesheet" href="fontstyle.css">
<style class="header">
#menu {
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100px;
	margin: 20px;
	font-family: "GeekbleMalang2WOFF2";
}
#logo {
	display: flex;
	align-items: center;
}
.headmenu {
	display: flex;
	list-style-type: none;
	font-size: 1.25rem;
	align-items: center
}
.headmenu>li{
	margin: 0 40px;
	justify-content: space-between;
}
.joinBtn {
	background-color: #CC9933;
	padding: 15px 20px;
	border-radius: 10px;
}
li:hover {
	color: #CC9933;
	cursor: pointer;
}
.joinBtn:hover {
	background-color: #0d4660;
	color: white;
	text-decoration: none;
}

#back {
	background-image: url(./img/mainthum.jpg);
	height: 300px;
	max-width: 100%;
	background-size: cover;
	background-repeat: no-repeat;
	background-position: center;
}
a{
	 text-decoration: none;
}
.joinBtn > a {
  color: white;
}

</style>
</head>
<body>
	<header>
		<div id="menu">
			<div id="logo">
				<a href ="Main.jsp"><img src="./img/logo.png" alt="" width="170px"></a>
			</div>
			<ul class='headmenu'>
				<li>맞춤추천</li>
				<li>전체보기</li>
				<li>칵테일이야기</li>
				<li>오늘의 칵테일</li>
				<li>커뮤니티</li>
				<li class="joinBtn"><a href="login.jsp">로그인/회원가입</a></li>
			</ul>
		</div>
	</header>
	<div id="back"></div>


</body>
</html>