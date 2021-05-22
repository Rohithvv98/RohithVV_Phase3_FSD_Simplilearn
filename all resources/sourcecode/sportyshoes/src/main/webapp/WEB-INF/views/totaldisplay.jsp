<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PRODUCT CATALOG</title>
</head>
<body>

<h1 style="text-align:center;Color:black;background-color: #dac292;border: 1px outset black">SPORTYSHOES.com</h1>
<h2 style="text-align:center; Color:red;"> CART</h2>
<div align="center" style="font-size:25px">
	<table border="1">
	<tr>
	<td>ordernumber</td>
	<td>price</td>
	<td></td>
	</tr>
	<tr>
	<td><a href="/cart/addtocart">buy</a></td>
	</tr>
	<c:forEach var="cart" items="${carts}">
			&nbsp;&nbsp;&nbsp;&nbsp;
				<tr><td>${cart.id}</td></tr>
				<tr><td>>${cart.price}</td></tr>
</c:forEach> 
	</table>
	</div>
</body>

<br/>
<br/><br/><br/><br/>
<br/>&nbsp;&nbsp;
<%@include file='footer.html' %>
</body>
</html>