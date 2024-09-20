<!DOCTYPE html>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Generos</h1>
    <table>
        <tr>
            <th>id</th>
            <th>nome</th>
        </tr>
        <c:forEach var="g" items="${generos}">
            <tr>
                <td>
                    ${g.id}
                </td>
                <td>
                    ${g.nome}
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>