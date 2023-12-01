<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page import="java.util.Date"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modificar Empleado</title>

    </head>
    <body>   
        <!-- Contenido de tu página -->
        <div class="container mt-4 mb-5 p-4 border">
            <h1 class="display-4">Modificar empleado</h1>
            <form method="POST" action="/Tienda/Servletprincipal?accion=modificarempleado">
                <div class="mb-3">
                    <label for="ID_Empleado" class="form-label">ID Empleado:</label>
                    <input type="text" class="form-control" name="ID_Empleado" id="ID_Empleado" value="${param.ID_Empleado}" readonly />
                </div>
                <div class="mb-3">
                    <label for="DUI_Empleado" class="form-label">DUI:</label>
                    <input type="text" class="form-control" name="DUI_Empleado" id="DUI_Empleado" value="${param.DUI_Empleado}" required />
                </div>

                <div class="mb-3">
                    <label for="nombresEmpleado" class="form-label">Nombres:</label>
                    <input type="text" class="form-control" name="nombresEmpleado" id="nombresEmpleado" value="${param.nombresEmpleado}" required />
                </div>
                <div class="mb-3">
                    <label for="apellidosEmpleado" class="form-label">Apellidos:</label>
                    <input type="text" class="form-control" name="apellidosEmpleado" id="apellidosEmpleado" value="${param.apellidosEmpleado}" required />
                </div>
                <div class="mb-3">
                    <label for="fechaNacEmpleado" class="form-label">Fecha de nacimiento:</label>
                    <input type="date" class="form-control" name="fechaNacEmpleado" id="fechaNacEmpleado" value="${param.fechaNacEmpleado}" required />
                </div>
                <div class="mb-3">
                    <label for="telefono" class="form-label">Teléfono:</label>
                    <input type="text" class="form-control" name="telefono" id="telefono" value="${param.telefono}" required />
                </div>
                <div class="mb-3">
                    <label for="correo" class="form-label">Correo:</label>
                    <input type="email" class="form-control" name="correo" id="correo" value="${param.correo}" required />
                </div>
                <div class="mb-3">
                    <label for="ID_Cargo" class="form-label">ID Cargo:</label>
                    <input type="text" class="form-control" name="ID_Cargo" id="ID_Cargo" value="${param.ID_Cargo}" required />
                </div>
                <div class="mb-3">
                    <label for="direccion" class="form-label">Dirección:</label>
                    <input type="text" class="form-control" name="direccion" id="ID_Direccion" value="${param.direccion}" required />
                </div>

                <button type="submit" class="btn btn-primary" onclick="return confirm('¿Desea modificar el empleado?')">Modificar</button>
            </form>
            <div class="mt-3">
                <a href="/Tienda/?accion=gestionarempleados" class="btn btn-secondary">Regresar</a>
            </div>
        </div>
</body>
</html>
