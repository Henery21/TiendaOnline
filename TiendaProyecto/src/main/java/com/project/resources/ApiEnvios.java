package com.project.resources;
import com.project.entidades.Envios;
import com.project.procesos.daoEnvios;
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

@Path("Envios")
public class ApiEnvios {
    @GET
    @Path("consultar")
    @Produces(MediaType.APPLICATION_JSON)
    @Secured
    public Response consultarEnvios(){
        daoEnvios dao = new daoEnvios();
        ArrayList<Envios> listaEnvios = dao.consultarEnvios("");
        return Response.ok(listaEnvios).build();
    }
    @POST
    @Path("insertar")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response insertarEnvios(Envios envios){
        daoEnvios c = new daoEnvios();
        int res = c.insertarEnvios(envios);
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
    public Response modificarEnvios(@PathParam("id")int id, Envios envios){
        daoEnvios c = new daoEnvios();
        envios.setID_Envio(id);
        int res = c.modificarEnvios(envios);
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
    public Response eliminarEnvios(@PathParam("id") Envios id){
        daoEnvios c = new daoEnvios();
        int res = c.eliminarEnvios(id);
        if (res > 0)
            return Response
                    .status(Status.OK)
                    .entity("Registro eliminado exitosamente")
                    .build();
        else
            return Response.notModified().build();
    }
}
