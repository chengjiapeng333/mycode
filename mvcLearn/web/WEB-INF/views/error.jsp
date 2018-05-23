<%--
  Created by IntelliJ IDEA.
  User: chengjiapeng
  Date: 2018/5/23
  Time: 22:42
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" session="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>
<h1 style="color:red">发生错误</h1>
<div >错误路径:<c:out value="${url}"></c:out></div>
<div >错误信息:<c:out value="${exception.message}"></c:out></div>
</body>
</html>
</body>
</html>
