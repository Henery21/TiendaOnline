<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gestionar Metodos de pago</title>
    </head>
    <body>
        <div class="container">
            <h1 class="mt-5">Gestión de pago</h1>
            <h2>Listado de pagos</h2>
            <h3>Conexion: ${mensaje_conexion}</h3><br>

            <div>
                <button class="btn btn-primary mb-3" onclick="regresar()">Regresar</button>    
                <a class="btn btn-primary mb-3" href="/Tienda?accion=agregarcargo">Agregar pago</a><br><br>
            </div>
            <table class="table table-bordered">
                <thead class="thead-dark">
                    <tr>
                        <th>ID Pago</th>
                        <th>ID Metodo Pago</th>
                        <th>Monto</th>
                        <th>Fecha de pago</th>
                        <th>Acciones</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${listaPagos}" var="item">
                        <tr>
                            <td><c:out value="${item.id_Pago}" /></td>
                            <td><c:out value="${item.id_MetodoPago}" /></td>
                            <td><c:out value="${item.monto}" /></td>
                            <td><c:out value="${item.fechaPago}" /></td>
                            <td class="text-center">
                                <form method="POST" action="/Tienda/crud/modificar/modificarcargo.jsp">
                                    <input type="hidden" name="id_Pago" value="${item.id_Pago}" />
                                    <input type="hidden" name="id_MetodoPago" value="${item.id_MetodoPago}" />             
                                    <button type="submit" class="btn btn-warning">Modificar</button>
                                </form>    
                                <form method="POST" action="/Tienda/crud/eliminar/eliminarcargo.jsp">
                                    <input type="hidden" name="id_Pago" value="${item.id_Pago}" />
                                    <input type="hidden" name="id_MetodoPago" value="${item.id_MetodoPago}" />             
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
