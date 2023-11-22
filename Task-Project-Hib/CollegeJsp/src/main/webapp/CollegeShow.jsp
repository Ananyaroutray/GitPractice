<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="com.java.hib.College" %>
<%@ page import="com.java.hib.CollegeDao" %>
<%@ page import="com.java.hib.CollegeDaoImpl" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>College List</title>
</head>
<body>
    <%
        CollegeDao collegeDao = new CollegeDaoImpl();
        List<College> collegeList = collegeDao.showCollegeDAO();
    %>

    <table border="3" align="center">
        <tr>
            <th>College ID</th>
            <th>Name</th>
            <th>Location</th>
            <th>Dean</th>
            <th>Student Count</th>
        </tr>
        <%
            for (College college : collegeList) {
        %>
            <tr>
                <td><%= college.getCollegeId() %> </td>
                <td><%= college.getName() %> </td>
                <td><%= college.getLocation() %> </td>
                <td><%= college.getDean() %> </td>
                <td><%= college.getStudentCount() %> </td>
            </tr>
        <%
            }
        %>
    </table>
    <hr>
    <a href="AddCollege.jsp">Add College</a>
</body>
</html>
