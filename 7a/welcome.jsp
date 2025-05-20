<%@ page language="java" session="true" %>
<%@ page import="java.util.*" %>

<%
    // Set session timeout to 1 minute
    session.setMaxInactiveInterval(60); // seconds

    String username = request.getParameter("username");

    if (username != null && !username.trim().isEmpty()) {
        // Store name in session
        session.setAttribute("username", username);
    } else {
        // Try to retrieve from session
        username = (String) session.getAttribute("username");
    }

    if (username == null) {
%>
        <h3>Session expired or no name found. Please <a href="index.jsp">go back</a> and enter your name again.</h3>
<%
    } else {
%>
        <h2>Hello, <%= username %>!</h2>
        <p>Your session will expire in 1 minute of inactivity.</p>
        <p><a href="welcome.jsp">Reload</a> to test expiry.</p>
<%
    }
%>
