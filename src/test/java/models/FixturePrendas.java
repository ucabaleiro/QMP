package models;

import qmp.prenda.*;

public class FixturePrendas {
  static public Borrador borradorGenerico() {
    return new Borrador().setMaterial(Material.ALGODON).setNombre("Camisuli").setColorPrimario(Col.ROJO).setTipo(TipoPrenda.CAMISA).setTempMaxima(20).setColorSecundario(Col.VERDE);
  }

  static public void prendaSinColPrimario() {
    borradorGenerico().setColorPrimario(null).construirPrenda();
  }

  static public void prendaSinMaterial() {
    borradorGenerico().setMaterial(null).construirPrenda();
  }

  static public void prendaSinTipo() {
    borradorGenerico().setTipo(null).construirPrenda();
  }

  static public void prendaSinTempMaxima() {
    borradorGenerico().setTempMaxima(null).construirPrenda();
  }

  static public Boolean tramaPorDefectoEsLisa() {
    Prenda prenda = borradorGenerico().construirPrenda();
    return prenda.getTrama() == Trama.LISA;
  }
}
