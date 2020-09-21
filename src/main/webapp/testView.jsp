<%@ page language="java" contentType="text/html; charset=UTF-8"
     pageEncoding="UTF-8"%>
<%@ taglib prefix = "st" uri = "/struts-tags"%>    
<!DOCTYPE html>
<html>
<head>
<title>Render this page</title>
</head>
<body>
	<h1>做動作測試</h1>
	<st:action name="msg"  executeResult="true">
		<br>動作結果：
	</st:action>		
</body>
</html>