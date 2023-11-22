<%@page import="com.java.jsp.Gender"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@page import="com.java.jsp.Employ"%>
<%@page import="com.java.jsp.EmployDAO"%>
<%@page import="com.java.jsp.EmployDAOImpl"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	int empno = Integer.parseInt(request.getParameter("empno"));
	EmployDAO dao = new EmployDAOImpl();
	Employ employ = dao.searchEmployDao(empno);
%>
<form method="get" action="UpdateEmploy.jsp">
	<center>
	Employ No : 
		<input type="number" name="empno" readonly="readonly" 
			value=<%=employ.getEmpno() %> /> <br/><br/>
	Employ Name : 
		<input type="text" name="name" 
			value=<%=employ.getName() %> /> <br/><br/>
	Gender : 
	<input type="text" name="gender" 
		value=<%=employ.getGender() %> /> <br/><br/>
	Department : 
	<input type="text" name="dept" 
			value=<%=employ.getDept() %> /> <br/><br/> 
	Designation : 
	<input type="text" name="design" 
			value=<%=employ.getDesign() %> /> <br/><br/>
	Basic : 
	<input type="number" name="basic" 
			value=<%=employ.getBasic() %> /> <br/><br/>
	<input type="submit" value="Update Employ" />
	</center>
</form>
<%
if(request.getParameter("empno")!=null &&
request.getParameter("basic")!=null
){
		Employ employUpdated = new Employ();
		employUpdated.setEmpno(Integer.parseInt(request.getParameter("empno")));
		employUpdated.setName(request.getParameter("name"));
		employUpdated.setGender(Gender.valueOf(request.getParameter("gender")));
		employUpdated.setDept(request.getParameter("dept"));
		employUpdated.setDesign(request.getParameter("design"));
		employUpdated.setBasic(Double.parseDouble(request.getParameter("basic")));
		dao.updateEmployDao(employUpdated);	
%>
<jsp:forward page="EmployShow.jsp"/>
<%
}
%>



</body>
</html>