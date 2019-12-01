<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 01/12/2019
  Time: 08:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="save" >
    <fieldset>
        <h2>SandWich Condimentes</h2>
        <table>
            <tr>
                <td><input type="checkbox" name="condiment" value="Lettuce">Lettuce</td>
                <td><input type="checkbox" name="condiment" value="Tomato">Tomato</td>
                <td><input type="checkbox" name="condiment" value="Mustad">Mustad</td>
                <td><input type="checkbox" name="condiment" value="Sprouts">Sprouts</td>
            </tr>
            <tr>
                <td><button type="submit" name="save">Save</button></td>
                <td></td>
                <td></td>
                <td></td>
            </tr>

        </table>
    </fieldset>
</form>
</body>
</html>
