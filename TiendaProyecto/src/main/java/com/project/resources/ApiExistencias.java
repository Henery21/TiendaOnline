package com.project.resources;
import com.project.entidades.ExistenciasProductos;
import com.project.procesos.daoExistencias;
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

@Path("Existencias")
public class ApiExistencias {
    @GET
    @Path("consultar")
    @Produces(MediaType.APPLICATION_JSON)
    @Secured
    public Response consultarExistencias(){
        daoExistencias dao = new daoExistencias();
        ArrayList<ExistenciasProductos> listaExistencias = dao.consultarExistencias("");
        return Response.ok(listaExistencias).build();
    }
    @POST
    @Path("insertar")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response insertarExistencias(ExistenciasProductos existencias){
        daoExistencias c = new daoExistencias();
        int res = c.insertarExistencias(existencias);
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
    public Response modificarExistencias(@PathParam("id")int id, ExistenciasProductos existencias){
        daoExistencias c = new daoExistencias();
        existencias.setID_Articulo(id);
        int res = c.modificarExistencias(existencias);
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
    public Response eliminarExistencias(@PathParam("id") ExistenciasProductos id){
        daoExistencias c = new daoExistencias();
        int res = c.eliminarExistencias(id);
        if (res > 0)
            return Response
                    .status(Status.OK)
                    .entity("Registro eliminado exitosamente")
                    .build();
        else
            return Response.notModified().build();
    }
}
