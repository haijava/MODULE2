<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 04/11/2019
  Time: 14:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Converter Money</title>
</head>
<body>
<h1> Currency Converter</h1><br/>
<form action="convert" method="post">
    <label> Rate: </label><br/>
    <input type="text" name="rate" placeholder="RATE" value="22000"/><br/>

    <label> USD: </label><br/>
    <input type="text" name="usd" placeholder="USD" value="0"><br/>
  <input type="submit" id="submit" value="Convert" />
</form>
</body>
</html>
