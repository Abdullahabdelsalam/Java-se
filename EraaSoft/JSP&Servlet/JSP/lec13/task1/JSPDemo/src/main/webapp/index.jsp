<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>JSP Function Example</title>
</head>
<body>

<%
    int id = 705;
    String name = "Abdullah Shams";
    String result = id + " - " + name;
%>

<h2>Concatenated Result:</h2>
<p><%= result %></p>

</body>
</html>