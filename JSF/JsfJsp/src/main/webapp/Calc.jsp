<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<f:view>
    <html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSF Page</title>
        <style>
            /* Add your CSS styles here */
            body {
                font-family: Arial, sans-serif;
            }
            
            h1 {
                color: #333;
                text-align: center;
            }
            
            .form-container {
                max-width: 400px;
                margin: 0 auto;
                padding: 20px;
                border: 1px solid #ccc;
                border-radius: 5px;
            }
            
            .input-label {
                font-weight: bold;
            }
            
            .result-label {
                font-weight: bold;
                margin-top: 10px;
            }
        </style>
    </head>
    <body>
        <div class="form-container">
            <h1>JSF Calculator</h1>
            <h:form>
                Please Enter Numbers:<br/>
                <div class="input-label">First Number:</div>
                <h:inputText id="num1" value="#{calculation.firstNo}"/><br/>
                
                <div class="input-label">Second Number:</div>
                <h:inputText id="num2" value="#{calculation.secondNo}"/><br/>

                <div class="result-label">Sum is:</div>
                <h:outputText value="#{calculation.addition}"/>
                <h:commandButton actionListener="#{calculation.addition}" value="Add"/><br/>

                <div class="result-label">Difference is:</div>
                <h:outputText value="#{calculation.subtraction}"/>
                <h:commandButton actionListener="#{calculation.subtraction}" value="Subtract"/><br/>

                <div class="result-label">Product is:</div>
                <h:outputText value="#{calculation.multiplication}"/>
                <h:commandButton actionListener="#{calculation.multiplication}" value="Multiply"/><br/>

                <div class="result-label">Quotient is:</div>
                <h:outputText value="#{calculation.division}"/>
                <h:commandButton actionListener="#{calculation.division}" value="Divide"/><br/>
            </h:form>
        </div>
    </body>
    </html>
</f:view>
