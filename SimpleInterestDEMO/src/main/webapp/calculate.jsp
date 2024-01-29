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
        // Get input values from the request
        double principal = Double.parseDouble(request.getParameter("principal"));
        double rate = Double.parseDouble(request.getParameter("rate"));
        int time = Integer.parseInt(request.getParameter("time"));

        // Simple interest calculation
        double simpleInterest = principal * rate * time;

        // Display the result
    %>

    <h1>Simple Interest Calculator</h1>
    <p>Principal Amount: $<%= principal %></p>
    <p>Interest Rate: <%= rate %>%</p>
    <p>Time (in years): <%= time %></p>
    <p>Simple Interest: $<%= simpleInterest %></p>
</body>
</html>