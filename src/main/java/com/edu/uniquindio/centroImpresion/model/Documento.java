package com.edu.uniquindio.centroImpresion.model;

public class Documento {

    //Atributos
    private String title;
    private String text;
    private EstadoDocumento estado;
    private PrioridadDocumento prioridad;

    /**
     * metodo construcor
     * @param title
     * @param text
     * @param estado
     * @param prioridad
     */
    public Documento(String title, String text, EstadoDocumento estado, PrioridadDocumento prioridad) {
        this.title = title;
        this.text = text;
        this.estado = estado;
        this.prioridad = prioridad;
    }

    /**
     * Métodos getter/setter for the atributos
     * @return
     */

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public EstadoDocumento getEstado() {
        return estado;
    }

    public void setEstado(EstadoDocumento estado) {
        this.estado = estado;
    }

    public PrioridadDocumento getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(PrioridadDocumento prioridad) {
        this.prioridad = prioridad;
    }
}
