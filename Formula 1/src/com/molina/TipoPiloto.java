package com.molina;

/**
 * Created by Fran on 09/05/2017.
 */
public enum TipoPiloto {
    PRIMERPILOTO("Primer piloto"),
    SEGUNDOPILOTO("Segundo piloto"),
    PILOTOPRUEBAS("Piloto de pruebas");

    private final String TIPO_PILOTO;

    TipoPiloto(String TIPO_PILOTO) {
        this.TIPO_PILOTO = TIPO_PILOTO;
    }

    public String getTIPO_PILOTO() {
        return TIPO_PILOTO;
    }
}
