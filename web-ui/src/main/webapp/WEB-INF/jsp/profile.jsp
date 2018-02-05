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
    <body id="fc-body">
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
            <div class="header-field">
                <span>Profile Details</span>
            </div>
            <div class="detail-field">
                <span>User Name</span>
                <label>${user.user.userName}</label>
            </div>
            <div class="detail-field">
                <span>First Name</span>
                <label>${user.user.firstName}</label>
            </div>
            <div class="detail-field">
                <span>Last Name</span>
                <label>${user.user.lastName}</label>
            </div>
            <div class="detail-field">
                <span>Email</span>
                <label>${user.user.email}</label>
            </div>
            <div class="detail-field">
                <span>Password</span>
                <label>${user.user.password}</label>
            </div>
        </div>
    </body>
</html>