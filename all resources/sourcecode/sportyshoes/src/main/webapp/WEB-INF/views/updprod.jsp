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
<h2 style="text-align:center; Color:red;"> update product</h2>
	<form method="post">
	<div align="center">
		<table border="1">
		<tr><td>Product Name     	:</td><td><input type="text" name="pname"/></td>
		<tr><td>Product Description :</td><td><input type="text" name="pdesc"/></td>
		<tr><td>Product Price		:</td><td><input type="number"name="price"/></td>
		<tr><td>Product Stock       :</td><td><input type="number" name="stock"/></td>
		<tr><td>Category ID 	    :</td><td><input type="number" name="cid"/></td></tr>
		</table>
		</div>
		<p align="center"><button type="submit">update Product</button></p>
		
	</form>
<br/>&nbsp;&nbsp; 
<br/>&nbsp;&nbsp; 
<br/>&nbsp;&nbsp; 
<br/>&nbsp;&nbsp; 
<br/>&nbsp;&nbsp; 
<br/>&nbsp;&nbsp; 
<br/>&nbsp;&nbsp;; 
<%@include file='footer.html' %>
</body>
</html>