/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.78
 * Generated at: 2023-08-30 08:48:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.smhrd.model.MemberDTO;
import java.util.ArrayList;

public final class Main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.smhrd.model.MemberDTO");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Forty by HTML5 UP</title>\r\n");
      out.write("<meta charset=\"utf-8\" />\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<!--[if lte IE 8]><script src=\"assets/js/ie/html5shiv.js\"></script><![endif]-->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"assets/css/main.css\" />\r\n");
      out.write("<!--[if lte IE 9]><link rel=\"stylesheet\" href=\"assets/css/ie9.css\" /><![endif]-->\r\n");
      out.write("<!--[if lte IE 8]><link rel=\"stylesheet\" href=\"assets/css/ie8.css\" /><![endif]-->\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");
 MemberDTO login = (MemberDTO)session.getAttribute("loginInfo"); 
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<!-- Wrapper -->\r\n");
      out.write("	<div id=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("		<!-- Header -->\r\n");
      out.write("		<header id=\"header\" class=\"alt\"> <a href=\"index.html\"\r\n");
      out.write("			class=\"logo\"><strong>Forty</strong> <span>by HTML5 UP</span></a>\r\n");
      out.write("			<nav>\r\n");
      out.write("		<!-- Q6. 로그인을 한 상태에서는 로그인탭 대신 로그아웃탭과 개인정보수정탭을 출력 -->\r\n");
      out.write("		");
if(login != null){
      out.write("\r\n");
      out.write("			<a href=\"logout\">로그아웃</a>\r\n");
      out.write("			<a href=\"UpdateMember.jsp\">개인정보수정</a>\r\n");
      out.write("			");
if(login.getEmail().equals("admin")){
      out.write("\r\n");
      out.write("			<a href=\"ShowMember.jsp\">전체회원목록</a>\r\n");
      out.write("			");
}
      out.write("		\r\n");
      out.write("		");
}else{ 
      out.write("\r\n");
      out.write("			<a href=\"#menu\">로그인</a>\r\n");
      out.write("		");
} 
      out.write("\r\n");
      out.write("		\r\n");
      out.write("		<!-- Q7. 개인정보수정 기능 만들기 -->		\r\n");
      out.write("		<!-- Q8. 로그아웃 기능 만들기 -->		\r\n");
      out.write("		<!-- Q9. 관리자 계정(admin)일 때는 회원정보관리 탭 만들기 -->\r\n");
      out.write("		\r\n");
      out.write("			</nav>\r\n");
      out.write("		</header>\r\n");
      out.write("\r\n");
      out.write("		<!-- Menu -->\r\n");
      out.write("		<nav id=\"menu\">\r\n");
      out.write("		<ul class=\"links\">\r\n");
      out.write("			<!-- Q3. 로그인 기능 만들기 -->\r\n");
      out.write("			<li><h5>로그인</h5></li>\r\n");
      out.write("			<form action=\"LoginService\" method=\"post\">\r\n");
      out.write("				<li><input type=\"text\" placeholder=\"Email을 입력하세요\" name=\"email\"></li>\r\n");
      out.write("				<li><input type=\"password\" placeholder=\"PW를 입력하세요\" name=\"pw\"></li>\r\n");
      out.write("				<li><input type=\"submit\" value=\"LogIn\" class=\"button fit\"></li>\r\n");
      out.write("			</form>\r\n");
      out.write("		</ul>\r\n");
      out.write("		<ul class=\"actions vertical\">\r\n");
      out.write("			<!-- Q1. 회원가입 기능 만들기 -->\r\n");
      out.write("			<li><h5>회원가입</h5></li>\r\n");
      out.write("			<form action=\"JoinService\" method=\"post\">\r\n");
      out.write("				<li><input type=\"text\" placeholder=\"Email을 입력하세요\" name=\"email\"></li>\r\n");
      out.write("				<li><input type=\"password\" placeholder=\"PW를 입력하세요\" name=\"pw\"></li>\r\n");
      out.write("				<li><input type=\"text\" placeholder=\"전화번호를 입력하세요\" name=\"tel\"></li>\r\n");
      out.write("				<li><input type=\"text\" placeholder=\"집주소를 입력하세요\" name=\"address\"></li>\r\n");
      out.write("				<li><input type=\"submit\" value=\"JoinUs\" class=\"button fit\"></li>\r\n");
      out.write("			</form>\r\n");
      out.write("		</ul>\r\n");
      out.write("		</nav>\r\n");
      out.write("		<!-- Banner -->\r\n");
      out.write("		<section id=\"banner\" class=\"major\">\r\n");
      out.write("		<div class=\"inner\">\r\n");
      out.write("			<header class=\"major\"> <!-- Q4. 로그인 후 로그인한 사용자의 아이디로 바꾸기 -->\r\n");
      out.write("			<!-- ex) smhrd님 환영합니다.  -->\r\n");
      out.write("			");
if(login != null){
      out.write("\r\n");
      out.write("			<h1>");
      out.print( login.getEmail() );
      out.write("님 환영합니다~</h1>\r\n");
      out.write("			");
}else{ 
      out.write("\r\n");
      out.write("			<h1>로그인해주세요~</h1>\r\n");
      out.write("			");
} 
      out.write("\r\n");
      out.write("			</header>\r\n");
      out.write("			<div class=\"content\">\r\n");
      out.write("				<p>\r\n");
      out.write("					게시판을 이용해보세요 ^^<br>\r\n");
      out.write("				</p>\r\n");
      out.write("				<ul class=\"actions\">\r\n");
      out.write("					<li><a href=\"BoardMain.jsp\" class=\"button next scrolly\">게시판\r\n");
      out.write("							바로가기</a></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		</section>\r\n");
      out.write("\r\n");
      out.write("		<!-- Main -->\r\n");
      out.write("		<div id=\"main\">\r\n");
      out.write("\r\n");
      out.write("			<!-- One -->\r\n");
      out.write("			<section id=\"one\" class=\"tiles\"> <article> <span\r\n");
      out.write("				class=\"image\"> <img src=\"images/pic01.jpg\" alt=\"\" />\r\n");
      out.write("			</span> <header class=\"major\">\r\n");
      out.write("			<h3>\r\n");
      out.write("				<a href=\"#\" class=\"link\">HTML</a>\r\n");
      out.write("			</h3>\r\n");
      out.write("			<p>홈페이지를 만드는 기초 언어</p>\r\n");
      out.write("			</header> </article> <article> <span class=\"image\"> <img\r\n");
      out.write("				src=\"images/pic02.jpg\" alt=\"\" />\r\n");
      out.write("			</span> <header class=\"major\">\r\n");
      out.write("			<h3>\r\n");
      out.write("				<a href=\"#\" class=\"link\">CSS</a>\r\n");
      out.write("			</h3>\r\n");
      out.write("			<p>HTML을 디자인해주는 언어</p>\r\n");
      out.write("			</header> </article> <article> <span class=\"image\"> <img\r\n");
      out.write("				src=\"images/pic03.jpg\" alt=\"\" />\r\n");
      out.write("			</span> <header class=\"major\">\r\n");
      out.write("			<h3>\r\n");
      out.write("				<a href=\"#\" class=\"link\">Servlet/JSP</a>\r\n");
      out.write("			</h3>\r\n");
      out.write("			<p>Java를 기본으로 한 웹 프로그래밍 언어/스크립트 언어</p>\r\n");
      out.write("			</header> </article> <article> <span class=\"image\"> <img\r\n");
      out.write("				src=\"images/pic04.jpg\" alt=\"\" />\r\n");
      out.write("			</span> <header class=\"major\">\r\n");
      out.write("			<h3>\r\n");
      out.write("				<a href=\"#\" class=\"link\">JavaScript</a>\r\n");
      out.write("			</h3>\r\n");
      out.write("			<p>HTML에 기본적인 로직을 정의할 수 있는 언어</p>\r\n");
      out.write("			</header> </article> <article> <span class=\"image\"> <img\r\n");
      out.write("				src=\"images/pic05.jpg\" alt=\"\" />\r\n");
      out.write("			</span> <header class=\"major\">\r\n");
      out.write("			<h3>\r\n");
      out.write("				<a href=\"#\" class=\"link\">MVC</a>\r\n");
      out.write("			</h3>\r\n");
      out.write("			<p>웹 프로젝트 중 가장 많이 사용하는 디자인패턴</p>\r\n");
      out.write("			</header> </article> <article> <span class=\"image\"> <img\r\n");
      out.write("				src=\"images/pic06.jpg\" alt=\"\" />\r\n");
      out.write("			</span> <header class=\"major\">\r\n");
      out.write("			<h3>\r\n");
      out.write("				<a href=\"#\" class=\"link\">Web Project</a>\r\n");
      out.write("			</h3>\r\n");
      out.write("			<p>여러분의 최종프로젝트에 웹 기술을 활용하세요!</p>\r\n");
      out.write("			</header> </article> </section>\r\n");
      out.write("			<!-- Two -->\r\n");
      out.write("			<section id=\"two\">\r\n");
      out.write("			<div class=\"inner\">\r\n");
      out.write("				<header class=\"major\">\r\n");
      out.write("				<h2>나에게 온 메세지 확인하기</h2>\r\n");
      out.write("				</header>\r\n");
      out.write("				<p></p>\r\n");
      out.write("				<ul class=\"actions\">\r\n");
      out.write("					<!-- Q12. 로그인 이메일 출력! -->\r\n");
      out.write("					<!-- ex) smhrd님에게 온 메시지  -->\r\n");
      out.write("					");
if(login != null){
      out.write("\r\n");
      out.write("					<li>");
      out.print( login.getEmail() );
      out.write(" 님에게 온 메세지</li>\r\n");
      out.write("					");
}else{ 
      out.write("\r\n");
      out.write("					<li>로그인을 하세요.</li>\r\n");
      out.write("					");
} 
      out.write("					\r\n");
      out.write("					<!-- Q14. 메시지 전체 삭제 기능 -->\r\n");
      out.write("					<li><a href=\"#\" class=\"button next scrolly\">전체삭제하기</a></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("				<!-- Q13. table형태로 나한테 온 메시지만 가져와서 보여주기\r\n");
      out.write("											 번호, 보낸사람, 내용, 시간 -->\r\n");
      out.write("				<!-- Q15. 메시지 개별 삭제 기능 -->\r\n");
      out.write("			</div>\r\n");
      out.write("			</section>\r\n");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("		<!-- Contact -->\r\n");
      out.write("		<section id=\"contact\">\r\n");
      out.write("		<div class=\"inner\">\r\n");
      out.write("			<section> <!-- Q11. 메시지 보내기 기능(메시지는 계속 확인하기 위해서 DB에 저장!) -->\r\n");
      out.write("			<!-- 다른 사람의 DB에 메시지 저장해보기! -->\r\n");
      out.write("			<form>\r\n");
      out.write("				<div class=\"field half first\">\r\n");
      out.write("					<label for=\"name\">Name</label> <input type=\"text\" id=\"name\"\r\n");
      out.write("						placeholder=\"보내는 사람 이름\" />\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"field half\">\r\n");
      out.write("					<label for=\"email\">Email</label> <input type=\"text\" id=\"email\"\r\n");
      out.write("						placeholder=\"받는 사람 이메일\" />\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("				<div class=\"field\">\r\n");
      out.write("					<label for=\"message\">Message</label>\r\n");
      out.write("					<textarea id=\"message\" rows=\"6\"></textarea>\r\n");
      out.write("				</div>\r\n");
      out.write("				<ul class=\"actions\">\r\n");
      out.write("					<li><input type=\"submit\" value=\"Send Message\" class=\"special\" /></li>\r\n");
      out.write("					<li><input type=\"reset\" value=\"Clear\" /></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("			</form>\r\n");
      out.write("			</section>\r\n");
      out.write("\r\n");
      out.write("			<section class=\"split\"> <section>\r\n");
      out.write("			<div class=\"contact-method\">\r\n");
      out.write("				<span class=\"icon alt fa-envelope\"></span>\r\n");
      out.write("				<h3>Email</h3>\r\n");
      out.write("\r\n");
      out.write("				<!-- Q5. 로그인 한 사용자의 이메일을 출력 -->\r\n");
      out.write("				");
if(login != null){
      out.write("\r\n");
      out.write("				<a href=\"#\">");
      out.print( login.getEmail() );
      out.write("</a>\r\n");
      out.write("				");
}else{ 
      out.write("\r\n");
      out.write("				<a href=\"#\"> </a>\r\n");
      out.write("				");
} 
      out.write("\r\n");
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("			</section> <section>\r\n");
      out.write("			<div class=\"contact-method\">\r\n");
      out.write("				<span class=\"icon alt fa-phone\"></span>\r\n");
      out.write("				<h3>Phone</h3>\r\n");
      out.write("				<!-- Q5. 로그인 한 사용자의 전화번호를 출력 -->\r\n");
      out.write("				");
if(login != null){
      out.write("\r\n");
      out.write("				<span>");
      out.print( login.getTel() );
      out.write("</span>\r\n");
      out.write("				");
}else{ 
      out.write("\r\n");
      out.write("				<span></span>\r\n");
      out.write("				");
} 
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("			</section> <section>\r\n");
      out.write("			<div class=\"contact-method\">\r\n");
      out.write("				<span class=\"icon alt fa-home\"></span>\r\n");
      out.write("				<h3>Address</h3>\r\n");
      out.write("				<!-- Q5. 로그인 한 사용자의 집주소를 출력 -->\r\n");
      out.write("				");
if(login != null){
      out.write("\r\n");
      out.write("				<span>");
      out.print( login.getAddress() );
      out.write("</span>\r\n");
      out.write("				");
}else{ 
      out.write("\r\n");
      out.write("				<span></span>\r\n");
      out.write("				");
} 
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("			</section> </section>\r\n");
      out.write("		</div>\r\n");
      out.write("		</section>\r\n");
      out.write("\r\n");
      out.write("		<!-- Footer -->\r\n");
      out.write("		<footer id=\"footer\">\r\n");
      out.write("		<div class=\"inner\">\r\n");
      out.write("			<ul class=\"icons\">\r\n");
      out.write("				<li><a href=\"#\" class=\"icon alt fa-twitter\"><span\r\n");
      out.write("						class=\"label\">Twitter</span></a></li>\r\n");
      out.write("				<li><a href=\"#\" class=\"icon alt fa-facebook\"><span\r\n");
      out.write("						class=\"label\">Facebook</span></a></li>\r\n");
      out.write("				<li><a href=\"#\" class=\"icon alt fa-instagram\"><span\r\n");
      out.write("						class=\"label\">Instagram</span></a></li>\r\n");
      out.write("				<li><a href=\"#\" class=\"icon alt fa-github\"><span\r\n");
      out.write("						class=\"label\">GitHub</span></a></li>\r\n");
      out.write("				<li><a href=\"#\" class=\"icon alt fa-linkedin\"><span\r\n");
      out.write("						class=\"label\">LinkedIn</span></a></li>\r\n");
      out.write("			</ul>\r\n");
      out.write("			<ul class=\"copyright\">\r\n");
      out.write("				<li>&copy; Untitled</li>\r\n");
      out.write("				<li>Design: <a href=\"https://html5up.net\">HTML5 UP</a></li>\r\n");
      out.write("			</ul>\r\n");
      out.write("		</div>\r\n");
      out.write("		</footer>\r\n");
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<!-- Scripts -->\r\n");
      out.write("	<script src=\"assets/js/jquery.min.js\"></script>\r\n");
      out.write("	<script src=\"assets/js/jquery.scrolly.min.js\"></script>\r\n");
      out.write("	<script src=\"assets/js/jquery.scrollex.min.js\"></script>\r\n");
      out.write("	<script src=\"assets/js/skel.min.js\"></script>\r\n");
      out.write("	<script src=\"assets/js/util.js\"></script>\r\n");
      out.write("	<!--[if lte IE 8]><script src=\"assets/js/ie/respond.min.js\"></script><![endif]-->\r\n");
      out.write("	<script src=\"assets/js/main.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}