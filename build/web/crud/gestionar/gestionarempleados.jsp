<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gestionar Empleados</title>
    </head>
    <body>
       <div class="container">
            <h1 class="mt-5">Gestión de Empleados</h1>
            <h2>Listado de Empleados</h2>
            <h3>Conexion: ${mensaje_conexion}</h3><br>

            <div>
                <button class="btn btn-primary mb-3" onclick="regresar()">Regresar</button>    
                <a class="btn btn-primary mb-3" href="/Tienda?accion=AgregarEmpleado">Agregar Empleado</a><br><br>
            </div>
            <table class="table table-bordered">
                <thead class="thead-dark">
                    <tr>
                        <th>ID Empleado</th>
                        <th>Dui Empleado</th>
                        <th>Iss Empleado</th>
                        <th>Nombres</th>
                        <th>Apellidos</th>
                        <th>Fecha Nacimiento</th>
                        <th>Telefono</th>
                        <th>Correo</th>
                        <th>ID Cargo</th>
                        <th>ID Direccion</th>
                        <th>Accion</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${listaEmpleados}" var="item">
                        <tr>
                            <td><c:out value="${item.ID_Empleado}" /></td>
                            <td><c:out value="${item.DUI_Empleado}" /></td>
                            <td><c:out value="${item.NombresEmpleado}" /></td>
                            <td><c:out value="${item.ApellidosEmpleado}" /></td>
                            <td><c:out value="${item.FechaNacEmpleado}" /></td>
                            <td><c:out value="${item.Telefono}" /></td>
                            <td><c:out value="${item.Correo}" /></td>
                            <td><c:out value="${item.ID_Cargo}" /></td>
                            <td><c:out value="${item.Direccion}" /></td>
                            <td class="text-center">
                                <form method="POST" action="/Tienda/crud/modificar/modificarempleado.jsp">
                                    <input type="hidden" name="ID_Empleado" value="${item.ID_Empleado}" />
                                    <input type="hidden" name="nombresEmpleado" value="${item.NombresEmpleado}" />             
                                    <input type="hidden" name="apellidosEmpleado" value="${item.ApellidosEmpleado}" />             
                                    <button type="submit" class="btn btn-warning">Modificar</button>
                                </form>    
                                <form method="POST" action="/Tienda/crud/eliminar/eliminarempleado.jsp">
                                    <input type="hidden" name="ID_Empleado" value="${item.ID_Empleado}" />
                                    <input type="hidden" name="DUI_Empleado" value="${item.DUI_Empleado}" />
                                    <input type="hidden" name="ID_Cargo" value="${item.ID_Cargo}" />
                                    <input type="hidden" name="nombresEmpleado" value="${item.NombresEmpleado}" />  
                                    <input type="hidden" name="apellidosEmpleado" value="${item.ApellidosEmpleado}" />             
                                    <input type="hidden" name="fechaNacEmpleado" value="${item.FechaNacEmpleado}" />             
                                    <input type="hidden" name="telefonoEmpleado" value="${item.Telefono}" />             
                                    <input type="hidden" name="correo" value="${item.Correo}" />             
            
                                    <input type="hidden" name="id_Direccion" value="${item.Direccion}" />             

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
