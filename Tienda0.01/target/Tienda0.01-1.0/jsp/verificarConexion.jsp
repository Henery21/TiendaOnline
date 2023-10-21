<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Verificar Conexión</title>
</head>
<body>
    <h1>Verificar Conexión a la Base de Datos</h1>
    <c:choose>
        <c:when test="${conexionExitosa}">
            <p>La conexión a la base de datos se ha establecido correctamente.</p>
        </c:when>
        <c:otherwise>
            <p>La conexión a la base de datos ha fallado.</p>
        </c:otherwise>
    </c:choose>
</body>
</html>
