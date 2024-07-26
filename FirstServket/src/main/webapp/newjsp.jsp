<%-- 
    Document   : newjsp
    Created on : 2 июл. 2024 г., 09:38:34
    Author     : Victor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello! my new Friend</h1>
        <strong>
            <%-- используем скриптлеты--%>
            
     <%--   <%
            String data = (String)request.getAttribute("key");
            out.write(data);
            %> 
     --%>
     <%--можно сделать короче --%>     
   <%--  <%=request.getAttribute("key")  %> --%>
   <%-- или использовать expression language ${} применяются фигурные скобки,
   или использовать JSTL--%> 
   ${3*4} ${key}
        </strong>
    </body>
</html>
