<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modificar Cargo</title>

    </head>
    <body>   
        <div class="container mt-4 border p-4">
            <h1 class="display-4">Modificar Cargo</h1>
            <form method="POST" action="/Tienda/ServletPrincipal?accion=modificarcargo">
                <div class="mb-3">
                    <label for="nombre_cargo" class="form-label">Cargo</label>
                    <input type="text" class="form-control" name="nombre_cargo" id="nombre_cargo" value="${param.nombre_cargo}" required />
                </div>
                <button type="submit" class="btn btn-primary" onclick="return confirm('¿Desea modificar el empleado?')">Modificar</button>
            </form>
            <div class="mt-3">
                <a href="/Tienda?accion=gestionarcargos" class="btn btn-secondary">Regresar</a>
            </div>
        </div>
    </body>
</html>