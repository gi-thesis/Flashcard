<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
    <head>
        <meta charset="utf-8">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/login.css" >
        <title>Title</title>
    </head>
    <body>
        <header>
            <span>Flashcard Application</span>
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
                <form:button type="submit" value="Submit"/>
            </div>
        </form:form>
    </body>
</html>
