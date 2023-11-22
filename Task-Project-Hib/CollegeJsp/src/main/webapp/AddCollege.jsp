<%@page import="com.java.hib.College"%>
<%@page import="com.java.hib.CollegeDaoImpl"%>
<%@page import="com.java.hib.CollegeDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body>
    <form method="post" action="AddCollege.jsp">
        
            College ID:
            <input type="number" name="collegeId" /><br /><br />
            College Name:
            <input type="text" name="name" /><br /><br />
            Location:
            <input type="text" name="location" /><br /><br />
            Dean:
            <input type="text" name="dean" /><br /><br />
            Student Count:
            <input type="number" name="studentCount" /><br /><br />
            <input type="submit" value="Add College" />       
    </form>
    <%
	if(request.getParameter("collegeId")!=null &&
	request.getParameter("studentCount")!=null
	){
		CollegeDao dao = new CollegeDaoImpl();
		College college = new College();
		college.setCollegeId(Integer.parseInt(request.getParameter("collegeId")));
        college.setName(request.getParameter("name"));
        college.setLocation(request.getParameter("location"));
        college.setDean(request.getParameter("dean"));
        college.setStudentCount(Integer.parseInt(request.getParameter("studentCount")));
        dao.addcollege(college);
		
%>
<jsp:forward page="CollegeShow.jsp" />
<% 
	}
%>

</body>
</html>