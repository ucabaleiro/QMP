package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestsPrenda {
    @Test
    public void colorPrimarioNotNull() {
        Assertions.assertThrows(NullPointerException.class, FixturePrendas::prendaSinColPrimario);
    }
    @Test
    public void materialNotNull() {
        Assertions.assertThrows(NullPointerException.class, FixturePrendas::prendaSinMaterial);
    }
    @Test
    public void tipoNotNull() {
        Assertions.assertThrows(NullPointerException.class, FixturePrendas::prendaSinTipo);
    }
    @Test
    public void tramaPorDefectoLisa() {
        Assertions.assertTrue(FixturePrendas::tramaPorDefectoEsLisa);
    }
    @Test
    public void temperaturaMaximaNotNull() { Assertions.assertThrows(NullPointerException.class, FixturePrendas::prendaSinTempMaxima); }
}


