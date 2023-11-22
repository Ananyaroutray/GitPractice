<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="calculation.jsp">
	<center>
	First No:
	<input type="number" name="firstNo" /><br/><br/><br/>
	<input type="submit" name="calculation" /><br/><br/><br/>
	Second No:
	<input type="number" name="secondNo"/><br/><
	
	</center>	
	</form>
	<%
		if(request.getParameter("firstNo")!=null &&
		request.getParameter("secondNo") !=null){
			int firstNo, secondNo, result;
			firstNo = Integer.parseInt(request.getParameter("firstNo"));
			secondNo = Integer.parseInt(request.getParameter("secondNo"));
			result = firstNo + secondNo;
			out.println("Sum is "+ result + "<br/>");
			result = firstNo - secondNo;
			out.println("Sub is "+ result + "<br/>");
			result = firstNo * secondNo;
			out.println("Mult is "+ result + "<br/>");
		}
	%>
</body>
</html>