package com.project.entidades;

import java.util.Date;

public class Empleados {
    private int ID_Empleado;
    private String DUI_Empleado;
    private String nombresEmpleado;
    private String apellidosEmpleado;
    private int ID_Usuario;
    private Date fechaNacEmpleado;
    private String telefono;
    private String correo;
    private String direccion;
    private int ID_Cargo;

    public Empleados(int ID_Empleado, String DUI_Empleado, String nombresEmpleado, String apellidosEmpleado, int ID_Usuario, Date fechaNacEmpleado, String telefono, String correo, String direccion, int ID_Cargo) {
        this.ID_Empleado = ID_Empleado;
        this.DUI_Empleado = DUI_Empleado;
        this.nombresEmpleado = nombresEmpleado;
        this.apellidosEmpleado = apellidosEmpleado;
        this.ID_Usuario = ID_Usuario;
        this.fechaNacEmpleado = fechaNacEmpleado;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.ID_Cargo = ID_Cargo;
    }

    public int getID_Empleado() {
        return ID_Empleado;
    }

    public void setID_Empleado(int ID_Empleado) {
        this.ID_Empleado = ID_Empleado;
    }

    public String getDUI_Empleado() {
        return DUI_Empleado;
    }

    public void setDUI_Empleado(String DUI_Empleado) {
        this.DUI_Empleado = DUI_Empleado;
    }

    public String getNombresEmpleado() {
        return nombresEmpleado;
    }

    public void setNombresEmpleado(String nombresEmpleado) {
        this.nombresEmpleado = nombresEmpleado;
    }

    public String getApellidosEmpleado() {
        return apellidosEmpleado;
    }

    public void setApellidosEmpleado(String apellidosEmpleado) {
        this.apellidosEmpleado = apellidosEmpleado;
    }

    public int getID_Usuario() {
        return ID_Usuario;
    }

    public void setID_Usuario(int ID_Usuario) {
        this.ID_Usuario = ID_Usuario;
    }

    public Date getFechaNacEmpleado() {
        return fechaNacEmpleado;
    }

    public void setFechaNacEmpleado(Date fechaNacEmpleado) {
        this.fechaNacEmpleado = fechaNacEmpleado;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getID_Cargo() {
        return ID_Cargo;
    }

    public void setID_Cargo(int ID_Cargo) {
        this.ID_Cargo = ID_Cargo;
    }
}
