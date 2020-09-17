<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "st" uri = "/struts-tags"%>        
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test2 page</title>
</head>
<body>
	<p>
	<h2>invoke action:</h2> 
	<st:action name="msg" executeResult="true"/>
	</p>
	
	<p>
	<h2>use bean:</h2>
	<st:bean name="idv.aaron4157.message.WordDomain" var="beanfun">
		<st:param name="msg1">hello</st:param>
		<st:param name="msg2">good bye</st:param>
	</st:bean>
	%{#beanfun.msg1}; <st:property value="#beanfun.msg2"/>
	</p>
	
</body>
</html>