<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="beanGreeting" class="com.java.bean.Greeting"/>
	Default Greeting:
	<b>
	<jsp:getProperty property="message" name="beanGreeting"/>	
	</b>
	<jsp:setProperty property="message" name="beanGreeting" value="Good Afternoon Ananya..."/>
	<br></br>
	Update Value:
	<jsp:getProperty property="message" name="beanGreeting"/>
</body>
</html>