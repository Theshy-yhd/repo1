<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/13
  Time: 9:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add</title>
</head>
<body>
<form action="u" method="post">
    Username &nbsp;<input type="text" name="name" /><br/>
    Password &nbsp;<input type="password" name="password" /><br/>
    Sex &nbsp;<input type="radio" name="sex" value="男" checked/>男
    <input type="radio" name="sex" value="女"/>女<br/>
    Age &nbsp;<input type="text" name="age" /><br/>
    Phone &nbsp;<input type="text" name="phone" /><br/>
    <input type="submit" value="提交"/>
</form>
</body>
</html>
