<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 22/11/2019
  Time: 22:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="/diction">
    <input type="text" name="txtname">
    <input type="submit" value="search">
</form>
${dictionary}
</body>
</html>
