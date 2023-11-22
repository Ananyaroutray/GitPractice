<%@page import="com.java.infinite.LibraryDAOImpl"%>
<%@page import="com.java.infinite.Books"%>
<%@page import="java.sql.SQLException"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Issue Book</title>
</head>
<body>
    
    <jsp:include page="Menu.jsp"/>
    <jsp:useBean id="book" class="com.java.infinite.Books" scope="session"/>
    <jsp:setProperty property="*" name="book"/>
    
    <%
    	String user = (String)session.getAttribute("user");
    	String[] issuedBookIds = request.getParameterValues("check1");
    	LibraryDAO dao = new LibraryDAOImpl();
    		for(String id: issuedBookIds ){
    			int bid = Integer.parseInt(id);
    			out.println(dao.updateBooks(bid, user));
    		}
    %>
</body>
</html>