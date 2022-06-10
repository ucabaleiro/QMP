package qmp;

import qmp.prenda.Prenda;

public abstract class Solicitud {
  Guardarropas guardarropas;
  Prenda prenda;
  User solicitante;
  public Solicitud(Guardarropas guardarropas, Prenda prenda, User solicitante) {
    this.guardarropas = guardarropas;
    this.prenda = prenda;
    this.solicitante = solicitante;
  }

  public Guardarropas getGuardarropas() {
    return guardarropas;
  }
  public Prenda getPrenda() {
    return prenda;
  }
  public User getSolicitante() {
    return solicitante;
  }

  public void aceptar() {
    this.ejecutar();
    guardarropas.anadirSolicitudAceptadaAHistorial(this);
  }
  abstract void ejecutar();
  public abstract void revertir();
}
