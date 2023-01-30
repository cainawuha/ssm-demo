<%--
  Created by IntelliJ IDEA.
  User: root
  Date: 2023-01-23
  Time: 12:02 p.m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <base href="${pageContext.request.contextPath}/">
    <title>Title</title>
</head>
<body>
${pageContext.request.contextPath}
<h3>login page</h3>
${tips}
<form action="user/login" method="post">
    <p>account:<input type="text" name="userName"/></p>
    <p>password:<input type="password" name="userPwd"/></p>
    <p><input type="submit" value="login"/></p>
</form>
</body>
</html>
