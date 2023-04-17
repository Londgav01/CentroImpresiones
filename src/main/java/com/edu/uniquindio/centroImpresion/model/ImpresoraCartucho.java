package com.edu.uniquindio.centroImpresion.model;

import java.util.List;

/**
 * clase hija impresora que implementa la interfaz impresoraInter y es hija de impresora
 */
public class ImpresoraCartucho extends Impresora implements ImpresoraInter{
    //Atributos
    private String cartucho;
    private String numCartuchos;

    /**
     * Constructores con diferentes parameter
     * @param name
     * @param marca
     * @param estado
     * @param listaDocumentos
     * @param cartucho
     * @param numCartuchos
     */
    public ImpresoraCartucho(String name, String marca, EstadoImpresora estado, List<Documento> listaDocumentos,
                             String cartucho, String numCartuchos) {
        super(name, marca, estado, listaDocumentos);
        this.cartucho = cartucho;
        this.numCartuchos = numCartuchos;
    }

    public ImpresoraCartucho(String name, String marca, EstadoImpresora estado) {
        super(name, marca, estado);
    }

    /**
     * metodos getter/setter de los parametros
     * @return
     */
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

    /**
     * metodo imprimir implementado de la interface ImpresoraInter
     */
    @Override
    public void imprimir() {
        System.out.println("imprime a cartucho");
    }
}
