package com.project.resources;
import com.project.entidades.Usuario;
import com.project.procesos.daoUsuario;
import com.project.utilerias.JSONWebToken;
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
import java.util.ArrayList;

@Path("auth")
public class ApiAuth {
    @POST
    @Path("token")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response validar(Usuario u){
        daoUsuario dao = new daoUsuario();
        boolean estado = dao.validarCredenciales(u.getUsuario(), u.getClave());
        if (estado){
            // crear el JWT
            JSONWebToken.inicializar();
            String jwt = JSONWebToken.crearJWT(u.getUsuario(), u.getUsuario());
            return Response.ok(jwt).build();
        }
        return Response.status(Response.Status.FORBIDDEN).build();
    }
    @GET
    @Path("consultar")
    @Produces(MediaType.APPLICATION_JSON)
    @Secured
    public Response consultarUsuarios(){
        daoUsuario dao = new daoUsuario();
        ArrayList<Usuario> listaUsuarios = dao.consultarUsuarios("");
        return Response.ok(listaUsuarios).build();
    }
    @POST
    @Path("insertar")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response insertarUsuarios(Usuario usuario){
        daoUsuario dao = new daoUsuario();
        int res = dao.insertarUsuarios(usuario);
        if (res>0)
            return Response
                    .status(Response.Status.CREATED)
                    .entity("Registro insertado exitosamente")
                    .build();
        else
            return Response
                    .status(Response.Status.NOT_ACCEPTABLE)
                    .entity("Error al insertar")
                    .build();
    }
    @PUT
    @Path("modificar/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response modificarUsuarios(@PathParam("id")int id, Usuario usuario){
        daoUsuario dao = new daoUsuario();
        usuario.setID_Usuario(id);
        int res = dao.modificarUsuarios(usuario);
        if (res>0)
            return Response
                    .status(Response.Status.OK)
                    .entity("Registro modificado exitosamente")
                    .build();
        else
            return Response.notModified().build();
    }
    @DELETE
    @Path("eliminar/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response eliminarUsuarios(@PathParam("id") int id){
        daoUsuario dao = new daoUsuario();
        int res = dao.eliminarUsuarios(id);
        if (res > 0)
            return Response
                    .status(Response.Status.OK)
                    .entity("Registro eliminado exitosamente")
                    .build();
        else
            return Response.notModified().build();
    }
}
