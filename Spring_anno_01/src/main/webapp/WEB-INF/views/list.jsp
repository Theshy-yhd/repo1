<%@ taglib prefix="th" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/13
  Time: 0:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>list</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->

    <!-- Bootstrap -->
    <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">

    <!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
    <script src="${pageContext.request.contextPath}/js/jquery-3.3.1.min.js"></script>
    <!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
    <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    <script type="text/javascript">

        //改变页码大小
        function changePageSize() {
            //获取下拉框的值
            var pageSize = $("#changePageSize").val();

            //向服务器发送请求，改变没页显示条数
            location.href = "${pageContext.request.contextPath}/user?currentPage=1&size="
                + pageSize;
        }

        function del(obj) {
            //alert(obj);
            $("#del").attr("action","${pageContext.request.contextPath}/u/"+obj);
            $("#del").submit();
        }
    </script>

</head>
<a href="u">Add</a>
<body>
<table border="1">
    <tr>
        <td>ID</td>
        <td>Name</td>
        <td>Password</td>
        <td>Sex</td>
        <td>age</td>
        <td>Phone</td>
        <td>Option</td>
    </tr>
    <th:forEach items="${info.list}" var="user">
        <tr>
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td>${user.password}</td>
            <td>${user.sex}</td>
            <td>${user.age}</td>
            <td>${user.phone}</td>
            <td><a href="u/${user.id}">Update</a> <button onclick="del(${user.id})">Delete</button> </td>
        </tr>
    </th:forEach>
</table>
<div class="box-tools pull-right">
    <ul class="pagination">
        <li>
            <a href="${pageContext.request.contextPath}/user?page=1&size=${info.pageSize}" aria-label="Previous">首页</a>
        </li>
        <li><a href="${pageContext.request.contextPath}/user?page=${info.pageNum-1}&size=${info.pageSize}">上一页</a></li>
        <c:if test="${info.pages>5&&info.pages<info.pageNum+4}">
            <c:forEach begin="${info.pages-4}" end="${info.pages}" var="pageNum">
                <li><a href="${pageContext.request.contextPath}/user?page=${pageNum}&size=${info.pageSize}">${pageNum}</a></li>
            </c:forEach>
        </c:if>
        <c:if test="${info.pages>5&&info.pages>=info.pageNum+4}">
            <c:forEach begin="${info.pageNum}" end="${info.pageNum+4}" var="pageNum">
                <li><a href="${pageContext.request.contextPath}/user?page=${pageNum}&size=${info.pageSize}">${pageNum}</a></li>
            </c:forEach>
        </c:if>
        <c:if test="${info.pages<=5}">
            <c:forEach begin="1" end="${info.pages}" var="pageNum">
                <li><a href="${pageContext.request.contextPath}/user?page=${pageNum}&size=${info.pageSize}">${pageNum}</a></li>
            </c:forEach>
        </c:if>
        <li><a href="${pageContext.request.contextPath}/user?page=${info.pageNum+1}&size=${info.pageSize}">下一页</a></li>
        <li>
            <a href="${pageContext.request.contextPath}/user?page=${info.pages}&size=${info.pageSize}" aria-label="Next">尾页</a>
        </li>
    </ul>
</div>

</div>
<div class="box-footer">
    <div class="pull-left">
        <div class="form-group form-inline">
            总共${info.pages} 页，共${info.total} 条数据。 每页
            <select class="form-control" id="changePageSize" onchange="changePageSize()">
                <option>${info.pageSize}</option>
                <option>1</option>
                <option>2</option>
                <option>3</option>
                <option>4</option>
                <option>5</option>
            </select> 条
        </div>
    </div>
</div>
<form  id="del" method="post">
    <input type="hidden" name="_method" value="delete"/>
</form>
</body>
</html>
