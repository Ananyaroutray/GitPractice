<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%> 
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<f:view>
        <h:form>
        <h:commandLink action="ShowDoctor.jsp">
        	<h:outputLabel value="Show Doctor" />
        </h:commandLink>
        &nbsp;&nbsp;  &nbsp;&nbsp;  &nbsp;&nbsp;
        
         <h:commandLink action="ShowRoom.jsp">
        	<h:outputLabel value="Show Room" />
        </h:commandLink>
         &nbsp;&nbsp;  &nbsp;&nbsp;  &nbsp;&nbsp;
  <h:commandLink action="AddPatient.jsp">
        	<h:outputLabel value="Add Patient" />
        </h:commandLink>
</h:form>
</f:view>
</body>
</html>