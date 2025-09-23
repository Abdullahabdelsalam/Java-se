<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="true" %>
<%@ page import="java.util.List" %>

<html>
<head>
    <title>All Orders</title>
</head>
<body>
    <h2>All Your Orders</h2>
    
    <%

        List<String> orders = (List<String>) session.getAttribute("orders");

        if (orders != null && !orders.isEmpty()) {
    %>
        <ul>
            <%
                for (String order : orders) {
            %>
                <li><%= order %></li>
            <%
                }
            %>
        </ul>
    <%
        } else {
    %>
        <p>No orders yet.</p>
    <%
        }
    %>

    <br>
    <a href="orderFood.jsp">Go back to Order Page</a>
</body>
</html>
