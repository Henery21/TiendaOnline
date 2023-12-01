<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gestion de clientes</title>
    </head>
    <body>
        <div class="container">
            <h1 class="mt-5">Gestión de Clientes</h1>
            <h2>Listado de Clientes</h2>
            <h3>Conexion: ${mensaje_conexion}</h3><br>

            <div>
                <button class="btn btn-primary mb-3" onclick="regresar()">Regresar</button>    
                <a class="btn btn-primary mb-3" href="/Tienda?accion=agregarcliente">Agregar Cliente</a><br><br>
            </div>
            <table class="table table-bordered">
                <thead class="thead-dark">
                    <tr>
                        <th>ID Cliente</th>
                        <th>Nombres</th>
                        <th>Apellidos</th>
                        <th>Dui</th>
                        <th>Telefono</th>
                        <th>Correo</th>
                        <th>Id DIreccion</th>
                        <th>Usuario</th>
                        <th>Clave</th>
                        <th>Acciones</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${listaClientes}" var="item">
                        <tr>
                            <td><c:out value="${item.ID_Cliente}" /></td>
                            <td><c:out value="${item.NombresCliente}" /></td>
                            <td><c:out value="${item.ApellidosCliente}" /></td>
                            <td><c:out value="${item.DUI_Cliente}" /></td>
                            <td><c:out value="${item.Telefono}" /></td>
                            <td><c:out value="${item.Correo}" /></td>
                            <td><c:out value="${item.ID_Direccion}" /></td>
                            <td><c:out value="${item.usuario}" /></td>
                            <td><c:out value="${item.clave}" /></td>
                            <td class="text-center">
                                <form method="POST" action="/Tienda/crud/modificar/modificarcliente.jsp">
                                    <input type="hidden" name="id_Cliente" value="${item.ID_Cliente}" />
                                    <input type="hidden" name="nombresCliente" value="${item.NombresCliente}" />             
                                    <button type="submit" class="btn btn-warning">Modificar</button>
                                </form>    
                                <form method="POST" action="/Tienda/crud/eliminar/eliminarcliente.jsp">
                                    <input type="hidden" name="id_Cliente" value="${item.ID_Cliente}" />
                                    <input type="hidden" name="nombresCliente" value="${item.NombresCliente}" />             
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
