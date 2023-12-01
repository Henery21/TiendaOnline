<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modificar Usuario</title>

    </head>
    <body>   
        <!-- Contenido de tu página -->
        <div class="container mt-4 mb-5 border p-4">
            <h1 class="display-4">Modificar Usuario</h1>
            <form method="POST" action="/Tienda/Servletprincipal?accion=modificarusuario">
                <div class="mb-3">
                    <label for="ID_Usuario" class="form-label">ID Usuario</label>
                    <input type="text" class="form-control" name="ID_Usuario" id="ID_Usuario" value="${param.id_Usuario}" readonly />
                </div>
                <div class="mb-3">
                    <label for="ID_Rol" class="form-label">ID Empleado</label>
                    <input type="text" class="form-control" name="ID_Rol" id="ID_Rol" value="${param.ID_Rol}" readonly />
                </div>
                <div class="mb-3">
                    <label for="usuario" class="form-label">Usuario:</label>
                    <input type="text" class="form-control" name="usuario" id="usuario" value="${param.usuario}" required />
                </div>
                <div class="mb-3">
                    <label for="clave" class="form-label">Clave:</label>
                    <input type="password" class="form-control" name="clave" id="clave" value="${param.clave}" required />
                </div>
                
                <button type="submit" class="btn btn-primary" onclick="return confirm('¿Desea modificar el Usuario?')">Modificar</button>
            </form>
            <div class="mt-3">
                <a href="/Tienda/?accion=gestionarusuarios" class="btn btn-secondary">Regresar</a>
            </div>
        </div>

    </body>
</html>
