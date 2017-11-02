<%--
  Created by IntelliJ IDEA.
  User: yuqy
  Date: 2017/4/18
  Time: 23:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录界面</title>
</head>
<body>
    <form action="/login" method="post">
        <%--<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>--%>
        用户名：<input type="text" name="username"/><br/>
        密码：<input type="password" name="password"/><br/>
        <input type="submit" value="登录"/>
    </form>
</body>
</html>
