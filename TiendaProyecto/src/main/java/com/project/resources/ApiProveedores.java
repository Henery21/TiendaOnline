package com.project.resources;
import com.project.entidades.Proveedores;
import com.project.procesos.daoProveedores;
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

@Path("Proveedores")
public class ApiProveedores {
    @GET
    @Path("consultar")
    @Produces(MediaType.APPLICATION_JSON)
    @Secured
    public Response consultarProveedores(){
        daoProveedores dao = new daoProveedores();
        ArrayList<Proveedores> listaProveedores = dao.consultarProveedores("");
        return Response.ok(listaProveedores).build();
    }
    @POST
    @Path("insertar")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response insertarProveedores(Proveedores proveedores){
        daoProveedores c = new daoProveedores();
        int res = c.insertarProveedores(proveedores);
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
    public Response modificarProveedores(@PathParam("id")int id, Proveedores proveedores){
        daoProveedores c = new daoProveedores();
        proveedores.setID_Proveedor(id);
        int res = c.modificarProveedores(proveedores);
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
    public Response eliminarProveedores(@PathParam("id") Proveedores id){
        daoProveedores c = new daoProveedores();
        int res = c.eliminarProveedores(id);
        if (res > 0)
            return Response
                    .status(Status.OK)
                    .entity("Registro eliminado exitosamente")
                    .build();
        else
            return Response.notModified().build();
    }
}
