<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
    <head>
        <meta charset="utf-8">

        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/header.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/registration.css" >
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/zxcvbn/4.2.0/zxcvbn.js"></script>
        <script src="${pageContext.request.contextPath}/resources/js/confirm.js" ></script>
        <script src="${pageContext.request.contextPath}/resources/js/username-validation.js"></script>
        <title>Title</title>
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/reset.css">
        <link href="https://fonts.googleapis.com/css?family=Oswald:300,400,600" rel="stylesheet">
    </head>
    <body id = "fc-body">
        <header id="fc-header">
            <div id="symbol-wrapper">
                <div class="header-wrapper">
                    <i class="material-icons md-30">picture_in_picture_alt</i>
                    <span class="bold-text">FLASH</span>
                    <span class="light-text">CARDS</span>
                </div>
            </div>
        </header>
        <form:form class="registration-form" action="${pageContext.request.contextPath}/registration" modelAttribute="user">
            <div class="header-field">
                <span>Create an Account</span>
            </div>
            <div class="details-field">
                <form:label class=""  path="userName"> User Name<span class="red">*</span> </form:label>
                <form:input class="input-field" id="user_name" type="text" path="userName" required="true"/>
            </div>
            <div class="details-field">
                <form:label class="" path="firstName"> First Name<span class="red">*</span> </form:label>
                <form:input class="input-field" id="first_name" type="text" path="firstName" required="true"/>
            </div>
            <div class="details-field">
                <form:label class="" path="lastName"> Last Name<span class="red">*</span> </form:label>
                <form:input class="input-field" id="last_name" type="text" path="lastName" required="true"/>
            </div>
            <div class="details-field">
                <form:label class="" path="password"> Password<span class="red">*</span> </form:label>
                <form:input class="input-field" id="password" type="password" path="password" required="true"/>
                <div id="meter-field">
                <p id="password-strength-text">Strength:</p>
                <meter max="4" id="password-strength-meter"></meter>
                </div>
            </div>
            <div class="details-field">
                <label class="" for="confirm_password"> Confirm Password<span class="red">*</span> </label>
                <input class="input-field" id="confirm_password" type="password" name="confirm_password" required="true"/>
            </div>
            <div class="details-field">
                <form:label class="" path="email"> Email<span class="red">*</span> </form:label>
                <form:input class="input-field" id="email" type="email" path="email" required="true"/>
            </div>
            <span class="information">The fields signed with <span class="red">*</span> are required!</span>
            <form:button id="submit" type="submit">
                <span class="text-button">SUBMIT</span>
            </form:button>
        </form:form>
    </body>
</html>
