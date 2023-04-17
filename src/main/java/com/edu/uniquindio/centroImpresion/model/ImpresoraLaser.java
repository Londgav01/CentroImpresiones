package com.edu.uniquindio.centroImpresion.model;

/**
 * clase hija de impresora que implementa la interfaz impresoraInter
 */
public class ImpresoraLaser extends Impresora implements ImpresoraInter{

    /**
     * Construct
     * @param name
     * @param marca
     * @param estado
     */
    public ImpresoraLaser(String name, String marca, EstadoImpresora estado) {
        super(name, marca, estado);
    }

    @Override
    public void imprimir() {
        System.out.println("imprime a laser");
    }
}
