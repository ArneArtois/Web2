<%@ page import="model.domain.Eten" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: L
  Date: 13/10/2019
  Time: 14:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%ArrayList<Eten> lijst = (ArrayList<Eten>) request.getAttribute("db");%>

<%int berekening = (int) request.getAttribute("berekening");%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Overzicht</title>
    <link rel="stylesheet" href="css/reset.css">
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
<header><nav>
    <ul>
        <li><a href = "index.html">Index</a></li>
        <li><a href = "add.jsp">Toevoegen</a></li>
        <li><a href = "Servlet">Overzicht</a></li>
    </ul>
</nav>
    <h1>Lijst:</h1>
</header>
<main>
    <section>
        <table>
            <tr>
                <th>Naam</th>
                <th>Aantal</th>
                <th>Calorie</th>
            </tr>
            <% if(lijst != null) {
                for(Eten eten : lijst) { %>
            <tr>
                <td><%=eten.getNaam()%></td>
                <td><%=eten.getAantal()%></td>
                <td><%=eten.getCalorie()%></td>
            </tr><%
                }
            }
        %>
        </table>
    </section>
    <section>
        <p>Totaal: <%=berekening%></p>
    </section>
</main>
</body>
</html>
