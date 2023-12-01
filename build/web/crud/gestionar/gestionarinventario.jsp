<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gestonar Investario</title>
    </head>
    <body>
        <div class="container">
            <h1 class="mt-5">Gestión de Inventario</h1>
            <h2>Listado de Inventario</h2>
            <h3>Conexion: ${mensaje_conexion}</h3><br>
            
            <div>
            <button class="btn btn-primary mb-3" onclick="regresar()">Regresar</button>    
            <a class="btn btn-primary mb-3" href="/Tienda?accion=AgregarCargo">Agregar Inventario</a><br><br>
            </div>

            

            <table class="table table-bordered">
                <thead class="thead-dark">
                    <tr>
                        <th>ID Inventario</th>
                        <th>Strock</th>
                        <th>Nombre del Producto</th>
                        <th>Descripcion</th>
                        <th>Precio</th>
                        <th>Fecha Adquirido</th>
                        <th>Ultima Actualizacion</th>
                        <th>Categoria</th>
                        <th>Proveedor</th>
                        <th>Acciones</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${listaInventario}" var="item">
                        <tr>
                            <td><c:out value="${item.id_Inventario}" /></td>
                            <td><c:out value="${item.stock}" /></td>
                            <td><c:out value="${item.nombreProducto}" /></td>
                            <td><c:out value="${item.descripcion}" /></td>
                            <td><c:out value="${item.precio}" /></td>
                            <td><c:out value="${item.fechaAdquisicion}" /></td>
                            <td><c:out value="${item.fechaUltimaActualizacion}" /></td>
                            <td><c:out value="${item.categoria}" /></td>
                            <td><c:out value="${item.proveedor}" /></td>
                            <td class="text-center">
                                <form method="POST" action="/Tienda/crud/modificar/modificarcargo.jsp">
                                    <input type="hidden" name="id_Inventario" value="${item.id_Inventario}" />
                                    <input type="hidden" name="nombreProducto" value="${item.nombreProducto}" />             
                                    <button type="submit" class="btn btn-warning">Modificar</button>
                                </form>    
                                <form method="POST" action="/Tienda/crud/eliminar/eliminarcargo.jsp">
                                    <input type="hidden" name="Id_Cargo" value="${item.id_Inventario}" />
                                    <input type="hidden" name="nombreProducto" value="${item.nombreProducto}" />             
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
