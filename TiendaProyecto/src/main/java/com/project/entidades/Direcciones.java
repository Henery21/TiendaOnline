package com.project.entidades;

public class Direcciones {
    private int ID_Direccion;
    private String linea1;
    private String linea2;
    private int ID_Distrito;
    private int codigoPostal;

    public Direcciones(int ID_Direccion, String linea1, String linea2, int ID_Distrito, int codigoPostal) {
        this.ID_Direccion = ID_Direccion;
        this.linea1 = linea1;
        this.linea2 = linea2;
        this.ID_Distrito = ID_Distrito;
        this.codigoPostal = codigoPostal;
    }

    public int getID_Direccion() {
        return ID_Direccion;
    }

    public void setID_Direccion(int ID_Direccion) {
        this.ID_Direccion = ID_Direccion;
    }

    public String getLinea1() {
        return linea1;
    }

    public void setLinea1(String linea1) {
        this.linea1 = linea1;
    }

    public String getLinea2() {
        return linea2;
    }

    public void setLinea2(String linea2) {
        this.linea2 = linea2;
    }

    public int getID_Distrito() {
        return ID_Distrito;
    }

    public void setID_Distrito(int ID_Distrito) {
        this.ID_Distrito = ID_Distrito;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
}
