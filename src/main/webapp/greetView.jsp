<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="st" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MY 1ST STRUTS WEBPAGE</title>
</head>
<body>	
	<label>已註冊的Struts標籤集有 property函數去執行getName()</label><br/>
	Hello, <st:property value="name"/>
	<br>
	Hello again, ${name}
		
	
</body>
</html>