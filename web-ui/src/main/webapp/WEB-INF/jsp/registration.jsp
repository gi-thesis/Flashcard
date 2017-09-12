<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>
        <form:form action="${pageContext.request.contextPath}/registration" modelAttribute="user">
            <div>
                <div>
                    <h1>Registration Page</h1>
                </div>
                <div>
                    <form:label path="userName"> User Name :</form:label>
                    <form:input id="user_name" type="text" path="userName" required="true"/>
                </div>
                <div>
                    <form:label path="firstName"> First Name :</form:label>
                    <form:input id="first_name" type="text" path="firstName" required="true"/>
                </div>
                <div>
                    <form:label path="lastName"> Last Name :</form:label>
                    <form:input id="last_name" type="text" path="lastName" required="true"/>
                </div>
                <div>
                    <form:label path="password"> Password : </form:label>
                    <form:input id="password" type="password" path="password" required="true"/>
                </div>
                <div>
                    <label for="password_again"> Password Again : </label>
                    <input id="password_again" type="password" name="password_again" required="true"/>
                </div>
                <div>
                    <form:label path="email"> Email : </form:label>
                    <form:input id="email" type="email" path="email" required="true"/>
                </div>
                <div>
                    <form:button type="submit">Submit</form:button>
                </div>
            </div>
        </form:form>
    </body>
</html>
