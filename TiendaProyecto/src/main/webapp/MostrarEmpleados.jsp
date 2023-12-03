<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mostrar Empleados</title>
    </head>
    <body>
        <h1>Lista de Empleados</h1>
    <h3>Conexion : ${mensaje_conexion}</h3>
    <table border="1">
        
        <thead>
            <tr>
                <th>ID Empleado</th>
                <th>DUI</th>
                <th>Nombres</th>
                <th>Apellidos</th>
                <th>Usuario</th>
                <th>Telefono</th>
                <th>Correo</th>
                <th>ID Cargo</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="empleado" items="${listaEmpleados}">
                <tr>
                    <td><c:out value ="${empleado.ID_Empleado}" /></td>
                    <td><c:out value ="${empleado.DUI_Cliente}" /></td>
                    <td><c:out value ="${empleado.nombresCliente}" /></td>
                    <td><c:out value ="${empleado.apellidosCliente}" /></td>
                    <td><c:out value ="${articulo.ID_Usuario}" /></td>
                    <td><c:out value ="${articulo.telefono}" /></td>
                    <td><c:out value ="${articulo.correo}" /></td>
                    <td><c:out value ="${articulo.ID_Cargo}" /></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    </body>
</html>
