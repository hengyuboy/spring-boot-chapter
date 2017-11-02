<%--
  Created by IntelliJ IDEA.
  User: yuqy
  Date: 2017/4/19
  Time: 22:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <sec:authorize access="hasRole('ROLE_ADMIN')">
        您是超级管理员可以管理信息。
    </sec:authorize>
    <br/>
    <sec:authorize access="hasRole('ROLE_USER')">
        您是普通用户只能查看信息。
    </sec:authorize>
</body>
</html>
