package com.project.entidades;

public class Clientes {

    private int ID_Cliente;
    private String DUI_Cliente;
    private String nombresCliente;
    private String apellidosCliente;
    private int ID_Usuario;
    private String telefono;
    private String correo;
    private int ID_Direccion;

    public Clientes(int ID_Cliente, String DUI_Cliente, String nombresCliente, String apellidosCliente, int ID_Usuario, String telefono, String correo, int ID_Direccion) {
        this.ID_Cliente = ID_Cliente;
        this.DUI_Cliente = DUI_Cliente;
        this.nombresCliente = nombresCliente;
        this.apellidosCliente = apellidosCliente;
        this.ID_Usuario = ID_Usuario;
        this.telefono = telefono;
        this.correo = correo;
        this.ID_Direccion = ID_Direccion;
    }
    
    public int getID_Cliente() {
        return ID_Cliente;
    }

    public void setID_Cliente(int ID_Cliente) {
        this.ID_Cliente = ID_Cliente;
    }

    public String getDUI_Cliente() {
        return DUI_Cliente;
    }

    public void setDUI_Cliente(String DUI_Cliente) {
        this.DUI_Cliente = DUI_Cliente;
    }

    public String getNombresCliente() {
        return nombresCliente;
    }

    public void setNombresCliente(String nombresCliente) {
        this.nombresCliente = nombresCliente;
    }

    public String getApellidosCliente() {
        return apellidosCliente;
    }

    public void setApellidosCliente(String apellidosCliente) {
        this.apellidosCliente = apellidosCliente;
    }

    public int getID_Usuario() {
        return ID_Usuario;
    }

    public void setID_Usuario(int ID_Usuario) {
        this.ID_Usuario = ID_Usuario;
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

    public int getID_Direccion() {
        return ID_Direccion;
    }

    public void setID_Direccion(int ID_Direccion) {
        this.ID_Direccion = ID_Direccion;
    }
}
