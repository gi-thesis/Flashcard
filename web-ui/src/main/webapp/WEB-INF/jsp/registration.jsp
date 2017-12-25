<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
    <head>
        <meta charset="utf-8">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/header.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/registration.css" >
        <title>Title</title>
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/reset.css">
        <link href="https://fonts.googleapis.com/css?family=Oswald:300,400,600" rel="stylesheet">
    </head>
    <body id = "fc-body">
        <header id="fc-header">
            <div class="header-wrapper">
                <i class="material-icons md-30">picture_in_picture_alt</i>
                <span class="bold-text">FLASH</span>
                <span class="light-text">CARDS</span>
            </div>
        </header>
        <form:form class="registration-form" action="${pageContext.request.contextPath}/registration" modelAttribute="user">
            <div class="form-group">
                <form:label class="control-label col-sm-2"  path="userName"> User Name :</form:label>
                <form:input class="col-sm-4" id="user_name" type="text" path="userName" required="true"/>
            </div>
            <div class="form-group">
                <form:label class="control-label col-sm-2" path="firstName"> First Name :</form:label>
                <form:input class="col-sm-4" id="first_name" type="text" path="firstName" required="true"/>
            </div>
            <div class="form-group">
                <form:label class="control-label col-sm-2" path="lastName"> Last Name :</form:label>
                <form:input class="col-sm-4" id="last_name" type="text" path="lastName" required="true"/>
            </div>
            <div class="form-group">
                <form:label class="control-label col-sm-2" path="password"> Password : </form:label>
                <form:input class="col-sm-4" id="password" type="password" path="password" required="true"/>
            </div>
            <div class="form-group">
                <label class="control-label col-sm-2" for="password_again"> Password Again : </label>
                <input class="col-sm-4" id="password_again" type="password" name="password_again" required="true"/>
            </div>
            <div class="form-group">
                <form:label class="control-label col-sm-2" path="email"> Email : </form:label>
                <form:input class="col-sm-4" id="email" type="email" path="email" required="true"/>
            </div>
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <form:button type="submit">Submit</form:button>
                </div>
            </div>
        </form:form>
    </body>
</html>
