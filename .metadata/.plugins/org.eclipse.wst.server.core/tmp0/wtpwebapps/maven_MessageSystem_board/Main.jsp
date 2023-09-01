<%@page import="com.smhrd.model.MemberDTO"%>
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
<link rel="stylesheet" href="assets/css/main.css" />
<!--[if lte IE 9]><link rel="stylesheet" href="assets/css/ie9.css" /><![endif]-->
<!--[if lte IE 8]><link rel="stylesheet" href="assets/css/ie8.css" /><![endif]-->
</head>
<body>
	<% MemberDTO login = (MemberDTO)session.getAttribute("loginInfo"); %>

	<!-- Wrapper -->
	<div id="wrapper">

		<!-- Header -->
		<header id="header" class="alt"> <a href="index.html"
			class="logo"><strong>Forty</strong> <span>by HTML5 UP</span></a>
			<nav>
		<!-- Q6. 로그인을 한 상태에서는 로그인탭 대신 로그아웃탭과 개인정보수정탭을 출력 -->
		<%if(login != null){%>
			<a href="logout.do">로그아웃</a>
			<a href="UpdateMember.jsp">개인정보수정</a>
			<%if(login.getEmail().equals("admin")){%>
			<a href="ShowMember.jsp">전체회원목록</a>
			<%}%>		
		<%}else{ %>
			<a href="#menu">로그인</a>
		<%} %>
		
		<!-- Q7. 개인정보수정 기능 만들기 -->		
		<!-- Q8. 로그아웃 기능 만들기 -->		
		<!-- Q9. 관리자 계정(admin)일 때는 회원정보관리 탭 만들기 -->
		
			</nav>
		</header>

		<!-- Menu -->
		<nav id="menu">
		<ul class="links">
			<!-- Q3. 로그인 기능 만들기 -->
			<li><h5>로그인</h5></li>
			<form action="LoginService.do" method="post">
				<li><input type="text" placeholder="Email을 입력하세요" name="email"></li>
				<li><input type="password" placeholder="PW를 입력하세요" name="pw"></li>
				<li><input type="submit" value="LogIn" class="button fit"></li>
			</form>
		</ul>
		<ul class="actions vertical">
			<!-- Q1. 회원가입 기능 만들기 -->
			<li><h5>회원가입</h5></li>
			<form action="JoinService.do" method="post">
				<li><input type="text" placeholder="Email을 입력하세요" name="email"></li>
				
				<li><button type="button" id="btn">이메일 중복확인</button></li>
				<li><p id="idcheck"> </p></li>
				
				<li><input type="password" placeholder="PW를 입력하세요" name="pw"></li>
				<li><input type="text" placeholder="전화번호를 입력하세요" name="tel"></li>
				<li><input type="text" placeholder="집주소를 입력하세요" name="address"></li>
				<li><input type="submit" value="JoinUs" class="button fit"></li>
			</form>
		</ul>
		</nav>
		<!-- Banner -->
		<section id="banner" class="major">
		<div class="inner">
			<header class="major"> <!-- Q4. 로그인 후 로그인한 사용자의 아이디로 바꾸기 -->
			<!-- ex) smhrd님 환영합니다.  -->
			<%if(login != null){%>
			<h1><%= login.getEmail() %>님 환영합니다~</h1>
			<%}else{ %>
			<h1>로그인해주세요~</h1>
			<%} %>
			</header>
			<div class="content">
				<p>
					게시판을 이용해보세요 ^^<br>
				</p>
				<ul class="actions">
					<li><a href="BoardMain.jsp" class="button next scrolly">게시판
							바로가기</a></li>
				</ul>
			</div>
		</div>
		</section>

		<!-- Main -->
		<div id="main">

			<!-- One -->
			<section id="one" class="tiles"> <article> <span
				class="image"> <img src="images/pic01.jpg" alt="" />
			</span> <header class="major">
			<h3>
				<a href="#" class="link">HTML</a>
			</h3>
			<p>홈페이지를 만드는 기초 언어</p>
			</header> </article> <article> <span class="image"> <img
				src="images/pic02.jpg" alt="" />
			</span> <header class="major">
			<h3>
				<a href="#" class="link">CSS</a>
			</h3>
			<p>HTML을 디자인해주는 언어</p>
			</header> </article> <article> <span class="image"> <img
				src="images/pic03.jpg" alt="" />
			</span> <header class="major">
			<h3>
				<a href="#" class="link">Servlet/JSP</a>
			</h3>
			<p>Java를 기본으로 한 웹 프로그래밍 언어/스크립트 언어</p>
			</header> </article> <article> <span class="image"> <img
				src="images/pic04.jpg" alt="" />
			</span> <header class="major">
			<h3>
				<a href="#" class="link">JavaScript</a>
			</h3>
			<p>HTML에 기본적인 로직을 정의할 수 있는 언어</p>
			</header> </article> <article> <span class="image"> <img
				src="images/pic05.jpg" alt="" />
			</span> <header class="major">
			<h3>
				<a href="#" class="link">MVC</a>
			</h3>
			<p>웹 프로젝트 중 가장 많이 사용하는 디자인패턴</p>
			</header> </article> <article> <span class="image"> <img
				src="images/pic06.jpg" alt="" />
			</span> <header class="major">
			<h3>
				<a href="#" class="link">Web Project</a>
			</h3>
			<p>여러분의 최종프로젝트에 웹 기술을 활용하세요!</p>
			</header> </article> </section>
			<!-- Two -->
			<section id="two">
			<div class="inner">
				<header class="major">
				<h2>나에게 온 메세지 확인하기</h2>
				</header>
				<p></p>
				<ul class="actions">
					<!-- Q12. 로그인 이메일 출력! -->
					<!-- ex) smhrd님에게 온 메시지  -->
					<%if(login != null){%>
					<li><%= login.getEmail() %> 님에게 온 메세지</li>
					<%}else{ %>
					<li>로그인을 하세요.</li>
					<%} %>					
					<!-- Q14. 메시지 전체 삭제 기능 -->
					<li><a href="#" class="button next scrolly">전체삭제하기</a></li>
				</ul>
				<!-- Q13. table형태로 나한테 온 메시지만 가져와서 보여주기
											 번호, 보낸사람, 내용, 시간 -->
				<!-- Q15. 메시지 개별 삭제 기능 -->
			</div>
			</section>

		</div>

		<!-- Contact -->
		<section id="contact">
		<div class="inner">
			<section> <!-- Q11. 메시지 보내기 기능(메시지는 계속 확인하기 위해서 DB에 저장!) -->
			<!-- 다른 사람의 DB에 메시지 저장해보기! -->
			<form>
				<div class="field half first">
					<label for="name">Name</label> <input type="text" id="name"
						placeholder="보내는 사람 이름" />
				</div>
				<div class="field half">
					<label for="email">Email</label> <input type="text" id="email"
						placeholder="받는 사람 이메일" />
				</div>

				<div class="field">
					<label for="message">Message</label>
					<textarea id="message" rows="6"></textarea>
				</div>
				<ul class="actions">
					<li><input type="submit" value="Send Message" class="special" /></li>
					<li><input type="reset" value="Clear" /></li>
				</ul>
			</form>
			</section>

			<section class="split"> <section>
			<div class="contact-method">
				<span class="icon alt fa-envelope"></span>
				<h3>Email</h3>

				<!-- Q5. 로그인 한 사용자의 이메일을 출력 -->
				<%if(login != null){%>
				<a href="#"><%= login.getEmail() %></a>
				<%}else{ %>
				<a href="#"> </a>
				<%} %>

			</div>
			</section> <section>
			<div class="contact-method">
				<span class="icon alt fa-phone"></span>
				<h3>Phone</h3>
				<!-- Q5. 로그인 한 사용자의 전화번호를 출력 -->
				<%if(login != null){%>
				<span><%= login.getTel() %></span>
				<%}else{ %>
				<span></span>
				<%} %>
			</div>
			</section> <section>
			<div class="contact-method">
				<span class="icon alt fa-home"></span>
				<h3>Address</h3>
				<!-- Q5. 로그인 한 사용자의 집주소를 출력 -->
				<%if(login != null){%>
				<span><%= login.getAddress() %></span>
				<%}else{ %>
				<span></span>
				<%} %>
			</div>
			</section> </section>
		</div>
		</section>

		<!-- Footer -->
		<footer id="footer">
		<div class="inner">
			<ul class="icons">
				<li><a href="#" class="icon alt fa-twitter"><span
						class="label">Twitter</span></a></li>
				<li><a href="#" class="icon alt fa-facebook"><span
						class="label">Facebook</span></a></li>
				<li><a href="#" class="icon alt fa-instagram"><span
						class="label">Instagram</span></a></li>
				<li><a href="#" class="icon alt fa-github"><span
						class="label">GitHub</span></a></li>
				<li><a href="#" class="icon alt fa-linkedin"><span
						class="label">LinkedIn</span></a></li>
			</ul>
			<ul class="copyright">
				<li>&copy; Untitled</li>
				<li>Design: <a href="https://html5up.net">HTML5 UP</a></li>
			</ul>
		</div>
		</footer>

	</div>

	<!-- Scripts -->
	<script src="assets/js/jquery.min.js"></script>
	<script src="assets/js/jquery.scrolly.min.js"></script>
	<script src="assets/js/jquery.scrollex.min.js"></script>
	<script src="assets/js/skel.min.js"></script>
	<script src="assets/js/util.js"></script>
	<!--[if lte IE 8]><script src="assets/js/ie/respond.min.js"></script><![endif]-->
	<script src="assets/js/main.js"></script>
	
	<script type="text/javascript">
	// on() 메소드 -> 부모속성의 이벤트를 물려받아서 지정 선택자에게 이벤트 연결해주는 메소드
		$('#btn').on('click', function(){
			// name="email"인 친구가 2개라서 1번 인덱스에 있는 친구 가져오기
			var email = $('input[name=email]').eq('1').val();
			console.log(email);
			$.ajax({
				url : "IdCheckService.do", /* 어디로 보낼지 */
				// type : "get", /* 어떤 방식으로 보낼지? */
				data : {email : email}, /* 어떤 데이터를 보낼지 */
				datatype : "text", /* 어떤 데이터 타입으로 받아올지 */
				success : (data)=>{
					if(data == 'false'){
						$('#idcheck').html('사용불가능한 아이디입니다!')
					}else{						
						$('#idcheck').html('사용가능한 아이디입니다!')
					}
				
				
				}, /* 성공 시 */
				error : ()=>{
					alert('실패');
				}, /* 실패 시 */
				
			})
			
		});
	
	
	
	</script>

</body>
</html>