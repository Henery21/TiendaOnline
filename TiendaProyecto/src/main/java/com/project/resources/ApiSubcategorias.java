package com.project.resources;
import com.project.entidades.Subcategorias;
import com.project.procesos.daoSubcategorias;
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


public class ApiSubcategorias {
    @GET
    @Path("consultar")
    @Produces(MediaType.APPLICATION_JSON)
    @Secured
    public Response consultarSubcategorias(){
        daoSubcategorias dao = new daoSubcategorias();
        ArrayList<Subcategorias> listaSubcategorias = dao.consultarSubcategorias("");
        return Response.ok(listaSubcategorias).build();
    }
    @POST
    @Path("insertar")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response insertarSubcategorias(Subcategorias subcategorias){
        daoSubcategorias c = new daoSubcategorias();
        int res = c.insertarSubcategorias(subcategorias);
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
    public Response modificarSubcategorias(@PathParam("id")int id, Subcategorias subcategorias){
        daoSubcategorias c = new daoSubcategorias();
        subcategorias.setID_Subcategoria(id);
        int res = c.modificarSubcategorias(subcategorias);
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
    public Response eliminarSubcategorias(@PathParam("id") Subcategorias id){
        daoSubcategorias c = new daoSubcategorias();
        int res = c.eliminarSubcategorias(id);
        if (res > 0)
            return Response
                    .status(Status.OK)
                    .entity("Registro eliminado exitosamente")
                    .build();
        else
            return Response.notModified().build();
    }
}
