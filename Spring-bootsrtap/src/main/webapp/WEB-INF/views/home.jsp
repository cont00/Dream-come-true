<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
</head>
<body>
	<div class="container">
		<div class="masthead">
			<h3 class="text-muted">MYPROJECT</h3>
			<nav>
				<ul class="nav nav-justified">
					<li class="active"><a href="/">Home</a></li>
					<li><a href="/LOTTO">LOTTO</a></li>
					<li><a href="/FREEBOARD">FREEBOARD</a></li>
				</ul>
			</nav>
		</div>
		<!-- Jumbotron -->
		<div class="jumbotron">
			<h1>LOTTO</h1>
			<p class="lead">로또확인 웹프로그램입니다.</p>
			<p>
				<a class="btn btn-lg btn-success" href="#" role="button">
					Get	started today
				</a>
			</p>
		</div>
		<!-- Example row of columns -->
		<div class="row">
			<div class="col-lg-4">
				<h2>최근 로또번호</h2>
				<p class="text-danger">로또번호입니다.</p>
				<p>
					<a class="btn btn-primary" href="#" role="button">
						LOTTO
					</a>
				</p>
			</div>
			<div class="col-lg-4">
				<h2>최신글</h2>
				<p>최신글</p>
				<p>
					<a class="btn btn-primary" href="#" role="button">
						FREEBOARD
					</a>
				</p>
			</div>
			<div class="col-lg-4">
				<h2>연락처</h2>
				<p>010-2019-1092</p>
				<p>
					<a class="btn btn-primary" href="#" role="button">
						연락처
					</a>
				</p>
			</div>
		</div>
		<!-- Site footer -->
		<footer class="footer">
			<p>&copy; Company 2014</p>
		</footer>
	</div>
	<!-- /container -->
	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
	<script src="/resources/ie10.js"></script>
</body>
</html>
