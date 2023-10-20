<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Lista de Empleados</title>
</head>
<body>
    <h1>Lista de Empleados</h1>
    <h3>Conexion : ${mensaje_conexion}</h3>
    <table border="1">
        
        <thead>
            <tr>
                <th>ID Empleado</th>
                <th>Nombres</th>
                <th>Apellidos</th>
                <th>Teléfono</th>
                <th>Correo</th>
                <th>ID Cargo</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="empleado" items="${empleados}">
                <tr>
                    <td><c:out value ="${empleado.ID_Empleado}" /></td>
                    <td><c:out value ="${empleado.nombresEmpleado}" /></td>
                    <td><c:out value ="${empleado.apellidosEmpleado}" /></td>
                    <td><c:out value ="${empleado.telefono}" /></td>
                    <td><c:out value ="${empleado.correo}" /></td>
                    <td><c:out value ="${empleado.ID_Cargo}" /></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
