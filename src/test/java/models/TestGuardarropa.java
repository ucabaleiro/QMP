package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import qmp.Guardarropas;
import qmp.User;
import qmp.prenda.Prenda;

public class TestGuardarropa {

  private User usuario1;
  private User usuario2;

  @BeforeEach
  void init() {
    usuario1 = new User();
    usuario2 = new User();
  }

  @Test
  public void unUsuarioPuedeTenerMultiplesGuardarropas() {
    usuario1.crearGuardarropas();
    usuario1.crearGuardarropas();

    Assertions.assertEquals(usuario1.getGuardarropas().size(), 2);
  }

  @Test
  public void losUsuariosPuedenCompartirGuardarropas() {
    usuario1.crearGuardarropas();
    usuario2.anadirGuardarropas(usuario1.getGuardarropas().get(0));

    Assertions.assertEquals(usuario1.getGuardarropas().get(0), usuario2.getGuardarropas().get(0));
  }

  @Test
  public void lasPrendasSeAnadenYEliminanAlAceptarLaSolicitud() {
    usuario1.crearGuardarropas();

    Guardarropas guardarropas = usuario1.getGuardarropas().get(0);
    Prenda prenda = FixturePrendas.borradorGenerico().construirPrenda();

    usuario2.solicitarAnadirPrenda(guardarropas, prenda);
    usuario1.aceptarSolicitud(usuario1.getSolicitudes().get(0));

    Assertions.assertEquals(prenda, guardarropas.getPrendas().get(0));

    usuario2.solicitarEliminarPrenda(guardarropas, prenda);
    usuario1.aceptarSolicitud(usuario1.getSolicitudes().get(0));

    Assertions.assertEquals(0,guardarropas.getPrendas().size());
  }

  @Test
  public void sePuedeRechazarUnaSolicitud() {
    usuario1.crearGuardarropas();

    Guardarropas guardarropas = usuario1.getGuardarropas().get(0);
    Prenda prenda = FixturePrendas.borradorGenerico().construirPrenda();

    usuario2.solicitarAnadirPrenda(guardarropas, prenda);
    usuario1.rechazarSolicitud(usuario1.getSolicitudes().get(0));

    Assertions.assertEquals(0, usuario1.getSolicitudes().size());
  }

  @Test
  public void sePuedeRevertirUnaSolicitudDeAnadirAceptada() {
    usuario1.crearGuardarropas();

    Guardarropas guardarropas = usuario1.getGuardarropas().get(0);
    Prenda prenda = FixturePrendas.borradorGenerico().construirPrenda();

    usuario2.solicitarAnadirPrenda(guardarropas, prenda);
    usuario1.aceptarSolicitud(usuario1.getSolicitudes().get(0));
    guardarropas.getHistorialSolicitudesAceptadas().get(0).revertir();

    Assertions.assertEquals(0, guardarropas.getPrendas().size());
  }

  @Test
  public void sePuedeRevertirUnaSolicitudDeEliminarAceptada() {
    usuario1.crearGuardarropas();

    Guardarropas guardarropas = usuario1.getGuardarropas().get(0);
    Prenda prenda = FixturePrendas.borradorGenerico().construirPrenda();

    guardarropas.cargarPrenda(prenda);

    usuario2.solicitarEliminarPrenda(guardarropas, prenda);
    usuario1.aceptarSolicitud(usuario1.getSolicitudes().get(0));

    guardarropas.getHistorialSolicitudesAceptadas().get(0).revertir();

    Assertions.assertEquals(prenda, guardarropas.getPrendas().get(0));
  }
}
