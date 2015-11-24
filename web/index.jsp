<%-- 
    Document   : index
    Created on : 16/11/2015, 20:39:00
    Author     : Pedro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%  if(session.getAttribute("profid")==null){response.sendRedirect("login.jsp");}else{response.sendRedirect("principal.html");};%>
    </body>
</html>
