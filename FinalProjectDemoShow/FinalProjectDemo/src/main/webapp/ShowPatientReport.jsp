<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
 
<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
 
<f:view>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h:form>
        		<center>
                <h2><h:outputText value="Member Details"/></h2>
           
        <h:dataTable value="#{patient.showPatientReportDAO()}" var="p" border="3">
              	    <h:column>
                    <f:facet name="header">
                    	<h:outputLabel value="Customer Id" />
                    </f:facet>
                    <h:outputText value="#{p.uhId}"/>
                </h:column>
                    <h:column>
                     <f:facet name="header">
                    	<h:outputLabel value="First Name" />
                    </f:facet>
                    <h:outputText value="#{p.firstName}"/>
                </h:column>
                    <h:column>
                     <f:facet name="header">	
                    	<h:outputLabel value="Last Name" />
                    </f:facet>
                    <h:outputText value="#{p.lastName}"/>
                </h:column>                   
                    <h:column>
                     <f:facet name="header">	
                    	<h:outputLabel value="ClickHere" />
                    </f:facet>
                    <h:commandLink action="PreviousHistory.jsp" value="PreviousHistory" />
                </h:column>
                    <h:column>
                     <f:facet name="header">	
                    	<h:outputLabel value="ClickHere" />
                    </f:facet>
                    <h:commandLink action="ShowUpcomintDetails.jsp" value="UpcomingDetails" />
                </h:column>                                       
        </h:dataTable> <br><br>      
         </center>
        </h:form>
    </body>
</html>
</f:view>