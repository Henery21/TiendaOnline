package com.project.entidades;

public class Usuario {
    private int idusuario;
    private String usuario;
    private String clave;
    private Rol rol;

    public Usuario() {
    }

    public Usuario(String usuario, String clave,Rol rol) {
        this.usuario = usuario;
        this.clave = clave;
        this.rol = rol;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
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

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
    
}
