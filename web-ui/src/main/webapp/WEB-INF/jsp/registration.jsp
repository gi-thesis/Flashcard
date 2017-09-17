<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js">
        </script>
        
        <title>Title</title>
    </head>
    <body>
        <div class = "container">
            <div>
                <h1>Registration Page</h1>
            </div>
            <form:form class="form-horizontal" action="${pageContext.request.contextPath}/registration" modelAttribute="user">
                    <div class="form-group">
                        <div>
                            <form:label class="control-label col-sm-2"  path="userName"> User Name :</form:label>
                        </div>
                        <div class="col-sm-10" >
                            <form:input id="user_name" type="text" path="userName" required="true"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="control-label col-sm-2">
                            <form:label path="firstName"> First Name :</form:label>
                        </div>
                        <div class="col-sm-10">
                            <form:input id="first_name" type="text" path="firstName" required="true"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="control-label col-sm-2">
                        <form:label path="lastName"> Last Name :</form:label>
                        </div>
                        <div class="col-sm-10" >
                        <form:input id="last_name" type="text" path="lastName" required="true"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="control-label col-sm-2">
                        <form:label path="password"> Password : </form:label>
                        </div>
                        <div class="col-sm-10" >
                        <form:input id="password" type="password" path="password" required="true"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="control-label col-sm-2">
                        <label for="password_again"> Password Again : </label>
                        </div>
                        <div class="col-sm-10" >
                        <input id="password_again" type="password" name="password_again" required="true"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="control-label col-sm-2">
                        <form:label path="email"> Email : </form:label>
                        </div>
                        <div class="col-sm-10" >
                        <form:input id="email" type="email" path="email" required="true"/>
                        </div>
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
