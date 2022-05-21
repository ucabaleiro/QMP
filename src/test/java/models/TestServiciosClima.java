package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import qmp.*;

import static models.FixturePrendas.borradorGenerico;

class TestServiciosClima {

  @Test
  public void seGeneraUnaSugerenciaCoherenteConLaTemperatura() {
    ServicioClimaLocator.setServicioClima(new ImpostorServicioClima(25));

    Guardarropas guardarropas = new Guardarropas();
    Prenda correctaSuperior = borradorGenerico().setTempMaxima(30).construirPrenda();

    guardarropas.cargarPrenda(correctaSuperior);
    guardarropas.cargarPrenda(borradorGenerico().setTempMaxima(20).construirPrenda());

    Atuendo atuendoGenerado = guardarropas.generarSugerencia();

    Assertions.assertEquals(atuendoGenerado.getPrendaSuperior(), correctaSuperior);
  }

  @Test
  public void sePuedeCambiarElServicioDeClima() {
    ServicioClimaLocator.setServicioClima(new ImpostorServicioClima(45));
    Assertions.assertEquals(ServicioClimaLocator.getInstance().getServicioClima().getTemperatura(), 45);
  }
}

class ImpostorServicioClima implements ServicioClima {

  Integer temperatura;

  public ImpostorServicioClima(Integer temperatura){
    this.temperatura = temperatura;
  }

  @Override
  public Integer getTemperatura() {
    return temperatura;
  }
}