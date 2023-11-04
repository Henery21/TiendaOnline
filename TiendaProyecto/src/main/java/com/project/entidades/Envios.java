package com.project.entidades;

public class Envios {
    private int ID_Envio;
    private int ID_Cliente;
    private int ID_Empleado;
    private String fechaEnvio;
    private String estado;
    private String metodoEnvio;
    private String notas;

    public Envios(int ID_Envio, int ID_Cliente, int ID_Empleado, String fechaEnvio, String estado, String metodoEnvio, String notas) {
        this.ID_Envio = ID_Envio;
        this.ID_Cliente = ID_Cliente;
        this.ID_Empleado = ID_Empleado;
        this.fechaEnvio = fechaEnvio;
        this.estado = estado;
        this.metodoEnvio = metodoEnvio;
        this.notas = notas;
    }

    /**
     * @return the ID_Envio
     */
    public int getID_Envio() {
        return ID_Envio;
    }

    /**
     * @param ID_Envio the ID_Envio to set
     */
    public void setID_Envio(int ID_Envio) {
        this.ID_Envio = ID_Envio;
    }

    /**
     * @return the ID_Cliente
     */
    public int getID_Cliente() {
        return ID_Cliente;
    }

    /**
     * @param ID_Cliente the ID_Cliente to set
     */
    public void setID_Cliente(int ID_Cliente) {
        this.ID_Cliente = ID_Cliente;
    }

    /**
     * @return the ID_Empleado
     */
    public int getID_Empleado() {
        return ID_Empleado;
    }

    /**
     * @param ID_Empleado the ID_Empleado to set
     */
    public void setID_Empleado(int ID_Empleado) {
        this.ID_Empleado = ID_Empleado;
    }

    /**
     * @return the fechaEnvio
     */
    public String getFechaEnvio() {
        return fechaEnvio;
    }

    /**
     * @param fechaEnvio the fechaEnvio to set
     */
    public void setFechaEnvio(String fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the metodoEnvio
     */
    public String getMetodoEnvio() {
        return metodoEnvio;
    }

    /**
     * @param metodoEnvio the metodoEnvio to set
     */
    public void setMetodoEnvio(String metodoEnvio) {
        this.metodoEnvio = metodoEnvio;
    }

    /**
     * @return the notas
     */
    public String getNotas() {
        return notas;
    }

    /**
     * @param notas the notas to set
     */
    public void setNotas(String notas) {
        this.notas = notas;
    }
}
