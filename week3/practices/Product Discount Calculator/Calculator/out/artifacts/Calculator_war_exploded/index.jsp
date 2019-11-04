<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 04/11/2019
  Time: 22:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Product Discount Calculator</title>
  </head>
  <body>
<form action="discount" method="post">
  <div>
    <h1>Product Discount Calculator</h1>
    <label>Product Description</label><br/>
    <input type="text" name="txtproduct" placeholder="Product Description"><br/>
    <label>List Price:</label><br/>
    <input type="text" name="txtprice" placeholder="List Price:"><br/>
    <label>Discount Percent</label><br/>
    <input type="text" name="txtdiscount" placeholder="Discount Percent"><br/>
    <input type="submit" id="submit" value="Calculate Discount">
  </div>
</form>
  </body>
</html>
