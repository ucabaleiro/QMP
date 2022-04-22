import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import qmp.*;
import qmp.Prenda.*;

class TestsPrenda {

    @Test
    public void colorPrimarioNotNull() {
        Assertions.assertThrows(NullPointerException.class, () -> new Prenda("Jean fachero", AttribsPrendaPrueba.tipoPrueba, AttribsPrendaPrueba.materialPrueba, null));
    }
    @Test
    public void materialNotNull() {
        Assertions.assertThrows(NullPointerException.class, () -> new Prenda("Jean fachero", AttribsPrendaPrueba.tipoPrueba, null, AttribsPrendaPrueba.colorPrueba));
    }
    @Test
    public void tipoNotNull() {
        Assertions.assertThrows(NullPointerException.class, () -> new Prenda("Jean fachero", null, AttribsPrendaPrueba.materialPrueba, AttribsPrendaPrueba.colorPrueba));
    }
    @Test
    public void claseNotNull() {
        Assertions.assertThrows(NullPointerException.class, () -> new TipoPrenda("Mocasines", null));
    }
}

class AttribsPrendaPrueba {
    static Col colorPrueba = Col.rojo;
    static String nombrePrueba = "Pantalon jean";
    static TipoPrenda tipoPrueba = new TipoPrenda("Zapatillas deportivas", CategoriaPrenda.calzado);
    static Material materialPrueba = new Material();
}