package com.project.entidades;

public class Carrito {
    private int ID_Carrito;
    private int ID_Cliente;
    private String fecha;
    private int ID_Articulo;
    private int cantidad;
    private double precio;

    public Carrito(int ID_Carrito, int ID_Cliente, String fecha, int ID_Articulo, int cantidad, double precio) {
        this.ID_Carrito = ID_Carrito;
        this.ID_Cliente = ID_Cliente;
        this.fecha = fecha;
        this.ID_Articulo = ID_Articulo;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public int getID_Carrito() {
        return ID_Carrito;
    }

    public void setID_Carrito(int ID_Carrito) {
        this.ID_Carrito = ID_Carrito;
    }

    public int getID_Cliente() {
        return ID_Cliente;
    }

    public void setID_Cliente(int ID_Cliente) {
        this.ID_Cliente = ID_Cliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
