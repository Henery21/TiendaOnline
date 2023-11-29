<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mostrar Articulos</title>
    </head>
    <body>
        <h1>Lista de Usuarios</h1>
    <h3>Conexion : ${mensaje_conexion}</h3>
    <table border="1">
        
        <thead>
            <tr>
                <th>ID Usuario</th>
                <th>Usuario</th>
                <th>ID Rol</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="usuario" items="${listaUsuarios}">
                <tr>
                    <td><c:out value ="${usuario.ID_Usuario}" /></td>
                    <td><c:out value ="${usuario.usuario}" /></td>
                    <td><c:out value ="${usuario.ID_Rol}" /></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    </body>
</html>
