package com.project.entidades;

public class Subcategorias {
    private int ID_Subcategoria;
    private String subcategoria;
    private int ID_Categoria;

    public Subcategorias(int ID_Subcategoria, String subcategoria, int ID_Categoria) {
        this.ID_Subcategoria = ID_Subcategoria;
        this.subcategoria = subcategoria;
        this.ID_Categoria = ID_Categoria;
    }

    public int getID_Subcategoria() {
        return ID_Subcategoria;
    }

    public void setID_Subcategoria(int ID_Subcategoria) {
        this.ID_Subcategoria = ID_Subcategoria;
    }

    public String getSubcategoria() {
        return subcategoria;
    }

    public void setSubcategoria(String subcategoria) {
        this.subcategoria = subcategoria;
    }

    public int getID_Categoria() {
        return ID_Categoria;
    }

    public void setID_Categoria(int ID_Categoria) {
        this.ID_Categoria = ID_Categoria;
    }
    
}
