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
                <h2><h:outputText value="College Details"/></h2>
           
        <h:dataTable value="#{college.showCollegeDAO()}" var="c" border="3">
              	    <h:column>
                    <f:facet name="header">
                    	<h:outputLabel value="College Id" />
                    </f:facet>
                    <h:outputText value="#{c.CollegeId}"/>
                </h:column>
                    <h:column>
                     <f:facet name="header">
                    	<h:outputLabel value="College Name" />
                    </f:facet>
                    <h:outputText value="#{c.name}"/>
                </h:column>
                    <h:column>
                     <f:facet name="header">
                    	<h:outputLabel value="Location" />
                    </f:facet>
                    <h:outputText value="#{c.location}"/>
                </h:column>
                    <h:column>
                     <f:facet name="header">
                    	<h:outputLabel value="Dean Name" />
                    </f:facet>
                    <h:outputText value="#{c.dean}"/>
                </h:column>
                    <h:column>
                     <f:facet name="header">
                    	<h:outputLabel value="Student Count" />
                    </f:facet>
                    <h:outputText value="#{c.studentCount}"/>
                </h:column>
        </h:dataTable> <br><br>
        <h:commandButton action="CustomerAdd" value="Register" /> &nbsp;&nbsp;
        
         </center>
        </h:form>
    </body>
</html>
</f:view>