package com.project.entidades;

public class Ventas {

    private int ID_Venta;
    private int ID_Empleado;
    private String Tipo_Comprobante;
    private String Serie_Comprobante;
    private String Num_Comprobante;
    private String fecha;
    private double total;
    private String estado;
    /*no se si agregar aqui lo de detalle venta*/

    public Ventas(int ID_Venta, int ID_Empleado, String Tipo_Comprobante, String Serie_Comprobante, String Num_Comprobante, String fecha, double total, String estado) {
        this.ID_Venta = ID_Venta;
        this.ID_Empleado = ID_Empleado;
        this.Tipo_Comprobante = Tipo_Comprobante;
        this.Serie_Comprobante = Serie_Comprobante;
        this.Num_Comprobante = Num_Comprobante;
        this.fecha = fecha;
        this.total = total;
        this.estado = estado;
    }
    
    public int getID_Venta() {
        return ID_Venta;
    }

    public void setID_Venta(int ID_Venta) {
        this.ID_Venta = ID_Venta;
    }

    public int getID_Empleado() {
        return ID_Empleado;
    }

    public void setID_Empleado(int ID_Empleado) {
        this.ID_Empleado = ID_Empleado;
    }

    public String getTipo_Comprobante() {
        return Tipo_Comprobante;
    }

    public void setTipo_Comprobante(String Tipo_Comprobante) {
        this.Tipo_Comprobante = Tipo_Comprobante;
    }

    public String getSerie_Comprobante() {
        return Serie_Comprobante;
    }

    public void setSerie_Comprobante(String Serie_Comprobante) {
        this.Serie_Comprobante = Serie_Comprobante;
    }

    public String getNum_Comprobante() {
        return Num_Comprobante;
    }

    public void setNum_Comprobante(String Num_Comprobante) {
        this.Num_Comprobante = Num_Comprobante;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
