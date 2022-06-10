package qmp;

import qmp.prenda.Prenda;

public class SolicitudEliminarPrenda extends Solicitud {
  public SolicitudEliminarPrenda(Guardarropas guardarropas, Prenda prenda, User solicitante) {
    super(guardarropas, prenda, solicitante);
  }
  public void ejecutar() {
    getGuardarropas().quitarPrenda(getPrenda());
  }
  public void revertir() {
    getGuardarropas().cargarPrenda(getPrenda());
  }
}
