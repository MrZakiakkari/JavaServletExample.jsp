<%-- 
    Document   : simple
    Created on : 16 Oct 2021, 21:29:27
    Author     : M.Zaki Al Akkari <https://github.com/MrZakiakkari>
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Date" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Java Servlet Example JSP</title>
    </head>
    <body>
        <h1>Java Servlet Example JSP</h1>
		<p>Let's go Brandon!</p>
		<p><%out.print(new Date().toString());%></p>
    </body>
</html>
