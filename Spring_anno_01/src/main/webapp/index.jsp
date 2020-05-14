<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>list</title>
<body>
<h2><a href="hello">hello</a> </h2>
<img src="images/33.jpg"/>
<form action="login" method="post">
    <input type="text" name="username" placeholder="Username"/><br/>
    <input type="password" name="password" placeholder="password"/><br/>
    <input type="submit" value="Sign"/>
    <input type="reset" value="reset"></button>
</form>
<a href="forword">forward</a>
<form method="post" action="upload" enctype="multipart/form-data">
    <input type="file" name="upload"  /><br/>
    <input type="hidden" name="id" value="2"/><br/>
    <input type="submit" value="上传"/>
</form>
</body>
</html>
