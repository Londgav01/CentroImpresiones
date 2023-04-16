package com.edu.uniquindio.centroImpresion.model;

public enum EstadoDocumento {
    IMPRESO(1),IMPRIMIENDO(2), EN_COLA(3);
    private final int num;

    EstadoDocumento(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

}
