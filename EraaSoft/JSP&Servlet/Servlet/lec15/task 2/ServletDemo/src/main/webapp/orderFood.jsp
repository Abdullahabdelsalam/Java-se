<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="true" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>

<html>
<head>
    <title>Food Order</title>
</head>
<body>
    <h2>Order Your Food</h2>
    <form action="orderFood.jsp" method="POST">
        <label for="food">Enter Food Order:</label>
        <input type="text" id="food" name="food" required>
        <input type="submit" value="Order">
    </form>

    <%
        String food = request.getParameter("food");
        if (food != null && !food.isEmpty()) {

            List<String> orders = (List<String>) session.getAttribute("orders");
            if (orders == null) {
                orders = new ArrayList<>();
            }

            orders.add(food);
            session.setAttribute("orders", orders);
        }
    %>

    <br>
    <a href="allorders.jsp">View All Orders</a>
</body>
</html>
