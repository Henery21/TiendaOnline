<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mostrar Direcciones</title>
    </head>
    <body>
        <h1>Lista de Direcciones</h1>
    <h3>Conexion : ${mensaje_conexion}</h3>
    <table border="1">
        
        <thead>
            <tr>
                <th>ID Direccion</th>
                <th>Linea 1</th>
                <th>Linea 2</th>
                <th>ID Distrito</th>
                <th>Codigo Postal</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="direccion" items="${listaDirecciones}">
                <tr>
                    <td><c:out value ="${direccion.ID_Direccion}" /></td>
                    <td><c:out value ="${direccion.linea1}" /></td>
                    <td><c:out value ="${direccion.linea2}" /></td>
                    <td><c:out value ="${direccion.ID_Distrito}" /></td>
                    <td><c:out value ="${direccion.codigoPostal}" /></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    </body>
</html>
