<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>Edit Agent</title>
        </head>
        <body>
            <h:form>
                <center>
                    <h2>Edit Agent Record</h2>
                </center>
                <hr/>
                Agent ID:
                <h:inputText id="agentId" value="#{editAgent.agentId}" /><br/>
                Name:
                <h:inputText id="name" value="#{editAgent.name}" /><br/>
                City:
                <h:inputText id="city" value="#{editAgent.city}" /><br/>
                Gender:
                <h:inputText id="gender" value="#{editAgent.gender}" /><br/>
                MaritalStatus:
                <h:inputText id="maritalStatus" value="#{editAgent.maritalStatus}" /><br/>                
                Premium:
                <h:inputText id="salary" value="#{editAgent.premium}" /><br/>
                <h:commandButton value="Update" action="#{ejbImpl.updateAgentEjb(editAgent)}" />
            </h:form>
        </body>
    </html>
</f:view>
