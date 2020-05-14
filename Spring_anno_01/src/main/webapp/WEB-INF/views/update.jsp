<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/13
  Time: 9:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>update</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/u" method="post">
    <input type="hidden" name="_method" value="put"/>
    <input type="hidden" name="id" value="${user.id}" />
    Username &nbsp;<input type="text" name="name" value="${user.name}"/><br/>
    Password &nbsp;<input type="password" name="password" value="${user.password}"/><br/>
    Sex &nbsp;<input type="radio" name="sex" value="男" <c:if test="${user.sex=='男'}">checked</c:if>/>男
    <input type="radio" name="sex" value="女" <c:if test="${user.sex=='女'}">checked</c:if>/>女<br/>
    Age &nbsp;<input type="text" name="age" value="${user.age}"/><br/>
    Phone &nbsp;<input type="text" name="phone" value="${user.phone}"/><br/>
    <input type="submit" value="提交"/>
</form>
</body>
</html>
