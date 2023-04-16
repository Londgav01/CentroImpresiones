package com.edu.uniquindio.centroImpresion.model;

import java.util.ArrayList;
import java.util.List;

public class Impresora {
    private String name;
    private String marca;
    private EstadoImpresora estado;
    private List<Documento> listaDocumentos = new ArrayList<>();

    public Impresora(String name, String marca, EstadoImpresora estado, List<Documento> listaDocumentos) {
        this.name = name;
        this.marca = marca;
        this.estado = estado;
        this.listaDocumentos = listaDocumentos;
    }

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
