package qmp;

import qmp.prenda.Prenda;

public class SolicitudAnadirPrenda extends Solicitud {
  public SolicitudAnadirPrenda(Guardarropas guardarropas, Prenda prenda, User solicitante) {
    super(guardarropas, prenda, solicitante);
  }
  public void ejecutar() {
    getGuardarropas().cargarPrenda(getPrenda());
  }
  public void revertir() {
    getGuardarropas().quitarPrenda(getPrenda());
  }

}
