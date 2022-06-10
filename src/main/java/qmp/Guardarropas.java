package qmp;

import qmp.prenda.CategoriaPrenda;
import qmp.prenda.Prenda;
import qmp.servicioClima.ServicioClimaLocator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Guardarropas {
  List<Prenda> prendas;
  List<Solicitud> historialSolicitudesAceptadas;
  User duenio;

  public Guardarropas(User duenio) {
    this.prendas = new ArrayList<>();
    this.historialSolicitudesAceptadas = new ArrayList<>();
    this.duenio = duenio;
  }

  public Atuendo generarSugerencia(){
    List<Prenda> prendasAptasSegunTemoperatura = getPrendasAptasATemperatura();
    Prenda superior = getPrendasSegunCategoria(CategoriaPrenda.SUPERIOR, prendasAptasSegunTemoperatura).stream().findFirst().orElse(null);
    Prenda inferior = getPrendasSegunCategoria(CategoriaPrenda.INFERIOR, prendasAptasSegunTemoperatura).stream().findFirst().orElse(null);
    Prenda accesorio = getPrendasSegunCategoria(CategoriaPrenda.ACCESORIO, prendasAptasSegunTemoperatura).stream().findFirst().orElse(null);
    Prenda calzado = getPrendasSegunCategoria(CategoriaPrenda.CALZADO, prendasAptasSegunTemoperatura).stream().findFirst().orElse(null);

    return new Atuendo(superior, inferior, accesorio, calzado);
  }
  private List<Prenda> getPrendasSegunCategoria(CategoriaPrenda categoria, List<Prenda> prendas) {
    return prendas.stream().filter(prenda -> prenda.esDeCategoria(categoria)).collect(Collectors.toList());
  }
  private List<Prenda> getPrendasAptasATemperatura() {
    Integer temperatura = ServicioClimaLocator.getInstance().getServicioClima().getTemperatura();
    return prendas.stream().filter(prenda -> prenda.esTemperaturaApta(temperatura)).collect(Collectors.toList());
  }

  public void cargarPrenda(Prenda prenda) {
    prendas.add(prenda);
  }
  public void quitarPrenda(Prenda prenda) {
    prendas.remove(prenda);
  }

  public void anadirSolicitudAceptadaAHistorial(Solicitud sol) {
    historialSolicitudesAceptadas.add(sol);
  }

  public void solicitarCambio(Solicitud sol) {
    if (sol.getSolicitante() == this.duenio) {
      sol.aceptar();
    } else {
      duenio.anadirSolicitud(sol);
    }
  }
  public List<Prenda> getPrendas() {
    return prendas;
  }

  public List<Solicitud> getHistorialSolicitudesAceptadas() {
    return historialSolicitudesAceptadas;
  }
}
