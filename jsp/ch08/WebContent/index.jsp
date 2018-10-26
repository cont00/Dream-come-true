<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("utf-8");%>
<%
	String menu = "menu1,menu2,menu3";
	String level = (String)session.getAttribute("id_level");
	if (level.equals("5"))
		menu = "admin";
// 	String top_page = request.getParameter("top");
// 	if ( top_page == null)
// 		top_page = "top";
// 	top_page = top_page + ".jsp";
	
	String center_page = request.getParameter("center");
	if ( center_page == null)
		center_page = "center";
	center_page = center_page + ".jsp";
	
	String bottom_page = request.getParameter("bottom");
	if ( bottom_page == null)
		bottom_page = "bottom";
	bottom_page = bottom_page + ".jsp";
%>
<!DOCTYPE>
	<html>
		<head>
			<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
			<title>Include</title>
			<style type="text/css">
				div {
					border: 1px solid black;
					padding: 10px;
				}			
				#top {
					width: 100%;
					height: 80px;
				}
				#center {
					width: 100%;
					height: 200px;
				}
				#bottom {
					width: 100%;
					height: 80px;
				}
			</style>
		</head>
		<body>
			<div id="container">
				<div id="top">
					<jsp:include page="a.jsp">
						<jsp:param name="menu" value="menu1,menu2,menu3" />
					</jsp:include>
				</div>
				<div id="center">
					<jsp:include page="<%= request.getParameter("center") %>.jsp" />
				</div>
				<div id="bottom">
					<jsp:include page="<%= request.getParameter("bottom") %>.jsp" />
				</div>
			</div>
		</body>
	</html>