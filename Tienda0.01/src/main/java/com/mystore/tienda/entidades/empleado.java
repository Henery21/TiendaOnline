
package com.mystore.tienda.entidades;

public class empleado {
    private int ID_Empleado;
    private String NombresEmpleado;
    private String ApellidosEmpleado;
    private String Telefono;
    private String Correo;
    private int ID_Cargo;

    public empleado(int ID_Empleado, String NombresEmpleado, String ApellidosEmpleado, String Telefono, String Correo, int ID_Cargo) {
        this.ID_Empleado = ID_Empleado;
        this.NombresEmpleado = NombresEmpleado;
        this.ApellidosEmpleado = ApellidosEmpleado;
        this.Telefono = Telefono;
        this.Correo = Correo;
        this.ID_Cargo = ID_Cargo;
    }

    public int getID_Empleado() {
        return ID_Empleado;
    }

    public void setID_Empleado(int ID_Empleado) {
        this.ID_Empleado = ID_Empleado;
    }

    public String getNombresEmpleado() {
        return NombresEmpleado;
    }

    public void setNombresEmpleado(String NombresEmpleado) {
        this.NombresEmpleado = NombresEmpleado;
    }

    public String getApellidosEmpleado() {
        return ApellidosEmpleado;
    }

    public void setApellidosEmpleado(String ApellidosEmpleado) {
        this.ApellidosEmpleado = ApellidosEmpleado;
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

    public int getID_Cargo() {
        return ID_Cargo;
    }

    public void setID_Cargo(int ID_Cargo) {
        this.ID_Cargo = ID_Cargo;
    }
    
}
