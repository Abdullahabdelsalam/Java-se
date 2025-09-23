<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="jakarta.servlet.http.Cookie" %>

<%
    String favPlace = request.getParameter("favPlace");

    if (favPlace != null && !favPlace.isEmpty()) {
        Cookie favPlaceCookie = new Cookie("favPlace", favPlace);
        favPlaceCookie.setMaxAge(60 * 60 * 24 * 30); 
        response.addCookie(favPlaceCookie);
    }

    String savedPlace = null;
    Cookie[] cookies = request.getCookies();
    if (cookies != null) {
        for (Cookie c : cookies) {
            if (c.getName().equals("favPlace")) {
                savedPlace = c.getValue();
                break;
            }
        }
    }
%>

<html>
<head>
    <title>Homepage</title>
</head>
<body>
    <h2>Welcome to the Homepage</h2>

    <%
        if (savedPlace != null) {
    %>
        <p>Your favorite place is: <strong><%= savedPlace %></strong></p>
    <%
        } else {
    %>
        <p>No favorite place set yet.</p>
    <%
        }
    %>

    <a href="start.html">Back to Start</a>
</body>
</html>
