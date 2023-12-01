<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JGestionar Compra</title>
    </head>
    <body>
        <div class="container">
            <h1 class="mt-5">Gestión de Compra</h1>
            <h2>Listado de Compra</h2>
            <h3>Conexion: ${mensaje_conexion}</h3><br>

            <div>
                <button class="btn btn-primary mb-3" onclick="regresar()">Regresar</button>    
                <a class="btn btn-primary mb-3" href="/Tienda?accion=AgregarCargo">Agregar Compra</a><br><br>
            </div>
            <table class="table table-bordered">
                <thead class="thead-dark">
                    <tr>
                        <th>ID Compra</th>
                        <th>Proveedor</th>
                        <th>Nombre Compra</th>
                        <th>Fecha Compra</th>
                        <th>Total</th>
                        <th>Estado</th>
                        <th>Empleado</th>
                        <th>Descripcion</th>
                        <th>Acciones</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${listaCompra}" var="item">
                        <tr>
                            <td><c:out value="${item.id_Compra}" /></td>
                            <td><c:out value="${item.proveedor}" /></td>
                            <td><c:out value="${item.nombreCompra}" /></td>
                            <td><c:out value="${item.fecha_Compra}" /></td>
                            <td><c:out value="${item.total}" /></td>
                            <td><c:out value="${item.estado}" /></td>
                            <td><c:out value="${item.id_Empleado}" /></td>
                            <td><c:out value="${item.descripcionCompra}" /></td>
                            <td class="text-center">
                                <form method="POST" action="/Tienda/OpcionesUsuario/Modificar/ModificarCargo.jsp">
                                    <input type="hidden" name="id_Compra" value="${item.id_Compra}" />
                                    <input type="hidden" name="nombreCompra" value="${item.nombreCompra}" />             
                                    <button type="submit" class="btn btn-warning">Modificar</button>
                                </form>    
                                <form method="POST" action="/ID_Proveedor/OpcionesUsuario/Eliminar/EliminarCargo.jsp">
                                    <input type="hidden" name="id_Compra" value="${item.id_Compra}" />
                                    <input type="hidden" name="nombreCompra" value="${item.nombreCompra}" />             
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
