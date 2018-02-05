<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
    <head>
        <link href="https://fonts.googleapis.com/css?family=Oswald:300,400,600" rel="stylesheet">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/header.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/reset.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/landing.css">
        <title>Landing Page</title>
    </head>
    <body>
        <header id="fc-header">
            <div id="symbol-wrapper">
                <div class="header-wrapper">
                    <i class="material-icons md-30">picture_in_picture_alt</i>
                    <span class="bold-text">FLASH</span>
                    <span class="light-text">CARDS</span>
                </div>
            </div>
            <form:form id="login-wrapper" action="${pageContext.request.contextPath}/login" modelAttribute="loginUser">
                <div id="login-details">
                    <div id="user-details">
                        <form:label class="light-text" path="userName">Username</form:label>
                        <form:input class="input-field" type="text" path="userName" requried="true"/>
                        <form:label class="light-text" path="password">Password</form:label>
                        <form:input class="input-field" type="password" path="password" requried="true"/>
                    </div>
                    <a id="register-link" href="${pageContext.request.contextPath}/registration">If you don't have an account please register</a>
                </div>
                <form:button id="submit-login" type="submit">
                    <span class="bold-text">LOG IN</span>
                </form:button>
            </form:form>
        </header>
        <div id="introduction">

        </div>
        <div id="information">

        </div>
        <div id="review">

        </div>
    </body>
</html>
