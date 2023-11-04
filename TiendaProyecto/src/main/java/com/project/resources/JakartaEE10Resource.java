package com.project.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("holamundo")
public class JakartaEE10Resource {
    
    @GET
    public Response ping(){
        return Response.ok("Hola desde mi API REST").build();
    }
}
