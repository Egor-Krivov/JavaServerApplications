<%-- 
    Document   : group
    Created on : 12.10.2014, 15:43:20
    Author     : egor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hello, <%=request.getParameter("visitor")%> --%></title>
    </head>
    <body>
        <h1>Hello <%=request.getParameter("visitor")%></h1>
    </body>
</html>
