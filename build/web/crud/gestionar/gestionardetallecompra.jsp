<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gestionar Compra</title>
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
                        <th>ID Detlle Compra</th>
                        <th>ID Compra</th>
                        <th>Cantidad</th>
                        <th>Precio Unitario</th>
                        <th>Estado de la Compra</th>
                        <th>Total</th>
                        <th>Acciones</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${listaDetalleCompra}" var="item">
                        <tr>
                            <td><c:out value="${item.id_DetalleCompra}" /></td>
                            <td><c:out value="${item.id_Compra}" /></td>
                            <td><c:out value="${item.cantidad}" /></td>
                            <td><c:out value="${item.precioUnitario}" /></td>
                            <td><c:out value="${item.estadoCompra}" /></td>
                            <td><c:out value="${item.total}" /></td>
                            <td class="text-center">
                                <form method="POST" action="/Tienda/OpcionesUsuario/Modificar/ModificarCargo.jsp">
                                    <input type="hidden" name="id_DetalleCompra" value="${item.id_DetalleCompra}" />
                                    <input type="hidden" name="estadoCompra" value="${item.estadoCompra}" />             
                                    <button type="submit" class="btn btn-warning">Modificar</button>
                                </form>    
                                <form method="POST" action="/Tienda/Usuario/Eliminar/EliminarCargo.jsp">
                                    <input type="hidden" name="id_DetalleCompra" value="${item.id_DetalleCompra}" />
                                    <input type="hidden" name="estadoCompra" value="${item.estadoCompra}" />             
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
