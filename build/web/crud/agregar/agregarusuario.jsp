<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar Usuario</title>
    </head>
    <body>
        <div class="container">
            <c:if test="${exito!=null}">
                <c:if test="${exito}">
                    <p><strong style="color: darkgreen;">La información se guardó correctamente</strong></p>
                </c:if>
                <c:if test="${!exito}">
                    <p><strong style="color: red;">No se guardó la información</strong></p>
                </c:if>
            </c:if>   
            <h1>Agregar nuevo Usuario</h1>

            <form method="POST" action="/Tienda/Servletprincipal?accion=agregarusuario">
                <div class="mb-3">
                    <label for="id_Empleado" class="form-label"> <strong> ID Empleado </strong></label>
                    <input type="text" class="form-control" name="id_Empleado" id="id_Empleado" required />
                </div>
                <div class="mb-3">
                    <label for="Id_Rol" class="form-label"> <strong> ID Rol </strong></label>
                    <input type="text" class="form-control" name="id_Rol" id="id_Rol" required />
                </div>
                <div class="mb-3">
                    <label for="Usuario" class="form-label"> <strong> Usuario </strong></label>
                    <input type="text" class="form-control" name="usuario" id="usuario" required />
                </div>
                <div class="mb-3">
                    <label for="Clave" class="form-label"> <strong> Clave </strong></label>
                    <input type="password" class="form-control" name="clave" id="clave" required />
                </div>

                <input type="submit" class="btn btn-primary" value="Registrar" onclick="return confirm('¿Desea registrar el Cargo?')" /><br><br>
            </form>

            <div class="mt-3">
                <a href="/Tienda/?accion=gestionarusuarios" class="btn btn-secondary">Regresar</a>
            </div>            

        </div>
    </body>
</html>
