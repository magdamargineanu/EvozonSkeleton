<%--
  Created by IntelliJ IDEA.
  User: Dragos
  Date: 06-Aug-21
  Time: 12:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/second">
    ${label} <input type="Email" name="Email" style="...">
    <input type="submit" value="Send info">
</form>
</body>
</html>

