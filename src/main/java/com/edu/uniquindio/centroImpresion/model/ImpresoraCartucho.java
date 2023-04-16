package com.edu.uniquindio.centroImpresion.model;

import java.util.List;

public class ImpresoraCartucho extends Impresora implements ImpresoraInter{

    private String cartucho;
    private String numCartuchos;

    public ImpresoraCartucho(String name, String marca, EstadoImpresora estado, List<Documento> listaDocumentos,
                             String cartucho, String numCartuchos) {
        super(name, marca, estado, listaDocumentos);
        this.cartucho = cartucho;
        this.numCartuchos = numCartuchos;
    }

    public String getCartucho() {
        return cartucho;
    }

    public void setCartucho(String cartucho) {
        this.cartucho = cartucho;
    }

    public String getNumCartuchos() {
        return numCartuchos;
    }

    public void setNumCartuchos(String numCartuchos) {
        this.numCartuchos = numCartuchos;
    }

    @Override
    public void imprimir() {

    }
}
