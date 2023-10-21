
package com.mystore.tienda.entidades;


public class Usuarios {
 private int ID_Usuario;
 private int ID_Rol;
 private String usuario;
 private String clave;

    public Usuarios() {
    }

    public Usuarios(int ID_Usuario, int ID_Rol, String usuario, String clave) {
        this.ID_Usuario = ID_Usuario;
        this.ID_Rol = ID_Rol;
        this.usuario = usuario;
        this.clave = clave;
    }

    public int getID_Usuario() {
        return ID_Usuario;
    }

    public void setID_Usuario(int ID_Usuario) {
        this.ID_Usuario = ID_Usuario;
    }

    public int getID_Rol() {
        return ID_Rol;
    }

    public void setID_Rol(int ID_Rol) {
        this.ID_Rol = ID_Rol;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
 
 
 
}
