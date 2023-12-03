package com.project.resources;

import com.project.entidades.Direcciones;
import com.project.procesos.daoDirecciones;
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

@Path("Direcciones")
public class ApiDirecciones {
    @GET
    @Path("consultar")
    @Produces(MediaType.APPLICATION_JSON)
    @Secured
    public Response consultarDirecciones(){
        daoDirecciones dao = new daoDirecciones();
        ArrayList<Direcciones> listaDirecciones = dao.consultarDirecciones("");
        return Response.ok(listaDirecciones).build();
    }
    @POST
    @Path("insertar")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response insertarDirecciones(Direcciones direcciones){
        daoDirecciones c = new daoDirecciones();
        int res = c.insertarDirecciones(direcciones);
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
    public Response modificarDirecciones(@PathParam("id")int id, Direcciones direcciones){
        daoDirecciones c = new daoDirecciones();
        direcciones.setID_Direccion(id);
        int res = c.modificarDirecciones(direcciones);
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
    public Response eliminarDirecciones(@PathParam("id") int id){
        daoDirecciones c = new daoDirecciones();
        int res = c.eliminarDirecciones(id);
        if (res > 0)
            return Response
                    .status(Status.OK)
                    .entity("Registro eliminado exitosamente")
                    .build();
        else
            return Response.notModified().build();
    }
}
