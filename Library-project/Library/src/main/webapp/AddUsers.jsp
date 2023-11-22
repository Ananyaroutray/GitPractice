<%@page import="com.java.infinite.LibUsers"%>
<%@page import="com.java.infinite.LibraryDAOImpl"%>
<%@page import="com.java.infinite.LibraryDAO"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="AddUsers.jsp">
		User Name : 
		<input type="text" name="userName" /> <br/><br/>
		Password : 
		<input type="password" name="passWord" /> <br/><br/>
		Re-Type Password : 
		<input type="password" name="retypePassCode" /> <br/><br/> 
		<input type="submit" value="Create Account" />
	</form>
	
	<c:if test="${param.userName!=null && param.passWord!=null}">
		<c:if test="${param.passWord == param.retypePassCode}">
		<jsp:useBean id="libUsers" class="com.java.infinite.LibUsers" />
		<jsp:setProperty property="*" name="libUsers" />
		<jsp:useBean id="beanDao" class="com.java.infinite.LibraryDAOImpl" />
		<%=beanDao.createUser(libUsers) %>
		</c:if>
	</c:if>
</body>
</html>