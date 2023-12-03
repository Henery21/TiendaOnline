package com.project.entidades;

public class Usuario {

    private int ID_Usuario;
    private String usuario;
    private String clave;
    private int ID_Rol;

    public Usuario(int ID_Usuario, String usuario, String clave, int ID_Rol) {
        this.ID_Usuario = ID_Usuario;
        this.usuario = usuario;
        this.clave = clave;
        this.ID_Rol = ID_Rol;
    }    

    public int getID_Usuario() {
        return ID_Usuario;
    }

    public void setID_Usuario(int ID_Usuario) {
        this.ID_Usuario = ID_Usuario;
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

    public int getID_Rol() {
        return ID_Rol;
    }

    public void setID_Rol(int ID_Rol) {
        this.ID_Rol = ID_Rol;
    }
}
