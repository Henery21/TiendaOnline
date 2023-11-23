<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mostrar Proveedores</title>
    </head>
    <body>
        <h1>Lista de Proveedores</h1>
    <h3>Conexion : ${mensaje_conexion}</h3>
    <table border="1">
        
        <thead>
            <tr>
                <th>ID Proveedor</th>
                <th>Nombre</th>
                <th>Direccion</th>
                <th>Telefono</th>
                <th>Correo</th>
                <th>Notas</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="proveedor" items="${listaProveedores}">
                <tr>
                    <td><c:out value ="${proveedor.ID_Proveedor}" /></td>
                    <td><c:out value ="${proveedor.nombre}" /></td>
                    <td><c:out value ="${proveedor.direccion}" /></td>
                    <td><c:out value ="${proveedor.telefono}" /></td>
                    <td><c:out value ="${proveedor.correo}" /></td>
                    <td><c:out value ="${proveedor.notas}" /></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    </body>
</html>
