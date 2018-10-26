<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="/resources/bootstrap.min.js"></script>
<script src="/resources/ie9.js"></script>
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
<script type="text/javascript">
/*{"bnusNo":44,"firstAccumamnt":0,"firstWinamnt":2275193820,}
 * "returnValue":"success","totSellamnt":47735197000,"drwtNo3":28,"drwtNo2":7
 * "drwtNo1":5,"drwtNo6":43,
 * "drwtNo5":39,"drwtNo4":29,"drwNoDate":"2007-03-03","drwNo":222,"firstPrzwnerCo":5
 */
	$(document).ready(function(){
		$('#req').click(function(){
			var lottoNumber = $('#lottoNumber').val();
			if(lottoNumber == ''){
				alert('요청회차 번호를 입력하세요.');
				return;
			}
			$.ajax({
				type : "GET",
				url : "/LOTTONUMBER1333",
				data : {
					"lottoNumber": lottoNumber,
					"idx" : 123	
				},
				dataType: "json" ,
				success : function(data) {
// 	 				alert("통신데이터 값 : " + data);
//{"bnusNo":17,"firstAccumamnt":12462565875,
//"firstWinamnt":4154188625,"returnValue":"success"
//,"totSellamnt":50673529000,"drwtNo3":23,"drwtNo2":13
//,"drwtNo1":11,"drwtNo6":45,"drwtNo5":43,"drwtNo4":35
//,"drwNoDate":"2011-06-04","drwNo":444,"firstPrzwnerCo":3}

// 					$('#print').html("보너스 번호 = "+data.bnusNo+"<br>"
// 							+"drwtNo3 = "+data.drwtNo3+"<br>"
// 							+"drwtNo2 = "+data.drwtNo2+"<br>"
// 							+"drwtNo1 = "+data.drwtNo1+"<br>"
// 							+"drwtNo6 = "+data.drwtNo6+"<br>"
// 							+"drwtNo5 = "+data.drwtNo5+"<br>"
// 							+"drwtNo4 = "+data.drwtNo4+"<br>"
// 							);
					$('#bnus').html(data.bnusNo);
					$('#no1').html(data.drwtNo3);
					$('#no2').html(data.drwtNo2);
					$('#no3').html(data.drwtNo1);
					$('#no4').html(data.drwtNo6);
					$('#no5').html(data.drwtNo5);
					$('#no6').html(data.drwtNo4);
				},
				error : function() {
					alert('통신실패!!');
				}
			});
		})
	});

	function reqNumber(number){
		var url="";
		if(number==1){
			url="/LOTTONUMBER1";
		}else if(number==2){
			url="/LOTTONUMBER2";
		}else{
			url="/LOTTONUMBER3";
		}
		$.ajax({
			type : "GET",
			url : url,
			success : function(data) {
// 				alert("통신데이터 값 : " + data);
				$('#print').html(data);
			},
			error : function() {
				alert('통신실패!!');
			}
		});
	}
	
	function reqlotto(){
		var url="http://www.nlotto.co.kr/common.do?method=getLottoNumber&drwNo=";
		url ="LOTTONUMBER1";
		$.ajax({
			type : "GET",
			url : url,
			dataType: "json",
			success : function(data) {
// 				alert("통신데이터 값 : " + data);
				$('#print').html(data.bnusNo);
			},
			error:function(request,status,error){
	        	alert("code:"+request.status+"\n"+"message:"+request.responseText+"\n"+"error:"+error);
	        }
		});
	}
	
	function reqDiv(){
		var url="/DIV";
		$.ajax({
			type : "GET",
			url : url,
			dataType: "text",
			success : function(data) {
// 				alert(data);
// 				alert("통신데이터 값 : " + data);
// var print = document.getElementById('print');
				$('#print').html(data);
			},
			error:function(request,status,error){
	        	alert("code:"+request.status+"\n"+"message:"+request.responseText+"\n"+"error:"+error);
	        }
		});
	}
	
</script>
</head>
<body>
	<div class="container">
		<div class="masthead">
			<h3 class="text-muted">MYPROJECT</h3>
			<nav>
				<ul class="nav nav-justified">
					<li><a href="/">Home</a></li>
					<li class="active"><a href="/LOTTO">LOTTO</a></li>
					<li><a href="/FREEBOARD">FREEBOARD</a></li>
				</ul>
			</nav>
		</div>
		<!-- Example row of columns -->
		<div class="jumbotron">
			<h2>최근 로또번호</h2>
			<p class="text-danger">로또번호입니다.${lottoNumber}</p>
			<p>
				<form class="form-inline">
					<div class="form-group">
						<label class="sr-only" for="exampleInputAmount"></label>
					<div class="input-group">
						<div class="input-group-addon">회차</div>
							<input type="text" class="form-control" id="lottoNumber" placeholder="요청회차"/>
						</div>
					</div>
					<button type="button" id="req" class="btn btn-primary" style="padding: 10px;font-size: 25px;">요청</button>
				</form>
			</p>
<!-- 				<p> -->
<!-- 					<a class="btn btn-primary" onclick="reqNumber(1);" role="button"> -->
<!-- 						LOTTO1  -->
<!-- 					</a>  -->
<!-- 					<a class="btn btn-primary" onclick="reqNumber(2);" role="button"> -->
<!-- 					    LOTTO2  -->
<!-- 					</a>  -->
<!-- 					<a class="btn btn-primary" onclick="reqNumber(3);" role="button">  -->
<!-- 						LOTTO3  -->
<!-- 					</a>  -->
<!-- 					<a class="btn btn-primary" onclick="reqlotto();" role="button"> -->
<!-- 						LOTTO3  -->
<!-- 					</a> -->
<!-- 					<a class="btn btn-primary" onclick="reqDiv();" role="button"> -->
<!-- 						DIV  -->
<!-- 					</a> -->
<!-- 				</p> -->
			<div id="print">
				<h2>보너스 번호</h2>
				<div id="bnus" class="btn btn-danger">1</div>
				<h2>이번주 당첨번호</h2>
				<div id="no1" class="btn btn-danger">1</div>
				<div id="no2" class="btn btn-danger">1</div>
				<div id="no3" class="btn btn-danger">1</div>
				<div id="no4" class="btn btn-danger">1</div>
				<div id="no5" class="btn btn-danger">1</div>
				<div id="no6" class="btn btn-danger">1</div>
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
