<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gestionar Cargos</title>
    </head>
    <body>
        <div class="container">
            <h1 class="mt-5">Gestión de Descuntos</h1>
            <h2>Listado de Descuntos</h2>
            <h3>Conexion: ${mensaje_conexion}</h3><br>

            <div>
                <button class="btn btn-primary mb-3" onclick="regresar()">Regresar</button>    
                <a class="btn btn-primary mb-3" href="/Tienda?accion=AgregarCargo">Agregar Descuntos</a><br><br>
            </div>
            <table class="table table-bordered">
                <thead class="thead-dark">
                    <tr>
                        <th>ID Descuntos</th>
                        <th>ID Producto</th>
                        <th>Porcentaje de Descuento</th>
                        <th>Inicio Descuento</th>
                        <th>Final Descuento</th>
                        <th>Acciones</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${listaDescuento}" var="item">
                        <tr>
                            <td><c:out value="${item.id_Descuento}" /></td>
                            <td><c:out value="${item.id_Producto}" /></td>
                            <td><c:out value="${item.porcentajeDescuento}" /></td>
                            <td><c:out value="${item.fechaInicio}" /></td>
                            <td><c:out value="${item.fechaFinal}" /></td>
                            <td class="text-center">
                                <form method="POST" action="/Tienda/OpcionesUsuario/Modificar/ModificarCargo.jsp">
                                    <input type="hidden" name="id_Descuento" value="${item.id_Descuento}" />
                                    <input type="hidden" name="porcentajeDescuento" value="${item.porcentajeDescuento}" />             
                                    <button type="submit" class="btn btn-warning">Modificar</button>
                                </form>    
                                <form method="POST" action="/Tienda/OpcionesUsuario/Eliminar/EliminarCargo.jsp">
                                    <input type="hidden" name="id_Descuento" value="${item.id_Descuento}" />
                                    <input type="hidden" name="porcentajeDescuento" value="${item.porcentajeDescuento}" />             
                                    <button type="submit" class="m-2 btn btn-danger">Eliminar</button>
                                </form>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>            
            </table>
        </div>
        <script>
            function regresar() {
                window.location.href = "index.html";
            }
        </script>
    </body>
</html>
