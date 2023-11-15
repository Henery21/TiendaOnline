package com.project.resources;
import com.project.entidades.Reservas;
import com.project.procesos.daoReservas;
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

@Path("Articulos")
public class ApiReservas {
    @GET
    @Path("consultar")
    @Produces(MediaType.APPLICATION_JSON)
    @Secured
    public Response consultarReservas(){
        daoReservas dao = new daoReservas();
        ArrayList<Reservas> listaReservas = dao.consultarReservas("");
        return Response.ok(listaReservas).build();
    }
    @POST
    @Path("insertar")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response insertarReservas(Reservas reservas){
        daoReservas c = new daoReservas();
        int res = c.insertarReservas(reservas);
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
    public Response modificarReservas(@PathParam("id")int id, Reservas reservas){
        daoReservas c = new daoReservas();
        reservas.setID_Reserva(id);
        int res = c.modificarReservas(reservas);
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
    public Response eliminarReservas(@PathParam("id") Reservas id){
        daoReservas c = new daoReservas();
        int res = c.eliminarReservas(id);
        if (res > 0)
            return Response
                    .status(Status.OK)
                    .entity("Registro eliminado exitosamente")
                    .build();
        else
            return Response.notModified().build();
    }
}
