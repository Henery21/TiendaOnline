package com.project.entidades;

public class Proveedores {
    private int ID_Proveerdor;
    private String nombre;
    private String direccion;
    private String telefono;
    private String correo;
    private String notas;

    public Proveedores(int ID_Proveerdor, String nombre, String direccion, String telefono, String correo, String notas) {
        this.ID_Proveerdor = ID_Proveerdor;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.notas = notas;
    }

    public int getID_Proveerdor() {
        return ID_Proveerdor;
    }

    public void setID_Proveerdor(int ID_Proveerdor) {
        this.ID_Proveerdor = ID_Proveerdor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }
}
