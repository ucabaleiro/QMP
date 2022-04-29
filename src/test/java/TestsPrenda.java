import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import qmp.*;
class TestsPrenda {
    @Test
    public void colorPrimarioNotNull() {
        Assertions.assertThrows(NullPointerException.class, Pruebas::prendaSinColPrimario);
    }
    @Test
    public void materialNotNull() {
        Assertions.assertThrows(NullPointerException.class, Pruebas::prendaSinMaterial);
    }
    @Test
    public void tipoNotNull() {
        Assertions.assertThrows(NullPointerException.class, Pruebas::prendaSinTipo);
    }
    @Test
    public void tramaPorDefectoLisa() {
        Assertions.assertTrue(Pruebas::tramaPorDefectoEsLisa);
    }
}
class Pruebas {
    static public void prendaSinColPrimario() {
        Borrador borrador = new Borrador();
        borrador.setMaterial(Material.ALGODON);
        borrador.setNombre("Camisuli");
        borrador.setTipo(TipoPrenda.CAMISA);

        Prenda prenda = borrador.construirPrenda();
    }
    static public void prendaSinMaterial() {
        Borrador borrador = new Borrador();
        borrador.setNombre("Camisuli");
        borrador.setColorPrimario(Col.ROJO);
        borrador.setTipo(TipoPrenda.CAMISA);

        Prenda prenda = borrador.construirPrenda();
    }
    static public void prendaSinTipo() {
        Borrador borrador = new Borrador();
        borrador.setMaterial(Material.ALGODON);
        borrador.setNombre("Camisuli");
        borrador.setColorPrimario(Col.ROJO);

        Prenda prenda = borrador.construirPrenda();
    }
    static public Boolean tramaPorDefectoEsLisa(){
        Borrador borrador = new Borrador();
        borrador.setMaterial(Material.ALGODON);
        borrador.setNombre("Camisuli");
        borrador.setColorPrimario(Col.ROJO);
        borrador.setTipo(TipoPrenda.CAMISA);

        Prenda prenda = borrador.construirPrenda();
        return prenda.getTrama() == Trama.LISA;
    }

}