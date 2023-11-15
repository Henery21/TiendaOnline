package com.project.entidades;

public class Articulos {

    private int ID_Articulo;
    private int ID_Categoria;
    private int ID_Subcategoria;
    private String codigo;
    private double Precio_Venta;
    private String Fecha_Vencimiento;
    private String descripcion;
    private int estado;
    private int ID_Proveedor;

    public Articulos(int ID_Articulo, int ID_Categoria, int ID_Subcategoria, String codigo, double Precio_Venta, String Fecha_Vencimiento, String descripcion, int estado, int ID_Proveedor) {
        this.ID_Articulo = ID_Articulo;
        this.ID_Categoria = ID_Categoria;
        this.ID_Subcategoria = ID_Subcategoria;
        this.codigo = codigo;
        this.Precio_Venta = Precio_Venta;
        this.Fecha_Vencimiento = Fecha_Vencimiento;
        this.descripcion = descripcion;
        this.estado = estado;
        this.ID_Proveedor = ID_Proveedor;
    }

    public int getID_Articulo() {
        return ID_Articulo;
    }

    public void setID_Articulo(int ID_Articulo) {
        this.ID_Articulo = ID_Articulo;
    }

    public int getID_Categoria() {
        return ID_Categoria;
    }

    public void setID_Categoria(int ID_Categoria) {
        this.ID_Categoria = ID_Categoria;
    }

    public int getID_Subcategoria() {
        return ID_Subcategoria;
    }

    public void setID_Subcategoria(int ID_Subcategoria) {
        this.ID_Subcategoria = ID_Subcategoria;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio_Venta() {
        return Precio_Venta;
    }

    public void setPrecio_Venta(double Precio_Venta) {
        this.Precio_Venta = Precio_Venta;
    }

    public String getFecha_Vencimiento() {
        return Fecha_Vencimiento;
    }

    public void setFecha_Vencimiento(String Fecha_Vencimiento) {
        this.Fecha_Vencimiento = Fecha_Vencimiento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getID_Proveedor() {
        return ID_Proveedor;
    }

    public void setID_Proveedor(int ID_Proveedor) {
        this.ID_Proveedor = ID_Proveedor;
    }   

}
