<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>My 1st Maven project</title>
	<!-- 動畫效果 -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script type="text/javascript">
		$(function(){
			$('h4').mouseenter(function(){
				alert('並沒有hello servlet 而是註冊為hello的POJO');
			});							
		});
	</script>
</head>

<body>
	<h2>Hello World!</h2>
	<br>
	<form action="hello.action">
		<label for="name">Sign in: </label><br/>
		<input type="text" name="name"/>
		<input type="submit" value="Go greeting!"/>
	</form>
	
</body>
</html>
