
package com.mystore.tienda.entidades;

public class proveedores {
    private int ID_Proveerdor;
    private String Nombre;
    private String Direccion;
    private String Telefono;
    private String Correo;
    private String Notas;

    public proveedores(int ID_Proveerdor, String Nombre, String Direccion, String Telefono, String Correo, String Notas) {
        this.ID_Proveerdor = ID_Proveerdor;
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.Correo = Correo;
        this.Notas = Notas;
    }

    public int getID_Proveerdor() {
        return ID_Proveerdor;
    }

    public void setID_Proveerdor(int ID_Proveerdor) {
        this.ID_Proveerdor = ID_Proveerdor;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getNotas() {
        return Notas;
    }

    public void setNotas(String Notas) {
        this.Notas = Notas;
    }
    
    
}
