<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>add product</title>
</head>
<body>
<h1 style="text-align:center;Color:black;background-color: #dac292;border: 1px outset black">SPORTYSHOES.com</h1>
	<p align="right" style="font-size:15px;"><a href="/mainapp/logout">logout</a></p>
<h2 style="text-align:center; Color:red;"> Add Product</h2>

	<form method="post" enctype="multipart/form-data">
	<div align="center">
	<table border="1">
	
		<tr><td align="left">Product ID			:</td><td><input type="number" name="pid"/></td></tr>
		<tr><td align="left">Product Name     	:</td><td><input type="text" name="pname"/></td></tr>
		<tr><td align="left">Product Description :</td><td><input type="text" name="pdesc"/></td></tr>
		<tr><td align="left">Product Price		:</td><td><input type="number" name="price"/></td></tr>
		<tr><td align="left">Product Stock       :</td><td><input type="number" name="stock"/></td></tr>
		<tr><td align="left">Category ID 	    :</td><td><input type="number" name="cid"/></td></tr>
		<tr><td align="left">Product Image		:</td><td><input type="file" name="pimage"></td></tr>
		</table>
		</div>>
		<p align="center"><button type="submit">Add Product</button></p>
		
		
	</form>

	
<br/>&nbsp;&nbsp; 
<br/>&nbsp;&nbsp; 
<br/>&nbsp;&nbsp;
<br/>&nbsp;&nbsp; 
<br/>&nbsp;&nbsp;; 
<%@include file='footer.html' %>
</body>
</html>