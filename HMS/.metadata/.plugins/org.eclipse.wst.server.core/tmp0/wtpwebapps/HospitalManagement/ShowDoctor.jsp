<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<f:view>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
    <style>
        /* Add your CSS styles here */
        table {
            border-collapse: collapse;
            width: 100%;
        }
        
        th, td {
            border: 1px solid #ddd;
            padding: 8px;
            text-align: left;
        }
        
        th {
            background-color: #f2f2f2;
        }
        
        tr:nth-child(even) {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
    <h:form>
        <h2><h:outputText value="Doctor Show" /></h2>
        <h:dataTable value="#{hmsDao.showDoctorDao()}" var="e" border="3">
            <h:column>
                <f:facet name="header">
                    <h:outputLabel value="Doctor Id" />
                </f:facet>
                <h:outputText value="#{e.dr_id}" />
            </h:column>
            <h:column>
                <f:facet name="header">
                    <h:outputLabel value="Doctor Name" />
                </f:facet>
                <h:outputText value="#{e.dr_name}" />
            </h:column>
            <h:column>
                <f:facet name="header">
                    <h:outputLabel value="Department" />
                </f:facet>
                <h:outputText value="#{e.dept}" />
            </h:column>
        </h:dataTable>
    </h:form>
</body>
</html>
</f:view>
</html>