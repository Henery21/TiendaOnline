<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mostrar Existencias</title>
    </head>
    <body>
        <h1>Lista de Existencias</h1>
    <h3>Conexion : ${mensaje_conexion}</h3>
    <table border="1">
        
        <thead>
            <tr>
                <th>ID Existencia</th>
                <th>ID Articulo</th>
                <th>Cantidad</th>
                <th>Fecha Ingreso</th>
                <th>Ubicacion</th>
                <th>Precio Compra</th>
                <th>Precio Venta</th>
                <th>Estado</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="existencia" items="${listaExistencias}">
                <tr>
                    <td><c:out value ="${existencia.ID_Existencia}" /></td>
                    <td><c:out value ="${existencia.ID_Articulo}" /></td>
                    <td><c:out value ="${existencia.cantidad}" /></td>
                    <td><c:out value ="${existencia.fechaIngreso}" /></td>
                    <td><c:out value ="${existencia.ubicacion}" /></td>
                    <td><c:out value ="${existencia.precioCompra}" /></td>
                    <td><c:out value ="${existencia.precioVenta}" /></td>
                    <td><c:out value ="${existencia.estado}" /></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    </body>
</html>
