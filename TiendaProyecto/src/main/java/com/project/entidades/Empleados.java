package com.project.entidades;

public class Empleados {
    private int ID_Empleado;
    private String nombresEmpleado;
    private String apellidosEmpleado;
    private String telefono;
    private String correo;
    private int ID_Cargo;

    public Empleados(int ID_Empleado, String nombresEmpleado, String apellidosEmpleado, String telefono, String correo, int ID_Cargo) {
        this.ID_Empleado = ID_Empleado;
        this.nombresEmpleado = nombresEmpleado;
        this.apellidosEmpleado = apellidosEmpleado;
        this.telefono = telefono;
        this.correo = correo;
        this.ID_Cargo = ID_Cargo;
    }

    public int getID_Empleado() {
        return ID_Empleado;
    }

    public void setID_Empleado(int ID_Empleado) {
        this.ID_Empleado = ID_Empleado;
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

    public int getID_Cargo() {
        return ID_Cargo;
    }

    public void setID_Cargo(int ID_Cargo) {
        this.ID_Cargo = ID_Cargo;
    }
}
