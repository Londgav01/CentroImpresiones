package com.edu.uniquindio.centroImpresion.model;

public enum PrioridadDocumento {
    ALTA(1), MEDIA(2), BAJA(3);
    private final int num;

    PrioridadDocumento(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }
}
