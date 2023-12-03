package com.project.resources;
import com.project.entidades.Empleados;
import com.project.procesos.daoEmpleados;
import com.project.utilerias.Secured;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;
import java.util.ArrayList;

@Path("Empleados")
public class ApiEmpleados {
    @GET
    @Path("consultar")
    @Produces(MediaType.APPLICATION_JSON)
    @Secured
    public Response consultarEmpleados(){
        daoEmpleados dao = new daoEmpleados();
        ArrayList<Empleados> listaEmpleados = dao.consultarEmpleados("");
        return Response.ok(listaEmpleados).build();
    }
    @POST
    @Path("insertar")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response insertarEmpleados(Empleados empleado){
        daoEmpleados c = new daoEmpleados();
        int res = c.insertarEmpleados(empleado);
        if (res>0)
            return Response
                    .status(Status.CREATED)
                    .entity("Registro insertado exitosamente")
                    .build();
        else
            return Response
                    .status(Status.NOT_ACCEPTABLE)
                    .entity("Error al insertar")
                    .build();
    }
    @PUT
    @Path("modificar/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response modificarEmpleados(@PathParam("id")int id, Empleados empleado){
        daoEmpleados c = new daoEmpleados();
        empleado.setID_Empleado(id);
        int res = c.modificarEmpleados(empleado);
        if (res>0)
            return Response
                    .status(Status.OK)
                    .entity("Registro modificado exitosamente")
                    .build();
        else
            return Response.notModified().build();
    }
    @DELETE
    @Path("eliminar/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response eliminarEmpleados(@PathParam("id") int id){
        daoEmpleados c = new daoEmpleados();
        int res = c.eliminarEmpleados(id);
        if (res > 0)
            return Response
                    .status(Status.OK)
                    .entity("Registro eliminado exitosamente")
                    .build();
        else
            return Response.notModified().build();
    }
}
