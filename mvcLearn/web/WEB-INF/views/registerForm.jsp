<%--
  Created by IntelliJ IDEA.
  User: chengjiapeng
  Date: 2018/5/17
  Time: 0:22
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Register</h1>
    <form method="post" >
        FirstName:<input type="text" name="firstName"/><br/>
        LastName:<input type="text" name="lastName"/><br/>
        UserName:<input type="text" name="username"/><br/>
        Password:<input type="text" name="password"/><br/>
        Picture:<input type="file" name="file"/><br/>
    </form>

    <h2>上传图片</h2>
    <form method="post" action="./upload" enctype="multipart/form-data">
        <input type="file" name="file">
        <input type="submit" value="上传图片">
    </form>

</body>
</html>
