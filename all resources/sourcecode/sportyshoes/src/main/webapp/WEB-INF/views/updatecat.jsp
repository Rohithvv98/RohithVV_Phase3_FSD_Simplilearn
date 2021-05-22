<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update category</title>
</head>
<body>
<h1 style="text-align:center;Color:black;background-color: #dac292;border: 1px outset black">SPORTYSHOES.com</h1>
<h2 style="text-align:center; Color:red;">category</h2>
<div align="center">
	<table border="1">
		<thead>
			<tr>

				<td>Category Id</td>
				<td>Category Name</td>
				<td>Category Description</td>
				
			</tr>
		</thead>

		<c:forEach var="category" items="${categories}">
			<tr>
				<td>${category.categoryId}</td>
				<td>${category.categoryName}</td>
				<td>${category.categoryDesc}</td>
				<td><a href ="/category/updcat">update</a></td>
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