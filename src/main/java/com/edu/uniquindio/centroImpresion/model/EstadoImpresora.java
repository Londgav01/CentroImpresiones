package com.edu.uniquindio.centroImpresion.model;

public enum EstadoImpresora {
    //enumeracion sobre estado en el que se encuentra una impresora
    ACTIVA(1), INACTIVA(2), MANTENIMIENTO(3);
    private final int num;

    EstadoImpresora(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    /**
     * Método que me convierte un string en un EstadoImpresora
     * @param estado
     * @return
     */
    public EstadoImpresora convertirStringAEstado(String estado) {
        EstadoImpresora result = ACTIVA;
        if(estado.equalsIgnoreCase("INACTIVA")){
            result= INACTIVA;
        } else if (estado.equalsIgnoreCase("MANTENIMIENTO")) {
            result= MANTENIMIENTO;
        }
        return result;
    }

}
