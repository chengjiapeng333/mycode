<%--
  Created by IntelliJ IDEA.
  User: chengjiapeng
  Date: 2018/5/17
  Time: 0:43
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Your Profile</h1>
<c:out value="${spitter.firstName}"></c:out><br/>
<c:out value="${spitter.lastName}"></c:out><br/>
<c:out value="${spitter.username}"></c:out><br/>
<c:out value="${spitter.password}"></c:out><br/>
</body>
</html>
