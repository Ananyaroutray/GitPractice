<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action= "login.jsp">
	<center>
	<h2>Please Login: </h2>
	UserName: <input type="text" name="userName" size='50'></br></br>	
	PassWord: <input type="password" name="passWord" size='50'></br></br>	
	<input type="submit" value="login">
	</center>
</form>
<c:if test="${param.userName!=null && param.passWord!=null}">
	<jsp:useBean id="login" class="com.java.infinite.LibUsers"/>
	<jsp:setProperty property="*" name="login"/>
	<jsp:useBean id="dao" class="com.java.infinite.LibraryDAOImpl"/>
	<c:set var="count" value="${dao.authenticate(login)}" />
	<c:if test="${count==1}">
		<%
			session.setAttribute("user", request.getParameter("userName"));
		%>
		<jsp:forward page="Menu.jsp"/>
	</c:if>
	<c:if test="${count==0}">
		<c:out value="Invalid Credentials..."/>
	</c:if>
	
</c:if>
</body>
</html>