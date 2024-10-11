<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%-- Esto es una declaracion --%>
<%! java.util.Calendar calendario = java.util.Calendar.getInstance(); %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8"/>
    <title>Hola desde un JSP</title>
</head>
<body>

    <%-- Esto es un comentario... --%>
    <h2>Hola a todos desde una Java Server Page</h2>

    <%-- Esto es un scriptlet --%>
    <%
        out.println("Hola a todos desde un scriptlet");
    %>

    <% if(calendario.get(java.util.Calendar.AM_PM)==java.util.Calendar.AM){ %>
        <h4>Buenos días por la mañana...</h4>
    <% }else{ %>
        <h4>Buenas tardes...</h4>
    <% } %>

    <%-- Esto es una expresion --%>
    <h4>La fecha del día de hoy es: <%=calendario.getTime()%></h4>

</body>
</html>