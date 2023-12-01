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
            <h1 class="mt-5">Gestión de Cargos</h1>
            <h2>Listado de Cargos</h2>
            <h3>Conexion: ${mensaje_conexion}</h3><br>

            <div>
                <button class="btn btn-primary mb-3" onclick="regresar()">Regresar</button>    
                <a class="btn btn-primary mb-3" href="/Tienda?accion=agregarcargo">Agregar Cargo</a><br><br>
            </div>
            <table class="table table-bordered">
                <thead class="thead-dark">
                    <tr>
                        <th>ID Cargo</th>
                        <th>Cargo</th>
                        <th>Acciones</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${listaCargos}" var="item">
                        <tr>
                            <td><c:out value="${item.id_cargo}" /></td>
                            <td><c:out value="${item.Nombre_Cargo}" /></td>
                            <td class="text-center">
                                <form method="POST" action="/Tienda/crud/modificar/modificarcargo.jsp">
                                    <input type="hidden" name="id_cargo" value="${item.id_cargo}" />
                                    <input type="hidden" name="nombre_cargo" value="${item.nombre_cargo}" />             
                                    <button type="submit" class="btn btn-warning">Modificar</button>
                                </form>    
                                <form method="POST" action="/Tienda/cru/eliminar/eliminarcargo.jsp">
                                    <input type="hidden" name="id_cargo" value="${item.id_cargo}" />
                                    <input type="hidden" name="nombre_cargo" value="${item.nombre_cargo}" />             
                                    <button type="submit" class="m-2 btn btn-danger">Eliminar</button>
                                </form>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>            
            </table>
        </div>
            <script>
                funtion regresar(){
                    window.location.href = "index.html";
                }
            </script>
    </body>
</html>
