<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%> 
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%> 

<f:view>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <style>
        /* Add your CSS styles here */
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
        }

        h2 {
            color: #333;
            text-align: center;
        }

        .data-table {
            border-collapse: collapse;
            width: 100%;
        }

        .data-table th, .data-table td {
            border: 1px solid #ddd;
            text-align: left;
            padding: 8px;
        }

        .data-table th {
            background-color: #f2f2f2;
        }

        .data-table tr:nth-child(even) {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
    <h:form>
        <h2>
            <h:outputText value="Room Information" />
        </h2>

        <h:dataTable value="#{hmsDao.showRoomsDao()}" var="e" border="3" styleClass="data-table">
            <h:column>
                <f:facet name="header">
                    <h:outputText value="Room No" />
                </f:facet>
                <h:outputText value="#{e.room_no}" />
            </h:column>
            <h:column>
                <f:facet name="header">
                    <h:outputText value="Room Type" />
                </f:facet>
                <h:outputText value="#{e.room_type}" />
            </h:column>
            <h:column>
                <f:facet name="header">
                    <h:outputText value="Status" />
                </f:facet>
                <h:outputText value="#{e.status}" />
            </h:column>
        </h:dataTable>
    </h:form>
</body>
</html>
</f:view>
</html>