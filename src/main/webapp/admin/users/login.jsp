<%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 6/7/2022
  Time: 9:55 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>login form</h1>
    <form action="/login" method="post">
        <div>
            user name <input type="text" name="usename">
        </div>
        <div>
            user name <input type="password" name="password">
        </div>
        <div>
            <input type="submit" value="login">
            <input type="reset" value="reset">
        </div>
    </form>
</body>
</html>
