<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
    <head>
        <title>Title</title>
        <link href="https://fonts.googleapis.com/css?family=Oswald:300,400,600" rel="stylesheet">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/header.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/reset.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/profile.css">
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
        </header>
        <div id="details">
            <sec:authentication var="user" property="principal" />
            ${user.user}
        </div>
    </body>
</html>