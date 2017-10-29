<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
    <head>
        <meta charset="utf-8">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/login.css" >
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/header.css" >
        <title>Title</title>
        <link rel="stylesheet" type="text/css" href="//fonts.googleapis.com/css?family=Oswald" />
    </head>
    <body>
        <header>
            <div class="wrapper">
                <div>
                    <img id="logo" src="resources/images/logo2.png"/>
                </div>
                <div class="header1">FLASH</div>
                <div class="header2">CARDS</div>
            </div>
        </header>
        <form:form class="form-horizontal" action = "${pageContext.request.contextPath}/login" modelAttribute="loginUser">
            <div class="">
                <form:label class="" path="userName">User Name : </form:label>
                <form:input class="" type="text" path="userName" required="true"/>
            </div>
            <div class="">
                <form:label class="" path="password"> Password : </form:label>
                <form:input class="" type="text" path="password" required="true"/>
            </div>
            <div class="">
                <form:button type="submit">Submit</form:button>
            </div>
        </form:form>
    </body>
</html>
