<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>Eliminar Cliente</title>
    </head>
    <body>
        <form method="POST">
            <label class="font-weight-bold">ID Cliente:</label> ${param.ID_Cliente}<br>
            <label class="font-weight-bold">DUI:</label> ${param.DUI_Cliente}<br>
            <label class="font-weight-bold">Nombres:</label> ${param.NombresCliente}<br>
            <label class="font-weight-bold">Apellidos:</label> ${param.ApellidosCliente}<br>
            <label class="font-weight-bold">Teléfono:</label> ${param.Telefono}<br>
            <label class="font-weight-bold">Correo:</label> ${param.Correo}<br>
            <label class="font-weight-bold">Cargo:</label> ${param.ID_Cargo}<br>
            <label class="font-weight-bold">Dirección:</label> ${param.Direccion}
            <input type="hidden" name="ID_Cliente" id="ID_Cliente" value="${param.ID_Cliente}" /><br><br>
            <button type="submit" class="btn btn-danger" onclick="return confirm('¿Desea eliminar el Cliente?')">Eliminar</button><br><br>
            </div>
        </form>

        <div>
            <a class="btn btn-secondary" href="/Tienda/?accion=gestionarcliente">Regresar</a><br><br>
        </div>
    </body>
</html>
