<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar Empleado</title>
    </head>
    <body>

        <div class="container mt-5 mb-5">
            <div class="container mt-4 border p-4">
                <c:if test="${exito!=null}">
                    <c:if test="${exito}">
                        <p class="alert alert-success"><strong>La información se guardó correctamente</strong></p>
                    </c:if>
                    <c:if test="${!exito}">
                        <p class="alert alert-danger"><strong>No se guardó la información</strong></p>
                    </c:if>
                </c:if>

                <h1 class="mb-4">Agregar nuevo empleado</h1>

                <form method="POST" action="/Tienda/Servletprincipal?accion=agregarempleado">
                    <div class="form-group">
                        <label for="DUI_Empleado">DUI:</label>
                        <input type="text" class="form-control" name="DUI_Empleado" id="DUI_Empleado" required>
                    </div>
                    
                    <div class="form-group">
                        <label for="ID_Cargo">ID cargo</label>
                        <input type="text" class="form-control" name="ID_Cargo" id="ID_Cargo" required>
                    </div>

                    <div class="form-group">
                        <label for="NombresEmpleado">Nombres:</label>
                        <input type="text" class="form-control" name="NombresEmpleado" id="NombresEmpleado" required>
                    </div>

                    <div class="form-group">
                        <label for="ApellidosEmpleado">Apellidos:</label>
                        <input type="text" class="form-control" name="ApellidosEmpleado" id="ApellidosEmpleado" required>
                    </div>

                    <div class="form-group">
                        <label for="FechaNacEmpleado">Fecha de nacimiento:</label>
                        <input type="date" class="form-control" name="FechaNacEmpleado" id="FechaNacEmpleado" required>
                    </div>

                    <div class="form-group">
                        <label for="Telefono">Teléfono:</label>
                        <input type="text" class="form-control" name="Telefono" id="Telefono" required>
                    </div>

                    <div class="form-group">
                        <label for="Correo">Correo:</label>
                        <input type="email" class="form-control" name="Correo" id="Correo" required>
                    </div>

                    <div class="form-group">
                        <label for="ID_Cargo">ID Cargo:</label>
                        <input type="text" class="form-control" name="ID_Cargo" id="ID_Cargo" required>
                    </div>

                    <div class="form-group">
                        <label for="Direccion">Dirección:</label>
                        <input type="text" class="form-control" name="Direccion" id="Direccion" required>
                    </div>

                    <div class="form-group">
                        <input type="submit" class="btn btn-primary" value="Registrar" onclick="return confirm('¿Desea registrar el empleado?')">
                    </div>
                </form>

                <div class="mt-4">
                    <a href="/Tienda/?accion=gestionarempleados" class="btn btn-secondary">Regresar</a>
                </div>
            </div>

        </div>
    </body>
</html>
