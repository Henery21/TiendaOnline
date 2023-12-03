<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mostrar Ingresos</title>
    </head>
    <body>
        <h1>Lista de Ingresos</h1>
    <h3>Conexion : ${mensaje_conexion}</h3>
    <table border="1">
        
        <thead>
            <tr>
                <th>ID Detalles</th>
                <th>ID Ingreso</th>
                <th>Categoria</th>
                <th>Cantidad</th>
                <th>Precio</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="ingreso" items="${listaIngresos}">
                <tr>
                    <td><c:out value ="${ingreso.ID_Detalle_Ingreso}" /></td>
                    <td><c:out value ="${ingreso.ID_Ingreso}" /></td>
                    <td><c:out value ="${ingreso.ID_Categoria}" /></td>
                    <td><c:out value ="${ingreso.cantidad}" /></td>
                    <td><c:out value ="${ingreso.precio}" /></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    </body>
</html>
