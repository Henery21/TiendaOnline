<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mostrar Ventas</title>
    </head>
    <body>
        <h1>Lista de Ventas</h1>
    <h3>Conexion : ${mensaje_conexion}</h3>
    <table border="1">
        
        <thead>
            <tr>
                <th>ID Articulo</th>
                <th>ID Categoria</th>
                <th>ID Subcategoria</th>
                <th>Codigo</th>
                <th>Precio Venta</th>
                <th>Fecha Vencimiento</th>
                <th>Descripcion</th>
                <th>Estado</th>
                <th>ID Proveedor</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="venta" items="${listaVentas}">
                <tr>
                    <td><c:out value ="${articulo.ID_Articulo}" /></td>
                    <td><c:out value ="${articulo.ID_Categoria}" /></td>
                    <td><c:out value ="${articulo.ID_Subcategoria}" /></td>
                    <td><c:out value ="${articulo.codigo}" /></td>
                    <td><c:out value ="${articulo.Precio_Venta}" /></td>
                    <td><c:out value ="${articulo.Fecha_Vencimiento}" /></td>
                    <td><c:out value ="${articulo.descripcion}" /></td>
                    <td><c:out value ="${articulo.estado}" /></td>
                    <td><c:out value ="${articulo.ID_Proveedor}" /></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    </body>
</html>
