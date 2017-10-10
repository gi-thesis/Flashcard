<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

        <title>Title</title>
    </head>
    <body>
        <div class="container">
            <form:form class="form-horizontal" action = "${pageContext.request.contextPath}/login" modelAttribute="loginUser">
                <div class="form-group">
                    <form:label class="control-label col-sm-4" path="userName">User Name : </form:label>
                    <form:input class="col-sm-8" id="user_name" type="text" path="userName" required="true"/>
                </div>
                <div class="form-group">
                    <form:label class="control-label col-sm-4" path="password"> Password : </form:label>
                    <form:input class="col-sm-8" id="password" type="text" path="password" required="true"/>
                </div>
                <div class="form-group">
                    <form:button type="submit" value="Submit"/>
                </div>
            </form:form>
        </div>
    </body>
</html>
