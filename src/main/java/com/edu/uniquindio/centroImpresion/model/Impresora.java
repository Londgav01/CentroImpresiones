package com.edu.uniquindio.centroImpresion.model;

import java.util.ArrayList;
import java.util.List;

/**
 * clase padre impresora
 */
public class Impresora {

    //Attributes
    private String name;
    private String marca;
    private EstadoImpresora estado;
    private List<Documento> listaDocumentos = new ArrayList<>();

    /**
     * Constructores con diveros parametros
     * @param name
     * @param marca
     * @param estado
     * @param listaDocumentos
     */
    public Impresora(String name, String marca, EstadoImpresora estado, List<Documento> listaDocumentos) {
        this.name = name;
        this.marca = marca;
        this.estado = estado;
        this.listaDocumentos = listaDocumentos;
    }

    public Impresora(String name, String marca, EstadoImpresora estado) {
        this.name = name;
        this.marca = marca;
        this.estado = estado;
    }

    /**
     * metodos getter/setter for the parameters
     * @return
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public EstadoImpresora getEstado() {
        return estado;
    }

    public void setEstado(EstadoImpresora estado) {
        this.estado = estado;
    }

    public List<Documento> getListaDocumentos() {
        return listaDocumentos;
    }

    public void setListaDocumentos(List<Documento> listaDocumentos) {
        this.listaDocumentos = listaDocumentos;
    }
}
