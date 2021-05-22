<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PRODUCT CATALOG</title>
</head>
<body>
<h1 style="text-align:center;Color:black;background-color: #dac292;border: 1px outset black">SPORTYSHOES.com</h1>
	<p align="right" style="font-size:15px;"><a href="/mainapp/logout">logout</a></p>
<h2 style="text-align:center; Color:red;"> CATALOG</h2>


<div >


		<table border="1">
		<thead>
	
		</thead>

		<c:forEach var="product" items="${productss}">
			&nbsp;&nbsp;&nbsp;&nbsp;
			<tr><td><a href="<c:url value="/product/totaldisplay/${productproductId}"/>"class="thumbnail">
				<img src="<c:url value="/resources/images/${product.productName}.jpg"/>"alt ="Generic placeholder thumbnail">
				</a></td></tr>
				<tr><td>Product name:</td><td>${product.productName}</td></tr>
				<tr><td>Product description:</td><td>${product.description}</td></tr>
				<tr><td>Price:</td><td>${product.price}</td></tr>
				<tr><td>Stock:</td><td>${product.stock}</td></tr>
				
			
		</c:forEach>

	</table>
	
<%-- <c:forEach var="product" items="${products}">
<div>
	<table>
<tr>
	<td><a href="/totaldisplay/${product.productId}">add to cart</a></td>
	
	<td><p align="center">${product.productName}</p>
	<p align="center">Price: ${product.price}</p>
	<p align="center">Stock: ${product.stock}</p></td>
	</tr>
	</table>
</div>
	
</c:forEach>
--%>
</div>
<br/>
<br/><br/><br/><br/>
<br/>&nbsp;&nbsp;
<%@include file='footer.html' %>
</body>
</html>