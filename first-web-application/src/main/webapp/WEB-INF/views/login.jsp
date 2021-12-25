<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to Project</title>
</head>
<%//System.out.println(request.getParameter("name"));%>
<body>
	<h1>My First Servlet</h1><br> 
	<!-- My Name is : ${name}<br>
	My Password is : ${password}-->
	<form action="/login.do" method="post">
	<p><font color="red">${errorMessage}</font></p>
	Enter your Name     <input type="text" name="name"/><br>
	<br>
	Enter your Password <input type ="password" name="password"/>
	<input type="submit">
	</form>
</body>
</html>