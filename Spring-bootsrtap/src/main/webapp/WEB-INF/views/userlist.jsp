<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.List" %>
<%@ page import="com.munggu.org.User" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>리스트를 보여줄꺼</p>
<% 
// 	List<User> list = (List<User>) request.getAttribute("userlist");

// 	for(int i =0; i< list.size() ; i++) {
// 		out.println(list.get(i).toString());
// 	}
%>
<c:forEach items="${userlist}" var="user"> 
	${user}<br>
</c:forEach>
</body>
</html>