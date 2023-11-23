<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mostrar Clientes</title>
    </head>
    <body>
        <h1>Lista de Clientes</h1>
    <h3>Conexion : ${mensaje_conexion}</h3>
    <table border="1">
        
        <thead>
            <tr>
                <th>ID Cliente</th>
                <th>DUI</th>
                <th>Nombres</th>
                <th>Apellidos</th>
                <th>Usuario</th>
                <th>Telefono</th>
                <th>Correo</th>
                <th>ID Direccion</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="cliente" items="${listaClientes}">
                <tr>
                    <td><c:out value ="${cliente.ID_Cliente}" /></td>
                    <td><c:out value ="${cliente.DUI_Cliente}" /></td>
                    <td><c:out value ="${cliente.nombresCliente}" /></td>
                    <td><c:out value ="${cliente.apellidosCliente}" /></td>
                    <td><c:out value ="${cliente.ID_Usuario}" /></td>
                    <td><c:out value ="${cliente.telefono}" /></td>
                    <td><c:out value ="${cliente.correo}" /></td>
                    <td><c:out value ="${cliente.ID_Direccion}" /></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    </body>
</html>
