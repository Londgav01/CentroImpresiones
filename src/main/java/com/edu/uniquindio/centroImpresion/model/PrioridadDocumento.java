package com.edu.uniquindio.centroImpresion.model;

public enum PrioridadDocumento {
    //Enumeration de la prioridad del documento a imprimir
    ALTA(1), MEDIA(2), BAJA(3);
    private final int num;

    PrioridadDocumento(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }
}
