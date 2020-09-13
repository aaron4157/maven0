<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>My 1st Maven project</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script type="text/javascript">
		$(function(){
			$('h4').mouseenter(function(){
				alert('並沒有hello servlet 而是在struts.xml註冊為hello的POJO');
			});							
		});
	</script>
</head>

<body>
	<h2>Hello World!</h2>
	<br>
	<form action="hello">
		<label for="name">Please enter your name: </label><br/>
		<input type="text" name="name"/>
		<input type="submit" value="Go greeting!"/>
	</form>
</body>
</html>
