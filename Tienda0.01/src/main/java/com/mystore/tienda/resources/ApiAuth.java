package com.mystore.tienda.resources;

import com.mystore.tienda.entidades.Usuarios;
import com.mystore.tienda.entidades.UsuarioLogin;
import com.mystore.tienda.operaciones.daoUSuario;
import com.mystore.tienda.utilerias.JSONWebToken;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("auth")
public class ApiAuth {
    @POST
    @Path("token")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response validar(Usuarios u){
        daoUSuario dao = new daoUSuario();
        boolean estado = dao.validarCredenciales(u.getUsuario(), u.getClave());
        if (estado){
            // crear el JWT
            JSONWebToken.inicializar();
            String jwt = JSONWebToken.crearJWT(u.getUsuario(), u.getUsuario());
            return Response.ok(jwt).build();
        }
        return Response.status(Response.Status.FORBIDDEN).build();
    }
}
