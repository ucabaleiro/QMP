package qmp;

import qmp.prenda.Prenda;

import java.util.ArrayList;
import java.util.List;

public class User {
  List<Guardarropas> guardarropas;
  List<Solicitud> solicitudes;

  public User() {
    guardarropas = new ArrayList<>();
    solicitudes = new ArrayList<>();
  }

  public void anadirGuardarropas(Guardarropas guardarropas) {
    this.guardarropas.add(guardarropas);
  }
  public void crearGuardarropas() {
    guardarropas.add(new Guardarropas(this));
  }

  public void anadirSolicitud(Solicitud sol) {
    solicitudes.add(sol);
  }
  public void solicitarAnadirPrenda(Guardarropas guardarropas, Prenda prenda) {
    SolicitudAnadirPrenda sol = new SolicitudAnadirPrenda(guardarropas, prenda, this);
    guardarropas.solicitarCambio(sol);
  }
  public void solicitarEliminarPrenda(Guardarropas guardarropas, Prenda prenda) {
    SolicitudEliminarPrenda sol = new SolicitudEliminarPrenda(guardarropas, prenda, this);
    guardarropas.solicitarCambio(sol);
  }

  public List<Guardarropas> getGuardarropas() {
    return guardarropas;
  }

  public void aceptarSolicitud(Solicitud sol) {
    sol.aceptar();
    solicitudes.remove(sol);
  }
  public void rechazarSolicitud(Solicitud sol) {
    solicitudes.remove(sol);
  }
  public List<Solicitud> getSolicitudes() {
    return solicitudes;
  }
}
