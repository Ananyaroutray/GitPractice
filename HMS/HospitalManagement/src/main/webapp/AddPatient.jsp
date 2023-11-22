<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<f:view>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
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

        .form-container {
            max-width: 400px;
            margin: 0 auto;
            background: #fff;
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }

        .form-container label {
            display: block;
            margin-bottom: 8px;
            font-weight: bold;
        }

        .form-container input {
            width: 100%;
            padding: 10px;
            margin-bottom: 15px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }

        .form-container .btn-container {
            text-align: center;
        }

        .form-container button {
            background-color: #4CAF50;
            color: white;
            padding: 10px 15px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }
    </style>
</head>
<body>
    <h2>
        <h:outputText value="Add Patient" />
    </h2>

    <div class="form-container">
        <h:form id="form">

            <h:outputText value="Patient id" />
            <h:inputText value="#{patient.pid}" />

            <h:outputText value="Patient name" />
            <h:inputText value="#{patient.name}" />

            <h:outputText value="Patient age" />
            <h:inputText value="#{patient.age}" />

            <h:outputText value="Patient weight" />
            <h:inputText value="#{patient.weight}" />

            <h:outputText value="Patient gender" />
            <h:inputText value="#{patient.gender}" />

            <h:outputText value="Patient address" />
            <h:inputText value="#{patient.address}" />

            <h:outputText value="Patient phoneno" />
            <h:inputText value="#{patient.phoneno}" />

            <h:outputText value="Patient disease" />
            <h:inputText value="#{patient.disease}" />

            <h:outputText value="Patient doctor_id" />
            <h:inputText value="#{patient.doctor_id}" />

            <div class="btn-container">
                <h:commandButton action="#{hmsDao.addPatientDao(patient)}" value="Add Customer" />
            </div>
        </h:form>
    </div>
</body>
</html>
</f:view>
</html>