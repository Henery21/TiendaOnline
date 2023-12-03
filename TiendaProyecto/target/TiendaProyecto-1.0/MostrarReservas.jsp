<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mostrar Reservas</title>
    </head>
    <body>
        <h1>Lista de Reservas</h1>
    <h3>Conexion : ${mensaje_conexion}</h3>
    <table border="1">
        
        <thead>
            <tr>
                <th>ID Reserva</th>
                <th>ID Cliente</th>
                <th>Fecha Inicio</th>
                <th>Fecha Fin</th>
                <th>Estado</th>
                <th>Notas</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="reserva" items="${listaReservas}">
                <tr>
                    <td><c:out value ="${reserva.ID_Reserva}" /></td>
                    <td><c:out value ="${reserva.ID_Cliente}" /></td>
                    <td><c:out value ="${reserva.fechaInicio}" /></td>
                    <td><c:out value ="${reserva.fechaFin}" /></td>
                    <td><c:out value ="${reserva.estado}" /></td>
                    <td><c:out value ="${reserva.notas}" /></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    </body>
</html>
