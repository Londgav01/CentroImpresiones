package com.edu.uniquindio.centroImpresion.model;

public enum EstadoImpresora {
    ACTIVA(1), INACTIVA(2), MANTENIMIENTO(3);
    private final int num;

    EstadoImpresora(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

}
