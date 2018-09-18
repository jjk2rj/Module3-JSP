<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>You've been registered!</title>
</head>
<body>
	<h2>JOHNS HOPKINS ANNUAL SOFTWARE DEVELOPMENT SEMINAR</h2>
<%@ page import="business.User" %>
<% 
    String name = request.getParameter("name");
    
    User user = new User(name);
    
%>
	Helloo ${user.name}
	<%= user.getName() %>
	<span>${name}</span>
    <form action="" method="post">
        <input type="hidden" name="action" value="">
        <input type="submit" value="Return">
    </form>
</body>
</html>