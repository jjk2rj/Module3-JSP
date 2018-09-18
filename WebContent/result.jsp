<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>You've been registered!</title>
   	<link rel="stylesheet" href="Styles/form.css">
</head>
<body>
	<h2>JOHNS HOPKINS ANNUAL SOFTWARE DEVELOPMENT SEMINAR</h2>
<%@ page import="business.User" %>
<% 
    String name = request.getParameter("name");
    String email = request.getParameter("email");
    String[] courses = request.getParameterValues("courses");
    
    User user = new User(name);
    
%>
	<%= user.getName() %>
	<br>
	<br>
	Your e-mail confirmation will be sent to: <%= email %>

	Your e-mail confirmation will be sent to: <%= courses[1] %>
	
	
	
	
</body>
</html>