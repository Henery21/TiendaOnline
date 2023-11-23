<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mostrar Categorias</title>
    </head>
    <body>
        <h1>Lista de Categorias</h1>
    <h3>Conexion : ${mensaje_conexion}</h3>
    <table border="1">
        
        <thead>
            <tr>
                <th>ID Categoria</th>
                <th>Nombre</th>
                <th>Descripcion</th>
                <th>Bit</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="categoria" items="${listaCategorias}">
                <tr>
                    <td><c:out value ="${categoria.ID_Categoria}" /></td>
                    <td><c:out value ="${categoria.nombre}" /></td>
                    <td><c:out value ="${categoria.descripcion}" /></td>
                    <td><c:out value ="${categoria.bit}" /></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    </body>
</html>
