<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 01/12/2019
  Time: 17:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="aa.css">
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="js/jquery.js">
</head>
<body>
<fieldset>
    <legend>Calculator</legend>
    <form method="post" action="/new" >
        <table>
            <tr>
                <td><input type="number" name="txt1" required class="n1"></td>
                <td><input type="numbert" name="txt2" required class="n1"></td>
                <td></td>
                <td></td>
            </tr>
            <tr>
                <td><button type="submit" name="txtadd" class="b1">(+)</button></td>
                <td><button type="submit" name="txtsub"class="b1">(-)</button></td>
                <td><button type="submit" name="txtmulti"class="b1">(*)</button></td>
                <td><button type="submit" name="txtdiv"class="b1">(/)</button></td>
            </tr>
            <tr>
                <td><label  name="lblresult">Result:${result}</label></td>
                <td></td>
                <td></td>
                <td></td>

            </tr>
        </table>

    </form>
</fieldset>
<link rel="stylesheet" type="text/javascript" href="js/bootstrap.js">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="webapp/1.css">
</body>

</html>
