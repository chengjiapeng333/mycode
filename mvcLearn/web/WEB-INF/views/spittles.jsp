<%--
  Created by IntelliJ IDEA.
  User: chengjiapeng
  Date: 2018/5/11
  Time: 0:56
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:forEach items="${spittleList}" var="spittle">
        <li id="spittle_<c:out value="spittle_id"/>">
            <div class="spittleMessage">
                <c:out value="${spittle.message}"></c:out>
            </div>
            <div>
                <span class="spittleTime"><c:out value="${spittle.time}"></c:out></span>
                <span class="spittleLocation">
                    (<c:out value="${spittle.latitude}"></c:out>,
                    <c:out value="${spittle.longitude}"></c:out>)
                </span>
            </div>
        </li>
    </c:forEach>
</body>
</html>
