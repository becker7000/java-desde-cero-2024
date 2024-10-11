<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%! int tam; %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8" />
    <title>Ejemplo de un for</title>
</head>
<body>

    <h2>Usando un for</h2>

    <%-- Reto: hacer que en cada iteracion salga un color diferente... --%>
    <% for(tam=1; tam<=10; tam++){ %>
        <font color="darkblue" size="<%=tam%>">
            Java Server Pages
        </font><br/>
    <% } %>

</body>
</html>