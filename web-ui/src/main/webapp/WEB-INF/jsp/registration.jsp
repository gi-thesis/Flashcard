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
        <div class = "container">
            <div>
                <h1>Registration Page</h1>
            </div>
            <form:form class="form-horizontal" action="${pageContext.request.contextPath}/registration" modelAttribute="user">
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
        </div>
    </body>
</html>
