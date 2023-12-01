<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar Cliente</title>
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

                <h1 class="mb-4">Agregar nuevo Cliente</h1>

                <form method="POST" action="/Tienda/Servletprincipal?accion=agregarcliente">
                    <div class="form-group">
                        <label for="NombresCliente">Nombres: </label>
                        <input type="text" class="form-control" name="NombresCliente" id="NombresCliente" required>
                    </div>

                    <div class="form-group">
                        <label for="ApellidosCliente">Apellidos: </label>
                        <input type="text" class="form-control" name="ApellidosCliente" id="ApellidosCliente" required>
                    </div>

                    <div class="form-group">
                        <label for="DUI_Cliente">DUI: </label>
                        <input type="text" class="form-control" name="DUI_Cliente" id="DUI_Cliente" required>
                    </div>

                    <div class="form-group">
                        <label for="Telefono">Telefono: </label>
                        <input type="text" class="form-control" name="Telefono" id="Telefono" required>
                    </div>

                    <div class="form-group">
                        <label for="Correo">Correo: </label>
                        <input type="email" class="form-control" name="Correo" id="Correo" required>
                    </div>

                    <div class="form-group">
                        <label for="ID_Direccion">Id Direccion:</label>
                        <input type="text" class="form-control" name="ID_Direccion" id="ID_Direccion" required>
                    </div>

                    <div class="form-group">
                        <label for="usuario">Usuario: </label>
                        <input type="text" class="form-control" name="usuario" id="usuario" required>
                    </div>
                    
                    <div class="form-group">
                        <label for="clave">Clave: </label>
                        <input type="password" class="form-control" name="clave" id="clave" required>
                    </div>
                    
                    <div class="form-group">
                        <input type="submit" class="btn btn-primary" value="Registrar" onclick="return confirm('¿Desea registrar el Cliente?')">
                    </div>
                </form>

                <div class="mt-4">
                    <a href="/Tienda/?accion=gestionarclientes" class="btn btn-secondary">Regresar</a>
                </div>
            </div>

        </div>

    </body>
</html>
