package com.project.entidades;

public class ExistenciasProductos {

    private int ID_Existencia;
    private int ID_Articulo;
    private int cantidad;
    private String fechaIngreso;
    private String ubicacion;
    private double precioCompra;
    private double precioVenta;
    private String estado;

    public ExistenciasProductos(int ID_Existencia, int ID_Articulo, int cantidad, String fechaIngreso, String ubicacion, double precioCompra, double precioVenta, String estado) {
        this.ID_Existencia = ID_Existencia;
        this.ID_Articulo = ID_Articulo;
        this.cantidad = cantidad;
        this.fechaIngreso = fechaIngreso;
        this.ubicacion = ubicacion;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.estado = estado;
    }
    
    public int getID_Existencia() {
        return ID_Existencia;
    }

    public void setID_Existencia(int ID_Existencia) {
        this.ID_Existencia = ID_Existencia;
    }

    public int getID_Articulo() {
        return ID_Articulo;
    }

    public void setID_Articulo(int ID_Articulo) {
        this.ID_Articulo = ID_Articulo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
