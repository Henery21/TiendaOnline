package com.project.entidades;

public class Rol {
    private int idrol;
    private String rol;
    
    public Rol(int idrol, String rol) {
        this.idrol = idrol;
        this.rol = rol;
    }
    
    public Rol() {
    }
    public int getIdrol() {
        return idrol;
    }
    public void setIdrol(int idrol) {
        this.idrol = idrol;
    }
    public String getRol() {
        return rol;
    }
    public void setRol(String rol) {
        this.rol = rol;
    }
}
