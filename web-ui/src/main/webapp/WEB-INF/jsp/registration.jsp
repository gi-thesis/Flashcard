<%--
  Created by IntelliJ IDEA.
  User: ssalyi
  Date: 9/9/2017
  Time: 11:10 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>
        <form action = "registration" method = "POST">
            <div>
                <div>
                    <h1>Registration Page</h1>
                </div>
                <div>
                    <label> User Name :</label>
                    <input type="text" name = "user_name">
                </div>
                <div>
                    <label> First Name :</label>
                    <input type="text" name = "first_name">
                </div>
                <div>
                    <label> Last Name :</label>
                    <input type="text" name = "last_name">
                </div>
                <div>
                    <label> Password : </label>
                    <input type="text" name = "password">
                </div>
                <div>
                    <label> Password Again : </label>
                    <input type="text" name = "password">
                </div>
                <div>
                    <label> Email : </label>
                    <input type="text" name = "email">
                </div>
                <div>
                <input type="submit" value="Submit">
                </div>
            </div>
        </form>
    </body>
</html>
