package com.project.entidades;

public class Ventas {
    private int ID_Detalle_Venta;
    private int ID_Venta;
    private int ID_Articulo;
    private int cantidad;
    private double Precio_Unitario;
    private double impuesto;
    private double total;

    public Ventas(int ID_Detalle_Venta, int ID_Venta, int ID_Articulo, int cantidad, double Precio_Unitario, double impuesto, double total) {
        this.ID_Detalle_Venta = ID_Detalle_Venta;
        this.ID_Venta = ID_Venta;
        this.ID_Articulo = ID_Articulo;
        this.cantidad = cantidad;
        this.Precio_Unitario = Precio_Unitario;
        this.impuesto = impuesto;
        this.total = total;
    }

    /**
     * @return the ID_Detalle_Venta
     */
    public int getID_Detalle_Venta() {
        return ID_Detalle_Venta;
    }

    /**
     * @param ID_Detalle_Venta the ID_Detalle_Venta to set
     */
    public void setID_Detalle_Venta(int ID_Detalle_Venta) {
        this.ID_Detalle_Venta = ID_Detalle_Venta;
    }

    /**
     * @return the ID_Venta
     */
    public int getID_Venta() {
        return ID_Venta;
    }

    /**
     * @param ID_Venta the ID_Venta to set
     */
    public void setID_Venta(int ID_Venta) {
        this.ID_Venta = ID_Venta;
    }

    /**
     * @return the ID_Articulo
     */
    public int getID_Articulo() {
        return ID_Articulo;
    }

    /**
     * @param ID_Articulo the ID_Articulo to set
     */
    public void setID_Articulo(int ID_Articulo) {
        this.ID_Articulo = ID_Articulo;
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
     * @return the Precio_Unitario
     */
    public double getPrecio_Unitario() {
        return Precio_Unitario;
    }

    /**
     * @param Precio_Unitario the Precio_Unitario to set
     */
    public void setPrecio_Unitario(double Precio_Unitario) {
        this.Precio_Unitario = Precio_Unitario;
    }

    /**
     * @return the impuesto
     */
    public double getImpuesto() {
        return impuesto;
    }

    /**
     * @param impuesto the impuesto to set
     */
    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }
}
