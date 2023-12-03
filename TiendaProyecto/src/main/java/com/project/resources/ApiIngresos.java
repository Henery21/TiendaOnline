package com.project.resources;

import com.project.entidades.Ingresos;
import com.project.procesos.daoIngresos;
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


@Path("Ingresos")
public class ApiIngresos {
    @GET
    @Path("consultar")
    @Produces(MediaType.APPLICATION_JSON)
    @Secured
    public Response consultarIngresos(){
        daoIngresos dao = new daoIngresos();
        ArrayList<Ingresos> listaIngresos = dao.consultarIngresos("");
        return Response.ok(listaIngresos).build();
    }
    @POST
    @Path("insertar")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response insertarIngresos(Ingresos ingresos){
        daoIngresos c = new daoIngresos();
        int res = c.insertarIngresos(ingresos);
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
    public Response modificarIngresos(@PathParam("id")int id, Ingresos ingresos){
        daoIngresos c = new daoIngresos();
        ingresos.setID_Detalle_Ingreso(id);
        int res = c.modificarIngresos(ingresos);
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
    public Response eliminarIngresos(@PathParam("id") int id){
        daoIngresos c = new daoIngresos();
        int res = c.eliminarIngresos(id);
        if (res > 0)
            return Response
                    .status(Status.OK)
                    .entity("Registro eliminado exitosamente")
                    .build();
        else
            return Response.notModified().build();
    }
}
