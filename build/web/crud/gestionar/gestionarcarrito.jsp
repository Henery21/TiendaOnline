
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gestionar carritos</title>
    </head>
    <body>
        <div class="container">
            <h1 class="mt-5">Gestión de Cargos</h1>
            <h2>Listado de Cargos</h2>
            <h3>Conexion: ${mensaje_conexion}</h3><br>

            <div>
                <button class="btn btn-primary mb-3" onclick="regresar()">Regresar</button>    
                <a class="btn btn-primary mb-3" href="/Tienda?accion=agregarCarro">Agregar Carro</a><br><br>
            </div>
            <table class="table table-bordered">
                <thead class="thead-dark">
                    <tr>
                        <th>ID Carrito</th>
                        <th>ID Producto</th>
                        
                        <th>Cantidad</th>
                        <th>Fecha Agregado</th>
                        <th>Acciones</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${listaCarrito}" var="item">
                        <tr>
                            <td><c:out value="${item.id_carrito}" /></td>
                            <td><c:out value="${item.id_articulo}" /></td>
                            
                            <td><c:out value="${item.cantidad}" /></td>
                            <td><c:out value="${item.fecha}" /></td>
                            <td class="text-center">
                                <form method="POST" action="/Tienda/OpcionesUsuario/modificar/modificarcargo.jsp">
                                    <input type="hidden" name="id_Carrito" value="${item.id_carrito}" />
                                    <input type="hidden" name="id_articulo" value="${item.id_articulo}" />             
                                    <button type="submit" class="btn btn-warning">Modificar</button>
                                </form>    
                                <form method="POST" action="/Tienda/OpcionesUsuario/eliminar/eliminarcargo.jsp">
                                    <input type="hidden" name="id_carrito" value="${item.id_carrito}" />
                                    <input type="hidden" name="id_articulo" value="${item.id_articulo}" />             
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
