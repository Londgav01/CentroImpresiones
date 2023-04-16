package com.edu.uniquindio.centroImpresion.model;

import java.util.ArrayList;
import java.util.List;

public class CentroImpresion {
    private String code;
    private List<Impresora> listaImpresoras= new ArrayList<>();
    private List<Documento> listaDocumentos= new ArrayList<>();

    public CentroImpresion(String code, List<Impresora> listaImpresoras, List<Documento> listaDocumentos) {
        this.code = code;
        this.listaImpresoras = listaImpresoras;
        this.listaDocumentos = listaDocumentos;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Impresora> getListaImpresoras() {
        return listaImpresoras;
    }

    public void setListaImpresoras(List<Impresora> listaImpresoras) {
        this.listaImpresoras = listaImpresoras;
    }

    public List<Documento> getListaDocumentos() {
        return listaDocumentos;
    }

    public void setListaDocumentos(List<Documento> listaDocumentos) {
        this.listaDocumentos = listaDocumentos;
    }
}
