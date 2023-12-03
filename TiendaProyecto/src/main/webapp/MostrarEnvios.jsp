<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mostrar Envios</title>
    </head>
    <body>
        <h1>Lista de Envios</h1>
    <h3>Conexion : ${mensaje_conexion}</h3>
    <table border="1">
        
        <thead>
            <tr>
                <th>ID Envio</th>
                <th>ID Cliente</th>
                <th>ID Empleado</th>
                <th>Fecha Envio</th>
                <th>Estado</th>
                <th>Metodo Envio</th>
                <th>Notas</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="envio" items="${listaEnvios}">
                <tr>
                    <td><c:out value ="${envio.ID_Envio}" /></td>
                    <td><c:out value ="${envio.ID_Cliente}" /></td>
                    <td><c:out value ="${envio.ID_Empleado}" /></td>
                    <td><c:out value ="${envio.fechaEnvio}" /></td>
                    <td><c:out value ="${envio.estado}" /></td>
                    <td><c:out value ="${envio.metodoEnvio}" /></td>
                    <td><c:out value ="${envio.notas}" /></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    </body>
</html>
