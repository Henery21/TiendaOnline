<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar Articulos</title>
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

                <form method="POST" action="/Tienda/Servletprincipal?accion=agregararticulo">
                    
                    <div class="form-group">
                        <label for="ID_Articulo">ID Articulo</label>
                        <input type="text" class="form-control" name="ID_Articulo" id="ID_Articulo" required>
                    </div>

                    <div class="form-group">
                        <label for="codigo">Articulo</label>
                        <input type="text" class="form-control" name="codigo" id="codigo" required>
                    </div>

                    <div class="form-group">
                        <label for="descripcion">Descripcion</label>
                        <input type="text" class="form-control" name="descripcion" id="descripcion" required>
                    </div>

                    <div class="form-group">
                        <label for="Precio_Venta">Precio</label>
                        <input type="date" class="form-control" name="Precio_Venta" id="Precio_Venta" required>
                    </div>

                    <div class="form-group">
                        <label for="ID_Proveedor">ID Proveedor:</label>
                        <input type="text" class="form-control" name="ID_Proveedor" id="ID_Proveedor" required>
                    </div>

                    <div class="form-group">
                        <label for="ID_Subcategoria">ID Subcategoria:</label>
                        <input type="email" class="form-control" name="ID_Subcategoria" id="ID_Subcategoria" required>
                    </div>

                    <div class="form-group">
                        <label for="ID_Categoria">ID Categoria:</label>
                        <input type="text" class="form-control" name="ID_Categoria" id="ID_Categoria" required>
                    </div>

                    <div class="form-group">
                        <input type="submit" class="btn btn-primary" value="Registrar" onclick="return confirm('¿Desea registrar un articulo?')">
                    </div>
                </form>

                <div class="mt-4">
                    <a href="/Tienda/?accion=gestionararticulos" class="btn btn-secondary">Regresar</a>
                </div>
            </div>

        </div>
    </body>
</html>
