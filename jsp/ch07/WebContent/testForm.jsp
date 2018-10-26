<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Enumeration" %> 
<%
	request.setCharacterEncoding("UTF-8");

	String name = request.getParameter("name");
	String age= request.getParameter("age");
	
	out.println("name : " + name);
	out.println("age : " + age + "<br />");
	
	Enumeration<String> enumeration = request.getParameterNames();
	while (enumeration.hasMoreElements()) {
		String nextElement = enumeration.nextElement();
		out.println("enumeration.nextElement() = " + nextElement + "<br />");
		out.println("reqeust.getParameter = " + request.getParameter(nextElement) + "<br />");
	}
	
	out.println("<br />");
	
	String[] game =  request.getParameterValues("game");
	out.print("game : ");
	for (int i = 0; i < game.length; i++) {
// 		out.print("game[" + i + "] = " + game[i] + " ");
	}
	
	for ( String temp:game ) {
		out.print(temp + "  ");
	}
%>
<!DOCTYPE>
	<html>
		<head>
			<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
			<title>Insert title here</title>
		</head>
		<body>
			<form>
				이름<input type="text" name="name" />
				나이<input type="text" name="age" />
				<br />
				<input type="checkbox" name="game" value="VRChat">VRChat
				<input type="checkbox" name="game" value="BeatSaber">BeatSaber
				<input type="checkbox" name="game" value="PUBG">PUBG
				<input type="checkbox" name="game" value="Metin">Metin
				<input type="submit" value="페이지이동" />
			</form>
		</body>
	</html>