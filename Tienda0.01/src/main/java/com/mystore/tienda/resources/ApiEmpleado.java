package com.mystore.tienda.resources;

import com.mystore.tienda.entidades.empleado;
import com.mystore.tienda.operaciones.daoEmpleado;
import com.mystore.tienda.utilerias.Secured;
import jakarta.ws.rs.Consumes;
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

@Path("contacto")
public class ApiEmpleado {
    @GET
    @Path("consultar")
    @Produces(MediaType.APPLICATION_JSON)
    @Secured
    public Response ConsultarContactos(){
        daoEmpleado dao = new daoEmpleado();
        ArrayList<empleado> listaContactos = dao.consultarEmpleado("");
        return Response.ok(listaContactos).build();
    }
    @POST
    @Path("insertar")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response InsertarContacto(empleado contacto){
        daoEmpleado c = new daoEmpleado();
        int res = c.insertar(contacto);
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
    public Response ModificarEmpleado(@PathParam("id")int id, empleado contacto){
        daoEmpleado c = new daoEmpleado();
        contacto.setID_Empleado(id);
        int res = c.modificar(contacto);
        if (res>0)
            return Response
                    .status(Status.OK)
                    .entity("Registro modificado exitosamente")
                    .build();
        else
            return Response.notModified().build();
    }
}
