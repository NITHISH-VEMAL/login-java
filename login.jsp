<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link href="login.css" rel="stylesheet" type="text/css">
</head>
<body>


<div id="login">
	<%
	
		//method is get by default if action in not mentioned
		//client to server post is needed
		//server to client get is needed
	%>
	<form action="Loign" method="post">
		<input type="text" name="uname" placeholder="username"><br>
		<input type="password" name="pass" placeholder="password"><br>
		<input type="submit" value="login">
	</form>

</div>

</body>
</html>