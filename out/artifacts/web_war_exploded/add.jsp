<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Toevoegen</title>
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
    <h1>Voeg toe:</h1>
</header>
<main>
    <section>
        <form method = "post" action = "Servlet" novalidate>
            <p><label for="gerecht">Naam van het gerecht:</label></p>
            <p><input type="text" name="naam" id="gerecht"></p>

            <p><label for="aantal">Aantal:</label></p>
            <p><input type="text" name="aantal" id="aantal"></p>

            <p><label for="calorie">Calorie:</label></p>
            <p><input type="text" name="calorie" id="calorie"></p>

            <p><input type ="submit" value="Voeg toe"></p>
        </form>
    </section>
</main>

</body>
</html>