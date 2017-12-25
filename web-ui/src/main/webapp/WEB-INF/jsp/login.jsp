<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <meta charset="utf-8">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/login.css" >
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/header.css">
        <title>Title</title>
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/reset.css">
        <link href="https://fonts.googleapis.com/css?family=Oswald:300,400,600" rel="stylesheet">
    </head>
    <body id="fc-body">
        <header id="fc-header">
            <div class="header-wrapper">
                <i class="material-icons md-30">picture_in_picture_alt</i>
                <span class="bold-text">FLASH</span>
                <span class="light-text">CARDS</span>
            </div>
        </header>
        <form:form class="login-wrapper" action = "${pageContext.request.contextPath}/login" modelAttribute="loginUser">
            <c:if test="${param.error eq ''}">
                <span id="user-error">Wrong username or password!</span>
            </c:if>
            <div class="details-field">
                <form:label class="" path="userName">Username  </form:label>
                <form:input class="input-field" type="text" path="userName" required="true"/>
            </div>
            <div class="details-field">
                <form:label class="" path="password"> Password  </form:label>
                <form:input class="input-field" type="password" path="password" required="true"/>
            </div>
            <form:button id="submit" type="submit">
                <span class="text-button">LOG IN</span>
            </form:button>
        </form:form>
    </body>
</html>
