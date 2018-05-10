<%--
  Created by IntelliJ IDEA.
  User: chengjiapeng
  Date: 2018/5/10
  Time: 23:59
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" session="false" %>
<html>
<head>
    <title>Spitter</title>
</head>
<body>
    <h1>Welcome to Spitter</h1>

    <a href="<c:url value="/spittles" />">Spittles</a>
    <a href="<c:url value="/spittles/register" />">Register</a>
</body>
</html>
