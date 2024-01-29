<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		int num1 = Integer.parseInt(request.getParameter("n1"));
		int num2 = Integer.parseInt(request.getParameter("n2"));
		int num3 = Integer.parseInt(request.getParameter("n3"));
	%>
	<h1>Biggest Number</h1>
	<% 
		out.print((num1>num2)?((num1 > num3)? num1 : num3):((num2 > num3)? num2 : num3));
	%>
</body>
</html>