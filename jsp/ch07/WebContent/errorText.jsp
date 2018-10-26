<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page  errorPage="error.jsp" %>
<!DOCTYPE>
	<html>
		<head>
			<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
			<title>Insert title here</title>
		</head>
		<body>
			<%
				String ok = request.getParameter("ok");
				out.print("ok : " + ok);
				if (ok.equals("글자"))
					out.println("글자와 같다.");
			%>
		</body>
	</html>