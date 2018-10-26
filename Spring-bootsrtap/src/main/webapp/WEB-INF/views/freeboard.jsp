<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.List"  %>
<%@ page import="com.munggu.org.freeboard.FreeBoardDTO"  %>
<% 
// 	List<FreeBoardDTO> list = (List<FreeBoardDTO>)request.getAttribute("list");
// 	for(FreeBoardDTO fbd : list ){
// 		out.println(fbd);
// 	}
%>
<%-- <c:forEach items="${list}" var="freeboardDTO"> --%>
<%-- 	${freeboardDTO} --%>
<%-- </c:forEach> --%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<title>멍구쌤프로젝트</title>
<link href="/resources/bootstrap.css" rel="stylesheet">
<link href="/resources/justified-nav.css" rel="stylesheet">

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="/resources/bootstrap.min.js"></script>
<script src="/resources/ie9.js"></script>
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    <!-- success warning danger info active -->
<script type="text/javascript">
	$(document).ready(function(){
		var arr = [ 'success', 'warning', 'danger', 'info', 'active'];
		var len = 0;
		$('#mytable tr').each(function(i){
			if( i!=0 && i%5==0 ){ 
				len =+5;
			}
// 			$(this).attr('class',arr[i]);
// 			$(this).attr('class',arr[i-len]);
			$(this).attr('class',arr[i-len] + ' rows');
		});
	});
	function view(idx){
// 		console.log(idx);
		location.href='/FREEBOARDVIEW?idx='+idx;
	}
</script>
<style type="text/css">
	.rows{
		cursor: pointer; 
	}
	.rows:hover {
		font-weight: bold;
	}
</style>
</head>
<body>
	<div class="container">
		<div class="masthead">
			<h3 class="text-muted">MYPROJECT</h3>
			<nav>
				<ul class="nav nav-justified">
					<li><a href="/">Home</a></li>
					<li><a href="/LOTTO">LOTTO</a></li>
					<li class="active"><a href="/FREEBOARD">FREEBOARD</a></li>
				</ul>
			</nav>
		</div>
		<!-- Jumbotron -->
		<!-- success warning danger info active-->
		<div class="jumbotron">
			<table id="mytable" class="table table-condensed">
				<tr class="active">
					<td>순번</td>
					<td>제목</td>
					<td>작성일자</td>
					<td>조회수</td>
				</tr>
				<c:forEach items="${list}" var="item">
					<tr class="rows" onclick="view(${item.idx});">
						<td>${item.idx}</td>
						<td>${item.title}</td>
						<td>${item.regdate}</td>
						<td>${item.read_cnt}</td>
					</tr>
				</c:forEach>
			</table>
			<button class="btn" style="padding:3px;font-size: 16px;">글쓰기</button>
			<div>
				<c:forEach begin="1" end="${page.pagecnt}" var="num">
					<a href="/FREEBOARD?pagenum=${num}">[ ${num} ]</a>
				</c:forEach>
			</div>
		</div>
		<!-- Site footer -->
		<footer class="footer">
			<p>&copy; My Company 2018</p>
		</footer>
	</div>
	<!-- /container -->
	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
	<script src="/resources/ie10.js"></script>
</body>
</html>
