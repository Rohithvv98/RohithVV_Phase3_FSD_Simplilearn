<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>USER LOGIN</title>

</head>
<body>
<h1 style="text-align:center;Color:black;background-color: #dac292;border: 1px outset black">SPORTYSHOES.com</h1>
<h2 style="text-align:center; Color:red;"> Login</h2>

<div style="color:white;text-align: center;">
	
	
	<form method="post">
	<table border="1" style="text-align:center;color:black; margin-left:auto;margin-right:auto;" > 
<tr>
	<td><br/>&nbsp;&nbsp;Username: <input type="text" name="uname" placeholder="username">&nbsp;&nbsp;<br/><br/>
	&nbsp;&nbsp;Password: <input type="password" name="upass" placeholder="password">&nbsp;&nbsp;
	<br/><br/>
	</td>
</tr>
<tr><td><button type="submit">Login</button></td></tr>
<tr><td><a href="/user/register">New User? Register</a></td></tr>
</table>
<br/>
<br/>
<br/>
	<%--
		<input type="text"  name="uname" placeholder="username"/> <br>
		<input type="password" name="upass" placeholder="password"/> <br>
		<button type="submit">Login</button>
		--%>
	</form>

	<br />&nbsp;&nbsp;
	<br />&nbsp;&nbsp;

	<br />&nbsp;&nbsp;
	<br />&nbsp;&nbsp;
	<br />&nbsp;&nbsp;
	<br />&nbsp;&nbsp;

	<%@include file='footer.html'%>
	
	</div>
</body>
</html>