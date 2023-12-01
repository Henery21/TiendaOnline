<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar Cargo</title>
    </head>
     <body>
        <div class="container mt-5 mb-5 border p-4">
            <c:if test="${exito!=null}">
                <c:if test="${exito}">
                    <p><strong style="color: darkgreen;">La información se guardó correctamente</strong></p>
                </c:if>
                <c:if test="${!exito}">
                    <p><strong style="color: red;">No se guardó la información</strong></p>
                </c:if>
            </c:if>   
            <h1>Agregar nuevo Cargo</h1>

            <form method="POST" action="/Tienda/Servletprincipal?accion=agregarcargo">
                <div class="mb-3">
                    <label for="nombre_cargo" class="form-label"> <strong> Cargo: </strong></label>
                    <input type="text" class="form-control" name="nombre_cargo" id="nombre_cargo" required />
                </div>

                <input type="submit" class="btn btn-primary" value="Registrar" onclick="return confirm('¿Desea registrar el Cargo?')" /><br><br>
            </form>

            <div class="mt-3">
                <a href="/Tienda/?accion=gestionarcargos" class="btn btn-secondary">Regresar</a>
            </div>            

        </div>
    </body>
</html>
