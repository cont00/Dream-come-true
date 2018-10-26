<%@page import="com.kb.org.MemberService"%>
<%@page import="com.kb.org.MemberDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.kb.org.FreeboardService"%>
<%@page import="com.kb.org.FreeboardDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- <% page language %> 페이지 디렉티브 --%>
<%-- <% page import %> --%>
<%-- <% page tlb="" %> --%>
<%--
	jsp 내장객체
		- request	getParameter("이름"); getParameters("이름"); setAttribute();
		- response	sendRedirect(); // 페이지 이동
		- out		출력하는 것
		- session	로그인 할 때, ID PW를 브라우저단에 저장시켜놓고 창 닫기 전까지 로그인체크 할 때 사용
		-include	공통적인 부분을 포함하는 것
--%>
<%
	MemberService ms = new MemberService();
	ArrayList<MemberDTO> al = (ArrayList<MemberDTO>) ms.getMemberAllThree();
		
	FreeboardService fbs = new FreeboardService();
	ArrayList<FreeboardDTO> array_freeboard = (ArrayList<FreeboardDTO>) fbs.getFreeboardAllThree();
	
	String status = request.getParameter("status");
	if (status != null && status.equals("Logout")) {
		out.print("<script>alert('You have successfully Logout.');</script>");
	}
%>
<!DOCTYPE>
	<html>
		<head>
			<%@ include file="cssjs.jsp" %>
			<link type="text/css" rel="stylesheet" href="/css/Index.css"/>
			<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
			<title>DoubleScarlet VRChat</title>
		</head>
		<body>
		<%@ include file="/header.jsp" %>
		<div id="mainslider">
			<div id="left"><a><img src="왼쪽.jpg"></a></div>
			<div id="right"><a><img src="오른쪽.jpg"></a></div>
			<div id="bottom">
				<span class="a">01</span>
				<span class="b">02</span>
				<span class="c">03</span>
				<span class="d">04</span>
				<span class="e">05</span>
				<span class="f">06</span>
			</div>
			<div id="move">
				<a><img src="VRChat00.jpg" width="750" height="400" alt="VRChatScreenshot"></a>
				<a><img src="VRChat01.jpg" width="750" height="400" alt="VRChatScreenshot"></a>
				<a><img src="VRChat02.jpg" width="750" height="400" alt="VRChatScreenshot"></a>
				<a><img src="VRChat03.jpg" width="750" height="400" alt="VRChatScreenshot"></a>
				<a><img src="VRChat04.jpg" width="750" height="400" alt="VRChatScreenshot"></a>
				<a><img src="VRChat05.jpg" width="750" height="400" alt="VRChatScreenshot"></a>
			</div>
		</div>
			<div class="body">
			<%
				String Login = (String)session.getAttribute("Login");
			%>
			<br/>
				<div id="member">
					<h2>Recently registered members</h2><hr/><hr/>
					<span><a href=""><h2>+</h2></a></span>
					<table id="membertable">
						<colgroup>
							<col width="100">
							<col width="50">
							<col width="150">
						</colgroup>
						<tr>
							<th>Cname</th>
							<th>Sex</th>
							<th>Language</th>
						</tr>
						<tr>
						<%
						for(int i = 0; i < al.size(); i++) {
						%>
							<th><% out.print( al.get(i).getCname() ); %></th>
							<th><% out.print( al.get(i).getSex() ); %></th>
							<th><% out.print( al.get(i).getLang() ); %></th>
						</tr>
						<% } %>
					</table>
				</div>
				<div id="freeboard">
					<h2>FreeBoard</h2><hr/><hr/>
					<span><a href=""><h2>+</h2></a></span>
					<table id="freeboardtable">
						<colgroup>
							<col width="10">
							<col width="250">
							<col width="150">
							<col width="100">
						</colgroup>
						<tr>
							<th>Num</th>
							<th>Title</th>
							<th>Cname</th>
							<th>Time</th>
						</tr>
						<tr>
						<%
						for(int i = 0; i < array_freeboard.size(); i++) {
						%>
							<th><% out.print( array_freeboard.get(i).getFreeboard_idx() ); %></th>
							<th><% out.print( array_freeboard.get(i).getTitle() ); %></th>
							<th><% out.print( array_freeboard.get(i).getCname() ); %></th>
							<th><% out.print( array_freeboard.get(i).getWritetime() ); %></th>
						</tr>
						<% } %>
					</table>
				</div>
			</div>
		<%@ include file="/footer.jsp" %>
		</body>
	</html>