<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Lista de Subcategorias</title>
</head>
<body>
    <h1>Lista de Subcategorias</h1>
    <h3>Conexion : ${mensaje_conexion}</h3>
    <table border="1">
        
        <thead>
            <tr>
                <th>ID Subcategoria</th>
                <th>Subcategoria</th>
                <th>ID Categoria</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="subcategoria" items="${listaSubcategorias}">
                <tr>
                    <td><c:out value ="${subcategoria.ID_Subcategoria}" /></td>
                    <td><c:out value ="${subcategoria.subcategoria}" /></td>
                    <td><c:out value ="${subcategoria.ID_Categoria}" /></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
