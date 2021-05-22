<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="text-align:center;Color:black;background-color: #dac292;border: 1px outset black">SPORTYSHOES.com</h1>
<p align="right" style="font-size:20px;"><a href="/mainapp/logout">logout</a></p>
<h2 style="text-align:center; Color:red;"> Users</h2>
<div align="center">
	<table border="1">
		<thead>
			<tr>
				<td>User Id</td>
				<td>User Name</td>
				<td>User Address</td>
				<td>User Mail</td>
				
			</tr>
		</thead>

		<c:forEach var="user" items="${users}">
			<tr>
				<td>${user.userName}</td>
				<td>${user.customerName}</td>
				<td>${user.customerAddr}</td>
				<td>${user.email}</td>
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