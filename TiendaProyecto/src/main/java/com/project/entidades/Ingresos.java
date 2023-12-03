package com.project.entidades;

public class Ingresos {

    private int ID_Detalle_Ingreso;
    private int ID_Ingreso;
    private int ID_Categoria;
    private int cantidad;
    private double precio;

    public Ingresos(int ID_Detalle_Ingreso, int ID_Ingreso, int ID_Categoria, int cantidad, double precio) {
        this.ID_Detalle_Ingreso = ID_Detalle_Ingreso;
        this.ID_Ingreso = ID_Ingreso;
        this.ID_Categoria = ID_Categoria;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    /**
     * @return the ID_Detalle_Ingreso
     */
    public int getID_Detalle_Ingreso() {
        return ID_Detalle_Ingreso;
    }

    /**
     * @param ID_Detalle_Ingreso the ID_Detalle_Ingreso to set
     */
    public void setID_Detalle_Ingreso(int ID_Detalle_Ingreso) {
        this.ID_Detalle_Ingreso = ID_Detalle_Ingreso;
    }

    /**
     * @return the ID_Ingreso
     */
    public int getID_Ingreso() {
        return ID_Ingreso;
    }

    /**
     * @param ID_Ingreso the ID_Ingreso to set
     */
    public void setID_Ingreso(int ID_Ingreso) {
        this.ID_Ingreso = ID_Ingreso;
    }

    /**
     * @return the ID_Categoria
     */
    public int getID_Categoria() {
        return ID_Categoria;
    }

    /**
     * @param ID_Categoria the IC_Categoria to set
     */
    public void setIC_Categoria(int ID_Categoria) {
        this.ID_Categoria = ID_Categoria;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}    