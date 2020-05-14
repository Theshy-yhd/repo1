<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/12
  Time: 11:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>success</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.3.1.min.js"></script>
    <script>
        $(function () {
            $("#ajax").click(function () {
                $.ajax({
                    url: "${pageContext.request.contextPath}/ajax",
                    contentType:"application/json;charset=UTF-8",
                    data:'{"name":"张三","age":"123"}',
                    dataType: "json",
                    type: "post",
                    success: function (data) {
                        alert(data.success);
                        alert(data.msg);
                    }
                })
            });
        })
    </script>
</head>
<body>
<h1>success</h1>
<form action="date" method="post">
    <input type="date" name="birth"/><br/>
    <input type="submit" value="提交"/>
</form>
<br/>
<button id="ajax" >ajax</button>
</body>
</html>
