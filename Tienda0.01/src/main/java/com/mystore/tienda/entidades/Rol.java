
package com.mystore.tienda.entidades;

import java.util.logging.Logger;


public class Rol {
    private int ID_rol;
    private String nombreRol;

    public Rol() {
    }

    public Rol(int ID_rol, String nombreRol) {
        this.ID_rol = ID_rol;
        this.nombreRol = nombreRol;
    }

    public int getID_rol() {
        return ID_rol;
    }

    public void setID_rol(int ID_rol) {
        this.ID_rol = ID_rol;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }
   
    
    
}
