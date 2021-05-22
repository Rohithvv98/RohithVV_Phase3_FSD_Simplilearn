<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>USER REGISTER</title>
</head>
<body>
<h1 style="text-align:center;Color:black;background-color: #dac292;border: 1px outset black">SPORTYSHOES.com</h1>
<h2 style="text-align:center; Color:red;"> Register</h2>
	<div align="center">
		
			<form method="post">
			<table border="1" style="text-align:center;color:black; margin-left:auto;margin-right:auto;">
				<tr>
				<td>User Name     &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:<input type="text" name="username" /><br><br> 
					User Password 	:<input type="password" name="userpass" /> <br><br>
					Email ID 		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:<input type="text" name="umail" /><br><br>
					Customer name	:<input type="text" name="ucname" /><br><br>
					Address	 	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:<input type="text" name="ucaddr" /></td>
				</tr>
				<tr><td><button type="submit">Register</button></td></tr>
				<tr><td><a href="/user/login">Already a user? login</a></td></tr>
		</table>
		</form>
		
	</div>
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