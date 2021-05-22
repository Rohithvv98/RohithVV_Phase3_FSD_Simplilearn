<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update product</title>
</head>
<body>
<h1 style="text-align:center;Color:black;background-color: #dac292;border: 1px outset black">SPORTYSHOES.com</h1>
<p align="right" style="font-size:20px;"><a href="/mainapp/logout">logout</a></p>
<h2 style="text-align:center; Color:red;">PRODUCTS</h2>
<div align="center">
	<table border="1">
		<thead>
			<tr>

				<td>Product name</td>
				<td>Product description</td>
				<td>Price</td>
				<td>Stock</td>
			</tr>
		</thead>

		<c:forEach var="product" items="${products}">
			<tr>
				<td>${product.productName}</td>
				<td>${product.description}</td>
				<td>${product.price}</td>
				<td>${product.stock}</td>
				<td><a href ="/product/updpro/${productId}">update</a></td>
			</tr>
		</c:forEach>

	</table>
</div>
	<br />&nbsp;&nbsp;
	<br />&nbsp;&nbsp;
	<br />&nbsp;&nbsp;
	<br />&nbsp;&nbsp;
	<br />&nbsp;&nbsp;
	<br />&nbsp;&nbsp;
	<br />&nbsp;&nbsp;
	<br />&nbsp;&nbsp;
	<br />&nbsp;&nbsp;
	<br />&nbsp;&nbsp;
	<br />&nbsp;&nbsp;
	<br />&nbsp;&nbsp;
	<br />&nbsp;&nbsp;
	<br />&nbsp;&nbsp;
	<br />&nbsp;&nbsp;
	<br />&nbsp;&nbsp;
	<%@include file='footer.html'%>
</body>
</html>