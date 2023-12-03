<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mostrar Carrito</title>
    </head>
    <body>
        <h1>Lista de Carrito</h1>
    <h3>Conexion : ${mensaje_conexion}</h3>
    <table border="1">
        
        <thead>
            <tr>
                <th>ID Carrito</th>
                <th>ID Cliente</th>
                <th>Fecha</th>
                <th>ID Articulo</th>
                <th>Cantidad</th>
                <th>Precio</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="carrito" items="${listaCarrito}">
                <tr>
                    <td><c:out value ="${carrito.ID_Carrito}" /></td>
                    <td><c:out value ="${carrito.ID_Cliente}" /></td>
                    <td><c:out value ="${carrito.fecha}" /></td>
                    <td><c:out value ="${carrito.ID_Articulo}" /></td>
                    <td><c:out value ="${carrito.cantidad}" /></td>
                    <td><c:out value ="${carrito.precio}" /></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    </body>
</html>
